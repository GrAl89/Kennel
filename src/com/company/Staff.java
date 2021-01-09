package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Staff {

    private int staffId;
    private String staffName;
    private String staffSpecialty;

    public Staff() {
    }

    public Staff(int staffId, String staffName, String staffSpecialty) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffSpecialty = staffSpecialty;
    }

    public static Staff[] createStaffArray() {
        Staff[] arrayOfStaff = new Staff[5];
        for (int i = 0; i < arrayOfStaff.length; i++) {
            arrayOfStaff[i] = new Staff();
            arrayOfStaff[i].createStaff(i + 1);
        }
        return arrayOfStaff;
    }

    public void createStaff(int n) {
        Scanner scan = new Scanner(System.in);
        staffId = n;
        switch (n) {
            case 1:
                staffSpecialty = "Cook";
                break;
            case 2:
                staffSpecialty = "Doctor";
                break;
            case 3:
                staffSpecialty = "Trainer";
                break;
            case 4:
                staffSpecialty = "Janitor";
                break;
            case 5:
                staffSpecialty = "Repairer";
                break;
        }
        System.out.println("\n" + "Enter the name of a " + staffSpecialty);
        staffName = scan.next();
    }

    public void showStaff() {
        System.out.println("\n" + "Staff Id - " + staffId + "\n" + "Specialty - " + staffSpecialty + "\n" + "Name - " + staffName);
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffSpecialty() {
        return staffSpecialty;
    }

    public void setStaffSpecialty(String staffSpecialty) {
        this.staffSpecialty = staffSpecialty;
    }

    public static void feeding(Dogs[] arrayOfDogs, Staff[] arrayOfStaff) {
        for (int i = 0; i < arrayOfDogs.length; i++)
            if (arrayOfDogs[i].isTheDogIsHungry() == true) {
                switch (arrayOfDogs[i].getDogAge()) {
                    case 0, 1, 2:
                        arrayOfDogs[i].setTheDogIsHungry(false);
                        System.out.println("\n" + arrayOfStaff[0].staffSpecialty + " " + arrayOfStaff[0].staffName + " fed " + arrayOfDogs[i].getDogName() + " with food for puppies." + "\n" + arrayOfDogs[i].getDogName() + " well-fed.");
                        break;
                        case 3, 4, 5, 6, 7:
                        arrayOfDogs[i].setTheDogIsHungry(false);
                        System.out.println("\n" + arrayOfStaff[0].staffSpecialty + " " + arrayOfStaff[0].staffName + " fed " + arrayOfDogs[i].getDogName() + " with food for adult dogs." + "\n" + arrayOfDogs[i].getDogName() + " well-fed.");
                        break;
                    default:
                        arrayOfDogs[i].setTheDogIsHungry(false);
                        System.out.println("\n" + arrayOfStaff[0].staffSpecialty + " " + arrayOfStaff[0].staffName + " fed " + arrayOfDogs[i].getDogName() + " with food for old dogs." + "\n" + arrayOfDogs[i].getDogName() + " well-fed.");
                        break;
                }
            } else
                System.out.println("\n" + arrayOfDogs[i].getDogName() + " is not hungry.");
    }

    public static void medication(Dogs[] arrayOfDogs, Staff[] arrayOfStaff) {
        for (int i = 0; i < arrayOfDogs.length; i++)
            if (arrayOfDogs[i].isTheDogIsSick() == true) {
                arrayOfDogs[i].setTheDogIsSick(false);
                System.out.println("\n" + arrayOfStaff[1].staffSpecialty + " " + arrayOfStaff[1].staffName + " cured " + arrayOfDogs[i].getDogName() + " with medicine." + "\n" + arrayOfDogs[i].getDogName() + " is healthy now.");
            } else
                System.out.println("\n" + arrayOfDogs[i].getDogName() + " is healthy.");
    }

    public static void training(Dogs[] arrayOfDogs, Staff[] arrayOfStaff) {
        for (int i = 0; i < arrayOfDogs.length; i++) {
            switch (arrayOfDogs[i].getDogAge()) {
                case 0, 1, 2:
                    if (arrayOfDogs[i].isTheDogIsTrained() == false) {
                        arrayOfDogs[i].setTheDogIsTrained(true);
                        System.out.println("\n" + arrayOfStaff[2].staffSpecialty + " " + arrayOfStaff[2].staffName + " trained " + arrayOfDogs[i].getDogName() + ". " + "\n" + arrayOfDogs[i].getDogName() + " is trained now and need to relax.");
                    } else {
                        System.out.println("\n" + arrayOfDogs[i].getDogName() + " is already trained but it so young for work.");
                    }
                    break;
                case 3, 4, 5, 6, 7:
                    if (arrayOfDogs[i].isTheDogIsTrained() == false) {
                        arrayOfDogs[i].setTheDogIsTrained(true);
                        System.out.println("\n" + arrayOfStaff[2].staffSpecialty + " " + arrayOfStaff[2].staffName + " trained " + arrayOfDogs[i].getDogName() + ". " + "\n" + arrayOfDogs[i].getDogName() + " is trained now and need to relax.");
                    } else {
                        System.out.println("\n" + arrayOfDogs[i].getDogName() + " is already trained and must go to work.");
                    }
                    break;
                default:
                    if (arrayOfDogs[i].isTheDogIsTrained() == false) {
                        arrayOfDogs[i].setTheDogIsTrained(false);
                        System.out.println("\n" + arrayOfStaff[2].staffSpecialty + " " + arrayOfStaff[2].staffName + " try to train " + arrayOfDogs[i].getDogName() + ". " + "\n" + arrayOfDogs[i].getDogName() + " is so old to train.");
                    } else {
                        System.out.println("\n" + arrayOfDogs[i].getDogName() + " is already trained but it to old for work.");
                    }
                    break;
            }
        }
    }

        public static void cleaning (Aviary [] arrayOfAviary, Staff[] arrayOfStaff) {
            for (int i = 0; i < arrayOfAviary.length; i++) {
                if (arrayOfAviary[i].isAviaryIsClean() == false) {
                    arrayOfAviary[i].setAviaryIsClean(true);
                    System.out.println("\n" + arrayOfStaff[3].staffSpecialty + " " + arrayOfStaff[3].staffName + " cleaned the aviary №  " + arrayOfAviary[i].getAviaryId() + ". " + "\n" + "Aviary № " + arrayOfAviary[i].getAviaryId() + " is clean now.");
                } else {
                    System.out.println("\n" + "Aviary № " + arrayOfAviary[i].getAviaryId() + " has already cleaned.");
                }
            }
        }

    public static void fixing (Aviary [] arrayOfAviary, Staff[] arrayOfStaff) {
        for (int i = 0; i < arrayOfAviary.length; i++) {
            if (arrayOfAviary[i].isAviaryIsBroken() == true) {
                arrayOfAviary[i].setAviaryIsClean(false);
                System.out.println("\n" + arrayOfStaff[4].staffSpecialty + " " + arrayOfStaff[4].staffName + " fixed the aviary №  " + arrayOfAviary[i].getAviaryId() + ". " + "\n" + "Aviary № " + arrayOfAviary[i].getAviaryId() + " is now of high quality.");
            } else {
                System.out.println("\n" + "Aviary № " + arrayOfAviary[i].getAviaryId() + " has already fixed.");
            }
        }
    }



    }

