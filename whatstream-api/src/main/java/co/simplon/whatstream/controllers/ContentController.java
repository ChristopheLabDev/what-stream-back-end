package co.simplon.whatstream.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.services.ContentService;

@RestController
@RequestMapping("/content")
public class ContentController {

    private final ContentService service;

    public ContentController(ContentService service) {
	this.service = service;
    }

    @PostMapping("/records")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ContentCreate inputs) {
	System.out.println(inputs);
	service.create(inputs);
    }
}