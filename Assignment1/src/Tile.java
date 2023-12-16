
/**
 * @author Yajur Vashisht
 * The class Tile uses a character named letter and an integer named value as well as the methods toString() and equals() 
 * to determine if the Tile instances match and displays their letter and value. It also displays whether or not the 
 * letters are equal.
 */

public class Tile {
	
	char letter = 'A';
	int value = 1;
	
	/**
	 * @param l
	 * @param v
	 * l and v initialize the letter and value objects. This method is used later to reference the inputed tiles.
	 */
	Tile (char l, int v) {
		this.letter = l;
		this.value = v;

	}
	
	/**
	 * The method toString() converts from a char to a string in order to print these strings afterwards.
	 */
	
	public String toString() {
		String stringout = Character.toString(letter) + "[" + (this.value) + "]";
		return stringout;
	}
	
	public boolean equals(Tile output) {
		if (this.letter == output.letter && this.value == output.value) {
		return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Tile tile0 = new Tile ('A', 1);
		Tile tile1 = new Tile('A', 1);
		Tile tile2 = new Tile ('Z', 10);
		
		System.out.println("Tile 0: " + tile0.toString());
		System.out.println("Tile 1: " + tile1.toString());
		System.out.println("Tile 2: " + tile2.toString());
		System.out.println("Tile 0 is equal to Tile 1 is " + tile0.equals(tile1));
		System.out.println("Tile 0 is equal to Tile 2 is " + tile1.equals(tile2));

	}

}
