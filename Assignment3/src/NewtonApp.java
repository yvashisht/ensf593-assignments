import java.text.NumberFormat;
import java.util.*;

/**
 * @author Yajur Vashisht
 * NewtonApp uses InteractiveCLI and NewtonSolver as well as the inputs from the user and the Newton
 * method to determine the square root of the user inputed values (number, error, and initial guess)
 */

public class NewtonApp {
	
	private InteractiveCLI cli;
	public NewtonSolver solver;
	
	public NewtonApp() {
		this.cli = new InteractiveCLI();
		this.solver = new NewtonSolver();
		
	}
	
	public void run() {

		this.cli.prompt("Please enter a positive number, followed by enter: ");
		solver.number = this.cli.getKeyboardDouble();
		this.cli.prompt("Please enter an acceptable error, ex. 0.001: ");
		solver.error = this.cli.getKeyboardDouble();
		this.cli.prompt("Please enter an initial guess: ");
		solver.initial_guess = this.cli.getKeyboardDouble();
		this.cli.display("Your number was: "+solver.number+", the initial guess was: "+solver.initial_guess+", the erorr was: "+solver.error);
		System.out.println("The square root of the number is: "+solver.sqrt()+", and the number of iterations required was: "+solver.getIterations());
		
	}

	public static void main(String[] args) {
		
		NewtonApp app = new NewtonApp();
		app.run();
		
	}

}
