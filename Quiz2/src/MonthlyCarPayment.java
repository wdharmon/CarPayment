import java.util.Scanner;
public class MonthlyCarPayment {
	public void MonthlyCarPayment() {   
		LoanCalculator x=new LoanCalculator();
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter Total Price: ");
		x.TP=stdin.nextDouble();
		   
		System.out.print("What is your Down Payment?: ");
		x.DP=stdin.nextDouble();
		             
		System.out.print("What is the length of the loan?(in months): ");
		x.LL=stdin.nextDouble();
		             
		System.out.print("Enter Interest Rate: ");
		x.IR=stdin.nextDouble();
		stdin.close();
		             
		System.out.println(x.MonthlyPay());
		System.out.println(x.TotalInterest());
	}
		            
	}


