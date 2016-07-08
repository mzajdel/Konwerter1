package konwerter;

import javax.swing.JFrame;

public class Kilometry 
{
	OknoKonwertera okno;
	String naglowek = "Zamiana stopni Celsjusa na stopnie Fahrenheita",jednostka1 = "km", jednostka2 = "mi";
	double przelicznik = 0.621371192;
	public Kilometry()
	{
		okno = new OknoKonwertera(naglowek, jednostka1, jednostka2, przelicznik);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
	}
	public double wynik(double jedn)
	{
		return jedn * przelicznik;
	}
}	
