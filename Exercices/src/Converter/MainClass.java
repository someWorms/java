package Converter;
/*
Постановка задачи:
разработать программу, которая будет менять одну величину на другую (переводить).
Величины: вес,длинна,скорость и т.д

*/

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Выберете велечину: \n1 - Вес\n2 - Длинна\n3 - Скорость");
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1) {
            Calcs c = new Massa();
            System.out.println("Введите число");
            c.setEntryNum(sc3.nextInt());

            System.out.println("В какой еденице заданное число? Укажите название");
            System.out.println("1)Грамм (g)\n2)Килограмм (kg)");
            System.out.println("3)Тонна (t)\n10)Килотонна (kt)");

            c.setTypo(sc2.nextLine());
            c.doCalcs();
        }

    }

}
