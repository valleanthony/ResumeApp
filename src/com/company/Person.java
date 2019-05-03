package com.company;

public class Person {
    private String Name;
    private String Email;
    private Education education;

    //Need to add getters and setters and constructors
    private  Job job;
    private Skill skill;

//CONSTRUCTORS
    public Person() {
    }

    public Person(String name, String email, Education education, Job job) {
        Name = name;
        Email = email;
        this.education = education;
        this.job = job;
    }

    //GETTERS and SETTERS
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
        System.out.println();
        System.out.println("-------------------------");
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println();
        education.printMyEducation();
        job.printMyjob();


    }

}
