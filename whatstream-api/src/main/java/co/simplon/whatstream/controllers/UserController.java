package co.simplon.whatstream.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.whatstream.dtos.UserLogin;
import co.simplon.whatstream.services.UserService;

@RestController
@RequestMapping("/users")

public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/sign-in")
    public Object signIn(@RequestBody UserLogin inputs) {
	return service.signIn(inputs);
    }

}
