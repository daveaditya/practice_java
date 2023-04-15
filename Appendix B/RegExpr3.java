// Use find() to find multiple subsequences.
import java.util.regex.*;

class RegExpr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("Beta");
		Matcher mat = pat.matcher("Alpha Beta Gamma Beta Theta");
		
		while(mat.find()) {
			System.out.println("Beta found at index " + mat.start());
		}
	}

}
