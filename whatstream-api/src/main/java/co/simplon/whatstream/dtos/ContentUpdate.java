package co.simplon.whatstream.dtos;

import java.time.LocalDate;

public class ContentUpdate {

    private String name;

    private String description;

    private String picturelink;

    private LocalDate releasedate;

    private int duration;

    private int rate;

    public ContentUpdate() {
	// Default no-arg constructor
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getPicturelink() {
	return picturelink;
    }

    public void setPicturelink(String picturelink) {
	this.picturelink = picturelink;
    }

    public LocalDate getReleasedate() {
	return releasedate;
    }

    public void setReleasedate(LocalDate releasedate) {
	this.releasedate = releasedate;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

    public int getRate() {
	return rate;
    }

    public void setRate(int rate) {
	this.rate = rate;
    }

}