package co.simplon.whatstream.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.whatstream.dtos.UserCreate;
import co.simplon.whatstream.dtos.UserLogin;
import co.simplon.whatstream.security.Jwt;
import co.simplon.whatstream.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;
    }

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody UserCreate inputs) {
	System.out.println(inputs);
	service.create(inputs);
    }

    @PostMapping("/sign-in")
    public Jwt signIn(@RequestBody UserLogin inputs) {
	return service.signIn(inputs);
    }
}
