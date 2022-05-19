package co.simplon.whatstream.dtos;

public class ContentCreate {

    private String name;

    private String description;

    private String duration;

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

    public String getDuration() {
	return duration;
    }

    public void setDuration(String duration) {
	this.duration = duration;
    }
}
