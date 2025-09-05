package com.ninabornemann;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonRepository {

    List<Person> personList = new ArrayList<>();

    public Map<Gender, Integer> countPersonsByGender() {
        int maleCount = 0;
        int femaleCount = 0;
        int diverseCount = 0;
        Map<Gender, Integer> genderCounts = new HashMap<>();
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
}
