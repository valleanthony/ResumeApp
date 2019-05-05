package com.company;

public class Person {
    private String Name;
    private String Email;
    private String PhoneNumber;
    private Education education;
    private Education education2;
    private  Job job;
    private  Job Job2;
    private  Job Job3;
    private Skill skill;


//CONSTRUCTORS
    public Person() {
    }

    public Person(String name, String email, String phoneNumber, Education education, Education education2, Job job, Job job2, Job job3, Skill skill) {
        Name = name;
        Email = email;
        PhoneNumber = phoneNumber;
        this.education = education;
        this.education2 = education2;
        this.job = job;
        Job2 = job2;
        Job3 = job3;
        this.skill = skill;
    }

    //GETTERS and SETTERS
    public Education getEducation2() {
        return education2;
    }

    public void setEducation2(Education education2) {
        this.education2 = education2;
    }

    public Job getJob2() {
        return Job2;
    }

    public void setJob2(Job job2) {
        Job2 = job2;
    }

    public Job getJob3() {
        return Job3;
    }

    public void setJob3(Job job3) {
        Job3 = job3;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }


    public void printPersonInfo(){
        // TODO: this needs to be fixed
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getPhoneNumber());
        //System.out.println();



    }





}
