import java.util.Scanner;

class MenuEntry{

    {
        System.out.println("Выберите опцию");
    }

    Scanner sc = new Scanner(System.in);
    private boolean choiceDone = false;
    private int ch;
    public void menu(int ch){
        do {

            if(ch == 1) {
                System.out.println("Начать игру");
                choiceDone = true;
                StartGame sg = new StartGame();
                sg.toClass();
            }
            else if(ch == 2){
                System.out.println("Выход");
                choiceDone = true;
                exitGame();

            }else {
                System.out.println("Выбор не верный");
                menu(sc.nextInt());
            }
        }while (choiceDone == false);
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
        menu(ch);
    }


    void exitGame(){
        System.out.println("Завершение...");
        System.exit(0);
    }
}


public class MainClass {
    public static void main(String[] args) {
        MenuEntry mE =new MenuEntry();
        Scanner sc = new Scanner(System.in);
        mE.setCh(sc.nextInt());
    }
}
