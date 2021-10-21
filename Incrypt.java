package incryptor;
import java.util.Scanner;

public class Incrypt {
	Scanner scan = new Scanner(System.in);
	Node first;
	Node last;
	Node3 first3;
	Node3 last3;
	int num = 1, spaceNum = 0; 
	
	public boolean isEmpty() {
		return (first == null);
	}

	public boolean isEmpty3() {
		return (first3 == null);
	}
	
	public void insertText(String data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode;
			newNode.privious = last;
		}
		
		last = newNode;
		
		Node2 newNode2 = new Node2();
		String container = "";
		
		for(int i = 0; i < data.length(); i++) {
			newNode2.character = incrypt(data.charAt(i));
			container += String.valueOf(newNode2.character);
		}
		
		Node3 newNode3 = new Node3();
		newNode3.incrypted = container;
		if(isEmpty3()) {
			first3 = newNode3;
		} else {
			last3.next = newNode3;
			newNode3.privious = last3;
		}
		last3 = newNode3;
		newNode3.displayData(num);
		num += 1;
	}
	
	//Display all data entered
	public void displayAllWords() {
		System.out.println("\nDisplay (first --> last)/////////////////////////////////////////////////////////////////////////////////////////////////////");
		Node temp = new Node();
		temp = first;
		int dataNum = 1;
		
		if(isEmpty()) {
			System.out.println("No data found to display");
		} else {
			while(temp != null) {
				temp.displayData(dataNum);
				temp = temp.next;
				dataNum++;
			}
		}
		
		System.out.println();
	}
	
	//Display all data entered
	public void displayAll() {
		System.out.println("\nDisplay (first --> last)/////////////////////////////////////////////////////////////////////////////////////////////////////");
		Node temp = new Node();
		Node3 temp3 = new Node3();
		temp = first;
		temp3 = first3;
		int dataNum = 1;
		
		if(isEmpty3()) {
			System.out.println("No data found to display");
		} else {
			while(temp != null && temp3 != null) {
				temp.displayData(dataNum);
				temp3.displayData(dataNum);
				temp = temp.next;
				temp3 = temp3.next;
				dataNum++;
				System.out.println();
			}
		}
	}
	
	
	
	private char incrypt(char str) {
        if (str == 'q') {
            str = '1';
        } else if (str == 'w') {
            str = '2';
        } else if (str == 'e') {
            str = '3';
        } else if (str == 'r') {
            str = '4';
        }  else if (str == 't') {
            str = '5';
        } else if (str == 'y') {
            str = '6';
        }  else if (str == 'u') {
            str = '7';
        } else if (str == 'i') {
            str = '8';
        } else if (str == 'o') {
            str = '9';
        } else if (str == 'p') {
            str = '0';
        } else if (str == 'a') {
            str = 'q';
        } else if (str == 's') {
            str = 'w';
        } else if (str == 'd') {
            str = 'e';
        } else if (str == 'f') {
            str = 'r';
        } else if (str == 'g') {
            str = 't';
        } else if (str == 'h') {
            str = 'y';
        } else if (str == 'j') {
            str = 'u';
        } else if (str == 'k') {
            str = 'i';
        } else if (str == 'l') {
            str = 'o';
        } else if (str == 'z') {
            str = 'p';
        } else if (str == 'x') {
            str = 'a';
        } else if (str == 'c') {
            str = 's';
        } else if (str == 'v') {
            str = 'd';
        } else if (str == 'b') {
            str = 'f';
        } else if (str == 'n') {
            str = 'g';
        } else if (str == 'm') {
            str = 'h';
        } else if (str == '1') {
            str = 'j';
        } else if (str == '2') {
            str = 'k';
        } else if (str == '3') {
            str = 'l';
        } else if (str == '4') {
            str = 'z';
        } else if (str == '5') {
            str = 'x';
        } else if (str == '6') {
            str = 'c';
        } else if (str == '7') {
            str = 'v';
        } else if (str == '8') {
            str = 'b';
        } else if (str == '9') {
            str = 'n';
        } else if (str == '0') {
            str = 'm';
        } else if (str == 'Q') {
            str = 'M';
        } else if (str == 'W') {
            str = 'N';
        } else if (str == 'E') {
            str = 'B';
        } else if (str == 'R') {
            str = 'V';
        } else if (str == 'T') {
            str = 'C';
        } else if (str == 'Y') {
            str = 'X';
        } else if (str == 'U') {
            str = 'Z';
        } else if (str == 'I') {
            str = 'L';
        } else if (str == 'O') {
            str = 'K';
        } else if (str == 'P') {
            str = 'J';
        } else if (str == 'A') {
            str = 'H';
        } else if (str == 'S') {
            str = 'G';
        } else if (str == 'D') {
            str = 'F';
        } else if (str == 'F') {
            str = 'D';
        } else if (str == 'G') {
            str = 'S';
        } else if (str == 'H') {
            str = 'A';
        } else if (str == 'J') {
            str = 'P';
        } else if (str == 'K') {
            str = 'O';
        } else if (str == 'L') {
            str = 'I';
        } else if (str == 'Z') {
            str = 'U';
        } else if (str == 'X') {
            str = 'Y';
        } else if (str == 'C') {
            str = 'T';
        } else if (str == 'V') {
            str = 'R';
        } else if (str == 'B') {
            str = 'E';
        } else if (str == 'N') {
            str = 'W';
        } else if (str == 'M') {
            str = 'Q';
        } else if (str == ' ') {
        	if(spaceNum == 0) {
        		str = '|';
        		spaceNum = 1;
        	} else if(spaceNum == 1) {
        		str = '*';
        		spaceNum = 2;
        	} else if(spaceNum == 2) {
        		str = '+';
        		spaceNum = 0;
        	}
        } else if (str == '.') {
            str = '!';
        } else if (str == ',') {
            str = '@';
        } else if (str == '?') {
            str = '#';
        }
        
        return str;
	}
}
