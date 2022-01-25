import java.util.Scanner;

public class App {
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
