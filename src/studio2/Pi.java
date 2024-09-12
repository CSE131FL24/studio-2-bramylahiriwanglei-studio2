package studio2;
import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a number of darts: ");
		int darts = in.nextInt();
		
		double x = 0;
		double y = 0;
		int count = 0;
		for (int i = 0; i < darts; i++) {
			x = Math.random();
			y = Math.random();	
			if ( (Math.pow((x-0.5), 2) + Math.pow((y-0.5), 2)) <= Math.pow(0.5,  2)){
				count ++;
				
			}
			
		}
		System.out.println((double) count / darts / Math.pow(0.5,  2));
		
		

	}

}
