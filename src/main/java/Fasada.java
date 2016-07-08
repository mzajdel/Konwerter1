package konwerter;
// WZORZEC PROJEKTOWY FASADAa
public class Fasada 
{
	OknoKonwertera okno;
	public Fasada()
	{
		
	}
	void setValues(String n, String j1, String j2, double p, OknoKonwertera o)
	{
		okno = o;
		setNaglowek(n);
		setJednostka1(j1);
		setJednostka2(j2);
		setPrzelicznik(p);
	}
	public void setNaglowek(String n)
	{
		okno.naglowek = n;
	}
	public void setJednostka1(String n)
	{
		okno.jednostka1 = n;
	}
	public void setJednostka2(String n)
	{
		okno.jednostka2 = n;
	}
	public void setPrzelicznik(double p)
	{
		okno.przelicznik = p;
	}
	
	public double wynik(double jedn, double przelicznik)
	{
		return jedn * przelicznik;
	}
}
