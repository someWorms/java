package ru.mccme.exercise113;

import java.util.Scanner;

//Выведите все точные квадраты натуральных чисел, не превосходящие данного числа N.
public class QuadSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (25);
        int div = 1;
        int cnt = 0;
        int dividerHolder = 2;

        while(cnt < num){
            num-=div;
            cnt = div;
            System.out.println(cnt);

            div=dividerHolder;
            dividerHolder++;
            div*=div;

        }
    }
}
