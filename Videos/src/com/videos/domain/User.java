package com.videos.domain;

import java.util.*;

public class User {
	
	protected String name;
	protected String surname;
	protected String password;
	protected Date registrationDate;
	protected List<Video> videos = new ArrayList<Video>();
	

public User(String name, String surname, String password, Date registrationDate) {
	this.name = name;
	this.surname = surname;
	this.password = password;
	this.registrationDate = registrationDate;
}


public String getName() {
	return name;
}


public String getPassword() {
	return password;
}


public List<Video> getVideos() {
	return videos;
}


public void setVideos(List<Video> videos) {
	this.videos = videos;
}



public void AddVideo(Video newVideo) {
	this.videos.add(newVideo);
	
}
}
