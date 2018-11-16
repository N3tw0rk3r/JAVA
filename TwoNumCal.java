package com.company;
import java.util.Scanner;
public class Main {

    static double  num1, num2;
    static int choice1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        do {

            //Menu Function
            menu();

            System.out.print("Please Enter your choice: ");
            choice1 = input.nextInt();

            //input data function to get user selection
            if (choice1 == 0) {
                System.exit(0);
            }
            else if (choice1 > 4){
                System.out.println("Invalid Selection, Please Try Again!");
            }
            else {
                inputdata();
            }

            //Menu Choices
            choice(num1,num2,choice1);

        } while (choice1 != 0);

    }


    public static void menu () {
        System.out.println("Choose your number from the following Menu");
        System.out.println("1. add Two Numbers");
        System.out.println("2. Subtract Two Numbers");
        System.out.println("3. Multiple Two Numbers");
        System.out.println("4. Divide Two Numbers");
        System.out.println("0. Exit");
    }

    public static void inputdata () {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your 1st Number: ");
        num1 = input.nextDouble();

        System.out.print("Please Enter your 2nd Number: ");
        num2 = input.nextDouble();

    }

    public static void choice (double num1, double num2, int choice1) {
        if (choice1 == 1) {
            System.out.println("Your result is: " + add(num1,num2) );
        }
        else if (choice1 == 2) {
            System.out.println("Your result is: " + sub(num1, num2));
        }
        else if (choice1 == 3) {
                System.out.println("Your result is: " + mult(num1,num2) );
        }
        else if (choice1 == 4) {
            System.out.println("Your result is: " + div(num1, num2));
        }
    }



    public static double add (double num1 , double num2) {
        return num1 + num2;
    }
    public static double sub (double num1 , double num2) {
        return num1 - num2;
    }
    public static double mult (double num1 , double num2) {
        return num1 * num2;
    }
    public static double div (double num1 , double num2) {
        return num1 / num2;
    }
}
