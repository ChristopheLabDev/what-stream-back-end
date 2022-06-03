package co.simplon.whatstream.services;

import java.util.List;

import co.simplon.whatstream.dtos.ContentCard;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.dtos.ContentName;
import co.simplon.whatstream.dtos.ContentUpdateView;
import co.simplon.whatstream.dtos.ContentUpdate;
import co.simplon.whatstream.dtos.UpdateTableItem;
import co.simplon.whatstream.entities.Content;

public interface ContentService {

    List<ContentUpdateView> findTableItems();

    void create(ContentCreate inputs);

    void update(Long contentId, ContentUpdate inputs);

    void delete(Long id);

    ContentUpdateView getContentById(Long id);

}