package incryptor;

public class Node3 {
	Node3 next;
	Node3 privious;
	String incrypted;
	
	public void displayData(int num) {
		System.out.println("Incrypted text(" + num + ") : " + incrypted);
	}
}
