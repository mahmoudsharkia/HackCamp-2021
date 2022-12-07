package main.model;

import java.util.ArrayList;

public class Grouping {
    String name;
    ArrayList<Holiday> holidays;

    public Grouping(String name) {
        this.name = name;
        this.holidays = new ArrayList<>();
    }

    // MODIFIES: this
    // EFFECTS: adds given holiday to holidays
    public void add(Holiday holiday) {
        holidays.add(holiday);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Holiday> getHolidays() {
        return holidays;
    }
}
