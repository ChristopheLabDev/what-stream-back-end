package co.simplon.whatstream.services;

import java.util.List;

import co.simplon.whatstream.dtos.ContentCard;
import co.simplon.whatstream.dtos.ContentCreate;
import co.simplon.whatstream.dtos.ContentName;
import co.simplon.whatstream.dtos.ContentTableItem;

public interface ContentService {

    /*
     * List<ContentName> findNames();
     * 
     * List<ContentTableItem> findTableItems();
     * 
     * List<ContentCard> findCards();
     */

    void create(ContentCreate inputs);
}