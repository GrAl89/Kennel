package com.company;

import java.util.Scanner;

public class Dogs {

private int dogId;
private String dogName;
private int dogAge;
private boolean theDogIsSick;
private boolean theDogIsHungry;
private boolean theDogIsTrained;

    public Dogs() {
    }

    public Dogs(int dogId, String dogName, int dogAge, boolean theDogIsSick, boolean theDogIsHungry, boolean theDogIsTrained) {
        this.dogId = dogId;
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.theDogIsSick = theDogIsSick;
        this.theDogIsHungry = theDogIsHungry;
        this.theDogIsTrained = theDogIsTrained;
    }

    public static Dogs[] createDogsArray (int n){
        Dogs[] arrayOfDogs = new Dogs[n];
        for (int i = 0; i<arrayOfDogs.length; i++){
            arrayOfDogs[i] = new Dogs();
            arrayOfDogs[i].createDogs(i+1);
        }
        return arrayOfDogs;
    }

    public void createDogs(int n){
        Scanner scan = new Scanner(System.in);
        dogId = n;
        System.out.println("\n" + "Enter the dog № " + n + " name ");
        dogName  = scan.next();
        System.out.println("\n" + "Enter the dog № " + n + " age ");
        dogAge = scan.nextInt();
        System.out.println("\n" + "Is the dog № " + n + " sick? " + "Enter yes/no ");
        switch (scan.next()) {
            case "yes":
                theDogIsSick = true;
                break;
            case "no":
            default:
                theDogIsSick = false;
        }
        System.out.println("\n" + "Is the dog № " + n + " hungry? " + "Enter yes/no ");
        switch (scan.next()) {
            case "yes":
                theDogIsHungry = true;
                break;
            case "no":
            default:
                theDogIsHungry = false;
        }
        System.out.println("\n" + "Is the dog № " + n + " trained? " + "Enter yes/no ");
        switch (scan.next()) {
            case "yes":
                theDogIsTrained = true;
                break;
            case "no":
            default:
                theDogIsTrained = false;
        }
    }

    public void showDogs () {
        System.out.println("\n" + "Dog Id - "+ dogId +"\n" + "Dog name - " + dogName    + "\n" + "Dog age - "+ dogAge + "\n" + "Sickness - " + theDogIsSick + "\n" + "Hunger - " + theDogIsHungry + "\n" + "Trained - " + theDogIsTrained);
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public boolean isTheDogIsSick() {
        return theDogIsSick;
    }

    public void setTheDogIsSick(boolean theDogIsSick) {
        this.theDogIsSick = theDogIsSick;
    }

    public boolean isTheDogIsHungry() {
        return theDogIsHungry;
    }

    public void setTheDogIsHungry(boolean theDogIsHungry) {
        this.theDogIsHungry = theDogIsHungry;
    }

    public boolean isTheDogIsTrained() {
        return theDogIsTrained;
    }

    public void setTheDogIsTrained(boolean theDogIsTrained) {
        this.theDogIsTrained = theDogIsTrained;
    }
}
