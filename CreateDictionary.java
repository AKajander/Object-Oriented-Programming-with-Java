import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class CreateDictionary {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String originalWord;
		String translation;
		HashMap<String, String> words = new HashMap<>();
		
		FileOutputStream dictionaryContent = new FileOutputStream ("DictionaryContent.xml");
		
		XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(dictionaryContent));
		
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println("Sana alkukielell‰?");
			originalWord = reader.nextLine();
			System.out.println("Sana k‰‰nnettyn‰?");
			translation = reader.nextLine();
		
			words.put(originalWord, translation);
			
		} while (originalWord == "lopeta");
		
		encoder.writeObject(words);
		encoder.close();
		
		System.out.println("Ohjelma lopetetaan, kiitos k‰ynnist‰!");

	}

}
