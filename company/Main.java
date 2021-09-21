package company;

import company.MyDate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter year");
        int year=scanner.nextInt();
        System.out.println("please enter month");
        int month=scanner.nextInt();
        System.out.println("please enter day");
        int day=scanner.nextInt();

        MyDate myDate=new MyDate();
        System.out.println( myDate.isValidDate(year,month,day));
        System.out.println(myDate.toString(year,month,day));
        System.out.println(myDate.nextDay());
    }
}
