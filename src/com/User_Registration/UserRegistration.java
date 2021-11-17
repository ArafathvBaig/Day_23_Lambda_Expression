package com.User_Registration;

import java.util.regex.Pattern;

@FunctionalInterface
interface FirstName
{
	void firstName(String firstName);
}
@FunctionalInterface
interface LastName
{
	void lastName(String lastName);
}
@FunctionalInterface
interface Email
{
	void email(String email);
}
@FunctionalInterface
interface PhoneNumber
{
	void phoneNumber(String phoneNumber);
}
@FunctionalInterface
interface Password
{
	void password(String password);
}
public class UserRegistration 
{
	
	public static void main(String[] args)
	{
		FirstName fn = (firstName) -> {
			boolean check = Pattern.matches("([A-Z][a-z]{2,})", firstName);
			if(check == true)
			{
				System.out.println("First Name is Correct: "+firstName);
			}
			else
			{
				System.out.println("First Name is InCorrect");
			}
		};
		fn.firstName("Arafath");
		LastName ln = (lastName) -> {
			boolean check = Pattern.matches("([A-Z][a-z]{2,})", lastName);
			if(check == true)
			{
				System.out.println("Last Name is Correct: "+lastName);
			}
			else
			{
				System.out.println("Last Name is InCorrect");
			}
		};
		ln.lastName("Baig");
		Email e= (email) -> {
			boolean check = Pattern.matches("(([a-z A-Z]{3,})([.])?([a-z A-Z]{3,})?+@(bl)([.])(co)([.])?([a-z]{2})?)", email);
			if(check == true)
			{
				System.out.println("Email is Correct: "+email);
			}
			else
			{
				System.out.println("Email is InCorrect");
			}
		};
		e.email("Arafath.Baig@bl.co.in");
		PhoneNumber pn = (phoneNumber) -> {
			boolean check = Pattern.matches("(([0-9]{2}) ([0-9]{10}))", phoneNumber);
			if(check == true)
			{
				System.out.println("Phone Number is Correct: "+phoneNumber);
			}
			else
			{
				System.out.println("Phone Number is InCorrect");
			}
		};
		pn.phoneNumber("91 9115513683");
		Password p = (password) -> {
			boolean check = Pattern.matches("(([A-Z]{1})([a-z]{7,})([0-9]{1,})([$&+,:;=?@#|'<>.-^*()%!]?))", password);
			if(check == true)
			{
				System.out.println("Password is Correct: "+password);
			}
			else
			{
				System.out.println("Password is InCorrect");
			}
		};
		p.password("Arafathbaig1997@");		
	}
}









