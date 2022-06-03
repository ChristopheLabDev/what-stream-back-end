package co.simplon.whatstream.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "picturelink")
    private String picturelink;

    @Column(name = "releasedate")
    private LocalDate releasedate;

    @Column(name = "duration")
    private int duration;

    @Column(name = "rate")
    private int rate;

    public Content() {
	// Default no-arg constructor
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
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

    @Override
    public String toString() {
	return "Content [id=" + id + ", name=" + name + ", description=" + description + ", picturelink=" + picturelink
		+ ", releasedate=" + releasedate + ", duration=" + duration + ", rate=" + rate + "]";
    }

}
