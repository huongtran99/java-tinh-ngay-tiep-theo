package com.codegym;

public class NextDayCalculator {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int NextDay() {
        switch (month) {
            case 1:
                if (day > 0 && day < 31) {
                    return day + 1;
                } else if (day >= 31) {
                    return 1;
                }
                break;
            case 2:
                if (day > 0 && day < 29) {
                    return day + 1;
                } else if (day >= 29) {
                    return 1;
                }
                break;
            case 4:
                if (day > 0 && day < 30) {
                    return day + 1;
                } else if (day >= 30) {
                    return 1;
                }
                break;
        }
        return day;

    }

}
