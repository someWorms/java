
import java.util.Scanner;

public class SimpleCalc {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char oper = getOpr();
        System.out.println(claculate(num1, num2, oper));

    }




    public static int getNum() {
        System.out.println("Введите число");
        int num;
        if(sc.hasNextInt()) num = sc.nextInt();
        else {
            System.out.println("No int-type");
            sc.next();
            num = getNum();
        }
        return num;

    }

    public static char getOpr(){
        System.out.println("Оператор");
        char oper;
        if(sc.hasNext()) {
            oper = sc.next().charAt(0);
            if (oper != '+' && oper !='-' && oper !='*' && oper !='/'){
                System.out.println("Ошибка -+*/");
                //sc.next();
                oper = getOpr();
            }

        }

        else{
            System.out.println("Ошибка -+*/");
            sc.next();
            oper = getOpr();
        }
        return oper;
    }


    public static int claculate(int num1, int num2, char oper) {
        int result = 0;
        switch (oper){
            case '+':
                result =  num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result =  num1*num2;
                break;
            case '/':
                result =  num1/num2;
                break;

                default:
                    System.out.println("Не верно");
                    break;
        }
        return result;
    }

}
