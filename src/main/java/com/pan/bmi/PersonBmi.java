package com.pan.bmi;


public class PersonBmi {
    public static void main(String[] args) {
        Person person = new Person(49.5f, 1.65f);
        System.out.println(person.bmi());
        person.hello();
    }
}
