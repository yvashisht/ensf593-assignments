/**
 * Class BankCD representing a certificate of deposit.
 * 
 * @author Yajur Vashisht
 *
 */
public class BankCD {
	
	double principal; //double for the principal amount
	double rate; //double for the rate of interest
	double years; //double for the years of accumulation
	
public BankCD(double principal, double rate, double years) {
	
	//initialization
	
	this.principal = principal;
	this.rate = rate; 
	this.years = years; 
	
}

/**
 * @return method to calculate the yearly interest
 */

public double calcYearly() {
	
	return this.principal * Math.pow(1 + this.rate/100, this.years);
	
}

/**
 * @return method to calculate the daily interest
 */

public double calcDaily() {
	
	return this.principal * Math.pow(1 + this.rate/36500, this.years*365);
	
	}

}
