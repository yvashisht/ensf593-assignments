
/**
 * 
 * TODO: add JavaDoc
 * 
 * @author: Yajur Vashisht 
 *
 */
public final class Days { //public class Days which determines the number of days in a particular month
	
	/**
	 * Days cannot be instantiated, has static methods only.
	 */
	private Days() {}

	/**
	 * @param howManyDaysinMonth creates an integer month and returns an output of 0, 30, or 31 days depending on
	 * the value of month inputed by the user.
	 * @return value of days in month
	 */
	
	public static int howManyDaysinMonth(int month) {		
		
        if (month < 1 || month > 12) {
            return 0;
        }
        
        else if(month < 8 && month != 2) {
			if (month % 2 == 0) {
				return 30;
			} else {
					return 31;
				}
			}
			
		else if (month > 8) {
			if (month % 2 == 0) {
				return 31;	
			} else {
				return 30;
			}
		
		} else {
			return 28;
		}
	}
}