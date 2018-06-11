package com.company.menu;

import com.company.people.Employee;
import com.company.people.Visitor;

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
            System.out.println("You are in the Employee Menu. " +
                    "\nPlease choose an option. " +
                    "\n1. Add Employee" +
                    "\n2. View Employee" +
                    "\n3. Remove Employee" +
                    "\n4. Edit Employee" +
                    "\n5. Go Back" +
                    "\n6. Exit Program");
            switch (input.nextInt()) {
                case 1:
                    //add/create employees
                    createPerson(1);
                    break;
                case 2:
                    //view employees
                    break;
                case 3:
                    //remove employees
                    break;
                case 4:
                    //edit employees
                    break;
                case 5:
                    managePeople();
                    //go back to manage people
                    break;
                case 6:
                    System.out.println("Thank you for using the Zoo Program");
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //handle incorrect inputs
                    System.out.println("Not a valid entry. Please enter a number between 1 and 6. ");
                    manageEmployee();
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 6. ");
            //handle any input that is not an int
            manageEmployee();
        }

    }




    //manage visitors
    private void manageVisitor() {
        try {
            System.out.println("You are in the Visitor Menu. " +
                    "\nPlease choose an option. " +
                    "\n1. Add Visitor " +
                    "\n2. View Visitor " +
                    "\n3. Remove Visitor " +
                    "\n4. Edit Visitor" +
                    "\n5. Go Back " +
                    "\n6. Exit Program ");
            switch (input.nextInt()){
                case 1:
                    //add visitors
                    createPerson(2);
                    break;
                case 2:
                    //view visitors
                    break;
                case 3:
                    //remove visitors
                    break;
                case 4:
                    //edit visitors
                    break;
                case 5:
                    //go back to manage people
                    managePeople();
                    break;
                case 6:
                    System.out.println("Thank you for using the Zoo Program. ");
                    //exit program
                    System.exit(0);
                    break;
                default:
                    //handle invalid int inputs (or intputs)
                    System.out.println("Not a valid entry. Please enter a number between 1 and 6. ");
                    manageVisitor();
                    break;
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Not a valid entry. Please enter a number between 1 and 6. ");
            //handle any input that is not an int
            manageVisitor();
        }
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


    private void createPerson(int location) {

        //if location == 1 new employee
        //if location == 2 new visitor

        if (location == 1){

            //find employee age
            System.out.println("What is the employee's age? ");
            int employeeAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's name? ");
            String employeeName = input.nextLine();
            System.out.println("What is the employee's gender? ");
            char employeeGender = input.nextLine().charAt(0);
            System.out.println("What is the employee's race? ");
            String employeeRace = input.nextLine();
            System.out.println("What is the employee's employee number? ");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is the employee's job title? ");
            String employeeTitle = input.nextLine();
            System.out.println("What is the employee's hire date? ");
            String employeeHireDate = input.nextLine();

            Employee newEmployee = new Employee(employeeAge, employeeName, employeeGender, employeeRace, employeeNumber, employeeTitle, employeeHireDate);

            // TODO add employee to employee list
        }

        else if (location == 2){

            System.out.println("What is the visitor's age? ");
            int visitorAge = input.nextInt();
            input.nextLine();
            System.out.println("What is the visitor's name? ");
            String visitorName = input.nextLine();
            System.out.println("What is the visitor's gender? ");
            char visitorGender = input.nextLine().charAt(0);
            System.out.println("What is the visitor's race? ");
            String visitorRace = input.nextLine();
            System.out.println("How big is the visitor's group? ");
            int visitorGroupSize = input.nextInt();
            input.nextLine();
            System.out.println("Does the visitor have a membership? ");
//           TODO add boolean hasMembership
//            boolean visitorHasMembership = input.nextBoolean();
            System.out.println("What is the visitor's home address?");
            String visitorHomeAddress = input.nextLine();

            Visitor newVisitor = new Visitor();
        }

    }

}
