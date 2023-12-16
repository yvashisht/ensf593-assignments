
/**
 * @author Yajur Vashisht
 * NewtonSolver() uses the same variables (initial_guess, number, error, and iterations) to 
 * determine the values needed. 
 */

public class NewtonSolver {
	
	double initial_guess;
	double number;
	double error;
	int iterations;

	public void initial_guess(double ig) {
		this.initial_guess = ig;
	}

	public void number(double n) {
		this.number = n;
	}
	
	public void error(double e) {
		this.error = e;
	}
	
	public int getIterations() {
		return iterations;
	}

	public double sqrt() {
	
		double guess = initial_guess;
		double previous_guess;
		iterations = 0;
	
		do {
			previous_guess = guess;
			guess = (( number / guess) + guess) / 2 ;
			iterations++;
		} while (Math.abs(guess-previous_guess)>error);
		
		return guess;
	
	}
}