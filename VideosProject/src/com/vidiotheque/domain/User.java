package com.vidiotheque.domain;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class User {
	
	String userName;
	String userSurname;
	String userPass;
	String date;
	Date userReg;
		
	//@Override
	//public String toString() {
	 // return getClass().getSimpleName() + "[Name=" + userName + "] + [Surname=" + userSurname + "] "
	  	//	+ "+ [Password=" +userPass+ "]+ [Date of registry= " +userReg +"]";
	//}

	public User (String userName, String userSurname, String userPass, Date userReg) {
		this.userName = userName;
		this.userSurname = userSurname;
		this.userPass= userPass; 
		this.userReg = userReg;
	}
	
	
	@Override
	public String toString () {
			return " Name: "+userName+ ";" +" Surname: "+userSurname+ ";" +" Password: "+userPass +";" + " Date of register: "+date+ ".";
	}
	

	public String getUserName() {
		System.out.println("Please, enter your name: ");
		Scanner sc = new Scanner(System.in);
		userName = sc.next();
		System.out.println(userName);
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		
	}

	public String getUserSurname() {
		System.out.println("Please, enter your surname: ");
		Scanner sc = new Scanner(System.in);
		this.userSurname = sc.next();
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserPass() {
		System.out.println("Please, entre your password. Must between 8 and 10 characters with any number or letter : ");
		Scanner sc = new Scanner(System.in);
		this.userPass = sc.next();
		return userPass;
	}
	
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Date getRegistryDate() {
		System.out.println("Please, enter the date (dd-mm-yyyy): ");
		Scanner dateStr = new Scanner (System.in);
		SimpleDateFormat formatDate = new SimpleDateFormat ("dd-mm-yyyy");
		date = dateStr.nextLine();		
		Date userReg = null;
		try {
			userReg = formatDate.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println(date);
		return userReg;
	}

	public void setRegistryDate(Date userReg) {
		this.userReg = userReg;
	}
	
	

}

