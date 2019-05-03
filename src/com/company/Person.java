package com.company;

public class Person {
    private String Name;
    private String Email;
    private Education education;

    public Person() {
    }

    public Person(String name, String email, Education education) {
        Name = name;
        Email = email;
        this.education = education;
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
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println();
        education.printMyEducation();


    }

}
