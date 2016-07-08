// test sprawdza, czy w przypadku podania 0 jako wartosc jednostki, po zamianie jednostki rowniez wartoscia jest 0
package konwerter;

import junit.framework.TestCase;

public class Test1 extends TestCase
{
	public void test() 
	{
		double jedn1 = 0.0;
		OknoKonwertera o = new OknoKonwertera();
		Fasada ff = new Fasada();
		o.dj1 = jedn1;
		assertEquals(jedn1, ff.wynik(o.dj1, o.przelicznik));
	}
}