// A simple pattern matching demo.
import java.util.regex.*;

class RegExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat;
		Matcher mat;
		boolean found;
		
		pat = Pattern.compile("Alpha");
		mat = pat.matcher("Alpha");
		found = mat.matches();
		
		System.out.println("Testing Alpha against Alpha.");
		if(found) {
			System.out.println("Matches");
		}
		else {
			System.out.println("No Match");
		}
		
		System.out.println();
		
		System.out.println("Testing Alpha against Alpha Beta Gamma.");
		mat = pat.matcher("Alpha Beta Gama");
		
		found  = mat.matches();
		
		if(found) {
			System.out.println("Matches");
		}
		else {
			System.out.println("No Match");
		}
	}

}
