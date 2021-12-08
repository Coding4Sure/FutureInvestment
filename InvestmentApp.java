import java.util.Scanner;
import java.text.NumberFormat;

public class InvestmentApp {
	public static void main(String[] args) {
		Scanner ri = new Scanner(System.in);
		String choice = "y";
		//if its not a choice ignore case
		while(!choice.equalsIgnoreCase("n")){
			//get input from user
			System.out.print("Enter the monthly investment:    ");
			double monthlyInvestment = ri.nextDouble();
			System.out.print("Enter the yearly interest rate:     ");
			double interestRate = ri.nextDouble();
			System.out.print("Enter the number of years:  ");
			int years = ri.nextInt();
			
			//convert yearly to monthly values & initiate future number
			double monthlyInterestRate = interestRate/12/100;
			int months = years * 12;
			double futureValue = 0.0;
			
			//use for loop to calculate future change number
			for (int i =0; i <= months; i++){
				futureValue = (futureValue + monthlyInvestment) * (1 + monthlyInterestRate);
			}
			
			//format & show results
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			System.out.println("Future Value:                 " + currency.format(futureValue));
		    System.out.println();
		}
	}
}