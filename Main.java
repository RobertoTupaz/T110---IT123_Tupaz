package incryptor;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Incrypt test = new Incrypt();
		String dataToIncrypt = " ";
		System.out.println("Click \"enter\" key to terminate the program.\nEnter '-' to show all data entered\nEnter '+' to show all data entered + incryption ");
		
		while(dataToIncrypt != "") {
			System.out.print("\nEnter Text to incrypt : ");
			dataToIncrypt = scan.nextLine();
			if(dataToIncrypt == "") {
				break;
			} else if(dataToIncrypt.charAt(0) == '-') {
				test.displayAllWords();
			} else if(dataToIncrypt.charAt(0) == '+') {
				test.displayAll();
			} else {
				test.insertText(dataToIncrypt);
			}
		}
		
		System.out.println("Program Terminated.");
		scan.close();
	}
	
}
