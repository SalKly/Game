package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import exceptions.BuildingInCoolDownException;
import exceptions.MaxCapacityException;
import exceptions.MaxLevelException;
import exceptions.MaxRecruitedException;
import exceptions.NotEnoughGoldException;
import units.Archer;
import units.Army;
import units.Cavalry;
import units.Infantry;
import units.Status;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import buildings.ArcheryRange;
import buildings.Barracks;
import buildings.Farm;
import buildings.Market;
import buildings.Stable;
import engine.City;
import engine.Game;
import exceptions.BuildingInCoolDownException;
import exceptions.MaxLevelException;

public class CityView extends JFrame implements ActionListener {
	
	 private JButton button1, button2, button3, button4, button5, button6;
	 private JButton button1b, button2b, button3b, button4b, button5b, button6b;
	 Game m;
	 City c;
	 JPanel farmFrame , marketFrame;
	 JButton upgrade,Build;
	 JLabel cityView1;
	  JTextArea gold;
	  JTextArea Level;
	  JTextArea turncount;
		String type;
		String check;
		String recruittype;
	  JButton Worldmap;
	  JButton recruit;
	  JButton EXIT;
	  JButton EXIT2;
	  JButton endturn;
	  JTextArea food;
	  ArrayList<JButton> defending_units;
	  JButton transfare;
	  JPanel defendingarmy;
	  int  lvl; 
	  int temp;



	public CityView (Game game, City city) 
	{
		m=game;
		c=city;
		check="";
		
		ImageIcon image = new ImageIcon("City.jpg");
		this.setLayout(null);
		this.setTitle("The Conquorer");
		cityView1 = new JLabel();
		cityView1.setLayout(null);
		
        

		
		
		Worldmap=new JButton();
		Worldmap.setText("World map");
		Worldmap.setBounds(1350,600, 100, 100);
		Worldmap.addActionListener(this);
		this.add(Worldmap);
		
		endturn=new JButton();
		endturn.setText("endturn");
		endturn.setBounds(1350,0, 100, 50);
		endturn.addActionListener(this);
		this.add(endturn);
		
		
		button1 = new JButton(); // Button for farm
		button1.setLayout(null);
		button1.setText("Farm");
		button1.setFocusable(false);
		button1.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button1.setBounds(1350, 170, 70, 30);
		button1.addActionListener(this);
		
		

		
		
		
	
		
		
		
		
		
		
		
		
		
		button2 = new JButton(); // Button for market
		button2.setLayout(null);
		button2.setText("Market");
		button2.setFocusable(false);
		button2.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button2.setBounds(600, 200, 90, 30);
		button2.addActionListener(this);
		
		
		
		
		button3 = new JButton(); // Button for Stable
		button3.setLayout(null);
		button3.setText("Stable");
		button3.setFocusable(false);
		button3.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button3.setBounds(800, 350, 90, 30);
		button3.addActionListener(this);
	
		
		
		button4 = new JButton(); // Button for Archery Range
		button4.setLayout(null);
		button4.setText("Archery Range");
		button4.setFocusable(false);
		button4.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button4.setBounds(1100, 330, 140, 30);
		button4.addActionListener(this);
		
		
		button5 = new JButton(); // Button for Barracks
		button5.setLayout(null);
		button5.setText("Barracks");
		button5.setFocusable(false);
		button5.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button5.setBounds(850, 100, 100, 30);
		button5.addActionListener(this);
		
		
	    
       
		
		
	    button6 = new JButton(); 
		button6.setLayout(null);
		button6.setText("DefendingArmy");
		button6.setFocusable(false);
		button6.setFont(new Font("Serif Italic",Font.ITALIC,15));
		button6.setBounds(110, 310, 150, 30);
		button6.addActionListener(this);
	
			
			
			
		
		JButton endturn= new JButton ("endturn");
		endturn.setLayout(null);
		endturn.setBounds(1350, 0, 80, 30);
		
		endturn.setVisible(true);
		

		JTextArea playername = new JTextArea("name: "+" "+this.m.getPlayer().getName());
		
		playername.setBounds(5,0,80,30);
		playername.setEditable(false);
        playername.setVisible(true);
        
        playername.setBorder(new LineBorder(Color.black));
       
        
        
         gold = new JTextArea("gold:" +" "+this.m.getPlayer().getTreasury());
       
        gold.setBounds(90,0, 80, 30);
        gold.setEditable(false);
        //Armies.add(gold);
        gold.setVisible(true);
        gold.setBorder(new LineBorder(Color.black));
        
        
         food = new JTextArea("food:"+" "+this.m.getPlayer().getFood());
       // food.setSize(54, 26);
        //food.setBackground(getBackground());
        food.setBounds(180,0, 80, 30);
        food.setEditable(false);
        food.setVisible(true);
        //Armies.add(food);
        food.setBorder(new LineBorder(Color.black));
        
        
         turncount = new JTextArea("turncount:"+" "+this.m.getCurrentTurnCount());
       // turncount.setSize(83, 26);
		//turncount.setBackground(getBackground());
        turncount.setBounds(270,0, 80, 30);
        turncount.setEditable(false);
        //Armies.add(turncount);
        turncount.setVisible(true);
        turncount.setBorder(new LineBorder(Color.black));
        
       
        
		

			
		
		
		
		
		
		
		
		
		cityView1.setIcon(image);
		cityView1.setVisible(true);
		cityView1.setBounds(0, 0, 1450, 1000);
		cityView1.add(button1);
		cityView1.add(button2);
		cityView1.add(button3);
		cityView1.add(button4);
		cityView1.add(button5);
		cityView1.add(button6);
		//cityView.add(Armies);
		//cityView.add(Armies);
		
		
		//JPanel buttons = new JPanel();
		
		
		
		//button1.addActionListener(this);
		
		
		//frame.add(Armies);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1450, 2000);
	    //cityView.add(Armies);
		this.add(food);
		this.add(playername);
		this.add(gold);
		this.add(turncount);
		this.add(endturn);
		
		this.add(cityView1); 
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		
		//frame.setBackground(setForegroung("city.jpg"));


		
		
		
		
	}
	
	public static void main(String [] args) throws IOException
	{
		Game m = new Game("Mazen","Cairo");
		City c = new City("Cairo");
		ArcheryRange ax=new ArcheryRange();
		Barracks bx=new Barracks();
		Stable cx=new Stable();
		Farm f =new Farm();
		Market mark =new Market();	
		Archer aaax=new Archer(0,0,0,0,0);
		Army Z = new Army("Cairo");
		Z.getUnits().add(aaax);
		c.setDefendingArmy(Z);
	
		c.getEconomicalBuildings().add(f);
		c.getMilitaryBuildings().add(bx);
		c.getMilitaryBuildings().add(cx);
		c.getMilitaryBuildings().add(ax);


		CityView x = new CityView(m, c);
		//f.setCoolDown(false);
		mark.setCoolDown(false);
;
		//System.out.println("1");
	}
	


	
	



	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) //Button for farm , for each button ba3mel el  7agat el hatl3la3lo 
		{
			Boolean Flag =false;
			for(int i=0;i<c.getEconomicalBuildings().size();i++) {
				if(c.getEconomicalBuildings().get(i) instanceof Farm) {
					Flag=true;
				
			 farmFrame = new JPanel(new GridLayout(3,1));
			farmFrame.setBounds(1250, 200, 200, 100);
			type="farm";
			EXIT=new JButton();
			EXIT.addActionListener(this);
			EXIT.setText("EXIT");
			farmFrame.add(EXIT);
			Level=new JTextArea();
			Level.setText("Building level is :"+c.getEconomicalBuildings().get(i).getLevel());
			 lvl =c.getEconomicalBuildings().get(i).getLevel();
		    upgrade = new JButton("Upgrade"); // button for upgrade w hacallo ba3den b method l wa7do 3ashan a2ol lw das 3aleh eh el y7sal 
			upgrade.setFocusable(false);
			upgrade.setVisible(true);
			upgrade.addActionListener(this);
			farmFrame.add(upgrade);
			farmFrame.add(Level);
			cityView1.add(farmFrame);
			farmFrame.setVisible(true);
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			button4.setEnabled(false);
			button5.setEnabled(false);
			button6.setEnabled(false);


			this.setVisible(true);
				}
		}
			if (Flag==false){
				farmFrame = new JPanel(new GridLayout(3,1));
				farmFrame.setBounds(1250, 200, 200, 100);
				type="farm";
				EXIT=new JButton();
				EXIT.addActionListener(this);
				EXIT.setText("EXIT");
				farmFrame.add(EXIT);

				Level=new JTextArea("0");
			    Build = new JButton("Build"); // button build de btte3ml incase el building da msh mawgod aslan lw mwgod el mfrod matezharsh 
			    Build.setFocusable(false);
			    Build.setVisible(true);
			    Build.addActionListener(this);
				farmFrame.add(Build);
				farmFrame.add(Level);
				cityView1.add(farmFrame);
				farmFrame.setVisible(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);

				this.setVisible(true);
				
			}

			



		}
		else {
			if(e.getSource() == button2) //Button for market
			{
				Boolean Flag =false;
				for(int i=0;i<c.getEconomicalBuildings().size();i++) {
					if(c.getEconomicalBuildings().get(i) instanceof Market) {
						Flag=true;
					
				 farmFrame = new JPanel(new GridLayout(3,1));
				farmFrame.setBounds(650, 200, 200, 100);
				type="Market";
				Level=new JTextArea();
				Level.setText("Building level is :"+c.getEconomicalBuildings().get(i).getLevel());
				 lvl =c.getEconomicalBuildings().get(i).getLevel();

				EXIT=new JButton();
				EXIT.addActionListener(this);
				EXIT.setText("EXIT");
				farmFrame.add(EXIT);
			    upgrade = new JButton("Upgrade"); // button for upgrade
				upgrade.setFocusable(false);
				upgrade.setVisible(true);
				upgrade.addActionListener(this);
				farmFrame.add(upgrade);
				farmFrame.add(Level);
				cityView1.add(farmFrame);
				farmFrame.setVisible(true);
				button1.setEnabled(false);
				button2.setEnabled(false);
				button3.setEnabled(false);
				button4.setEnabled(false);
				button5.setEnabled(false);
				button6.setEnabled(false);


				this.setVisible(true);
					}
			}
				if (Flag==false){
					farmFrame = new JPanel(new GridLayout(3,1));
					farmFrame.setBounds(650, 200, 200, 100);
					type="Market";
					Level=new JTextArea("0");
					EXIT=new JButton();
					EXIT.addActionListener(this);
					EXIT.setText("EXIT");
					farmFrame.add(EXIT);

				    Build = new JButton("Build"); // button for upgrade
				    Build.setFocusable(false);
				    Build.setVisible(true);
				    Build.addActionListener(this);
					farmFrame.add(Build);
					farmFrame.add(Level);
					cityView1.add(farmFrame);
					farmFrame.setVisible(true);
					button1.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					button6.setEnabled(false);

					this.setVisible(true);
					
				}

				

				



			}
			else {
				if(e.getSource() == button3) //Button for stable
				{
					Boolean Flag =false;
					for(int i=0;i<c.getMilitaryBuildings().size();i++) {
						if(c.getMilitaryBuildings().get(i) instanceof Stable) {
							Flag=true;
						
					 farmFrame = new JPanel(new GridLayout(4,1));
					farmFrame.setBounds(850, 350, 200, 100);
					type="Stable";
					recruit=new JButton();
					recruit.addActionListener(this);
					recruit.setText("Recruit Unit Cavalry");
					recruittype="Cavalry";
					EXIT=new JButton();
					EXIT.addActionListener(this);
					EXIT.setText("EXIT");
					farmFrame.add(EXIT);
					Level=new JTextArea();
					Level.setText("Building level is :"+c.getMilitaryBuildings().get(i).getLevel());
					lvl =c.getMilitaryBuildings().get(i).getLevel();
				    upgrade = new JButton("Upgrade"); // button for upgrade
					upgrade.setFocusable(false);
					upgrade.setVisible(true);
					upgrade.addActionListener(this);
					
					farmFrame.add(upgrade);
					farmFrame.add(recruit);
					farmFrame.add(Level);
					cityView1.add(farmFrame);
					farmFrame.setVisible(true);
					button1.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					button6.setEnabled(false);


					this.setVisible(true);
						}
				}
					if (Flag==false){
						farmFrame = new JPanel(new GridLayout(3,1));
						farmFrame.setBounds(850, 350, 200, 100);
						type="Stable";
						EXIT=new JButton();
						EXIT.addActionListener(this);
						EXIT.setText("EXIT");
						farmFrame.add(EXIT);
						Level=new JTextArea("0");
					    Build = new JButton("Build"); // button for upgrade
					    Build.setFocusable(false);
					    Build.setVisible(true);
					    Build.addActionListener(this);
						farmFrame.add(Build);
						farmFrame.add(Level);
						cityView1.add(farmFrame);
						farmFrame.setVisible(true);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);

						this.setVisible(true);
						
					}

					

					



				}
				else {
					if(e.getSource() == button4) //Button for archeryrange
					{
						Boolean Flag =false;
						for(int i=0;i<c.getMilitaryBuildings().size();i++) {
							if(c.getMilitaryBuildings().get(i) instanceof ArcheryRange) {
								Flag=true;
							
						 farmFrame = new JPanel(new GridLayout(4,1));
						farmFrame.setBounds(1150, 330, 200, 100);
						type="ArcheryRange";
						recruit=new JButton();
						recruit.addActionListener(this);
						recruit.setText("Recruit Unit Archer");
						EXIT=new JButton();
						EXIT.addActionListener(this);
						EXIT.setText("EXIT");
						farmFrame.add(EXIT);
						recruittype="Archer";
						Level=new JTextArea();
						Level.setText("Building level is :"+c.getMilitaryBuildings().get(i).getLevel());
						lvl =c.getMilitaryBuildings().get(i).getLevel();
					    upgrade = new JButton("Upgrade"); // button for upgrade
						upgrade.setFocusable(false);
						upgrade.setVisible(true);
						upgrade.addActionListener(this);
						farmFrame.add(recruit);
						farmFrame.add(upgrade);
						farmFrame.add(Level);
						cityView1.add(farmFrame);
						farmFrame.setVisible(true);
						button1.setEnabled(false);
						button2.setEnabled(false);
						button3.setEnabled(false);
						button4.setEnabled(false);
						button5.setEnabled(false);
						button6.setEnabled(false);


						this.setVisible(true);
							}
					}
						if (Flag==false){
							farmFrame = new JPanel(new GridLayout(3,1));
							farmFrame.setBounds(1150, 330, 200, 100);
							type="ArcheryRange";
							Level=new JTextArea("0");
							EXIT=new JButton();
							EXIT.addActionListener(this);
							EXIT.setText("EXIT");
							farmFrame.add(EXIT);

						    Build = new JButton("Build"); // button for upgrade
						    Build.setFocusable(false);
						    Build.setVisible(true);
						    Build.addActionListener(this);
							farmFrame.add(Build);
							farmFrame.add(Level);
							cityView1.add(farmFrame);
							farmFrame.setVisible(true);
							button1.setEnabled(false);
							button2.setEnabled(false);
							button3.setEnabled(false);
							button4.setEnabled(false);
							button5.setEnabled(false);
							button6.setEnabled(false);

							this.setVisible(true);
							
						}

						

						



					}
					else {
						if(e.getSource() == button5) //Button for barracks
						{
							Boolean Flag =false;
							for(int i=0;i<c.getMilitaryBuildings().size();i++) {
								if(c.getMilitaryBuildings().get(i) instanceof Barracks) {
									Flag=true;
								
							 farmFrame = new JPanel(new GridLayout(4,1));
							farmFrame.setBounds(850, 100, 200, 100);
							type="Barracks";
							recruit=new JButton();
							recruit.addActionListener(this);
							recruit.setText("Recruit Unit Infantry");
							EXIT=new JButton();
							EXIT.addActionListener(this);
							EXIT.setText("EXIT");
							farmFrame.add(EXIT);
							recruittype="Infantry";
							Level=new JTextArea();
							Level.setText("Building level is :"+c.getMilitaryBuildings().get(i).getLevel());
							lvl =c.getMilitaryBuildings().get(i).getLevel();
						    upgrade = new JButton("Upgrade"); // button for upgrade
							upgrade.setFocusable(false);
							upgrade.setVisible(true);
							upgrade.addActionListener(this);
							farmFrame.add(recruit);
							farmFrame.add(upgrade);
							farmFrame.add(Level);
							cityView1.add(farmFrame);
							farmFrame.setVisible(true);
							button1.setEnabled(false);
							button2.setEnabled(false);
							button3.setEnabled(false);
							button4.setEnabled(false);
							button5.setEnabled(false);
							button6.setEnabled(false);


							this.setVisible(true);
								}
						}
							if (Flag==false){
								farmFrame = new JPanel(new GridLayout(3,1));
								farmFrame.setBounds(850, 100, 200, 100);
								type="Barracks";
								Level=new JTextArea("0");
								EXIT=new JButton();
								EXIT.addActionListener(this);
								EXIT.setText("EXIT");
								farmFrame.add(EXIT);

							    Build = new JButton("Build"); // button for upgrade
							    Build.setFocusable(false);
							    Build.setVisible(true);
							    Build.addActionListener(this);
								farmFrame.add(Build);
								farmFrame.add(Level);
								cityView1.add(farmFrame);
								farmFrame.setVisible(true);
								button1.setEnabled(false);
								button2.setEnabled(false);
								button3.setEnabled(false);
								button4.setEnabled(false);
								button5.setEnabled(false);
								button6.setEnabled(false);

								this.setVisible(true);
								
							}

							

							



						}
					

			
				
			
		
		else {
			if(e.getSource() == upgrade) { //lw upgrade ben5osh neshof el upgrade da et3amal 3ala eh  using el type string el me3rafeno w ne3ml upgrade 
		
				
				
				for(int i = 0; i < m.getPlayer().getControlledCities().size();i++)
					
				{
					
					if(m.getPlayer().getControlledCities().get(i).getName().equalsIgnoreCase(c.getName()))
					{
					
					}
						for(int j = 0; j <= 5;j++)
						{
							if(type.equalsIgnoreCase("Farm")) {
							if(c.getEconomicalBuildings().size()>j&&(c.getEconomicalBuildings().get(j) instanceof Farm))
							{
								
								
									
									
										
											String[] s={"ok","Cancel"};
											
											int check=(int)JOptionPane.showConfirmDialog(button1,"Cost: "+c.getEconomicalBuildings().get(j).getUpgradeCost(),"are you sure u want to upgrade?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
									
									
											if(check==JOptionPane.YES_OPTION) {
											
													
													try {
														this.m.getPlayer().upgradeBuilding(c.getEconomicalBuildings().get(j));
													} catch (NotEnoughGoldException e1) {
														JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);
														farmFrame.setVisible(false);														
														e1.printStackTrace();
													} catch (BuildingInCoolDownException e1) {
														JOptionPane.showMessageDialog(null, "buildingincooldown","NOTE", JOptionPane.ERROR_MESSAGE);
														farmFrame.setVisible(false);													
														e1.printStackTrace();
													} catch (MaxLevelException e1) {
														JOptionPane.showMessageDialog(null, "Max levle reached for this building","NOTE", JOptionPane.ERROR_MESSAGE);
														farmFrame.setVisible(false);													
														e1.printStackTrace();
													}
													gold.setText(""+this.m.getPlayer().getTreasury());
													farmFrame.setVisible(false);
													
														

												
											}
											else {
												farmFrame.setVisible(false);
												

										}
											
											

											
											
										
									
								
							}
						}
							else {
								if(type.equalsIgnoreCase("Market")) {
								if(c.getEconomicalBuildings().size()>j&&(c.getEconomicalBuildings().get(j) instanceof Market))
								{
									
									
										
										
											
												String[] s={"ok","Cancel"};
												
												int check=(int)JOptionPane.showConfirmDialog(button2,"Cost: "+c.getEconomicalBuildings().get(j).getUpgradeCost(),"are you sure u want to upgrade?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
												
												if(check==JOptionPane.YES_OPTION) {
													
														
														try {
															this.m.getPlayer().upgradeBuilding(c.getEconomicalBuildings().get(j));
														} catch (NotEnoughGoldException e1) {
															JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);	
															farmFrame.setVisible(false);
															e1.printStackTrace();
														} catch (BuildingInCoolDownException e1) {
															JOptionPane.showMessageDialog(null, "buildingincooldown","NOTE", JOptionPane.ERROR_MESSAGE);
															farmFrame.setVisible(false);
															e1.printStackTrace();
														} catch (MaxLevelException e1) {
															JOptionPane.showMessageDialog(null, "Max levle reached for this building","NOTE", JOptionPane.ERROR_MESSAGE);
															farmFrame.setVisible(false);
															e1.printStackTrace();
														}
														gold.setText(""+this.m.getPlayer().getTreasury());
														farmFrame.setVisible(false);
														
															

													
												}
												else {
													farmFrame.setVisible(false);
													

											}
												

												
										
										
									
								}
							}
								else {
									if(type.equalsIgnoreCase("ArcheryRange")) {
									if(c.getMilitaryBuildings().size()>j&&(c.getMilitaryBuildings().get(j) instanceof ArcheryRange))
									{
										
										
											
											
												
													String[] s={"ok","Cancel"};
													int check=(int)JOptionPane.showConfirmDialog(button3,"Cost: "+c.getMilitaryBuildings().get(j).getUpgradeCost(),"are you sure u want to upgrade?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
													
													if(check==JOptionPane.YES_OPTION) {
														
															
															try {
																this.m.getPlayer().upgradeBuilding(c.getMilitaryBuildings().get(j));
															} catch (NotEnoughGoldException e1) {
																JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);	
																farmFrame.setVisible(false);																
																e1.printStackTrace();
															} catch (BuildingInCoolDownException e1) {
																JOptionPane.showMessageDialog(null, "Building incoodldown","NOTE", JOptionPane.ERROR_MESSAGE);	
																farmFrame.setVisible(false);																
																e1.printStackTrace();
															} catch (MaxLevelException e1) {
																JOptionPane.showMessageDialog(null, "Max levle reached for this building","NOTE", JOptionPane.ERROR_MESSAGE);
																farmFrame.setVisible(false);																
																e1.printStackTrace();
															}
															gold.setText(""+this.m.getPlayer().getTreasury());
															farmFrame.setVisible(false);
															
														

														
													}
													else {
														farmFrame.setVisible(false);
														

												}
											
										
									}
								}
									else {
										if(type.equalsIgnoreCase("Barracks")) {
										if(c.getMilitaryBuildings().size()>j&&(c.getMilitaryBuildings().get(j) instanceof Barracks))
										{
											
											
											
												
													
														String[] s={"ok","Cancel"};
														int check=(int)JOptionPane.showConfirmDialog(null,""+c.getMilitaryBuildings().get(j).getUpgradeCost(),"are you sure u want to upgrade?",JOptionPane.YES_NO_OPTION);
														if(check==JOptionPane.YES_OPTION) {
															
																
																try {
																	this.m.getPlayer().upgradeBuilding(c.getMilitaryBuildings().get(j));
																} catch (NotEnoughGoldException e1) {
																	JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);	
																	farmFrame.setVisible(false);																	
																	e1.printStackTrace();
																} catch (BuildingInCoolDownException e1) {
																	JOptionPane.showMessageDialog(null, "Building incooldown","NOTE", JOptionPane.ERROR_MESSAGE);	
																	farmFrame.setVisible(false);																	
																	e1.printStackTrace();
																} catch (MaxLevelException e1) {
																	JOptionPane.showMessageDialog(null, "Max level reached","NOTE", JOptionPane.ERROR_MESSAGE);	
																	farmFrame.setVisible(false);																	
																	e1.printStackTrace();
																}
																gold.setText(""+this.m.getPlayer().getTreasury());
																farmFrame.setVisible(false);
																
																

															
														}
														else {
															farmFrame.setVisible(false);
															

													}
														

														
														
												
												
											
										}
									}
										else {
											if(type.equalsIgnoreCase("Stable")) {
											if(c.getMilitaryBuildings().size()>j&&(c.getMilitaryBuildings().get(j) instanceof Stable))
											{
												
												
															String[] s={"ok","Cancel"};
															
															int check=(int)JOptionPane.showConfirmDialog(button1,"Cost: "+c.getMilitaryBuildings().get(j).getUpgradeCost(),"are you sure u want to upgrade?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
															
															if(check==JOptionPane.YES_OPTION) {
																
																	
																	try {
																		this.m.getPlayer().upgradeBuilding(c.getMilitaryBuildings().get(j));
																	} catch (NotEnoughGoldException e1) {
																		JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);	
																		farmFrame.setVisible(false);																		
																		e1.printStackTrace();
																	} catch (BuildingInCoolDownException e1) {
																		JOptionPane.showMessageDialog(null, "Building in cooldown","NOTE", JOptionPane.ERROR_MESSAGE);	
																		farmFrame.setVisible(false);																		
																		e1.printStackTrace();
																	} catch (MaxLevelException e1) {
																		JOptionPane.showMessageDialog(null, "Max levle reached","NOTE", JOptionPane.ERROR_MESSAGE);	
																		farmFrame.setVisible(false);																		
																		e1.printStackTrace();
																	}
																	gold.setText(""+this.m.getPlayer().getTreasury());
																	farmFrame.setVisible(false);
																	
																		

																
															}
															else {
																farmFrame.setVisible(false);
																

														}
														
													
												
											}
										}
											
											
										}
										
										
									}
								}
								
							}
							
							
									
						
					}
					


					
				}
				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);

				
			}
			else {
				if (e.getSource()==Build) {
					if (type.equalsIgnoreCase("Farm")) {
						Farm b=new Farm();
						
							String[] s={"ok","Cancel"};
							
			int check=(int)JOptionPane.showConfirmDialog(button1,"Cost: "+b.getCost(),"are you sure u want to Build?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
							
							if(check==JOptionPane.YES_OPTION) {
								try {
									this.m.getPlayer().build("Farm", c.getName());
								} catch (NotEnoughGoldException e1) {
									JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);				
									e1.printStackTrace();
									farmFrame.setVisible(false);							
									
								}
								gold.setText(""+this.m.getPlayer().getTreasury());
								farmFrame.setVisible(false);							
								
								//m.endTurn();
								//turncount.setText(""+m.getCurrentTurnCount());
								
								
								
							}
							else {
								farmFrame.setVisible(false);
								
							
							


						}
							

							
							 
						
					}
					
				
				else {
						if (type.equalsIgnoreCase("Market")) {
							String [] s= {"ok","Cancel"};
							Market b=new Market();
						
						int check=(int)JOptionPane.showConfirmDialog(button2,"Cost: "+b.getCost(),"are you sure u want to Build?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
								
								if(check==JOptionPane.YES_OPTION) {
									try {
										this.m.getPlayer().build("Market", c.getName());
									} catch (NotEnoughGoldException e1) {
										JOptionPane.showMessageDialog(button2, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);		
										e1.printStackTrace();
									}
									gold.setText(""+this.m.getPlayer().getTreasury());
									farmFrame.setVisible(false);							
									
									//m.endTurn();
									//turncount.setText(""+m.getCurrentTurnCount());
									
								}
								else {
									farmFrame.setVisible(false);
									
								
								


							}

								
								
							
						}
					
						else if (type.equalsIgnoreCase("Stable")) {
							Stable b=new Stable();
							
								String[] s={"ok","Cancel"};
								
								int check=(int)JOptionPane.showConfirmDialog(button3,"Cost: "+b.getCost(),"are you sure u want to Build?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
								
								if(check==JOptionPane.YES_OPTION) {
									try {
										this.m.getPlayer().build("Stable", c.getName());
									} catch (NotEnoughGoldException e1) {
										JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);
										e1.printStackTrace();
									}
									gold.setText(""+this.m.getPlayer().getTreasury());
									farmFrame.setVisible(false);							
									
									//m.endTurn();
									//turncount.setText(""+m.getCurrentTurnCount());
									
								}
								else {
									farmFrame.setVisible(false);
									
									
								
								


							}

								
								
							
							
						}
						
						
					
						else if (type.equalsIgnoreCase("ArcheryRange")) {
							ArcheryRange b=new ArcheryRange();
							
								String[] s={"ok","Cancel"};
								
					int check=(int)JOptionPane.showConfirmDialog(button4,"Cost: "+b.getCost(),"are you sure u want to Build?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
								
					if(check==JOptionPane.YES_OPTION) {
						try {
							this.m.getPlayer().build("ArcheryRange", c.getName());
						} catch (NotEnoughGoldException e1) {
							JOptionPane.showMessageDialog(button4, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);
							e1.printStackTrace();
						}
						gold.setText(""+this.m.getPlayer().getTreasury());
						farmFrame.setVisible(false);							
						
						//m.endTurn();
						//turncount.setText(""+m.getCurrentTurnCount());
						
					}
					else {
						farmFrame.setVisible(false);
						
						
					
					


				}


								
								
							
							
						}
						
						
					
					else {
							if (type.equalsIgnoreCase("Barracks")) {
								Barracks b=new Barracks();
								
									String[] s={"ok","Cancel"};
									
								int check=(int)JOptionPane.showConfirmDialog(button5,"Cost: "+b.getCost(),"are you sure u want to Build?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
									
								if(check==JOptionPane.YES_OPTION) {
									try {
										this.m.getPlayer().build("Barracks", c.getName());
									} catch (NotEnoughGoldException e1) {
										JOptionPane.showMessageDialog(null, "NotEnoughGold","NOTE", JOptionPane.ERROR_MESSAGE);
										e1.printStackTrace();
									}
									gold.setText(""+this.m.getPlayer().getTreasury());
									farmFrame.setVisible(false);							
									
									//m.endTurn();
									//turncount.setText(""+m.getCurrentTurnCount());
									
								}
								else {
									farmFrame.setVisible(false);
									
									
								
								


							}


									
									
								
								
							}
							
							
						
					}
					
				}
					button1.setEnabled(true);
					button2.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					button5.setEnabled(true);
					button6.setEnabled(true);

			}
				else if (e.getSource()==Worldmap) {
					this.setVisible(false);
					WorldMapview2 x=new WorldMapview2(m);
				}
				else if(e.getSource()==EXIT) {
					farmFrame.setVisible(false);
					button1.setEnabled(true);
					button2.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					button5.setEnabled(true);
					button6.setEnabled(true);

					
				}
				else if(e.getSource()==EXIT2) {
					defendingarmy.setVisible(false);
					button1.setEnabled(true);
					button2.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					button5.setEnabled(true);
					button6.setEnabled(true);

					
				}
				else if (e.getSource()==recruit) {
					if(recruittype.equalsIgnoreCase("Archer")) {
						for(int i =0;i<c.getMilitaryBuildings().size();i++) {
							if (c.getMilitaryBuildings().get(i) instanceof ArcheryRange){
						
				
					int check=(int)JOptionPane.showConfirmDialog(recruit.getParent().getParent(),"Cost: "+c.getMilitaryBuildings().get(i).getRecruitmentCost(),"are you sure u want to Recruit Archers?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
					if(check==JOptionPane.YES_OPTION) {
					try {
						this.m.getPlayer().recruitUnit(recruittype, c.getName());
					} catch (BuildingInCoolDownException e1) {
						JOptionPane.showMessageDialog(null, "building in cooldown","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (MaxRecruitedException e1) {
						JOptionPane.showMessageDialog(null, "Max recruit reached","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (NotEnoughGoldException e1) {
						JOptionPane.showMessageDialog(null, "not enough gold","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
					gold.setText(""+m.getPlayer().getTreasury());
					farmFrame.setVisible(false);
					
					
					
					}
					
						}
					}
					
					}
					else 	if(recruittype.equalsIgnoreCase("Infantry")) {
						for(int i =0;i<c.getMilitaryBuildings().size();i++) {
							if (c.getMilitaryBuildings().get(i) instanceof Barracks){
						
				
					int check=(int)JOptionPane.showConfirmDialog(recruit.getParent().getParent(),"Cost: "+c.getMilitaryBuildings().get(i).getRecruitmentCost(),"are you sure u want to Recruit Infantries?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
					if(check==JOptionPane.YES_OPTION) {
					try {
						this.m.getPlayer().recruitUnit(recruittype, c.getName());
					} catch (BuildingInCoolDownException e1) {
						JOptionPane.showMessageDialog(null, "building in cooldown","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (MaxRecruitedException e1) {
						JOptionPane.showMessageDialog(null, "Max recruit reached","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (NotEnoughGoldException e1) {
						JOptionPane.showMessageDialog(null, "not enough gold","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
					gold.setText(""+m.getPlayer().getTreasury());
					farmFrame.setVisible(false);

					
					
					}
						}
					}
					
					}
					else 	if(recruittype.equalsIgnoreCase("Cavalry")) {
						for(int i =0;i<c.getMilitaryBuildings().size();i++) {
							if (c.getMilitaryBuildings().get(i) instanceof Stable){
						
				
					int check=(int)JOptionPane.showConfirmDialog(recruit.getParent().getParent(),"Cost: "+c.getMilitaryBuildings().get(i).getRecruitmentCost(),"are you sure u want to Recruit Cavalries?",JOptionPane.YES_NO_OPTION,JOptionPane.CANCEL_OPTION);
					if(check==JOptionPane.YES_OPTION) {
					try {
						this.m.getPlayer().recruitUnit(recruittype, c.getName());
					} catch (BuildingInCoolDownException e1) {
						JOptionPane.showMessageDialog(null, "building in cooldown","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (MaxRecruitedException e1) {
						JOptionPane.showMessageDialog(null, "Max recruit reached","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					} catch (NotEnoughGoldException e1) {
						JOptionPane.showMessageDialog(null, "not enough gold","NOTE", JOptionPane.ERROR_MESSAGE);
						e1.printStackTrace();
					}
					gold.setText(""+m.getPlayer().getTreasury());
					farmFrame.setVisible(false);

					
					
					}
						}
					}
					
					}
					farmFrame.setVisible(false);
					button1.setEnabled(true);
					button2.setEnabled(true);
					button3.setEnabled(true);
					button4.setEnabled(true);
					button5.setEnabled(true);
					button6.setEnabled(true);
					


					
					
				}
				
				
				else if (e.getSource()==endturn) {
					for(int i=0;i<this.m.getPlayer().getControlledArmies().size();i++) {
						if(this.m.getPlayer().getControlledArmies().get(i).getCurrentStatus().equals(Status.MARCHING)) {
							if(this.m.getPlayer().getControlledArmies().get(i).getDistancetoTarget()==1) {
								battleview2 x=new battleview2(this.m,i);
							}
						}
					}
					this.m.endTurn();
					turncount.setText(""+m.getCurrentTurnCount());
					gold.setText(""+m.getPlayer().getTreasury());
					food.setText(""+m.getPlayer().getFood());

					
					
				}
				else if(e.getSource()==button6) {
				    Boolean Flag=false;
					EXIT2=new JButton();
			        EXIT2.setText("EXIT");
			        EXIT2.addActionListener(this);
			        EXIT2.setPreferredSize(new Dimension(50,50));
					defendingarmy=new JPanel(new GridLayout(31,1));
					defendingarmy.setBounds(300, 250, 400, 500);
					defendingarmy.add(EXIT2);
					defendingarmy.setVisible(false);
					cityView1.add(defendingarmy);
					defending_units=new ArrayList<JButton>();
					for(int i=0;i<this.c.getDefendingArmy().getUnits().size();i++) {
						
						JButton unitsdef=new JButton();
						unitsdef.addActionListener(this);
						unitsdef.setText(""+this.c.getDefendingArmy().getUnits().get(i).getClass()+"  "+"Level:"+this.c.getDefendingArmy().getUnits().get(i).getLevel());
						defending_units.add(unitsdef);
						defendingarmy.add(unitsdef);
						defendingarmy.setVisible(true);
						Flag=true;
						
						
						
					
					}
					button1.setEnabled(false);
					button2.setEnabled(false);
					button3.setEnabled(false);
					button4.setEnabled(false);
					button5.setEnabled(false);
					button6.setEnabled(false);
					if(Flag==false) {
						JOptionPane.showMessageDialog(null, "not defeding army yet");
						button1.setEnabled(true);
						button2.setEnabled(true);
						button3.setEnabled(true);
						button4.setEnabled(true);
						button5.setEnabled(true);
						button6.setEnabled(true);
						
					}

					
				}
				else {
					JButton b=(JButton)e.getSource();
					int r=defending_units.indexOf(b);
					System.out.print("this is r:"+r);
					if(r!=-1) {
						temp=r;
						EXIT=new JButton();
						EXIT.addActionListener(this);
						EXIT.setText("EXIT");
						defendingarmy.setVisible(false);
						farmFrame=new JPanel();
						farmFrame.setLayout(new GridLayout(2,1));
						farmFrame.setBounds(110,400,400,50);
						transfare=new JButton();
						transfare.setText("add army to controlled army");
						transfare.addActionListener(this);
					    farmFrame.add(EXIT);
						farmFrame.add(transfare);
						farmFrame.setVisible(true);
						cityView1.add(farmFrame);
						this.setVisible(true);
						
						
					}
					else if(e.getSource()==transfare) {
						
						transfare.setEnabled(false);
						farmFrame.setVisible(false);
						
						Boolean Flag=false;
							if (m.getPlayer().getControlledArmies().size()==0) {
								
								this.m.getPlayer().initiateArmy(c, c.getDefendingArmy().getUnits().get(temp));
								Flag=true;
								
							}
								
								else {
							for(int j=0;j<m.getPlayer().getControlledArmies().size()&&Flag==false;j++) {
								if(m.getPlayer().getControlledArmies().get(j).getUnits().size()==m.getPlayer().getControlledArmies().get(j).getMaxToHold()) {
									this.m.getPlayer().initiateArmy(c, c.getDefendingArmy().getUnits().get(temp));
									Flag=true;
								
							
						}
								else if(m.getPlayer().getControlledArmies().get(j).getUnits().size()<m.getPlayer().getControlledArmies().get(j).getMaxToHold()) {
									try {
										this.m.getPlayer().getControlledArmies().get(j).relocateUnit(c.getDefendingArmy().getUnits().get(temp));
									} catch (MaxCapacityException e1) {
										JOptionPane.showMessageDialog(null, "Army is full","NOTE", JOptionPane.ERROR_MESSAGE);
										
										e1.printStackTrace();
									}
									Flag=true;
								}

						}
							}
							
							button1.setEnabled(true);
							button2.setEnabled(true);
							button3.setEnabled(true);
							button4.setEnabled(true);
							button5.setEnabled(true);
							button6.setEnabled(true);
							
					
							
							
						
					}
					
					
				
					
				}
		}
					}
				}
		}
		}

			
			
			
			
			
			
			
			
		}
	
	}
	
	}

