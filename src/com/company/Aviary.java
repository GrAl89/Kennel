package com.company;

import java.util.Scanner;

public class Aviary {

    private int aviaryId;
    private boolean aviaryIsClean;
    private boolean aviaryIsBroken;

    public Aviary() {
    }

    public Aviary(int aviaryId, boolean aviaryIsClean, boolean aviaryIsBroken) {
        this.aviaryId = aviaryId;
        this.aviaryIsClean = aviaryIsClean;
        this.aviaryIsBroken = aviaryIsBroken;
    }

    public static Aviary [] createAviaryArray (int n){
        Aviary [] arrayOfAviary = new Aviary[n];
        for (int i = 0; i<arrayOfAviary.length; i++){
            arrayOfAviary[i] = new Aviary();
            arrayOfAviary[i].createAviary(i+1);
        }
        return arrayOfAviary;
    }

    public void createAviary(int n){
        Scanner scan = new Scanner(System.in);
        aviaryId = n;
        System.out.println("\n" + "Is the aviary № " + n + " clean? " + "Enter yes/no ");
        if (scan.next().equals("yes")){
            aviaryIsClean = true;
        }else aviaryIsClean = false;
        System.out.println("\n" + "Is the aviary № " + n + " broken? " + "Enter yes/no ");
        if (scan.next().equals("yes")){
            aviaryIsBroken = true;
        } else aviaryIsBroken = false;
    }

    public void showAviary () {
        System.out.println("\n" + "Aviary Id - "+ aviaryId +"\n" + "Clean - " + aviaryIsClean + "\n" + "Broken - " + aviaryIsBroken);
    }

    public int getAviaryId() {
        return aviaryId;
    }

    public void setAviaryId(int aviaryId) {
        this.aviaryId = aviaryId;
    }

    public boolean isAviaryIsClean() {
        return aviaryIsClean;
    }

    public void setAviaryIsClean(boolean aviaryIsClean) {
        this.aviaryIsClean = aviaryIsClean;
    }

    public boolean isAviaryIsBroken() {
        return aviaryIsBroken;
    }

    public void setAviaryIsBroken(boolean aviaryIsBroken) {
        this.aviaryIsBroken = aviaryIsBroken;
    }
}
