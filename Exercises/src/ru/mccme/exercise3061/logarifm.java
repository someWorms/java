package ru.mccme.exercise3061;

import java.util.Scanner;

/*По данному натуральному числу N выведите такое наименьшее целое число k, что 2k≥N.

        Операцией возведения в степень пользоваться нельзя!
*/
public class logarifm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (sc.nextInt());
        int powerN = 0;

        while (num/2 > 0){
            powerN++;
            if(num%2 == 0)
                num /= 2;
            else {
                num++;
                num/=2;
            }
        }
        System.out.println(powerN);
    }
}

