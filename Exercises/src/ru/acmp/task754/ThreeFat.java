package ru.acmp.task754;

import java.util.Scanner;

/*

Три толстяка решили поспорить: кто из них самый тяжелый.
После взвешивания оказалось, что их масса соответственно M1, M2 и M3 килограмм.
Считается, что масса толстяка должна быть не менее 94 и не более 727 килограмм.

Помогите определить массу самого тяжелого из них, либо выяснить, что была допущена ошибка при взвешивании.
 */
public class ThreeFat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(),m2 = sc.nextInt(),m3 = sc.nextInt();
        if (m1 > 94 && m1 < 727 | m2 > 94 && m2 < 727 | m3 > 94 && m3 < 727){
            if(m2 > m1){
                if(m2 > m3)
                    System.out.println(m2);
                else
                    System.out.println(m3);
            }else
                if(m1 > m3)
                    System.out.println(m1);
                else
                    System.out.println(m3);
        }else
            System.out.println("Error");
    }
}
