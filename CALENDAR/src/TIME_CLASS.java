
import java.util.Calendar;
import java.awt.*;
import javax.swing.*;

public class TIME_CLASS {

    public int year;
    public int month;
    public int day;
    String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    Calendar calendar = Calendar.getInstance();

    public int firstDayofnewyearMonth(int year) {
        int day_start = 0;
        int x1, x2, x3;
        x1 = (year - 1) / 4;
        x2 = (year - 1) / 100;
        x3 = (year - 1) / 400;
        day_start = (year + x1 - x2 + x3) % 7;
        return day_start;

    }

    public boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public int getMonth(int numDays, int weekDay) {
        int day = 1;
        ///skipToDay(weekDay);
        while (day <= numDays) {
            ///cout << setw(2) << day << " ";
            if (weekDay == 6) {
                /// cout << endl;
                weekDay = 0;
            } else {
                weekDay = weekDay + 1;
            }
            day = day + 1;
        }
        return weekDay;
    }

    public int numOfDaysInMonth(int m, boolean leap) {
        if (m == 0) {
            return (31);
        } else if (m == 1) {
            if (leap) {
                return (29);
            } else {
                return (28);
            }
        } else if (m == 2) {
            return (31);
        } else if (m == 3) {
            return (30);
        } else if (m == 4) {
            return (31);
        } else if (m == 5) {
            return (30);
        } else if (m == 6) {
            return (31);
        } else if (m == 7) {
            return (31);
        } else if (m == 8) {
            return (30);
        } else if (m == 9) {
            return (31);
        } else if (m == 10) {
            return (30);
        } else if (m == 11) {
            return (31);
        } else {
            return (0);
        }
    }

    public int makeEqualtoCurrentMonth(int month, int year) {
        int currentmonth = 0;
        boolean leap = isLeapYear(year);
        int firstDay = firstDayofnewyearMonth(year);
        while (currentmonth != month) {
            int numDays = numOfDaysInMonth(currentmonth, leap);

            firstDay = getMonth(numDays, firstDay);

            currentmonth++;
        }
        return firstDay;
    }

    public int get_month() {
        month = calendar.get(Calendar.MONTH);
        return month;
    }

    public int get_year() {
        year = calendar.get(Calendar.YEAR);
        return year;
    }
    public int get_day()
    {
        return calendar.get(Calendar.DATE);
    }
}
