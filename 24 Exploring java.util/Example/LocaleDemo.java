// Demonstrate Locale.
import java.util.*;

class LocaleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale defLocale = Locale.getDefault();
		
		System.out.println("Default locale: ");
		System.out.println("Name: "+  defLocale.getDisplayName());
		System.out.println("Country: " + defLocale.getDisplayCountry());
		System.out.println("Language: " + defLocale.getDisplayLanguage());
		
		System.out.println();
		
		Locale germanLocale = new Locale("de","DE");
		System.out.println("German Locale: ");
		System.out.println("Name: " + germanLocale.getDisplayName());
		System.out.println("Country: " + germanLocale.getDisplayCountry());
		System.out.println("Language: " + germanLocale.getDisplayLanguage());
		
		System.out.println();
		
		System.out.println("France.Locale: ");
		System.out.println("Name: " + Locale.FRANCE.getDisplayName());
		System.out.println("Country: " + Locale.FRANCE.getDisplayCountry());
		System.out.println("Language: " + Locale.FRANCE.getDisplayLanguage());		
	}

}
