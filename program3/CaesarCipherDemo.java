package program3;
import java.util.Scanner;
public class CaesarCipherDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter three digit key: "); // this line asks for a three digit key from the user
		Scanner input = new Scanner(System.in); // uses scanner to get the input
		int rotation = input.nextInt(); // calls the input rotation as an int
		CaesarCipher cipher = new CaesarCipher(rotation); // uses rotation as the parameter for CaesarCipher
		
		System.out.println("E or 1 for encrypt, D or 2 for decrypt: "); // prompts the option to encrypt or decrypt
		String choice = input.next(); // calls the input choice as a String
		input.nextLine(); // starts the next line in the scanner
		switch (choice) { // a switch
		case "1": case "E": case "e": // if the choice is one of these strings the following will run
			System.out.println("Enter message to encrypt: "); // asks the user for a message to encrypt
			String message = input.nextLine(); // calls the input message as a String
			
			String coded = cipher.encrypt(message); // uses message in the encrypt method within CaesarCipher and calls it coded as a String
			System.out.println("Encoded message: " + coded); // display encrypted message
			break; // ends switch if this section runs
			
		case "2": case "D": case "d": // if the choice is one of these strings the following will run
			System.out.println("Enter message to decrypt: "); // asks the user for a message to decrypt
			String decodedMessage = input.nextLine(); // calls the input decodedMessage as a String
			
			String decoded = cipher.decrypt(decodedMessage); // uses decodedMessage in the decrypt method within the CaesarCipher and calls it decoded as a String
			System.out.println("Decoded message: " + decoded); // displays decoded message
			break; // ends switch if this section runs
		}
		input.close(); // closes scanner
	}
}
