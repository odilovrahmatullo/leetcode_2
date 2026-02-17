package day_of_the_year;

public class Main {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2012-01-02"));
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2020-03-01"));
        System.out.println(dayOfYear("2020-02-10"));
    }

    public static int dayOfYear(String date) {
        int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month > 2) {
            return days[month - 1] + day + 1;
        }
        return days[month - 1] + day;
    }
}
