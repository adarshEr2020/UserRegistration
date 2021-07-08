package com.bridgelabz.userregistration;

/*User Registration
 * 
 *User Registration System needs to ensure all validations
 *
 *are in place during the User Entry
 *
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner scan = new Scanner(System.in);

	// First name validation 
	public boolean firstName() {

		System.out.println("Enter first name : ");
		String firstName = scan.next();
		String namePatten = "^[A-Z]{1}[a-z]{2}";
		Pattern pattern = Pattern.compile(namePatten);
		Matcher matcher = pattern.matcher(firstName);
		return  matcher.matches();
	}

	// Last name validation  
	public boolean lastName() {

		System.out.println("Enter last name : ");
		String lastName = scan.next();
		String namePatten = "^[A-Z]{1}[a-z]{2}";
		Pattern pattern = Pattern.compile(namePatten);
		Matcher matcher = pattern.matcher(lastName);
		return  matcher.matches();
	}

	// Email validation 
	public boolean validEmail() {
		System.out.println("Enter email : ");
		String userEmail = scan.next();
		String emailPattern ="^([0-9]{2})?[0-9]{10}" ;
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(userEmail);
		return matcher.matches();
	}

	// Mobile format validation 
	public boolean mobileFormat() {
		System.out.println("Enter mobile no with country : ");
		String mobile = scan.next();
		String mobilePattern ="^(0|91)?[6-9]{1}[0-9]{9}$";
		Pattern pattern = Pattern.compile(mobilePattern);
		Matcher matcher = pattern.matcher(mobile);
		return matcher.matches();
	}

	// Main method here 
	public static void main(String[] args) {

		System.out.println("Welcome to user registration problem :");
		UserRegistration user = new UserRegistration();
		
		boolean result1 = user.firstName();
		System.out.println("first name" +result1);
		
		boolean result2 = user.lastName();
		System.out.println("last name " +result2);
		
		boolean result3 = user.validEmail();
		System.out.println("last name " +result3);
		
		boolean result4 = user.mobileFormat();
		System.out.println("Mobile format validation " +result4);
	}

}
