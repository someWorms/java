package MagicBall;

import java.util.Scanner;

/*
Постановка задачи: Разработать программу, которая будет как “магически” шар выдавать случайный результат.
К примеру, вы ей задаете вопрос: “..... . .. ... .. ?”, а она выдает вам результат из предложенного:

   Да
   Нет
   Скорее всего да
   Скорее всего нет
   Возможно
   Имеются перспективы
   Вопрос задан неверно


*/
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int randNum = (int) (Math.random() * 6);
        String s = sc.nextLine();


        switch (randNum){
            default:
                System.out.println("Hello, im here just for test!");
            case 0:
                System.out.println("Да");
                break;
            case 1:
                System.out.println("Нет");
                break;
            case 2:
                System.out.println("Скорее всего да");
                break;
            case 3:
                System.out.println("Скорее всего нет");
                break;
            case 4:
                System.out.println("Возможно");
                break;
            case 5:
                System.out.println("Имеются переспективы");
                break;
            case 6:
                System.out.println("Вопрос задан не верно");
                break;

        }
    }
}


