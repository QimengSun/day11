package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/10 21:25
 * @description:
 */
public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    public void eat(){
        System.out.println("Eat");
    }

    public void walk(){
        System.out.println("Study");
    }
}
