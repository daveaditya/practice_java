// Use XOR to encode and decode a message.
class SimpleCipher {

	public static void main(String[] args) {
		String msg = "This is a test";
		String encMsg = "";
		String decMsg = "";
		int key = 88;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		for(int i=0;i<msg.length();i++) {
			encMsg = encMsg + (char)(msg.charAt(i) ^ key);
		}
		
		System.out.print("Encoded Message: ");
		System.out.println(encMsg);
		
		for(int i=0;i<msg.length();i++) {
			decMsg = decMsg + (char)(encMsg.charAt(i) ^ key);
		}
		
		System.out.print("Decoded Message: ");
		System.out.println(decMsg);

	}

}
