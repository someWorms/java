package ru.mccme.exercise3059;

import java.util.Scanner;
/*По данному числу N распечатайте все целые степени двойки, не превосходящие N, в порядке возрастания.

  Операцией возведения в степень пользоваться нельзя!
*/
public class PowOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = (sc.nextInt());
        int powTwo = 2;
        while (powTwo < limit-(powTwo)){  // это просто лучший костыль ever made.
            powTwo*=2;
        }
        System.out.println(powTwo);

    }
}
