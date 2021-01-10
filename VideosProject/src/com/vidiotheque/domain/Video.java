package com.vidiotheque.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Video {

	String vidURL;
	String vidTitle;
	static ArrayList<String> vidTags;
		
	public Video (String vidURL, String vidTitle, ArrayList<String> vidTags ) {
		this.vidURL = vidURL;
		this.vidTitle = vidTitle;
		Video.vidTags = vidTags;
	}
	
	@Override
	public String toString () {
		return "Title: " +vidTitle +" URL: "+vidURL+" Tags: "+vidTags;
	}
	
	public static void printVidTag (ArrayList<String> vidTags) {
		for (String s: vidTags) {
			System.out.println(s);
		}
	}
	
	
	public ArrayList<Video> vidCollector () {
		ArrayList<Video> vidCollection = new ArrayList<>();
		return vidCollection;			
	}
	
	public boolean vidColCheck () {
		
		System.out.println("Would you like to add a new video? Please, print Y(es) or N(o).");
		Scanner vid = new Scanner(System.in);
		String sc = vid.next();
		System.out.println(sc);
		boolean vidCheck = Pattern.matches("^[Y,y]$", sc);
		return vidCheck;
	}
	
	public String getVidURL() {
		System.out.println("Please, enter video URL: ");
		Scanner url = new Scanner(System.in);
		vidURL= url.nextLine();
		System.out.println(vidURL);
		return vidURL;
	}

	public void setVidURL(String vidURL) {
		this.vidURL = vidURL;
	}

	public String getVidTitle() {
		System.out.println("Please, enter video title: ");
		Scanner sc = new Scanner(System.in);
		vidTitle= sc.nextLine();
		System.out.println(vidTitle);
		return vidTitle;
	}

	public void setVidTitle(String vidTitle) {
		this.vidTitle = vidTitle;
	}
	
	public String getTag() {
		System.out.println("Enter a tag. Type 'Ready' when done: ");
		Scanner sc = new Scanner(System.in);
		String tag = sc.next();
		return tag;
	}
	
	
	public ArrayList<String> getVidTags() {
		ArrayList<String> vidTags = new ArrayList<>();
		return vidTags;
	}

	public void setVidTags(List<String> vidTags) {
		Video.vidTags = (ArrayList<String>) vidTags;
	}
}