/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble(); //stores weight
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble(); //stores height

        double bmi = (weight/(height*height))*703;  //calculates bmi
        System.out.println("Your BMI is: "+bmi);

        if(bmi<18.5) {  //if bmi is less than 18.5
            System.out.println("You are underweight. You should see your doctor");
        }else if(bmi<25) {  //if bmi is less than 25
            System.out.println("You are within the ideal weight range.");
        }else if(bmi>30){   //if bmi is greater than 30
            System.out.println("You are overweight. You should see your doctor");
        }
    }
}
