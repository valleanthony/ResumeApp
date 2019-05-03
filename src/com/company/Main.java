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

        //Job temp vars

        String tempCompany;
        String tempJobTitle;
        String tempStartDate;
        String tempEndDate;
        String tempJobDescription;


        // TODO: Will have to make some type of loop to support multiple users.

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


        /*
        TODO: Fix the User var below to make the program dynamic

        Making holder variables - userName  + Education or username + Job

        THESE ARE THE VARS THAT YOU SHOULD USE TO NAME AN INSTANCE
         */
        ///String UserEducation = tempName + " Education";


        /*
        Making the instance of the education and calling it after that person  + education
         */
        Education u1 = new Education(tempDegreeType,tempMajor,tempUniversityName,tempGraduationYear);

        // EDUCATION IS DONE

        //Start of the job section
        System.out.println("Thank you! Let's start working on your experience ");
        System.out.println("Please enter the name of your most recent employer:");
        tempCompany = keyboard.nextLine();
        System.out.println("Nice! What was your job title?");
        tempJobTitle =keyboard.nextLine();
        System.out.println("Please enter your Start date (Month,Year)");
        tempStartDate = keyboard.nextLine();
        System.out.println("Please enter your end date (Month,Year)");
        tempEndDate = keyboard.nextLine();
        System.out.println("Please enter a description of your role");
        tempJobDescription = keyboard.nextLine();

        //Making an instance of JOB with user Input
        Job j1 = new Job(tempCompany,tempJobTitle,tempStartDate,tempEndDate,tempJobDescription);









        /*
        Now making an instance of a person
         */

        Person tempname = new Person(tempName,tempEmail,u1,j1);

        tempname.printPersonInfo();

    }
}
