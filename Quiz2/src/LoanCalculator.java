
public class LoanCalculator {
	 double TP; // Total Price
     double DP; // Down Payment
     double LL; // Length of Loan in months
     double IR; // Interest Rate
     double MP; // Monthly Pay
     double TotalInterest; // Total Interest
    
    
     double MonthlyPay() {
            MP= ((IR/12)*(TP-DP)) / (1-(java.lang.Math.pow((1+(IR/12)),-LL)));
            return MP;
     }
    
     double TotalInterest() {
            TotalInterest=(MP*LL)-(TP-DP);
            return TotalInterest;
     }
}
