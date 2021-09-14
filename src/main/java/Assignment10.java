/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter item 1 : ");
        double one = input1.nextDouble();

        System.out.println("Enter the quantity : ");
        int oneq = input1.nextInt();

        System.out.println("Enter item 2: ");
        double two = input1.nextDouble();

        System.out.println("Enter the quantity: ");
        int twoq = input1.nextInt();

        System.out.println("Enter item 3: ");
        double three = input1.nextDouble();

        System.out.println("Enter the quantity: ");
        int threeq = input1.nextInt();

        double total = (one * oneq) + (two * twoq) + (three * threeq);
        double tax = (total * 0.055);
        System.out.println("Your subtotal is: " + total);
        System.out.println("Your tax is " + tax );
        System.out.println("Your total is: " + (total + tax));





    }
}