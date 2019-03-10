package ru.mccme.exercise68;

import java.util.Scanner;

/*
Дан массив, состоящий из целых чисел.
Напишите программу, которая в данном массиве определит количество элементов,
 у которых два соседних и, при этом, оба соседних элемента меньше данного.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int x = sc.nextInt();
        int paired = 0;
        int[] arr = new int[x];

        System.out.println("Заполните массив");
        for (int i = 0; i < x; i++)
            arr[i] = sc.nextInt();

        for (int i = 1; i < x - 1; i += 2) {
            if (arr[i] < arr[i + 1] && arr[i] < arr[i - 1]) {
                paired++;
            }
        }
        System.out.println("Количество элементов с соседями больше чем сам элемент " + paired);
    }
}
