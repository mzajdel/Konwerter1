//sprawdza, czy jest tworzony przycisk 
package konwerter;


import junit.framework.TestCase;

public class Test5 extends TestCase
{
	double przelicznik = 0.666;
	public void test() 
	{
		OknoKonwertera o = new OknoKonwertera("naglowek", "j1", "j2", przelicznik);
		assertNotNull(o.button);
	}
}