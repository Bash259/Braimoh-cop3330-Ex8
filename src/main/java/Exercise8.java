/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fouad Braimoh
 */


import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner UserInput = new Scanner(System.in);
        int NoOfPeople = UserInput.nextInt();
        System.out.println("How many pizzas do you have?");
        int NoOfPizzas = UserInput.nextInt();
        System.out.println("How many slices per pizza?");
        int NoOfSlices = UserInput.nextInt();
        int TotalNoOfSlices = NoOfSlices * NoOfPizzas;
        System.out.println(NoOfPeople + " people with " + NoOfPizzas + " pizzas (" + TotalNoOfSlices + " slices)");
        int AllowedSlices = TotalNoOfSlices / NoOfPeople;
        if(AllowedSlices == 1) {
            System.out.println("Each person gets " + AllowedSlices + " piece of pizza.");
        }else {
            System.out.println("Each person gets " + AllowedSlices + " pieces of pizza.");
        }
        int remainder = TotalNoOfSlices % NoOfPeople;
        if (remainder == 1) {
            System.out.println("There is " + remainder + " leftover piece.");
        } else {
            System.out.println("There are " + remainder + " leftover pieces.");
        }
    }
}