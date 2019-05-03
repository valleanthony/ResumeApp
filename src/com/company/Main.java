package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring all my vars


        // Person temp vars
        String tempName;
        String tempEmail;

        //Education temp vars
        String tempDegreeType;
        String tempMajor;
        String tempUniversityName;
        String tempGraduationYear;



        /*

        Making holder variables - userName  + Education or username + Job

        THESE ARE THE VARS THAT YOU SHOULD USE TO NAME AN INSTANCE
         */




        //Will have to make some type of loop to support multiple users.

        // Start of person var user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        tempName = keyboard.nextLine();
        System.out.println("What is your email?");
        tempEmail = keyboard.nextLine();

        // Asking for education vars to make an instance
        System.out.println("Tell us about your education, What is the highest degree that you currently hold?");
        tempDegreeType = keyboard.nextLine();
        System.out.println("What was your major?");
        tempMajor = keyboard.nextLine();
        System.out.println("what was the name of your university?");
        tempUniversityName = keyboard.nextLine();
        System.out.println("What year did you graduate?");
        tempGraduationYear = keyboard.nextLine();

        String UserEducation = tempName + " Education";


        /*
        Making the instance of the education and calling it after that person  + education
         */
        Education u1 = new Education(tempDegreeType,tempMajor,tempUniversityName,tempGraduationYear);

        /*
        Now making an instance of a person
         */

        Person tempname = new Person(tempName,tempEmail,u1);

        tempname.printPersonInfo();

    }
}
