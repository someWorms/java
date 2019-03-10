package ru.mccme.exercise65;


/*Дан массив, состоящий из целых чисел.
/ Напишите программу, которая подсчитывает количество положительных чисел среди элементов массива.
*/
import java.util.Scanner;

public class CuantOfNumbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int x = sc.nextInt();
        int[] arr = new int[x];
        int cuant = 0;

        System.out.println("Заполните массив");
        for (int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < x; i++){
            if(arr[i] > 0)
                cuant++;
        }

        System.out.println("Количесвто положительных чисел " + cuant);

    }
}
