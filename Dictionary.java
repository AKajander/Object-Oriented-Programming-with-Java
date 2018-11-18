import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	public static void main(String args[]) {
		
		String search;
		String result;
		HashMap<String, String> words = new HashMap<>();
	
		words.put("kissa", "cat");
		words.put("koira", "dog");
		words.put("hevonen", "horse");
		words.put("auto", "car");
		words.put("vene", "boat");
		
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Minkä sanan käännöksen haluat tietää?");
			search = reader.nextLine();		
			result = words.get(search);
			
			if (words.get(search) == null) {
				System.out.println("Sanan \"" + search + "\" käännös tuntematon!");
			} else {
				System.out.println("Sanan \"" + search + "\" käännös on \"" + result + "\"");
			}
		} while (search != "");
		
		System.out.println("Ohjelma lopetetaan, kiitos käynnistä!");
		
		
	}
}