package GUI;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import engine.Game;

import units.Archer;

import units.Army;

import units.Cavalry;

import units.Infantry;

import units.Status;

import units.Unit;





public class battleview2 extends JFrame implements ActionListener {

	ArrayList<JButton> attack;
	ArrayList<JButton> defend;
	ArrayList<TextArea> rtext;
	ArrayList<TextArea> ltext;
	
	JPanel left, right, center;
	
	

	Game game;
	int index;

	

	

	public battleview2(Game game,int index){

		this.index=index;
		this.game=game;
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("battleview");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        
        
        

		

		
		
		ImageIcon image = new ImageIcon("battle1.jpg");
        JLabel background = new JLabel();
        //background.setLayout(null);
        background.setIcon(image);
        background.setPreferredSize(new Dimension(this.WIDTH,this.HEIGHT));
        background.setVisible(true);
        this.add(background,BorderLayout.CENTER);
        
        
        
        
        
       
		left = new JPanel(new GridLayout(15,15));
		left.setBounds(0, 0, 300, 1500);
		left.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Controller Armies"));		
		left.setVisible(true);
		background.add(left);
		
		right = new JPanel(new GridLayout(15,15));
		right.setBounds(1605, 0, 300, 1500);
		right.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Defending Army"));	
		right.setVisible(true);
		background.add(right);
		
		
		attack = new ArrayList<JButton> ();
		JButton b1= new JButton();
		b1.setSize(50, 30);
		String[] units = {"Archer", "Infantry", "Cavalry"};
		JComboBox x1 = new JComboBox(units);
		b1.add(x1);
		left.add(b1);
		
		
		
		
		
		
		
		
		JButton b2= new JButton();
		b2.setSize(50, 30);
		JComboBox x2 = new JComboBox(units);
		b2.add(x2);
		left.add(b2);
		
		JButton b3= new JButton();
		b3.setSize(50, 30);
		JComboBox x3= new JComboBox(units);
		b3.add(x3);
		left.add(b3);
		
		
		JButton b4= new JButton();
		b4.setSize(50, 30);
		JComboBox x4 = new JComboBox(units);
		b4.add(x4);
		left.add(b4);
		
		JButton b5= new JButton();
		b5.setSize(50, 30);
		b5.addActionListener(this);
		JComboBox x5 = new JComboBox(units);
		b5.add(x5);
		left.add(b5);
		 
		JButton b6= new JButton();
		b6.setSize(50, 30);
		b6.addActionListener(this);
		JComboBox x6 = new JComboBox(units);
		b6.add(x6);
		left.add(b6);
		
		
		JButton b7= new JButton();
		b7.setSize(50, 30);
		b7.addActionListener(this);
		JComboBox x7 = new JComboBox(units);
		b7.add(x7);
		left.add(b7);
		
		
		JButton b8= new JButton();
		b8.setSize(50, 30);
		b8.addActionListener(this);
		JComboBox x8 = new JComboBox(units);
		b8.add(x8);
		left.add(b8);
		
		JButton b9= new JButton();
		
		b9.setSize(50, 30);
		b9.addActionListener(this);
		JComboBox x9 = new JComboBox(units);
		b9.add(x9);
		left.add(b9);
		
		
		JButton b10= new JButton();
		b10.setSize(50, 30);
		b10.addActionListener(this);
		JComboBox x10 = new JComboBox(units);
		b10.add(x10);
		left.add(b10);
		
		
		defend = new ArrayList<JButton> ();
		JButton d1= new JButton();
		d1.setSize(50, 30);
		JComboBox y1 = new JComboBox(units);
		d1.add(y1);
		right.add(d1);
		
		
		
		
		
		
		
		JButton d2= new JButton();
		d2.setSize(50, 30);
		JComboBox y2 = new JComboBox(units);
		d2.add(y2);
		right.add(d2);
		
		JButton d3= new JButton();
		d3.setSize(50, 30);
		JComboBox y3= new JComboBox(units);
		d3.add(y3);
		right.add(d3);
		
		
		JButton d4= new JButton();
		d4.setSize(50, 30);
		JComboBox y4 = new JComboBox(units);
		d4.add(y4);
		right.add(d4);
		
		JButton d5= new JButton();
		d5.setSize(50, 30);
		d5.addActionListener(this);
		JComboBox y5 = new JComboBox(units);
		d5.add(y5);
		right.add(d5);
		 
		JButton d6= new JButton();
		d6.setSize(50, 30);
		d6.addActionListener(this);
		JComboBox y6 = new JComboBox(units);
		d6.add(y6);
		right.add(d6);
		
		
		JButton d7= new JButton();
		d7.setSize(50, 30);
		d7.addActionListener(this);
		JComboBox y7 = new JComboBox(units);
		d7.add(y7);
		right.add(d7);
		
		
		JButton d8= new JButton();
		d8.setSize(50, 30);
		d8.addActionListener(this);
		JComboBox y8 = new JComboBox(units);
		d8.add(y8);
		right.add(d8);
		
		JButton d9= new JButton();
		d9.setSize(50, 30);
		d9.addActionListener(this);
		JComboBox y9 = new JComboBox(units);
		d9.add(y9);
		right.add(d9);
		
		
		JButton d10= new JButton();
		d10.setSize(50, 30);
		d10.addActionListener(this);
		JComboBox y10 = new JComboBox(units);
		d10.add(y10);
		right.add(d10);
		
		JButton attacking = new JButton("Attack");
		attacking.setLayout(null);
		attacking.setBounds(800, 0, 90, 30);
		attacking.setFocusable(false);
		attacking.setVisible(true);
		attacking.addActionListener(this);
		background.add(attacking);
		
		JButton layseige = new JButton("LaySiege");
		layseige.setLayout(null);
		layseige.setBounds(900, 0, 90, 30);
		layseige.setFocusable(false);
		layseige.setVisible(true);
		layseige.addActionListener(this);
		background.add(layseige);
		
		JButton auto = new JButton("Auto Resolve");
		auto.setLayout(null);
		auto.setBounds(1000, 0, 110, 30);
		auto.setFocusable(false);
		auto.setVisible(true);
		auto.addActionListener(this);
		background.add(auto);
		
		
		
		
		
		
		JButton endturn= new JButton ("endturn");
		endturn.setLayout(null);
		endturn.setBounds(1525, 0, 80, 30);	
		endturn.setVisible(true);
		background.add(endturn);
		

		JTextArea playername = new JTextArea("playername");
		
		playername.setBounds(350,0,80,30);
		playername.setVisible(true);
        playername.setBorder(new LineBorder(Color.black));
        playername.setEditable(false);
        background.add(playername);
       
        
        
        JTextArea gold = new JTextArea("gold");
       
        gold.setBounds(550,0, 80, 30);
        gold.setVisible(true);
        gold.setBorder(new LineBorder(Color.black));
        gold.setEditable(false);
        background.add(gold);
        
        
        JTextArea food = new JTextArea("food");
        food.setBounds(650,0, 80, 30);
        food.setVisible(true);
        food.setBorder(new LineBorder(Color.black));
        food.setEditable(false);
        background.add(food);
        
        
        JTextArea turncount = new JTextArea("turncount");
        turncount.setBounds(450,0, 80, 30);
        turncount.setVisible(true);
        turncount.setBorder(new LineBorder(Color.black));
        turncount.setEditable(false);
        background.add(turncount);
		
		
		
		
		
		
		

		this.setVisible(true);

		

		

	}

		

	public void rightpanel (Army a , JPanel right) {

		JPanel right1 = new JPanel();
		right1.setBounds(0, 0, 60, 2000);
		right1.setLayout(null);
		right1.setVisible(true);
		
		int count=0;

		for (int i =0 ; i< a.getUnits().size();i++) {

			

		JButton c = new JButton();
		c.setLayout(null);
		c.setSize(40,80);
		right1.add(c);
		c.setVisible(true);

		

		for (int j=0 ; j< a.getUnits().size();j++) {

			if (a.getUnits().get(j) instanceof Archer) {

				

				

				JButton b  = new JButton ("Archer level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());

				b.addActionListener(this);

				attack.add(b);

				right1.add(b);

				

				

				

				

			}

	if (a.getUnits().get(j) instanceof Cavalry) {

				

				

				JButton b  = new JButton ("cavalry level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());

				b.addActionListener(this);

				attack.add(b);

				right1.add(b);

				

				

				

				

			}

	if (a.getUnits().get(j) instanceof Infantry) {

		

		

		JButton b  = new JButton ("infantry level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());

		b.addActionListener(this);

		attack.add(b);

		right1.add(b);
		}

	

	
		}
		
		
		}
		
	}

	

	public void leftpanel(Army a , JPanel left) {
		JPanel left1 = new JPanel();
		left1.setBounds(1300, 0, 60, 2000);
		left1.setLayout(null);
		left1.setVisible(true);
		int count=0;

		for (int i =0 ; i< a.getUnits().size();i++) {
			JButton c = new JButton();
			c.setLayout(null);
			c.setSize(40,80);
			left1.add(c);
			c.setVisible(true);
			
			for (int j=0 ; j< a.getUnits().size();j++) {
				if (a.getUnits().get(j) instanceof Archer) {
					JButton b  = new JButton ("Archer level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());
					b.addActionListener(this);
					defend.add(b);
					left1.add(b);

				}
				
				if (a.getUnits().get(j) instanceof Cavalry) {
					JButton b  = new JButton ("cavalry level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());
					b.addActionListener(this);
					defend.add(b);
					left1.add(b);

				

				

				

				

			}

	if (a.getUnits().get(j) instanceof Infantry) {

		

		

		JButton b  = new JButton ("infantry level: "+ a.getUnits().get(j).getLevel()+ "solider count" + a.getUnits().get(j).getCurrentSoldierCount()+"max solider count"+a.getUnits().get(j).getMaxSoldierCount());

		b.addActionListener(this);

		defend.add(b);

		left1.add(b);

		

		

		

		

	}

	

		

		

		}

		

		}

		

		

		

		

	}

		


		

		

	
		
	public static void main(String[] args) throws IOException
	{
	Game m = new Game("Mazen","Cairo");
	battleview2 x = new battleview2(m,3);
		
	}



		
		public void actionPerformed(ActionEvent e) {
			
			
				 
				 
			 }
			
		}