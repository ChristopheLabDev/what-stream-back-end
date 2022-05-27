package co.simplon.whatstream.services;

import org.springframework.stereotype.Service;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.entities.Content;
import co.simplon.whatstream.repositories.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService {

    private final ContentRepository repository;

    public ContentServiceImpl(ContentRepository repository) {
	this.repository = repository;
    }

    @Override
    public void create(ContentCreate inputs) {
	Content content = new Content();
	content.setName(inputs.getName());
	content.setDescription(inputs.getDescription());
	content.setAuthor(inputs.getAuthor());
	content.setDuration(inputs.getDuration());
	repository.save(content);

    }

}