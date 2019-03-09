package ru.mccme.exercice3059;

import java.util.Scanner;

public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = (sc.nextInt());
        int powTwo = 2;
        while (powTwo < limit-(powTwo)){  // это просто лучший костыль ever made.
            powTwo*=2;
        }
        System.out.println(powTwo);

    }
}
