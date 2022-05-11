package co.simplon.whatstream.services;

import co.simplon.whatstream.dtos.UserLogin;

public interface UserService {

    Object signIn(UserLogin inputs);
}
