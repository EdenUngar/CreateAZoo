package com.company.people;

public class Person {

    private int age;
    private String name;
    private char gender;
    private String race;

    public Person(int age, String name, char gender, String race) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.race = race;
    }

    //default constructor
    public Person() { }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }
    //race cannot change

}
