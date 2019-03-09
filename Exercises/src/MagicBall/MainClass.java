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


        if(randNum == 0){
            System.out.println("Да");
        }else if(randNum == 1){
            System.out.println("Нет");
        }else if(randNum == 2){
            System.out.println("Скорее всего да");
        }else if(randNum == 3){
            System.out.println("Скорее всего нет");
        }else if(randNum == 4){
            System.out.println("Возможно");
        }else if(randNum == 5){
            System.out.println("Имеются переспективы");
        }else if(randNum == 6){
            System.out.println("Вопрос задан не верно");
        }else{
            System.out.println("You will not see that:D");
        }
    }
}


