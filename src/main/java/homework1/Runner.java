package homework1;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Homework1.print();
        System.out.println(Homework1.calculating(3,1,4,2));
        System.out.println(Homework1.sumBool(9,20));
        System.out.println(Homework1.isNegative(1));
        System.out.println(Homework1.checked(-1));
        Homework1.printHiName("Alex");
        System.out.println();
        int year = new Scanner(System.in).nextInt();
        System.out.println(Homework1.isLeapYear(year));

    }
}
