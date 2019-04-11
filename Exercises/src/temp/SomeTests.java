package temp;

import java.util.Scanner;


import static java.lang.System.out;
import static java.lang.Math.*;

public class SomeTests {

    public static void main(String[] args) {
        out.println((int) sqrt(25.0));

        TheHouse.setType(new Scanner(System.in));
    }
}


class TheHouse {
    private static String type;
    private double price;
    private int floors;



    public static String getType() {
        return type;
    }

    public static void setType(Scanner sc) {
        String x = sc.nextLine();
        TheHouse.type = x;
    }

    void priceDo(){
        if(type.equals("Вилла")){
            this.price = 2000000;
            this.floors = 3;
        }
    }
    static void show(){
        out.println("не статик поля не выведет");
    }
}