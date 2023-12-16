import java.text.NumberFormat;
import java.util.*;

/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 *  
 * @author 
 *
 */
public class BankCDApp {
	
	private BankCD bank;
	private InteractiveCLI cli;
	
	/**
	 * Uses InterativeCLI to provide the principal, rate, and years in daily and compounded interest.
	 */
	
	public BankCDApp() {
		
		cli = new InteractiveCLI();
	}
	
	/**
	 * Receives input and provides the output to the user using BankCD.java to calculate the required values.
	 */
	
	public void run() {
		
		NumberFormat currency_format = NumberFormat.getCurrencyInstance(Locale.CANADA); //Using $ symbol
		NumberFormat percent_format = NumberFormat.getPercentInstance(Locale.CANADA); //Using the percent format
		percent_format.setMaximumFractionDigits(3);
		
		double principal;
		double rate;
		double years;
		
		cli.display("************************ OUTPUT ********************");
		this.cli.prompt("Please a number, e.g 16.0 followed by enter > "); //Prompt
		principal = this.cli.getKeyboardDouble(); //Receiving input
		cli.display("Compare daily and annual compounding for a Bank CD.");  //Prompt
		this.cli.prompt("Input CD interest rate, e.g.  6.5 > 7.8: ");
		rate = this.cli.getKeyboardDouble(); //Receiving input
		this.cli.prompt("Input the number of years to maturity, e.g., 10.5 > 5: "); //Prompt
		years = this.cli.getKeyboardDouble(); //Receiving input
		
		//Creating bankCD object
		
		BankCD bankCD = new BankCD(principal, rate, years);
		
		cli.display("For Principal = " + currency_format.format(principal) + " Rate = " + percent_format.format(rate/100.0) + " Years = " + years);
		
		double yearly_value = bankCD.calcYearly();
		double daily_value = bankCD.calcDaily();
		
		cli.display("The maturity value compounded yearly is " + currency_format.format(yearly_value));
		cli.display("The maturity value compounded daily is: " + currency_format.format(daily_value));
		cli.display("************************ OUTPUT ********************");
		
	}
	public static void main(String[] args) {
		
		BankCDApp app = new BankCDApp();
		app.run();
	
	}

}

