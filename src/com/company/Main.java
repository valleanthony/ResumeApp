package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

        //Part two vars
        String tempPhoneNumber;
        boolean edSwitch = false;
        boolean jobSwitch = false;
        boolean skillSwitch = false;
        String ansholder;


        //Loop vars
        String newUser;
        boolean switchU = false;

        //ArrayList of Users
        ArrayList<Person> users = new ArrayList<Person>();

        // Start of person var user input
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter Y for a new resume. Enter N to exit");

        newUser = keyboard.nextLine();

        if (newUser.equalsIgnoreCase("Y")) {
            switchU = true;
        }


        while (switchU == true) { //This is the main loop that controls everything.

            System.out.println("Hello, What is your name?");
            tempName = keyboard.nextLine();
            System.out.println("What is your email?");
            tempEmail = keyboard.nextLine();
            Person tempname = new Person();

            /*
            EDUCATION SECTION::
             */
            System.out.println("Would you like to enter an education section?(Y/N)");
            ansholder = keyboard.nextLine();

            if (ansholder.equalsIgnoreCase("y")) {
                edSwitch = true;
            }

            while (edSwitch == true) {
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
                tempname.setEducation(u1); //Setting the education for the person


                System.out.println("Would you like to add another education section (Y/N)?");
                ansholder = keyboard.nextLine();
                if (ansholder.equalsIgnoreCase("Y")) {

                }
                else{
                    edSwitch = false;
                }


            }
            /*
            EDUCATION SECTION DONE::
             */


             /*
            JOB SECTION::
             */
            System.out.println("Would you like to add a Job to your resume (Y/N)?");
            ansholder = keyboard.nextLine();

            if (ansholder.equalsIgnoreCase("Y")) {
                jobSwitch = true;
            }


            while (jobSwitch == true) {
                //Start of the job section
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
                tempname.setJob(j1); // Adding any jobs to the person
            }


            System.out.println("Let's add some skills to your resume");
            System.out.println("Would you like to add some skills to your resume (Y/N)?");
            ansholder = keyboard.nextLine();

            if (ansholder.equalsIgnoreCase("y")) {
                skillSwitch = true;
            }

            while (skillSwitch == true) {
                //Start of the skills section


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

            }

            System.out.println("WE ARE DONE!");

            //The function below displays the resume for the current user.
            tempname.printPersonInfo();



        } //End of the main while loop to make a resume.





                System.out.println("These are all the users stored in the system."+ users);





        }
    }

