//sprawdza, czy przelicznik zostaje prawidlowo przypisany
package konwerter;


import junit.framework.TestCase;

public class Test3 extends TestCase
{
	double przelicznik = 0.666;
	public void test() 
	{
		OknoKonwertera o = new OknoKonwertera("naglowek", "j1", "j2", przelicznik);
		assertEquals(przelicznik, o.przelicznik);
	}
}