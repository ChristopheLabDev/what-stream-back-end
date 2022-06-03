package co.simplon.whatstream.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.dtos.ContentUpdateView;
import co.simplon.whatstream.dtos.ContentUpdate;
import co.simplon.whatstream.dtos.UpdateTableItem;
import co.simplon.whatstream.entities.Content;
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

    @GetMapping("/my-contents")
    public List<ContentUpdateView> tableItems() {
	return service.findTableItems();
    }

    @GetMapping("/{id}")
    public ContentUpdateView getContentById(@PathVariable("id") Long id) {
	return service.getContentById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") Long id, @RequestBody ContentUpdate inputs) {
	service.update(id, inputs);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }
}