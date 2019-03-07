package Converter;

public class Lengths extends Calcs {
    @Override
    void doCalcs() {
        if (getTypo().equals("mm")) {
            System.out.println("Миллиметр: " + getEntryNum());
            System.out.println("Сантиметр: " + (getEntryNum() * 1000));
            System.out.println("Метр: " + (getEntryNum() * 10000));
            System.out.println("Километр: " + (getEntryNum() * 100000));
        }
        if (getTypo().equals("cm")) {
            System.out.println("Миллиметр: " + getEntryNum() / 1000);
            System.out.println("Сантиметр: " + (getEntryNum()));
            System.out.println("Метр: " + (getEntryNum() * 1000));
            System.out.println("Километр: " + (getEntryNum() * 10000));
        }
        if (getTypo().equals("m")) {
            System.out.println("Миллиметр: " + getEntryNum() / 10000);
            System.out.println("Сантиметр: " + (getEntryNum() / 1000));
            System.out.println("Метр: " + (getEntryNum()));
            System.out.println("Километр: " + (getEntryNum() * 1000));
        }
        if (getTypo().equals("km")) {
            System.out.println("Миллиметр: " + getEntryNum() / 100000);
            System.out.println("Сантиметр: " + (getEntryNum() / 10000));
            System.out.println("Метр: " + (getEntryNum() / 1000));
            System.out.println("Километр: " + (getEntryNum()));
        }
    }
}
