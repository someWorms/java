package ru.mccme.exercise351;
//Вычислите N! ("эн-факториал") – произведение всех натуральных чисел от 1 до N ( N!=1∙2∙3∙…∙ N ).

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Factorial f = new Factorial();
        System.out.println("Введите число");
        System.out.println(f.factorial(sc.nextInt()));

    }

    int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

}
