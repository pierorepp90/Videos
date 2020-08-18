package com.videos.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.videos.controller.UserController;
import com.videos.domain.User;
import com.videos.domain.Video;

public class Main {

	public static void main(String[] args) throws Exception {
		List<User> users = new ArrayList<User>();
		String whatToDo;
		do {
			whatToDo = JOptionPane.showInputDialog("Type 'user' to create a new user,'video' to add a new video or 'quit'");
			if(whatToDo.equalsIgnoreCase("user")) {
				User newUser = UserController.createUser();
				users.add(newUser);
			}else if(whatToDo.equalsIgnoreCase("video")) {
				User currentUser = UserController.recognizeUser(users);
				if(currentUser != null) {
				Video newVideo = UserController.createVideo(currentUser);
				currentUser.AddVideo(newVideo);
				}
			}
			
		}while
			(!whatToDo.equalsIgnoreCase("quit"));

	}

}
