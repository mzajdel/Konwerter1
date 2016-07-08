package konwerter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OknoKonwertera extends JFrame implements ActionListener
{
	String naglowek, jednostka1, jednostka2;
	
	JLabel LJednostka1, LJednostka2;      
	JTextField Tpole1, Tpole2;
	JButton button;
	double dj1, dj2, przelicznik;
	
	Fasada f;
	
	OknoKonwertera(){}
	
	OknoKonwertera(double jedn1)
	{
		dj1 = jedn1;
	}
	
	OknoKonwertera(String n, String j1, String j2, double przelicznik)
	{
		f = new Fasada();
		
		f.setValues(n, j1, j2, przelicznik, this);
		
		setSize(500,250);
		setTitle("Konwerter jednostek");
		setLayout(null);
		
		JLabel napis = new JLabel(naglowek);
		napis.setBounds(20, 0, 200, 40);
		add(napis);
		
		
		LJednostka1 = new JLabel(jednostka1);
		LJednostka1.setBounds(20, 50, 30, 30);
		add(LJednostka1);
		
		Tpole1 = new JTextField();
		Tpole1.setBounds(75, 50, 200, 30);
		add(Tpole1);
		
		LJednostka2 = new JLabel(jednostka2);
		LJednostka2.setBounds(20, 100, 30, 30);
		add(LJednostka2);
		
		Tpole2 = new JTextField();
		Tpole2.setBounds(75, 100, 200, 30);
		add(Tpole2);
		
		button = new JButton("KONWERTUJ");
		button.setBounds(300, 50, 150, 110);
		add(button);
		button.addActionListener(this);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	/*
	void setValues(String n, String j1, String j2, double p)
	{
		setNaglowek(n);
		setJednostka1(j1);
		setJednostka2(j2);
		setPrzelicznik(p);
	}
	public void setNaglowek(String n)
	{
		naglowek = n;
	}
	public void setJednostka1(String n)
	{
		jednostka1 = n;
	}
	public void setJednostka2(String n)
	{
		jednostka2 = n;
	}
	public void setPrzelicznik(double p)
	{
		przelicznik = p;
	}
	
	public double wynik(double jedn)
	{
		return dj2 = jedn * przelicznik;
	}
*/
	public void actionPerformed(ActionEvent e) 
	{
		dj1 = Double.parseDouble(Tpole1.getText());
		dj2 = f.wynik(dj1, przelicznik);
		Tpole2.setText(String.valueOf(dj2));
	}
}
