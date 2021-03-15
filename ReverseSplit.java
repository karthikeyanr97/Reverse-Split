import java.util.Scanner;

public class ReverseSplit extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");
		String word = scanner.nextLine();

		System.out.println("Enter the character:");
		char splitChar = scanner.next().charAt(0);

		String result = reshape(word, splitChar);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String reshape(String word, char splitChar) {

		String result = "";
		for (int i = word.length() - 1; i >= 0; i--) {

			if (i == 0)
				result = result + word.charAt(i);
			else
				result = result + word.charAt(i) + splitChar;

		}

		return result;
	}

}
