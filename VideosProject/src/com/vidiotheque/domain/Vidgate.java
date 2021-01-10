package com.vidiotheque.domain;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Vidgate {

	public static void main(String[] args) {
		
		//create a user
		System.out.println("Welcome to VidGate. You must create an account.");
		User newUser = new User(null, null, null, null);
		
		String userName = newUser.getUserName();
		boolean validUserName = validateUserName(userName);
		while (validUserName == false) {
			System.out.println("Invalid user name.");
			String name = newUser.getUserName();
			boolean bn = validateUserName (name);
			if (bn == false) {
				System.out.println("Invalid user name.");
			} else {
				System.out.println("Valid name.");
				break;
			}
		} 
		
		String userSurname = newUser.getUserSurname();
		boolean validUserSurname = validateUserSurname(userSurname);
		while (validUserSurname == false) {
			System.out.println("Invalid user surname.");
			String surname = newUser.getUserSurname();
			boolean bn = validateUserSurname (surname);
			if (bn == false) {
				System.out.println("Invalid user surname.");
			} else {
				System.out.println("Valid surname.");
				break;
			}
		}  
		
		String userPass = newUser.getUserPass();
		boolean validUserPass = validateUserPass(userPass);
		while (validUserPass == false) {
			System.out.println("Invalid password.");
			String pass = newUser.getUserPass();
			boolean bn = validateUserPass (pass);
			if (bn == false) {
				System.out.println("Invalid password.");
			} else {
				System.out.println("Valid password.");
				break;
			}
		} 
	  
		Date registryDate = newUser.getRegistryDate();
		boolean validRegDate = validateRegDate(registryDate);
		while (validRegDate == false) {
			System.out.println("Invalid date.");
			Date date = newUser.getRegistryDate();
			boolean bn = validateRegDate (date);
			if (bn == true) {
				System.out.println("Valid date.");
				break;
			} else {
				System.out.println("Invalid date.");
				break;
			}
		} 
		
		System.out.println("Account successfully created!\n");
		System.out.println("Your account details: "+ newUser);
		
		//create video collection
		ArrayList <Video> vidCollection = new ArrayList<>();
		//Then we begin to add objects by executing Video object methods
		System.out.println("Proceed to video creation.");
					
		Video newVideo = new Video(null, null, null);
		
		while (newVideo.vidColCheck()) {
		//if (vidCheck == true) {
			newVideo.getVidTitle(); 
			newVideo.getVidURL();
			ArrayList<String> vidTags=newVideo.getVidTags();
				String tag = newVideo.getTag();
				boolean rightTag = validateTag(tag);
				System.out.println(rightTag);
				vidTags.add(tag);
				while (rightTag == true) {	
					String tag1 = newVideo.getTag();
					boolean valTag = validateTag(tag1);
					System.out.println(valTag);
					vidTags.add(tag1);
					if (valTag == false) {
						System.out.println("Tag list complete.");
						break;
					} 
				}		
			System.out.println(newVideo);
			//Once a video is finished we add it to the Video list
			vidCollection.add(newVideo);
						
		}
		
		
		//print out video list
		System.out.println("Your list if finished. These are your videos: \n");
		
		/*WATCH IT:
		 *  repeats first video... probably same object instantiation
		 *  tag list is null... 
		 *  */
		int vidCount = 0;
		for (int i = 0; i < vidCollection.size(); i++) {
			vidCount = vidCount + 1;
			System.out.println("Video " + vidCount+ ":"+vidCollection.get(i));
		}
		
	}

	
	
	public static boolean validateUserName (String userName) {
		boolean validUserName = Pattern.matches("^[A-Z]{1}[a-z]{2,15}$", userName);
		System.out.println(validUserName);
		return validUserName;
	}
	
	public static boolean validateUserSurname (String userSurname) {
		boolean validUserSurname = Pattern.matches("^[A-Z]{1}[a-z]{2,15}$", userSurname);
		return validUserSurname;
	}
	
	public static boolean validateUserPass (String userPass) {
		boolean validUserPass = Pattern.matches("^[0-9A-Za-z]{8,20}$", userPass);
		return validUserPass;
	}

	public static boolean validateRegDate (Date date) {
		SimpleDateFormat formatDate = new SimpleDateFormat ("dd-mm-yyyy");
		String dst = formatDate.format(date);
		boolean validRegDate = Pattern.matches("^[0-3][0-9]-[0-3][0-9]-(?:[0-9][0-9])?[0-9][0-9]$", dst);
		System.out.println("Given date is " +validRegDate);
		return validRegDate;
	}

	public static boolean validateTag (String tag) {
		boolean rightTag = !Pattern.matches("^[ready,Ready]{5}$", tag);
		System.out.println(rightTag);
		return rightTag;
	}
	
	/*public static void vidColPrint (ArrayList<Video> vidCollection) {
		for (Video vid: vidCollection) {
			System.out.println(vid);
		}		
	}
	*/
	
	
	
}