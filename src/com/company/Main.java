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
            Person tempname = new Person(); //Making an instance of a person

            System.out.println("Hello, What is your name?");
            tempName = keyboard.nextLine();
            tempname.setName(tempName);

            System.out.println("What is your email?");
            tempEmail = keyboard.nextLine();
            tempname.setEmail(tempEmail);

            System.out.println("Enter your phone Number:");
            tempPhoneNumber= keyboard.nextLine();
            tempname.setPhoneNumber(tempPhoneNumber);

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
               //making the instance of the education and calling it after that person  + education
                Education e1 = new Education(tempDegreeType, tempMajor, tempUniversityName, tempGraduationYear);
                tempname.setEducation(e1); //Setting the education for the person

                System.out.println("Would you like to add another education section (Y/N)?");
                ansholder = keyboard.nextLine();
                if (ansholder.equalsIgnoreCase("Y")) {
                    System.out.println("What is the the type of degree (BA/MS/PHD)?");
                    tempDegreeType = keyboard.nextLine();
                    System.out.println("What was your major?");
                    tempMajor = keyboard.nextLine();
                    System.out.println("what was the name of the university?");
                    tempUniversityName = keyboard.nextLine();
                    System.out.println("What year did you graduate?");
                    tempGraduationYear = keyboard.nextLine();
                    Education e2 = new Education(tempDegreeType, tempMajor, tempUniversityName, tempGraduationYear);
                    tempname.setEducation2(e2); //Setting the education for the person
                    edSwitch = false;

                }
                else{
                    edSwitch = false;
                }

            }
            /*
            EDUCATION SECTION DONE::
             */


             /*
            JOB SECTION:: You can have up to two jobs or no jobs
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
                tempname.setJob(j1); // Adding any jobs to the person
                // JOB SECTION IS DONE
                System.out.println("Would you like to add another Job section (Y/N)?");
                ansholder = keyboard.nextLine();
                if (ansholder.equalsIgnoreCase("Y")) {
                    System.out.println("Please enter the name of your most recent employer:");
                    tempCompany = keyboard.nextLine();
                    System.out.println("What was your job title?");
                    tempJobTitle = keyboard.nextLine();
                    System.out.println("Please enter your Start date (Month,Year)");
                    tempStartDate = keyboard.nextLine();
                    System.out.println("Please enter your end date (Month,Year)");
                    tempEndDate = keyboard.nextLine();
                    System.out.println("Please enter a description of your role");
                    tempJobDescription = keyboard.nextLine();
                    //Making an instance of JOB with user Input
                    Job j2 = new Job(tempCompany, tempJobTitle, tempStartDate, tempEndDate, tempJobDescription);
                    tempname.setJob2(j2); // Adding any jobs to the person
                    jobSwitch=false;
                    // JOB SECTION IS DONE
                }
                else{
                    jobSwitch = false;
                }

            }

            System.out.println("Let's add some skills to your resume");
            System.out.println("you can add up to three skills");
            System.out.println("Would you like to add some skills to your resume (Y/N)?");
            ansholder = keyboard.nextLine();

            if (ansholder.equalsIgnoreCase("y")) {
                skillSwitch = true;
            }

            while (skillSwitch == true) {
                //Start of the skills section
                //making an instance and then setting skills as the user decides to add them
                Skill sk = new Skill();


                System.out.println("What is the your first skill? (this could be something like python)");
                tempSkillOne = keyboard.nextLine();
                sk.setSkillOne(tempSkillOne); //setting skill one name
                System.out.println("Proficiency level(Fundamental, Novice, Intermediate, Advanced)");
                tempLevelSkillOne = keyboard.nextLine();
                sk.setLevelSkillOne(tempLevelSkillOne);

                System.out.println("Add another skill? (Y/N)");
                ansholder = keyboard.nextLine();
                if (ansholder.equalsIgnoreCase("Y")) {
                    System.out.println("What is the name of your second skill:");
                    tempSkillTwo = keyboard.nextLine();
                    sk.setSkillTwo(tempSkillTwo);
                    System.out.println("Proficiency level:(Fundamental, Novice, Intermediate, Advanced");
                    tempLevelSkillTwo = keyboard.nextLine();
                    sk.setLevelSkillTwo(tempLevelSkillTwo);
                    System.out.println("Add another skill? (Y/N)"); //asking the user if they want to add another skill
                    ansholder = keyboard.nextLine();

                    if (ansholder.equalsIgnoreCase("Y")) {
                        System.out.println("What is the name of your third skill:");
                        tempSkillthree = keyboard.nextLine();
                        sk.setSkillthree(tempSkillthree);
                        System.out.println("Proficiency level:(Fundamental, Novice, Intermediate, Advanced");
                        tempLevelSkillThree = keyboard.nextLine();
                        sk.setLevelSkillThree(tempLevelSkillThree);
                        tempname.setSkill(sk);
                        skillSwitch = false;
                    }

                    else{
                        tempname.setSkill(sk);
                        skillSwitch = false;

                    }


                }
                else{
                    tempname.setSkill(sk);
                    skillSwitch = false;
                }
                //END OF SKILLS
            }
            System.out.println("WE ARE DONE!");
            //The function below displays the resume for the current user.

            tempname.printPersonInfo();
//            System.out.println();
//            System.out.println("-------------------------");
//            System.out.println(tempname.getName());
//            System.out.println(tempname.getEmail());
//            System.out.println(tempname.getPhoneNumber());
//            tempname.getEducation().printMyEducation();
//            tempname.getEducation2().printMyEducation();
//
//
//
//            System.out.println("-------------------------");
            users.add(tempname);
            System.out.println("Would you like to add another user?");
            ansholder = keyboard.nextLine();
            if (ansholder.equalsIgnoreCase("Y")){

            }
            else{
                switchU =false;
            }

        } //End of the main while loop to make a resume.

                System.out.println("These are all the users stored in the system."+ users);
        }
    }

