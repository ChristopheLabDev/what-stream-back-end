package co.simplon.whatstream.services;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.simplon.whatstream.dtos.UserCreate;
import co.simplon.whatstream.dtos.UserLogin;
import co.simplon.whatstream.entities.User;
import co.simplon.whatstream.repositories.UserRepository;
import co.simplon.whatstream.security.Jwt;
import co.simplon.whatstream.security.JwtProvider;
import co.simplon.whatstream.entities.Role;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final PasswordEncoder encoder;

    private final JwtProvider provider;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder, JwtProvider provider) {
	this.repository = repository;
	this.encoder = encoder;
	this.provider = provider;
    }

    @Transactional
    @Override
    public void create(UserCreate inputs) {
	User user = new User();
	user.setUserName(inputs.getUsername());
	String encoded = encoder.encode(inputs.getPassword());
	user.setPassword(encoded);
	repository.save(user);
    }

    @Override
    public Jwt signIn(UserLogin inputs) throws BadCredentialsException {
	String username = inputs.getUsername();
	User user = repository.findByUserNameIgnoreCase(username).orElseThrow(
		() -> new BadCredentialsException(String.format("no user found with username '%s'", username)));
	String password = inputs.getPassword();
	if (!encoder.matches(password, user.getPassword())) {
	    throw new BadCredentialsException(String.format("password does not match for username '%s'", username));
	}
	Role role = user.getRole();
	List<String> roles = null;
	if (role != null) {
	    roles = List.of(role.getName());
	}
	return provider.create(String.valueOf(user.getId()), roles);
    }
}
