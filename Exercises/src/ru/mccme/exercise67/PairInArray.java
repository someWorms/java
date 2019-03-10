package ru.mccme.exercise67;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/*
Дан массив, состоящий из целых чисел. Напишите программу, которая определяет,
есть ли в массиве пара соседних элементов с одинаковыми знаками.
 */
public class PairInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int x = sc.nextInt();
        boolean isPair = false;
        int[] arr = new int[x];

        System.out.println("Заполните массив");
        for (int i = 0; i < x; i++)
            arr[i] = sc.nextInt();
        for (int i = 1; i < x; i+=2){
            if(arr[i]<0 && arr[i-1]<0){
                isPair=true;

            }
            if(arr[i]>0 && arr[i-1]>0){
                isPair=true;
            }
        }
        System.out.println("Есть ли парные числа? " + isPair);
    }
}
