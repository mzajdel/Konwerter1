package konwerter;

//import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Kilogramy
{
	OknoKonwertera okno;
	String naglowek = "Zamiana kilogramow na funty",jednostka1 = "kg", jednostka2 = "lbs";
	double przelicznik = 2.20462262;
	public Kilogramy()
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
