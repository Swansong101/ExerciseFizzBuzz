package com.codewithnicole;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int number = input.nextInt();
//Using "if statements"
     if (number % 3 == 0 && number % 5 == 0)
         System.out.println("FizzBuzz");
     else if (number % 5 == 0)
         System.out.println("Fizz");
     else if (number % 3 == 0)
         System.out.println("Buzz");
     else
         System.out.println(number);

     //Using switch statements
     // Generate a key for the switch statement
//        String key = "";
//        if (number % 3 == 0) key += "Fizz";
//        if (number % 5 == 0) key += "Buzz";

//         Switch statement to handle cases
//        switch (key) {
//            case "FizzBuzz":
//                System.out.println("FizzBuzz");
//                break;
//            case "Fizz":
//                System.out.println("Fizz");
//                break;
//            case "Buzz":
//                System.out.println("Buzz");
//                break;
//            default:
//                System.out.println(number);
//                break;
        //}
     }

    }
