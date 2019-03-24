package DurakGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выбери вариант:\n1 - Начать игру \n2 - Выйти");
        int choice = sc.nextInt();
        boolean menu = true;
        Init initialize = new Init();

        CardSuits cs = CardSuits.CLUBS;
        StandardCardDeck scd = StandardCardDeck.ACE;
        StandardCardDeck sdd = StandardCardDeck.KING;
        do {
            switch (choice) {
                default:
                    System.out.println("Wrong Choice");
                    break;
                case 1:
                    System.out.println(cs + " " + scd.getPower());
                    System.out.println(scd.getPower() < sdd.getPower());


                    System.out.println("Введите кол-во карт в колоде! (36 , 54)");
                    initialize.setSize(sc.nextInt());
                    menu = false;
                    break;
                case 2:
                    System.out.println("Exit");
                    System.exit(0);
                    menu = false;
                    break;
            }
        }while (menu);

    }
}
