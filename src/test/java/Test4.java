// test sprawdzaj¹cy, czy metoda przelicza poprawnie wynik konwersji
package konwerter;

import junit.framework.TestCase;

public class Test4 extends TestCase
{
	double przelicznik = 0.666;
	public void test() 
	{
		double przelicznik = 2.0;
		double j1 = 3.0;
		OknoKonwertera o = new OknoKonwertera("naglowek", "j1", "j2", przelicznik);
		o.dj1 = j1;
		assertEquals(przelicznik * j1, o.f.wynik(o.dj1, o.przelicznik));
	}
}