package co.simplon.whatstream.services;

import java.util.NoSuchElementException;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.simplon.whatstream.dtos.UserLogin;
import co.simplon.whatstream.entities.User;
import co.simplon.whatstream.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final PasswordEncoder encoder;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder) {
	this.repository = repository;
	this.encoder = encoder;
    }

    @Override
    public Object signIn(UserLogin inputs) {
	String username = inputs.getUsername();
	User user = repository.findByUserNameIgnoreCase(username)
		.orElseThrow(() -> new BadCredentialsException(username));

	String password = inputs.getPassword();
	if (!encoder.matches(password, user.getPassword())) {
	    throw new BadCredentialsException(username);
	}
	return user;
    }
}
