package co.simplon.whatstream.dtos;

public class ContentCreate {

    private String name;

    private String description;

    private String author;

    private int duration;

    public ContentCreate() {
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

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public int getDuration() {
	return duration;
    }

    public void setDuration(int duration) {
	this.duration = duration;
    }

}
