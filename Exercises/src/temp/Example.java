package temp;

import java.util.Scanner;

public class Example {


    public static void main(String[] args) {
        Controls controls = new Controls(-1);
        controls.movement(new Scanner(System.in));


    }
}

// Вопрос в том что если у меня таких класов много, отвечающие за разный функционал приложения
// то в этом случае будет очень много кода, есть ли возможность сократить класс Controls?

class Controls{
    private int i;
    Controls(int i){
        this.i = i;
    }


    void movement(Scanner sc){

        //Нормальное управление
        if(i == 1){
            System.out.println("Нажит на клавищу w a s d");
            do{
                String x = sc.nextLine();

                switch (x){
                    case "w":
                        System.out.println("Вперед");
                        break;
                    case "s":
                        System.out.println("Назад");
                        break;
                    case "a":
                        System.out.println("Лево");
                        break;
                    case "d":
                        System.out.println("Право");
                        break;
                }
            }while (true);
        }

        //Инверсия управления
        if(i == -1){
            System.out.println("Нажит на клавищу w a s d");
            do{
                String x = sc.nextLine();

                switch (x){
                    case "s":
                        System.out.println("Вперед");
                        break;
                    case "w":
                        System.out.println("Назад");
                        break;
                    case "d":
                        System.out.println("Лево");
                        break;
                    case "a":
                        System.out.println("Право");
                        break;
                }
            }while (true);
        }
    }
}