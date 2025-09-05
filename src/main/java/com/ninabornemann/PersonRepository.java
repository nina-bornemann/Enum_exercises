package com.ninabornemann;

import java.util.*;

public class PersonRepository {

    List<Person> personList = new ArrayList<>();

    public Map<Gender, Integer> countPersonsByGender() {
        int maleCount = 0;
        int femaleCount = 0;
        int diverseCount = 0;
        Map<Gender, Integer> genderCounts = new LinkedHashMap<>();
        for (Person p : personList) {
            if (p.gender().equals(Gender.MALE)) {
                maleCount++;
            } else if (p.gender().equals(Gender.FEMALE)) {
                femaleCount++;
            } else if (p.gender().equals(Gender.DIVERSE)) {
                diverseCount++;
            }
        }
        genderCounts.put(Gender.MALE, maleCount);
        genderCounts.put(Gender.FEMALE, femaleCount);
        genderCounts.put(Gender.DIVERSE, diverseCount);
        return genderCounts;
    }


    public List<String> getFavDayofPersons() {
        List<String> favDayList = new ArrayList<>();
        for (Person p : personList) {
            String info = p.name() + "= Favorite day: " + p.favDay().getDayInWeek();
            favDayList.add(info);
        }
        return favDayList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "personList=" + personList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(personList, that.personList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(personList);
    }
}
