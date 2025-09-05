package com.ninabornemann;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepositoryTest {
    @Test
    void countPersonsByGender_IsEqual() {
        Person p1 = new Person("12", "Lena", DaysOfWeek.SUNDAY, Gender.DIVERSE);
        Person p2 = new Person("25", "Sarah", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person p3 = new Person("37", "Joe", DaysOfWeek.MONDAY, Gender.DIVERSE);
        PersonRepository personRepo = new PersonRepository();
        personRepo.personList.add(p1);
        personRepo.personList.add(p2);
        personRepo.personList.add(p3);
        String expected = "{MALE=0, FEMALE=1, DIVERSE=2}";
        String actual = personRepo.countPersonsByGender().toString();
        assertEquals(expected, actual);
    }

    @Test
    void countPersonsByGender_IsNotEqual() {
        Person p1 = new Person("12", "Lena", DaysOfWeek.SUNDAY, Gender.DIVERSE);
        Person p2 = new Person("25", "Sarah", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person p3 = new Person("37", "Joe", DaysOfWeek.MONDAY, Gender.MALE);
        PersonRepository personRepo = new PersonRepository();
        personRepo.personList.add(p1);
        personRepo.personList.add(p2);
        personRepo.personList.add(p3);
        String expected = "{MALE=0, FEMALE=1, DIVERSE=2,}";
        String actual = personRepo.countPersonsByGender().toString();
        assertNotEquals(expected, actual);
    }

    @Test
    void getFavDayofPersons_isEqual() {
        Person p1 = new Person("12", "Lena", DaysOfWeek.WEDNESDAY, Gender.DIVERSE);
        Person p2 = new Person("25", "Sarah", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person p3 = new Person("37", "Joe", DaysOfWeek.MONDAY, Gender.DIVERSE);
        PersonRepository personRepo = new PersonRepository();
        personRepo.personList.add(p1);
        personRepo.personList.add(p2);
        personRepo.personList.add(p3);
        String expected = "[Lena= Favorite day: Wednesday, Sarah= Favorite day: Friday, Joe= Favorite day: Monday]";
        String actual = personRepo.getFavDayofPersons().toString();
        assertEquals(expected, actual);
    }

    @Test
    void getFavDayofPersons_isNotEqual() {
        Person p1 = new Person("12", "Lena", DaysOfWeek.WEDNESDAY, Gender.DIVERSE);
        Person p2 = new Person("25", "Sarah", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person p3 = new Person("37", "Joe", DaysOfWeek.MONDAY, Gender.DIVERSE);
        PersonRepository personRepo = new PersonRepository();
        personRepo.personList.add(p1);
        personRepo.personList.add(p2);
        personRepo.personList.add(p3);
        String expected = "[Lena= Favorite day: Sunday, Sarah= Favorite day: Friday, Joe= Favorite day: Monday]";
        String actual = personRepo.getFavDayofPersons().toString();
        assertNotEquals(expected, actual);
    }
}