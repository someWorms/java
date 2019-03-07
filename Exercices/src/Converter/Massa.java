package Converter;

public class Massa extends Calcs{
    @Override
    void doCalcs(){
        if(getTypo().equals("gr")) {
            System.out.println("Грамм: " + getEntryNum());
            System.out.println("Килограмм: " + (getEntryNum()*1000));
            System.out.println("Тонна: " + (getEntryNum()*10000));
            System.out.println("Килотонна: " + (getEntryNum()*100000));
        }
        if(getTypo().equals("kg")){
            System.out.println("Грамм: " + (getEntryNum()/1000));
            System.out.println("Килограмм: " + (getEntryNum()));
            System.out.println("Тонна: " + (getEntryNum()*1000));
            System.out.println("Килотонна: " + (getEntryNum()*10000));
        }
        if(getTypo().equals("t")){
            System.out.println("Грамм: " + (getEntryNum()/10000));
            System.out.println("Килограмм: " + (getEntryNum()/1000));
            System.out.println("Тонна: " + (getEntryNum()));
            System.out.println("Килотонна: " + (getEntryNum()*1000));
        }
        if(getTypo().equals("kt")){
            System.out.println("Грамм: " + (getEntryNum()/100000));
            System.out.println("Килограмм: " + (getEntryNum()/10000));
            System.out.println("Тонна: " + (getEntryNum()/1000));
            System.out.println("Килотонна: " + (getEntryNum()));
        }
    }
}
