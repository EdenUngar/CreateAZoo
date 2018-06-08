package com.company.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeopleMenu {

    private Scanner input = new Scanner(System.in);

    //handles People Options
    protected void managePeople() {

        try {
            //find out what type of person we need to manage
            System.out.println("What type of person? " +
                    "\n1. An Employee" +
                    "\n2. A Visitor" +
                    "\n3. Go Back" +
                    "\n4. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //handle employee
                    manageEmployee();
                    break;
                case 2:
                    //handle visitor
                    manageVisitor();
                    break;
                case 3:
                    Menu menu = new Menu();
                    menu.mainMenu();
                    //handle going back to mainMenu()
                    break;
                case 4:
                    System.out.println("Thank you for using the Zoo Program");
                    //exit program
                    System.exit(0);
                    //handle exiting the program
                    break;
                default:
                    System.out.println("Not a valid entry. Please enter a number between 1 and 4. ");
                    managePeople();
                    //handle error
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 4. ");
            //handle any input that is not an int
            managePeople();
        }
    }


    //manage employees
    private void manageEmployee() {

        try {
            System.out.println("Please choose an option. " +
                    "\n1. Add Employee" +
                    "\n2. View Employee" +
                    "\n3. Remove Employee" +
                    "\n4. Go Back" +
                    "\n5. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //add employees
                    addEmployee();
                    break;
                case 2:
                    //view employees
                    viewEmployee();
                    break;
                case 3:
                    //remove employees
                    removeEmployee();
                    break;
                case 4:
                    managePeople();
                    //go back to manage people
                    break;
                case 5:
                    System.out.println("Thank you for using the Zoo Program");
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //handle incorrect inputs
                    System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
                    manageEmployee();
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
            //handle any input that is not an int
            manageEmployee();
        }

    }

    //add employees
    private void addEmployee() {
    }
    //view employees
    private void viewEmployee() {
    }
    //remove employees
    private void removeEmployee() {
    }




    //manage visitors
    private void manageVisitor() {
        try {
            System.out.println("Please choose an option. " +
                    "\n1. Add Visitor " +
                    "\n2. View Visitor " +
                    "\n3. Remove Visitor " +
                    "\n4. Go Back " +
                    "\n5. Exit Program ");
            switch (input.nextInt()){
                case 1:
                    //add visitors
                    addVisitor();
                    break;
                case 2:
                    //view visitors
                    viewVisitor();
                    break;
                case 3:
                    //remove visitors
                    removeVisitor();
                    break;
                case 4:
                    //go back to manage people
                    managePeople();
                    break;
                case 5:
                    System.out.println("Thank you for using the Zoo Program");
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //handle invalid int inputs (or intputs)
                    System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
                    manageVisitor();
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
            //handle any input that is not an int
            manageVisitor();
        }
    }

    private void addVisitor() {
    }
    private void viewVisitor() {
    }
    private void removeVisitor() {
    }


    //code for Manage People -> add people, view people, and remove people instead of ^ (manage people -> employee/visitor)
//        try{
//            System.out.println("Please choose an option. " +
//                    "\n1. Add People" +
//                    "\n2. View People" +
//                    "\n3. Remove People" +
//                    "\n4. Back to Main Menu" +
//                    "\n5. Exit Program");
//            switch (input.nextInt()){
//                case 1:
//                    //add people
//                    addPeople();
//                    break;
//                case 2:
//                    //view people
//                    viewPeople();
//                    break;
//                case 3:
//                    //remove people
//                    removePeople();
//                    break;
//                case 4:
//                    //back to main menu
//                    mainMenu();
//                    break;
//                case 5:
//                    //exit program
//                    System.out.println("Thank you for using the Zoo Program");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Not a valid entry. Please enter a number between 1 and 5. ");
//                    managePeople();
//                    break;
//            }
//        } catch (InputMismatchException ime){
//            //what you want it to do IF this exception happens
//            input.nextLine();
//            System.out.println("Not a valid entry. Please enter a number between 1 and 5.");
//            managePeople();
//        }
//
//    }
//
//    private void addPeople() {
//    }
//    private void viewPeople() {
//    }
//    private void removePeople() {
//    }


}
