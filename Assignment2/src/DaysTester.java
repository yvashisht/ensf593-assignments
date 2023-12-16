import java.util.Scanner;
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @author Yajur Vashisht
 *
 */


public class DaysTester {
	
	public static void main(String[] args) {
		
		for(int month = 1; month <=12; month++) {
            int days = Days.howManyDaysinMonth(month);
            System.out.println("Month " + month + " has " + days + " days.");
		}

	}

}
