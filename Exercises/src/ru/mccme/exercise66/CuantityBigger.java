package ru.mccme.exercise66;

import java.util.Scanner;

//Дан массив, состоящий из целых чисел. Напишите программу,
//которая подсчитает количество элементов массива, больших предыдущего (элемента с предыдущим номером).


public class CuantityBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int elem = 0;

        System.out.println("Заполните массив");
        for (int i = 0; i < x; i++)
            arr[i] = sc.nextInt();

        for (int i = 1; i < x; i++){
            if(arr[i] > arr[i-1]){
                elem++;
            }
            else
                elem = 0;
        }
        System.out.println("Элесентов больще предыдущего " + elem);
    }
}
