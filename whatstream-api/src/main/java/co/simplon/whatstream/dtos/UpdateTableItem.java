package co.simplon.whatstream.dtos;

import java.time.LocalDate;

public interface UpdateTableItem {
    String getName();

    String getDescription();

    String getPicturelink();

    LocalDate getReleasedate();

    int getDuration();

    int getRate();

    Long getId();

}