package DurakGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Init initialize = new Init();
        switch (choice){
            default:
                System.out.println("Wrong Choice");
            case 1:
                System.out.println("Start Game");
                initialize.setSize(sc.nextInt());
                break;
            case 2:
                System.out.println("Exit");
                System.exit(0);
                break;
        }

    }
}
