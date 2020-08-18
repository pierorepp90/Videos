package com.videos.domain;

import java.util.ArrayList;
import java.util.List;

public class Video {

	protected String tittle;
	protected String url;
	protected List<String> tags = new ArrayList<String>();
	
	
public Video(String tittle, String url, List<String> tags ) throws Exception {
		this.tittle = tittle;
		this.url = url;
		this.tags = tags;

}
public Video(String tittle, String url) throws Exception {
	this.tittle = tittle;
	this.url = url;

}
}

