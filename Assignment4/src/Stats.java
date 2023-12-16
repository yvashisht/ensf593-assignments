/**
 * 
 * Partial implementation of Stats class
 * 
 * Stats uses the array grades[] and the count of all of the inputted grades within the array to calculate the mean
 * and the median of the numbers and display them.
 * 
 * @author Yajur Vashisht
 * 
 */
public class Stats {

	private int grades[];
	private int count;

	public Stats() {
		grades = new int[100];
		count = 0;
	}
	
	public void add(int grade) {
		grades[count] = grade;
		count++;
	}
	
	/**
	 * @return the getMean() method creates an initial sum and then uses the inputted grades from the user to
	 * divide the total (aka sum) by the number of values to get the mean
	 */
	
	public double getMean() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += grades[i];
		}
		return (double) sum/count;
	}
	
	/**
	 * @return the getMedian() method uses an if else statement to determine if there is an odd or even number of
	 * values in the grades array. It then uses the appropriate formula to calculate the median.
	 */
	public double getMedian() {
		sort();
		if (count % 2 == 0) {
			int MiddleIndex = count / 2;
			return (grades[MiddleIndex -1] + grades[MiddleIndex]/2.0);
		} else {
			int MiddleIndex = count/2;
			return grades[MiddleIndex];
		}
	}
	
	/**
	 * Displays the mean and median functions calculated above.
	 */
	public String toString() {
		sort();
		StringBuilder display = new StringBuilder();
		for (int i = 0; i < count; i++) {
			display.append(grades[i]).append(" ");
		}
		display.append("\nMean: ").append(getMean());
		display.append("\nMedian: ").append(getMedian());
		return display.toString();
	}


	/**
	 * 
	 * Sorts the first count elements of grades array with Bubble sort.
	 * 
	 * Bubble sort adapted
	 * from 5.2 Try-this: Sorting an array 
	 * in Java, a beginner's guide 9th ed 
	 * 
	 */
	public void sort() {
		int a, b, t;
		for(a=1; a<count; a++) {
			for(b=count-1;b>=a;b--) {
				if(grades[b-1]>grades[b]) {
					t = grades[b-1];
					grades[b-1] = grades[b];
					grades[b] = t;
				}
			}
			
		}
	}
}
