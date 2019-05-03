package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void main(String[]args) {
        run();
    }

    public static void run() {
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


        //Skills Vars
        String tempSkillOne;
        String tempLevelSkillOne;
        String tempSkillTwo;
        String tempLevelSkillTwo;
        String tempSkillthree;
        String tempLevelSkillThree;


        //Loop vars
        String newUser;
        boolean switchU = true;

        //ArrayList of Users
        ArrayList<Person> users = new ArrayList<Person>();

        // Start of person var user input
        Scanner keyboard = new Scanner(System.in);

        //TODO:: Need to make a loop. To add multiple users.

        System.out.println("Enter R for a new resume");
        System.out.println("Enter E to exit");
        System.out.println("Enter U to add a new user with a new resume");
        newUser = keyboard.nextLine();

        if (newUser.equalsIgnoreCase("r")) {
            switchU = true;
        }
        if (newUser.equalsIgnoreCase("e")) {
            switchU = false;
        }


        while (switchU == true) {

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
        Making the instance of the education and calling it after that person  + education
         */
            Education u1 = new Education(tempDegreeType, tempMajor, tempUniversityName, tempGraduationYear);

            // EDUCATION IS DONE

            //Start of the job section
            System.out.println("Thank you! Let's start working on your experience ");
            System.out.println("Please enter the name of your most recent employer:");
            tempCompany = keyboard.nextLine();
            System.out.println("Nice! What was your job title?");
            tempJobTitle = keyboard.nextLine();
            System.out.println("Please enter your Start date (Month,Year)");
            tempStartDate = keyboard.nextLine();
            System.out.println("Please enter your end date (Month,Year)");
            tempEndDate = keyboard.nextLine();
            System.out.println("Please enter a description of your role");
            tempJobDescription = keyboard.nextLine();

            //Making an instance of JOB with user Input
            Job j1 = new Job(tempCompany, tempJobTitle, tempStartDate, tempEndDate, tempJobDescription);

            // JOB SECTION IS DONE

            //Start of the skills section

            System.out.println("Let's add some skills to your resume");
            System.out.println("What is the your first skill? (this could be something like python)");
            tempSkillOne = keyboard.nextLine();
            System.out.println("Proficiency level(Fundamental, Novice, Intermediate, Advanced)");
            tempLevelSkillOne = keyboard.nextLine();
            System.out.println("What is the name of your second skill:");
            tempSkillTwo = keyboard.nextLine();
            System.out.println("Proficiency level:(Fundamental, Novice, Intermediate, Advanced");
            tempLevelSkillTwo = keyboard.nextLine();
            System.out.println("What is the name of your third skill:");
            tempSkillthree = keyboard.nextLine();
            System.out.println("Proficiency level:(Fundamental, Novice, Intermediate, Advanced");
            tempLevelSkillThree = keyboard.nextLine();
            System.out.println("WE ARE DONE!");

            // Making an instance of Skills
            Skill s1 = new Skill(tempSkillOne, tempLevelSkillOne, tempSkillTwo, tempLevelSkillTwo, tempSkillthree, tempLevelSkillThree);

            //END OF SKILLS

        /*
        Now making an instance of a person
         */

            Person tempname = new Person(tempName, tempEmail, u1, j1, s1);
            //Adding the user to the arraylist for users
            users.add(tempname);

            //The function below displays the resume for the current user.
            tempname.printPersonInfo();


            System.out.println(users);

            System.out.println("Would you like to add another user (Y/N)?");
            newUser = keyboard.nextLine();

            System.out.println(users);

            if (newUser.equalsIgnoreCase("Y")) {
                run();

            } else {
                switchU = false;
            }


        }

    }
}

