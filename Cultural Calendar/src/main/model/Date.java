package main.model;

public class Date {
    private Integer month;
    private Integer day;

    // REQUIRES: a valid date
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    // EFFECTS: returns true if this is earlier in year than d
    public boolean before(Date d) {
        if (month < d.getMonth()) {
            return true;
        } else if (month == d.getMonth() && day <= d.getDay()) {
            return true;
        } else {
            return false;
        }
    }

    // EFFECTS: returns true if this is later in year than d
    public boolean after(Date d) {
        if (month > d.getMonth()) {
            return true;
        } else if (month == d.getMonth() && day > d.getDay()) {
            return true;
        } else {
            return false;
        }
    }
}
