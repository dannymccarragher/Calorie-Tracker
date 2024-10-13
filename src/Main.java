import personInfo.Person;
import java.util.Scanner;
import Validate.Validator;

import static Validate.Validator.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to CalorieTracker. ");
        String name = validateName(scanner);
        int age = validateAge(scanner);
        String gender = validateGender(scanner);
        double weight = validateWeight(scanner);

        Person newPerson = new Person(name, age, gender, weight);

        System.out.println(newPerson);


    }


}