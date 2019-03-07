package BlackOrWhite;

import java.util.Scanner;

/*
Постановка задачи:
Разработать программу, благодаря которой можно потренировать свою интуицию, выбирая между “черным” и “белым”,
программа же должна рандомно выдавать определенный цвет (по желанию можно усложнить программу).
 */
public class MainClass {
    public static void main(String[] args) {
        Game g = new Game();
        Scanner sc = new Scanner(System.in);
        int ans;

        boolean checked = false;

        while (!checked) {

            g.process();

            System.out.println("\nЕще раз попробовать желаешь? \n 1-да \n 2-нет");
            ans = sc.nextInt();
            if (ans == 1)
                g.process();

            if (ans == 2) {
                System.out.println("Пока!");
                checked = true;
                break;
            }
        }
    }
}

class Game {
    Scanner sc = new Scanner(System.in);


    void process() {
        System.out.println("Введите черное или белое");
        int randNum = (int) (Math.random() * 2);
        String s = sc.nextLine();

        if (s.equals("Белое") || s.equals("белое") || s.equals("Черное") || s.equals("черное")) {

            if (randNum == 0) {
                System.out.println("Черное");
                if (s.equals("Черное") || s.equals("черное")) System.out.println("Вы выиграли!");
                else System.out.println("Вы проиграли.");
            }
            if (randNum == 1) {
                System.out.println("Белое");
                if (s.equals("Белое") || s.equals("белое")) System.out.println("Вы выиграли!");
                else System.out.println("Вы проиграли.");
            }
        } else {
            System.out.println("Вы можете выбрать только белое или черное.");
        }
    }
}