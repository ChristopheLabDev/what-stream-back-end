package co.simplon.whatstream.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.dtos.ContentUpdateView;
import co.simplon.whatstream.dtos.ContentUpdate;
import co.simplon.whatstream.dtos.UpdateTableItem;
import co.simplon.whatstream.entities.Content;
import co.simplon.whatstream.repositories.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService {

    private final ContentRepository repository;

    public ContentServiceImpl(ContentRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<ContentUpdateView> findTableItems() {
	return repository.findAllProjectedByOrderByName(ContentUpdateView.class);
    }

    @Transactional
    @Override
    public void create(ContentCreate inputs) {
	Content content = new Content();
	content.setName(inputs.getName());
	content.setDescription(inputs.getDescription());
	content.setPicturelink(inputs.getPicturelink());
	content.setReleasedate(inputs.getReleasedate());
	content.setDuration(inputs.getDuration());
	content.setRate(inputs.getRate());
	repository.save(content);

    }

    @Transactional
    @Override
    public void update(Long contentId, ContentUpdate inputs) {
	Content content = repository.findById(contentId).get();
	content.setName(inputs.getName());
	content.setDescription(inputs.getDescription());
	content.setPicturelink(inputs.getPicturelink());
	content.setReleasedate(inputs.getReleasedate());
	content.setDuration(inputs.getDuration());
	content.setRate(inputs.getRate());
	repository.save(content);
    }

    @Transactional
    @Override
    public void delete(Long id) {
	repository.deleteById(id);
    }

    @Override
    public ContentUpdateView getContentById(Long id) {
	return repository.findProjectedById(id);

    }

}