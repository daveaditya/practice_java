// Use XOR to encode and decode a message.
class SimpleCipher {

	public static void main(String[] args) {
		String msg = "This is a test";
		String encMsg = "";
		String decMsg = "";
		char[] key = {
				'a', 's', 'd', 'f', 'g', 'h','i','j'
		};
		int j = 0;
		
		System.out.print("Original message: ");
		System.out.println(msg);
		
		for(int i=0;i<msg.length();i++) {
			if(i%8 == 0) {
				j = 0;
			}
			encMsg = encMsg + (char)(msg.charAt(i) ^ key[j]);
		}
		
		System.out.print("Encoded Message: ");
		System.out.println(encMsg);
		
		for(int i=0;i<msg.length();i++) {
			if(i%8 == 0) {
				j = 0;
			}
			decMsg = decMsg + (char)(encMsg.charAt(i) ^ key[j]);
		}
		
		System.out.print("Decoded Message: ");
		System.out.println(decMsg);

	}

}
