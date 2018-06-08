package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);


    public void mainMenu(){

        try {
            System.out.println("Please choose an option. " +
                    "\n1. Manage People" +
                    "\n2. Manage Animals" +
                    "\n3. Manage Inventory");

            //handles user input for navigation
            switch (input.nextInt()) {
                case 1:
                    //Manage People
                    managePeople();
                    break;
                case 2:
                    //Manage Animals
                    manageAnimals();
                    break;
                case 3:
                    //Manage Inventory
                    manageInventory();
                    break;
                default:
                    //handle wrong number
                    //tell them they did something wrong
                    System.out.println("Not a valid entry. Please enter a number between 1 and 3. ");
                    //restart method to allow user to try again
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime){
            //handle if user puts in something that is not an int
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 3. ");
            //restart method to allow user to try again
            mainMenu();

        }

    }

    //handles People Options
    private void managePeople() {

        try{
            //enter code you would like to run that MAY throw an exception
        } catch (InputMismatchException ime){
            //what you want it to do IF this exception happens
        }

    }

    //handles Animal Options
    private void manageAnimals() {
    }

    //handles Inventory Options
    private void manageInventory() {
    }



}
