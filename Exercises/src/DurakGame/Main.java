package DurakGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выбери вариант:\n1 - Начать игру \n2 - Выйти");
        int choice = sc.nextInt();
        Init initialize = new Init();
        switch (choice){
            default:
                System.out.println("Wrong Choice");
            case 1:
                System.out.println("Введите кол-во карт в колоде! (36 , 54)");
                initialize.setSize(sc.nextInt());
                break;
            case 2:
                System.out.println("Exit");
                System.exit(0);
                break;
        }

    }
}
