package ru.mccme.exercise352;

import java.util.Scanner;

//Напишите программу, вычисляющую 2^N. ( 0<n<30 )
public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (sc.nextInt());
        int two = 2;
        int counter = 1;

        while (counter < n){
            two *= 2;
            counter++;
        }
        System.out.println(two);
    }
}
