package co.simplon.whatstream.services;

import co.simplon.whatstream.dtos.UserCreate;
import co.simplon.whatstream.dtos.UserLogin;
import co.simplon.whatstream.security.Jwt;

public interface UserService {
    void create(UserCreate inputs);

    Jwt signIn(UserLogin inputs);
}
