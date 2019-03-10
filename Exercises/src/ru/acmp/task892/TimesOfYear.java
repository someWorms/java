package ru.acmp.task892;
//По заданному номеру месяца в году требуется определить время года.

import java.util.Scanner;

public class TimesOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x <= 2 && x > 0)
            System.out.println("Winter");
        if(x > 2 && x <= 5)
            System.out.println("Spring");
        if(x > 5 && x <= 8)
            System.out.println("Summer");
        if(x > 8 && x <= 11)
            System.out.println("Autumn");
        if(x==12)
            System.out.println("Winter");

    }
}
