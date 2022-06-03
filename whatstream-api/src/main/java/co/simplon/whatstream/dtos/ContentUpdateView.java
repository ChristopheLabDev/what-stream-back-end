package co.simplon.whatstream.dtos;

import java.time.LocalDate;

public interface ContentUpdateView {

    Long getId();

    String getName();

    String getDescription();

    String getPicturelink();

    LocalDate getReleasedate();

    int getDuration();

    int getRate();

}
