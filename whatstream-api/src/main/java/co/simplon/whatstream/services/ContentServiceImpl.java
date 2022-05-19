package co.simplon.whatstream.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.whatstream.dtos.ContentCard;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.dtos.ContentName;
import co.simplon.whatstream.dtos.ContentTableItem;
import co.simplon.whatstream.repositories.ContentRepository;

@Service
public class ContentServiceImpl implements ContentService {

    private final ContentRepository repository;

    public ContentServiceImpl(ContentRepository repository) {
	this.repository = repository;
    }

    @Override
    public List<ContentName> findNames() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<ContentTableItem> findTableItems() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<ContentCard> findCards() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void create(ContentCreate inputs) {
	// TODO Auto-generated method stub

    }

}