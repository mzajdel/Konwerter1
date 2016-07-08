package konwerter;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class OknoGlowne extends JFrame implements ActionListener
{
	JButton BMetry;
	JButton BKilogramy;
	JButton BStopnie;
	
	private static OknoGlowne INSTANCE;
	
	
	private OknoGlowne()
	{

		setSize(500,250);
		setTitle("Konwerter jednostek");
		setLayout(null);
		
		JLabel powitanie = new JLabel("Wybierz konwerter");
		powitanie.setBounds(185, 0, 200, 40);
		add(powitanie);
		
		BMetry = new JButton("Metry na cale");
		BMetry.setBounds(80, 80, 350, 40);
		add(BMetry);
		BMetry.addActionListener(this);
		
		BKilogramy = new JButton("Kilogramy na funty");
		BKilogramy.setBounds(80, 120, 350, 40);
		add(BKilogramy);
		BKilogramy.addActionListener(this);
		
		BStopnie = new JButton("Kilometry na mile");
		BStopnie.setBounds(80, 160, 350, 40);
		add(BStopnie);
		BStopnie.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	

	
	
	public void actionPerformed(ActionEvent zdarzenie)
	{
		//WZORZEC PROJEKTOWY METODA WYTRÓRCZA
		Object zrodlo = zdarzenie.getSource();
		if(zrodlo == BMetry)
		{
			this.setVisible(false);
			Kilogramy q = new Kilogramy();
		}
		if(zrodlo == BKilogramy)
		{
			this.setVisible(false);
			Metry q = new Metry();
		}
		if(zrodlo == BStopnie)
		{
			this.setVisible(false);
			Kilometry q = new Kilometry();
		}
	}
	// WZORZEC PROJEKTOWY SINGLETON
	 public static OknoGlowne getInstance() 
	 {
         if (INSTANCE == null)
        	 synchronized (OknoGlowne.class) 
                 {
        		 if (INSTANCE == null)
        			 INSTANCE = new OknoGlowne();
                 }
         return INSTANCE;
 }
}
