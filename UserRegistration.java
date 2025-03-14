package PasswordCheck;

import java.util.Scanner;



public class UserRegistration {
    public void registerUser(String password, String confirmPassword) {
        try (ValidationLogger logger = new ValidationLogger()) {
            PasswordValidator validator = new PasswordValidator();
            validator.ValidatePassword(password, confirmPassword);
            logger.LogSuccess();
        } catch (WeakPasswordException | PasswordMismatchException e) {
            try (ValidationLogger logger = new ValidationLogger()) {
                logger.LogFail(e.getMessage());
            }
        } finally {
            try (ValidationLogger logger = new ValidationLogger()) {
                logger.close();
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
 
        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();
 
        UserRegistration registration = new UserRegistration();
        registration.registerUser(password, confirmPassword);
    }
}