package konwerter;

import javax.swing.JFrame;

public class Metry 
{
	OknoKonwertera okno;
	String naglowek = "Zamiana metrow na cale",jednostka1 = "m", jednostka2 = "inch";
	double przelicznik = 39.3700787;
	public Metry()
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
