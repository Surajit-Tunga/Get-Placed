# Find day of the week for a given date [Leetcode 1185: Easy]

- Given an array date[] = [d, m, y], where d denotes the day, m denotes the month, and y denotes the year, Write a program that calculates the day of the week for any particular date in the past or future.

**Examples:**
```text
Input: d = 30, m = 8, y = 2010
Output: 1
Explanation: 30th August 2010 was a Monday.

Input: d = 15, m = 6, y = 1995
Output: 4
Explanation: 15th June 1995 was a Thursday.

Input: d = 29, m = 2, y = 2016
Output: 1
Explanation: 26th January was a Monday.
```

**Problems:**
```java
public class Main{

    public static boolean checkLeapYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }

        return false;
    }

    public static String checkDay(int arr[]){

        int day = arr[0];
        int month = arr[1];
        int year = arr[2]; 

        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};

        int[] daysInMonth = {31, 28, 31,30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (checkLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        int totalDays = 0;

        // Take 1 Jan 1971 = Friday as a base.
        //Count Days as per year.

        for (int i = 1971; i < year; i++) {
            if (checkLeapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }  

        // Update total days as per months.

        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Days

        totalDays += day - 1;

        return weekDays[(totalDays+5) % 7];  // +5 as base date is friday(weekDays[5])
    }

    public static void main(String[] args) {

        int arr[] = {1,12,2002};

        System.out.println(checkDay(arr));
    }
}
```
**Complexity:**

- Time: O(year)
- Space: O(1)

---
