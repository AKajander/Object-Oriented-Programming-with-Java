import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuomaAutomaattiK�ytt�liittym� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {			
			String vastaus = JOptionPane.showInputDialog(null, "*******Juoma-Automaatti*******\\n\"+\r\n" + 
					"\"1. Kahvi\\n2.Tee\\n3.Kaakao\\n4.Lopeta", JOptionPane.QUESTION_MESSAGE);
			int valinta = Integer.parseInt(vastaus);
			
			if (valinta == 1) {
				JuomaAutomaatti tilattuKahvi = new JuomaAutomaatti();
				tilattuKahvi.valmistaKahvi();
				
				JOptionPane.showMessageDialog(null, tilattuKahvi.toString());
			}
			if (valinta == 2) {
				JuomaAutomaatti tilattuTee = new JuomaAutomaatti();
				tilattuTee.valmistaTee();
				
				JOptionPane.showMessageDialog(null, tilattuTee.toString());
			}
			if (valinta == 3) {
				JuomaAutomaatti tilattuKaakao = new JuomaAutomaatti();
				tilattuKaakao.valmistaKaakao();
				
				JOptionPane.showMessageDialog(null, tilattuKaakao.toString());
			}
			// valinta-muuttujaa ei voi k�ytt�� while-ehdossa.. J�in jumiin, miten saisin toteutettua t�m�n
		} while ();
	}

}
