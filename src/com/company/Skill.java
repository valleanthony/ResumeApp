package com.company;

import java.sql.SQLOutput;

public class Skill {
    private String skillOne;
    private String levelSkillOne;
    private String skillTwo;
    private String levelSkillTwo;
    private String skillthree;
    private String levelSkillThree;


    //Constructors
    public Skill(String skillOne, String levelSkillOne, String skillTwo, String levelSkillTwo, String skillthree, String levelSkillThree) {
        this.skillOne = skillOne;
        this.levelSkillOne = levelSkillOne;
        this.skillTwo = skillTwo;
        this.levelSkillTwo = levelSkillTwo;
        this.skillthree = skillthree;
        this.levelSkillThree = levelSkillThree;
    }

    public Skill() {
    }



    // GETTERS & SETTERS


    public String getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(String skillOne) {
        this.skillOne = skillOne;
    }

    public String getLevelSkillOne() {
        return levelSkillOne;
    }

    public void setLevelSkillOne(String levelSkillOne) {
        this.levelSkillOne = levelSkillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getLevelSkillTwo() {
        return levelSkillTwo;
    }

    public void setLevelSkillTwo(String levelSkillTwo) {
        this.levelSkillTwo = levelSkillTwo;
    }

    public String getSkillthree() {
        return skillthree;
    }

    public void setSkillthree(String skillthree) {
        this.skillthree = skillthree;
    }

    public String getLevelSkillThree() {
        return levelSkillThree;
    }

    public void setLevelSkillThree(String levelSkillThree) {
        this.levelSkillThree = levelSkillThree;
    }

    //TODO: Work on the Print Method for this class

    public void printMySkills(){
        System.out.println();
        System.out.println("Skills:");
        System.out.println(getLevelSkillOne()+ " in "+ getSkillOne());
        System.out.println(getLevelSkillTwo()+ " in "+ getSkillTwo());
        System.out.println(getLevelSkillThree()+ " in "+ getSkillthree());



    }

}
