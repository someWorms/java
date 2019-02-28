import java.util.Scanner;

class gameInitializer {
    public final int maxLevel = 150;

}

class characterMenuEntry{


    void characterChoice(int ch) {
        boolean chDone = false;
        do {
            if(ch == 1) {
                System.out.println("РЫЦАРЬ");
                chDone = true;
            }else if(ch == 2) {
                System.out.println("УБИЙЦА");
                chDone = true;
            }else if(ch == 3) {
                System.out.println("СТРЕЛОК");
                chDone = true;
            }else{
                System.out.println("Неверный выбор");
            }

        }while (!chDone);
    }

}
public class startGame {
    {
        System.out.println("Начало! Выбери персонажа");

    }
    characterMenuEntry cME = new characterMenuEntry();
    public void toClass(){
        Scanner sc = new Scanner(System.in);
        cME.characterChoice(sc.nextInt());
    }
}
