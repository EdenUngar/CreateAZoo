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
                    "\n3. Manage Inventory" +
                    "\n4. Exit Program");

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
                case 4:
                    System.out.println("Thank you for using the Zoo Program");
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //handle wrong number
                    //tell them they did something wrong
                    System.out.println("Not a valid entry. Please enter a number between 1 and 4. ");
                    //restart method to allow user to try again
                    mainMenu();
                    break;
            }
        } catch (InputMismatchException ime){
            //handle if user puts in something that is not an int
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 4. ");
            //restart method to allow user to try again
            mainMenu();

        }

    }


    //handles People Options
    private void managePeople() {

        try{
            //enter code you would like to run that MAY throw an exception
            System.out.println("Please choose an option. " +
                    "\n1. Add People" +
                    "\n2. View People" +
                    "\n3. Remove People" +
                    "\n4. Back to Main Menu" +
                    "\n5. Exit Program");
            switch (input.nextInt()){
                case 1:
                    //add people
                    addPeople();
                    break;
                case 2:
                    //view people
                    viewPeople();
                    break;
                case 3:
                    //remove people
                    removePeople();
                    break;
                case 4:
                    //back to main menu
                    mainMenu();
                    break;
                case 5:
                    //exit program
                    System.out.println("Thank you for using the Zoo Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
                    managePeople();
                    break;
            }
        } catch (InputMismatchException ime){
            //what you want it to do IF this exception happens
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 5.");
            managePeople();
        }

    }

    private void addPeople() {
    }
    private void viewPeople() {
    }
    private void removePeople() {
    }





    //handles Animal Options
    private void manageAnimals() {
    }

    //handles Inventory Options
    private void manageInventory() {
    }


}
