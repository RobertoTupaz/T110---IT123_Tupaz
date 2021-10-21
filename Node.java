package incryptor;

public class Node {
	Node next;
	Node privious;
	String data;
	
	public void displayData(int num) {
		System.out.println("Data entered to incrypt(" + num + ") : " + data);
	}
}
