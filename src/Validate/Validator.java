package Validate;

import java.util.Scanner;

public class Validator {

    public static String validateName(Scanner scanner){
        String name = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.println("What is your name? ");
            name = scanner.next();

            // Regular expression to check if name contains any digits
            if (name.matches(".*\\d.*")) {
                System.out.println("Name cannot contain numbers. Please enter a valid name.");
            } else if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty. Please enter a valid name.");
            } else {
                validInput = true;  // Valid name entered
            }
        }
        return name;
    }

    public static int validateAge(Scanner scanner) {
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("What is your age? ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            }
            if (age > 0 || age < 120) {
                validInput = true;
            } else {
                System.out.println("Please re-enter a valid age.");
                scanner.next();
            }
        }
        return age;
    }

    public static String validateGender (Scanner scanner){
        String gender = "";
        boolean validInput = false;
        while(!validInput) {
            System.out.println("What is your gender?");
            gender = scanner.next();
            if (gender.isEmpty()) {
                System.out.println("Gender cannot be empty.");
            }
            if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
                System.out.println("Invalid gender. Please enter Male or Female.");
            } else {
                validInput = true;
            }
        }
        return gender;
    }

    public static double validateWeight(Scanner scanner) {
        double weight;
        while (true) {
            System.out.println("What is your weight?");
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                if (weight > 0) {
                    break;
                } else {
                    System.out.println("Weight must be positive.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number for weight.");
                scanner.next(); // Clear invalid input
            }
        }
        return weight;
    }
}
