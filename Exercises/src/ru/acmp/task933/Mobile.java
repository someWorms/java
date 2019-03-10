package ru.acmp.task933;

import java.util.Scanner;

/*
Услуги телефонной сети оплачиваются по следующему правилу: за разговоры до А минут в месяц – В рублей за минуту,
а разговоры сверх установленной нормы оплачиваются из расчета С рублей за минуту.
Требуется написать программу, вычисляющую плату за пользование телефоном для разговоров продолжительностью Т минут в месяц.
 */
public class Mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во минут тарифа в месяц");
        int a = sc.nextInt();
        System.out.println("Введите цену за минуту тарифа в месяц");
        int b = sc.nextInt();
        System.out.println("Цена сверхнормы");
        int c = sc.nextInt();
        System.out.println("Сколько времени базар шел");
        int t = sc.nextInt();
        int noTarrif = 0;
        int withTarrif = a * b;


        if (t > a) {
            noTarrif = t - a;  // без тарифа
            noTarrif *= c;
            System.out.println("Общая цена " + (noTarrif+withTarrif) + " руб");
        }else
            System.out.println("Общая цена " + withTarrif + " руб");

    }
}
