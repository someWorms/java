package Converter;


import java.util.Scanner;

abstract public strictfp class Calcs {


    //some functionality will be added.

    private double entryNum;
    private String typo;


    abstract void doCalcs();


    public String getTypo() {
        return typo;
    }

    public void setTypo(String typo) {
        this.typo = typo;
    }

    public double getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(double entryNum) {
        this.entryNum = entryNum;
    }
}
