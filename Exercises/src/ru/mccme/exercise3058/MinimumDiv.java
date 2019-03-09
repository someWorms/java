package ru.mccme.exercise3058;

import java.util.Scanner;

// Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.

public class MinimumDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinimumDiv md = new MinimumDiv();
        md.calcs(sc.nextInt());
    }

    void calcs(int g){
        int div = 2;

        while (g % div != 0) {
            div++;
        }
        System.out.println(div);
    }
}
