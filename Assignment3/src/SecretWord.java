
/**
 * @author Yajur Vashisht
 * The class SecretWord uses the SecretWordGUI to prompt the user to input letters in order to
 * determine the "secret word"
 *
 */
public class SecretWord {
	
	private String secretWord;
	private String displayedWord;
	
	public SecretWord() {
		secretWord = "sloshed";
		displayedWord = replaceChars(secretWord, '*');
	}

	public String getDisplayedWord() {
		return displayedWord;
	}
	
	public String getSecretWord() {
		return secretWord;
	}
	
	//determines if the inputted letter is equal to one of the characters in secretWord
	
	public String updatedWord(String s1, String s2, char ch) { 
		StringBuilder result = new StringBuilder(); 
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ch) {
				result.append(ch);
			} else 
				result.append(s2.charAt(i));
		}
		return result.toString();
	}
	
	//Replaces the inputted letter provided it is equal to one of the characters in secretWord
	public String replaceChars(String s, char ch) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			result.append(ch);
		}
		return result.toString();
	}
	
	//"shows" (gets rid of the asterisk) if the inputted letter is equal to one of the characters in secretWord
	//otherwise it returns wrong guess
	
	public boolean makeGuess(char ch) {
		boolean guess = false;
		StringBuilder updatedWord = new StringBuilder(displayedWord);
		for (int i = 0; i < secretWord.length(); i++) {
			if (secretWord.charAt(i) == ch) {
				updatedWord.setCharAt(i, ch);
				guess = true;
			} 
		}
		
		displayedWord = updatedWord.toString();
		return guess;
	}
}
