package PasswordCheck;

import java.util.*;

public class PasswordValidator {
	
	public static void ValidatePassword(String Password,String ConfirmPassword) throws WeakPasswordException,PasswordMismatchException{
		
		if(Password.length()<8) {
			throw new WeakPasswordException("Password must contain 8 Characters");
		}
		
		if(Password.length()>20) {
			throw new WeakPasswordException("Password should not exceed 20 Characters");
		}
		
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasNumber = false;
		boolean hasSpecialchar = false;
		String SpecialCharacters = "!@#$%^&*";
		
		
		for(char ch: Password.toCharArray()) {
			
			if(Character.isUpperCase(ch)) hasUppercase = true;
			if(Character.isLowerCase(ch)) hasLowercase = true;
			if(Character.isDigit(ch)) hasNumber = true;
			if(SpecialCharacters.indexOf(ch)>= 0) hasSpecialchar = true;
			
		}
		if(!hasUppercase || !hasLowercase || !hasNumber || !hasSpecialchar) {
			
			throw new WeakPasswordException("The Password must contain atleast one Uppercase or Lowercase or Special character or Number");
			
		}
		
		if(!Password.equals(ConfirmPassword)) {
			
			throw new PasswordMismatchException("Both passwordds must match ");
		}
		
		System.out.println("password has been set");



	}
	
	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the password");
//		String password = s.nextLine();
//		
//		System.out.println("Confirm the password");
//		String confirmpassword = s.nextLine();
//		
//		
//		try {
//			
//			ValidatePassword(password,confirmpassword);
//		
//		}catch (WeakPasswordException | PasswordMismatchException e){
//			
//			System.out.println(" Unable to set Password " + e.getMessage());
//		}
	}
	
}
