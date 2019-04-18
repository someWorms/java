package temp;

import java.util.Scanner;


import static java.lang.System.out;
import static java.lang.Math.*;

public class SomeTests {

    public static void main(String[] args) {
        out.println((int) sqrt(25.0));
        TheHouse villa = new TheHouse();
        TheHouse another = new TheHouse();

        TheHouse.setType(new Scanner(System.in));
        villa.priceDo();
        another.priceDo();


        villa.show();
        another.show();
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

    void priceDo() {
        if (type.equals("Вилла")) {
            this.price = 2000000;
            this.floors = 3;
        } else {
            this.price = 10000;
            this.floors = 1;
        }
    }

    void show() {
        out.println(price + " " + floors + " " + type);
        price = 12;
        out.println(price);

    }
}


class toInstance{
    int num = 5;
    void reciever(int num){
        out.println(num);
        out.println(this.num);
    }
}