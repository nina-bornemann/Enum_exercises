package com.ninabornemann;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(TrafficLight.RED.getDescription());
        System.out.println(TrafficLight.GREEN.getDescription());

        System.out.println(DaysOfWeek.WEDNESDAY.getDayInWeek());
        System.out.println(DaysOfWeek.SATURDAY.getDayInWeek());

        Person p1 = new Person("1", "Nina", DaysOfWeek.THURSDAY, Gender.FEMALE);
        Person p2 = new Person("2", "Alex", DaysOfWeek.FRIDAY, Gender.MALE);
        Person p3 = new Person("3", "John", DaysOfWeek.MONDAY, Gender.DIVERSE);

        PersonRepository personRepo = new PersonRepository();

        personRepo.personList.add(p1);
        personRepo.personList.add(p2);
        personRepo.personList.add(p3);

        System.out.println(personRepo.countPersonsByGender());
        System.out.println(personRepo.getFavDayofPersons());

    }


}