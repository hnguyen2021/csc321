//Hubert Nguyen
//Lab 4b
//Prof Garrett Poppe
//2.4.2025

import java.util.Scanner;

public class hnguyen4b {

    public static void main (String[] args) {
    	Scanner input = new Scanner(System.in);
	int choice;
	System.out.println("You just got home from school and have 4 choices...");
	System.out.println("1: Get some homework done");
	System.out.println("2: Eat something from the fridge");
	System.out.println("3: Scroll on your phone");
	System.out.println("4: Take a nap");
	System.out.print("Which will you choose?: ");
	choice = input.nextInt();

	if(choice == 1)
	{
	    System.out.println("Great! Get to it then.");
	}
	else if(choice == 2)
	{
	    System.out.println("Understandable. You can get hungry after a long day in school.");
	}
	else if(choice == 3)
	{
	    System.out.println("Okay, don't overdo it. You got homework to do.");
	}
	else if(choice == 4)
	{
	    System.out.println("Okay, make sure you set an alarm. Otherwise you end up 'napping' for 3 hours.");
	}
	else
	{
	    System.out.println("Not available");
	}

	input.close();
    }

}
