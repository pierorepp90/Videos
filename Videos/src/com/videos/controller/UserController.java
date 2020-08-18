package com.videos.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import com.videos.domain.User;
import com.videos.domain.Video;

public class UserController {
	
	
	
	public static User  createUser()throws Exception{
		String newName = JOptionPane.showInputDialog("Please insert your name: ");
		if(newName == null || newName.isEmpty()){
		        throw new RuntimeException();
		}
		String newSurname = JOptionPane.showInputDialog("Please insert your surname: ");
		if(newSurname == null || newSurname.isEmpty()){
		        throw new RuntimeException();
		}
		String newPassword = JOptionPane.showInputDialog("Please insert your password: ");
		if(newPassword == null || newPassword.isEmpty()){
	        throw new RuntimeException();
		}
		Date newRegistrationDate = new Date();
		User newUser = new User(newName,newSurname,newPassword,newRegistrationDate);
		return newUser;

	}
	public static Video createVideo(User currentUser) throws Exception{
		List<String> tags = new ArrayList<String>();
		String tagsOrNo;
		boolean withTags = false;
		
		String tittle = JOptionPane.showInputDialog("Please insert a tittle: ");
		if(tittle.equals("")) {
			throw new RuntimeException();
		}
		String url = JOptionPane.showInputDialog("Please insert the video url: ");
		if(url.equals("")) {
			throw new RuntimeException();
		}

		do {
			tagsOrNo = JOptionPane.showInputDialog("Type 'tag' to add a new tag or 'quit'");
			if(tagsOrNo.equalsIgnoreCase("tag")) {
				String tag = JOptionPane.showInputDialog("Please insert the video tag: ");
				tags.add(tag);
				withTags = true;
			}	
			}while(!tagsOrNo.equalsIgnoreCase("quit"));

		Video newVideo;
		if(withTags) {
			newVideo = new Video(tittle,url,tags);
		}else {
			newVideo = new Video(tittle,url);
		}
		return newVideo;
	}
	
	public static User recognizeUser(List<User> users) {
		String userName = JOptionPane.showInputDialog("Please insert your user name: ");
		String password = JOptionPane.showInputDialog("Please insert your password: ");
		User currentUser = null;
		for(User u: users) {
			if(u.getName().equals(userName)) {
				if(u.getPassword().equals(password)) {
					currentUser = u;
				}
			}
		}
		return currentUser;
	}

}
