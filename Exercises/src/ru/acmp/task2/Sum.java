package ru.acmp.task2;
// Требуется посчитать сумму целых чисел, расположенных между числами 1 и N включительно.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum = new Sum();
        System.out.println(sum.doSum(sc.nextInt()));

    }

    int doSum(int i){
        if(i == 1)
            return 1;
        else
            return i+=doSum(i-1);
    }
}
