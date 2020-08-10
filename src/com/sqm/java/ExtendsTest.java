package com.sqm.java;

/**
 * @author: sqm
 * @date: 2020/8/10 21:31
 * @description:
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.study();
    }
}
