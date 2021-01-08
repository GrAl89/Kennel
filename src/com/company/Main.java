package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n" + "Enter the number of dogs in the kennel ");
        Dogs[] dogsArray = Dogs.createDogsArray(scan.nextInt());

        System.out.println("\n" + "Enter the number of aviaries in the kennel ");
        Aviary[] aviaryArray = Aviary.createAviaryArray(scan.nextInt());

        Staff[] staffArray = Staff.createStaffArray();

        // displaying a list of dogs and their characteristics at the beginning of the day
        System.out.println("\n" + "Condition of dogs at the beginning of the day:");
        for (int i = 0; i < dogsArray.length; i++) {
            dogsArray[i].showDogs();
        }

        // displaying a list of aviaries and their characteristics at the beginning of the day
        System.out.println("\n" + "Condition of aviaries at the beginning of the day:");
        for (int i = 0; i < aviaryArray.length; i++) {
            aviaryArray[i].showAviary();
        }

        // displaying a list of staff of the kennel
        System.out.println("\n" + "The following staff will work today:");
        for (int i = 0; i < staffArray.length; i++) {
            staffArray[i].showStaff();
        }

        // displaying the feeding results
        System.out.println("\n" + "The feeding results:");
        Staff.feeding(dogsArray, staffArray);

        // displaying the medication results
        System.out.println("\n" + "The medication results:");
        Staff.medication(dogsArray, staffArray);

        // displaying the training results
        System.out.println("\n" + "The training results:");
        Staff.training(dogsArray, staffArray);

        // displaying the cleaning aviary results
        System.out.println("\n" + "The cleaning aviary results:");
        Staff.cleaning(aviaryArray, staffArray);

        // displaying the fixing aviary results
        System.out.println("\n" + "The fixing aviary results:");
        Staff.fixing(aviaryArray, staffArray);

        // displaying a list of dogs and their characteristics at the end of the day
        System.out.println("\n" + "Condition of dogs at the end of the day:");
        for (int i = 0; i < dogsArray.length; i++) {
            dogsArray[i].showDogs();
        }

        // displaying a list of aviaries and their characteristics at the end of the day
        System.out.println("\n" + "Condition of aviaries at the end of the day:");
        for (int i = 0; i < aviaryArray.length; i++) {
            aviaryArray[i].showAviary();
        }

        }
    }


