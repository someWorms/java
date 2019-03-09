package ru.mccme.exercice3060;

import java.util.Scanner;

/*
Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.

Операцией возведения в степень пользоваться нельзя!
 */
public class ExaxtPowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int realPow = 0;

        while (num%2 == 0){
            realPow++;
            num /= 2;
        }
        if(num == 1)
            System.out.println("YES " +realPow);
        else
            System.out.println("NO");
    }
}
