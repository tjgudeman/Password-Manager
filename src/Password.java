import java.util.ArrayList;
import java.lang.Character;

public class Password {

	public int score;
	public String pass;

	int symbols = 0;
	int numbers = 0;
	int lCase = 0;
	int uCase = 0;

	public Password() {
		String p = null;
		pass = p;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	//Generates new password by build each part and storing it in arrayList
	public static String generateNewPassword(boolean l, boolean u, boolean n,
			boolean s, int len) {
		ArrayList<Integer> cs = new ArrayList<Integer>();
		if (l) {
			for (int i = 0; i < 26; i++) {
				cs.add(97 + i);
			}
		}
		if (u) {
			for (int i = 0; i < 26; i++) {
				cs.add(65 + i);
			}
		}
		if (n) {
			for (int i = 0; i < 10; i++) {
				cs.add(48 + i);
			}
		}
		if (s) {
			for (int i = 0; i < 10; i++) {
				cs.add(33 + i);
			}
			for (int i = 0; i < 7; i++) {
				cs.add(58 + i);
			}
			for (int i = 0; i < 6; i++) {
				cs.add(91 + i);
			}
			for (int i = 0; i < 4; i++) {
				cs.add(123 + i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			sb.append(Character.toChars(cs.get((int) (Math.random() * cs.size()))));
		}
		return sb.toString();
	}

	
	//Testing strength of password
	public int passwordStrength() {

		int len = pass.length();

		for (int i = 0; i < pass.length(); i++) {
			if (symbolArray(pass.charAt(i)) == true) {
				symbols++;
			} else if (numberArray(pass.charAt(i)) == true) {
				numbers++;
			} else if (upperCaseArray(pass.charAt(i)) == true) {
				uCase++;
			} else {
				lCase++;
			}
		}

		scoreMethod(len, symbols, numbers, lCase, uCase);

		return score;

	}

	// Check for symbol
	public boolean symbolArray(char c) {

		char[] sArray = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
				'.', ',', '<', '>', '?', '/', '`', '~' };

		for (int i = 0; i < sArray.length; i++) {
			if (sArray[i] == c) {
				return true;
			}
		}
		return false;
	}

	//Check for number
	public boolean numberArray(char c) {

		char[] nArray = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

		for (int i = 0; i < nArray.length; i++) {
			if (nArray[i] == c) {
				return true;

			}
		}
		return false;
	}

	//Check for upperCase
	public boolean upperCaseArray(char c) {

		char[] upCaseArray = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
				'V', 'W', 'X', 'Y', 'Z' };

		for (int i = 0; i < upCaseArray.length; i++) {
			if (upCaseArray[i] == c) {
				return true;
			}
		}
		return false;

	}

	//Check for lowerCase
	public boolean lowerCaseArray(char c) {

		char[] lowCaseArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
				'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
				'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < lowCaseArray.length; i++) {
			if (lowCaseArray[i] == c) {
				return true;
			}
		}
		return false;

	}

	// Scoring password
	public int scoreMethod(int length, int s, int n, int low, int up) {

		if ((pass.length() >= 14)
				&& (lCase >= 7 && uCase >= 7 && symbols >= 4 || numbers >= 4)
				|| (symbols >= 7 && numbers >= 7 && lCase >= 4 || uCase >= 4)) {
			score = 8;
		} else if ((pass.length() >= 11 || pass.length() <= 13)
				&& (lCase >= 5 && uCase >= 5 && symbols >= 3 || numbers >= 3)
				|| (symbols >= 5 && numbers >= 5 && lCase >= 3 || uCase >= 3)) {
			score = 5;
		} else if ((pass.length() >= 7 || pass.length() <= 10)
				&& (lCase >= 3 && uCase >= 3 && symbols >= 2 || numbers >= 2)
				|| (symbols >= 3 && numbers >= 3 && lCase >= 2 || uCase >= 2)) {
			score = 3;
		}
		return score;
	}

}
