package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/10 21:27
 * @description:
 */
public class Student extends Person{
    private String major;

    public Student(){

    }

    public Student(String major) {
        this.major = major;
    }

    public Student(int age, String name, String major) {
        super(age, name);
        this.major = major;
    }

    public void study(){
        System.out.println("Study!");
    }
}
