/* 
* Create a class Time with hh, mm, ss as data members. Write a java program to find the sum of two time intervals (Hint: Use object as parameter to function).
*/

import java.util.Scanner;

class Time {
    int hh, mm, ss;

    int convertToSeconds(int hr, int min, int sec) {
        return ((hr * 60) + min) * 60 + sec;
    }

    Time convertToTimeInterval(int seconds) {
        Time t = new Time();
        int n = seconds % (24 * 3600);
        t.hh = n / 3600;

        n %= 3600;
        t.mm = n / 60;

        n %= 60;
        t.ss = n;

        return t;
    }

    Time addTimeInterval(Time t1, Time t2) {
        Time t = new Time();
        int timeInterval1, timeInterval2, sumInSeconds;
        timeInterval1 = convertToSeconds(t1.hh, t1.mm, t1.ss);
        timeInterval2 = convertToSeconds(t2.hh, t2.mm, t2.ss);
        sumInSeconds = timeInterval1 + timeInterval2;
        t = convertToTimeInterval(sumInSeconds);
        return t;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();
        Time sum = new Time();
        System.out.println("\n\t SUM OF 2 TIME INTERVALS\n");
        System.out.println("Enter 1st Time Interval");
        System.out.print("HH :");
        t1.hh = input.nextInt();
        System.out.print("MM :");
        t1.mm = input.nextInt();
        System.out.print("SS :");
        t1.ss = input.nextInt();

        System.out.println("Enter 2nd Time Interval");
        System.out.print("HH :");
        t2.hh = input.nextInt();
        System.out.print("MM :");
        t2.mm = input.nextInt();
        System.out.print("SS :");
        t2.ss = input.nextInt();

        sum = sum.addTimeInterval(t1, t2);

        System.out.println("Sum of These 2 Time Intervals is " + sum.hh + ":" + sum.mm + ":" + sum.ss);
    }
}
/* ©️ Adhil Roshan*/