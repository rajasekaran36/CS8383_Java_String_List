import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.raja.oopslab.stringlist.StringList;

public class Main {
	public static void main(String[] args) {
		StringList stringList = new StringList();
		Scanner userInput = new Scanner(System.in);
		String aString = null;
		int choice = 0;
		int position = 0;
		while (choice != 6) {
			System.out.println("\nString List Operations");
			System.out.println("************************");
			System.out.println(
					"1. Append a String\n"
					+ "2. Insert a String at Position\n"
					+ "3. Search a String\n"
					+ "4. List all Strings\n"
					+ "5. Display String's Begins with a Letter\n"
					+ "6.Exit");

			choice = userInput.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter a String: ");
				stringList.addString(userInput.next());
				break;
			case 2:
				System.out.println("Enter a String: ");
				aString = userInput.next();
				System.out.println("Enter a Position to Insert: ");
				position = userInput.nextInt();
				stringList.insertStringAt(position, aString);
				break;
			case 3:
				System.out.println("Enter a String to Be Searched: ");
				aString = userInput.next();
				stringList.searchString(aString);
				break;
			case 4:
				System.out.println("\nList Contains");
				System.out.println("-------------");
				stringList.displayList();
				break;
			case 5:
				System.out.println("Enter a letter");
				stringList.displayStringsBeginWith(userInput.next());
				break;
			case 6:
				System.out.println("\n\nThank You !!!");
				userInput.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter valid input");
				break;
			}
		}
	}
}
