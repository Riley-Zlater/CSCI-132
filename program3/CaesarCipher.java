package program3;

public class CaesarCipher {
	
	// Fields
	protected char[] superSecretEncoder = new char[26]; // Regular alphabet
	protected char[] superSecretDecoder = new char[26]; // Reversed alphabet
	protected int[] shifts = new int[3]; // Keys
	
	// Constructor
	/**
	 * Constructs three arrays one is the alphabet, next has the alphabet backwards, and last is the three keys.
	 * @param rotation The three keys used for shifting the letters
	 */
	public CaesarCipher(int rotation) {
		this.shifts[2] = rotation % 10;
		rotation = rotation / 10;
		this.shifts[1] = rotation % 10;
		rotation = rotation / 10;
		this.shifts[0] = rotation;
		
		for (int j = 0; j < 26; j++) {
			superSecretEncoder[j] = (char)('A' + j % 26);
			superSecretDecoder[j] = (char)('Z' - j-26 % 26);
		}
	}
	
	// Methods
	/**
	 * This method puts the message and the regular alphabet through the transform method.
	 * @param message The message received from the user.
	 * @return Returns the transformed message as a String.
	 */
	public String encrypt(String message) {
		return transform(message, superSecretEncoder);
	}
	
	/**
	 * This method puts the encrypted message and the reversed alphabet through the transform method.
	 * @param secret The encrypted message received from the user.
	 * @return Returns the un-encrypted message as a String.
	 */
	public String decrypt(String secret) {
		return transform(secret, superSecretDecoder);
	}
	
	/**
	 * Applies the shifts the characters in the inputed String.
	 * @param original The inputed String.
	 * @param code The char array of the alphabet.
	 * @return Returns the encrypted or decrypted messages as a String
	 */
	private String transform(String original, char[] code) {
		char[] msg = original.toCharArray();
		for (int k = 0; k < msg.length; k++) {
			if (code[0] == 'A') {
				if ((k % 3) == 0) {
					if (Character.isUpperCase(msg[k])) {
						int j = msg[k] - 'A';
						msg[k] = code[j + this.shifts[0]];
					} else if (Character.isLowerCase(msg[k])) {
						int j = msg[k] - 'a';
						msg[k] = Character.toLowerCase(code[(j + this.shifts[0])%26]);
					}
				} else if ((k % 3) == 1) {
					if (Character.isUpperCase(msg[k])) {
						int j = msg[k] - 'A';
						msg[k] = code[j + this.shifts[1]];
					} else if (Character.isLowerCase(msg[k])) {
						int j = msg[k] - 'a';
						msg[k] = Character.toLowerCase(code[(j + this.shifts[1])%26]);
					}
				} else if ((k % 3) == 2) {
					if (Character.isUpperCase(msg[k])) {
						int j = msg[k] - 'A';
						msg[k] = code[j + this.shifts[2]];
					} else if (Character.isLowerCase(msg[k])) {
						int j = msg[k] - 'a';
						msg[k] = Character.toLowerCase(code[(j + this.shifts[2])%26]);
					}
				} 
			} else {
				if ((k % 3) == 0) {
					if (Character.isUpperCase(msg[k])) {
						int j = 25-(msg[k] - 'A');
						msg[k] = code[(j + this.shifts[0])%26];
					} else if (Character.isLowerCase(msg[k])) {
						int j = 25 - (Character.toUpperCase(msg[k]) - 'A');
						msg[k] = Character.toLowerCase(code[(j + this.shifts[0])%26]);
					}
				} else if ((k % 3) == 1) {
					if (Character.isUpperCase(msg[k])) {
						int j = 25-(msg[k] - 'A');
						msg[k] = code[(j + this.shifts[1])%26];
					} else if (Character.isLowerCase(msg[k])) {
						int j = 25 - (Character.toUpperCase(msg[k]) - 'A');
						msg[k] = Character.toLowerCase(code[(j + this.shifts[1])%26]);
					}
				} else if ((k % 3) == 2) {
					if (Character.isUpperCase(msg[k])) {
						int j = 25-(msg[k] - 'A');
						msg[k] = code[(j + this.shifts[2])%26];
					} else if (Character.isLowerCase(msg[k])) {
						int j = 25 - (Character.toUpperCase(msg[k]) - 'A');
						msg[k] = Character.toLowerCase(code[(j + this.shifts[2])%26]);
					}
				} 	
			}
		}
		return new String(msg);
	}
}
