import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	public static void main(String args[]) {
		
		String search;
		String result;
		String originalWord;
		String translation;
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
		} while (words.get(search) != "lopeta");
		
		System.out.println("Ohjelma lopetetaan, kiitos käynnistä!");
		
		do {
			System.out.println("Sana alkukielellä?");
			originalWord = reader.nextLine();
			System.out.println("Sana käännettynä?");
			translation = reader.nextLine();
		
			words.put(originalWord, translation);
		} while (originalWord == "lopeta");
		
		System.out.println("Ohjelma lopetetaan, kiitos käynnistä!");
	}
}