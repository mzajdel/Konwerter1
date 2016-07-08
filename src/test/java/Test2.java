//test sprawdza czy string zostaje poprawnie ustawiony
package konwerter;

import junit.framework.TestCase;

public class Test2 extends TestCase
{
	public void test() 
	{
		OknoKonwertera o = new OknoKonwertera("naglowek", "j1", "j2", 0.0);
		assertEquals("j1", o.jednostka1);
	}
}