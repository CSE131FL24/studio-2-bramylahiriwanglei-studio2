package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your start amount? ");
		double startAmount = in.nextDouble(); //The amount of money that you start with
		
		System.out.println("What is your win chance? ");
		double winChance = in.nextDouble(); //The win probability of a single play
		
		System.out.println("What is your win limit? ");
		double winLimit = in.nextDouble(); //If you reach this amount of money, you had a successful day and leave

		System.out.println("What is the number of days you'll simulate? ");
		
		double currentAmount = startAmount;
		double expectedRuin;
		int totalSimulations = in.nextInt();
		int ruinNumber = 0;
		for (int i = 1; i <= totalSimulations; i++) {
			int count = 0;
			while ((currentAmount != 0) && (currentAmount < winLimit)) {
	
				if(Math.random() < winChance) {
					currentAmount++;
				}
				else {
					currentAmount--;
				}
				count++;
			}
			if (currentAmount == 0) {
				System.out.print("Ruin! ");
				ruinNumber++;
			}
			else {
				System.out.print("Success! ");
			}
			currentAmount = startAmount;			
			System.out.println("Day number: " + i + "\n" + "Number of plays: " + count);

		}
		double a = (1 - winChance) / winChance;
		if (winChance == 0.5) {
			expectedRuin = (double) 1 - (startAmount / winLimit);
		}
		else {
			expectedRuin = (Math.pow(a, startAmount) - Math.pow(a,  winLimit)) / (1-Math.pow(a,  winLimit));
			
		}
		System.out.println("Expected Ruin Rate: " + expectedRuin);
		System.out.println("Ruin rate: " + (double) ruinNumber / totalSimulations);
		
		
		
		
		
		
		
	}

}
