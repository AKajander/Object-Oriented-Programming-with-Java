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
			System.out.println("Mink� sanan k��nn�ksen haluat tiet��?");
			search = reader.nextLine();		
			result = words.get(search);
			
			if (words.get(search) == null) {
				System.out.println("Sanan \"" + search + "\" k��nn�s tuntematon!");
			} else {
				System.out.println("Sanan \"" + search + "\" k��nn�s on \"" + result + "\"");
			}
		} while (words.get(search) != "lopeta");
		
		System.out.println("Ohjelma lopetetaan, kiitos k�ynnist�!");
		
		do {
			System.out.println("Sana alkukielell�?");
			originalWord = reader.nextLine();
			System.out.println("Sana k��nnettyn�?");
			translation = reader.nextLine();
		
			words.put(originalWord, translation);
		} while (originalWord == "lopeta");
		
		System.out.println("Ohjelma lopetetaan, kiitos k�ynnist�!");
	}
}