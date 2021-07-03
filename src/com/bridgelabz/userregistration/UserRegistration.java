package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scan = new Scanner(System.in);
	public boolean firstName() {

		System.out.println("Enter first name : ");
		String firstName = scan.next();
		String namePatten = "^[A-Z]{1}[a-z]{2}";
		Pattern pattern = Pattern.compile(namePatten);
		Matcher matcher = pattern.matcher(firstName);
		return  matcher.matches();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to user registration problem :");
		UserRegistration user = new UserRegistration();
		boolean result1 = user.firstName();
		System.out.println("first name" +result1);
		
	}

}


