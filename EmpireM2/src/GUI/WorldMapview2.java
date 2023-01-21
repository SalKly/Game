package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import engine.Game;
import units.Archer;
import units.Army;
import units.Cavalry;
import units.Infantry;
import units.Status;
import units.Unit;

public class WorldMapview2 extends JFrame implements ActionListener{

	Game game;
	JLabel backgroundmap;
	JLabel name;
	JLabel Food;
	JLabel Gold;
	JLabel turncount;
	JButton cairo;
	JButton Rome;
	JButton sparta;
	JButton idle;
	JButton marching;
	JButton besiege;
	JPanel idleinfo;
	JPanel marchinginfo;
	JPanel besiegeinfo;
	ArrayList<JButton> buttons;
	ArrayList<JTextArea> armyinfo;
	JButton Exit;
	JButton Attack;
	JPanel newone;
	int temp;
	ArrayList<Army> currentArmy;
	String type;

	
	public WorldMapview2 (Game game) {
		newone=new JPanel();
		type="";
		buttons=new ArrayList<JButton>();
		armyinfo=new ArrayList<JTextArea>();
		this.game=game;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentArmy=new ArrayList<>();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        
		backgroundmap=new JLabel();
		backgroundmap.setLayout(null);
		ImageIcon imageworld = new ImageIcon("Map.jpg");
		backgroundmap.setIcon(imageworld);
		backgroundmap.setPreferredSize(new Dimension(this.WIDTH,this.HEIGHT));
		this.add(backgroundmap,BorderLayout.CENTER);
		// 3amlt el background map wl JFrame 3amlt el Jframe boderlayout 3ashan a3raf azbat el dimension bta3t el background b shola w i think
		//making it Center hayzbotha 
		//3malt el background b null as layout 3ashan a3raf a7rak feh el butttons beshola
		
		//conncet the name with the game
		name=new JLabel();
		name.setText(game.getPlayer().getName());
		name.setBounds(0, 0, 100, 50);
		name.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "name"));
		backgroundmap.add(name);
		//connect food with game
		Food=new JLabel();
		Food.setText(""+game.getPlayer().getFood());
		Food.setBounds(110, 0, 100, 50);
		Food.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Food"));
		backgroundmap.add(Food);
		//connect gold with game
		Gold=new JLabel();
		Gold.setText(""+game.getPlayer().getTreasury());
		Gold.setBounds(220, 0, 100, 50);
		Gold.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "Gold"));
		backgroundmap.add(Gold);
		//connect turn count to the game
		turncount=new JLabel();
		turncount.setText(""+game.getCurrentTurnCount());
		turncount.setBounds(330, 0, 100, 50);
		turncount.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black), "turncount"));
		backgroundmap.add(turncount);
		//putting location of cairo box and other cities dont forget to conncet them to the game when oppening the cityview 
		cairo=new JButton();
		cairo.setBounds(600,350,100,20);
		cairo.addActionListener(this);
		cairo.setText("cairo");
		backgroundmap.add(cairo);
		Rome=new JButton();
		Rome.addActionListener(this);
		Rome.setBounds(1000,200,100,20);
		Rome.setText("Rome");
		backgroundmap.add(Rome);
		sparta=new JButton();
		sparta.setBounds(1200,600,100,20);
		sparta.addActionListener(this);
		sparta.setText("sparta");
		backgroundmap.add(sparta);
		//hane3ml el buttons el tedena access 3ashan neshof el idle army w kda  el hane3mlo add using el loop fl action listner w hane3ml el pannel
		// bta3t kol wa7ed fehom el panel de el mfrof ama nedos 3ala idle yezahrlena el panel de w de el hanloop beha w ncreat gowaah buttons
		idle=new JButton();
		idle.setBounds(900, 0, 290, 50);
		idle.setText(" cick to know your idle army information" );
		idle.addActionListener(this);
		idleinfo=new JPanel(new GridLayout(3,3));
		idleinfo.setBounds(0, 200, 500, 500);
		Attack=new JButton();
		Attack.addActionListener(this);
		Attack.setVisible(false);
		Exit=new JButton();
		Exit.setBounds(540,100, 50, 20);
		Exit.setVisible(false);
		Exit.setText("X");
		Exit.addActionListener(this);
		idleinfo.setVisible(false);
		backgroundmap.add(idle);
		backgroundmap.add(Exit);
		backgroundmap.add(idleinfo);
		
		marching=new JButton();
		marching.setBounds(600, 0, 290, 50);
		marching.addActionListener(this);
		marching.setText(" cick to know your marching army information" );
		marchinginfo=new JPanel(new GridLayout(3,3));
		marchinginfo.setBounds(0, 200, 500, 500);
		marchinginfo.setVisible(false);
	
		backgroundmap.add(marching);
		backgroundmap.add(marchinginfo);
		
		
		besiege=new JButton();
		besiege.setBounds(1200, 0, 290, 50);
		besiege.setText(" cick to know your besiege army information" );
		besiege.addActionListener(this);
		besiegeinfo=new JPanel(new GridLayout(3,3));
		besiegeinfo.setBounds(0, 200, 500, 500);
		besiegeinfo.setVisible(false);
		backgroundmap.add(besiege);
		backgroundmap.add(besiegeinfo);
		
		this.setVisible(true);

	}
	public static void main(String[] args) throws IOException {
		Game  m =new Game("mazen","cairo");
		Archer A=new Archer(1,20,0,0,0);
		Archer A2=new Archer(2,20,0,0,0);
		Infantry B=new Infantry(1,20,0,0,0);
		Cavalry C=new Cavalry(1,20,0,0,0);
		Army army=new Army("cairo");
		army.getUnits().add(A);
		army.getUnits().add(B);
		army.getUnits().add(C);
		army.setCurrentStatus(Status.IDLE);
		army.setCurrentLocation("Rome");
		m.getPlayer().getControlledArmies().add(army);
		Army army1=new Army("cairo");
		army1.getUnits().add(A2);
		army1.getUnits().add(B);
		army1.getUnits().add(C);
		army1.setCurrentStatus(Status.BESIEGING);
		army1.setCurrentLocation("Rome");
		m.getPlayer().getControlledArmies().add(army1);
		Army army2=new Army("cairo");
		army2.getUnits().add(A);
		army2.getUnits().add(B);
		army2.getUnits().add(C);
		army2.setCurrentStatus(Status.MARCHING);
		army2.setCurrentLocation("Rome");
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		m.getPlayer().getControlledArmies().add(army2);
		
		new WorldMapview2(m);

		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//awl 7aga 3ayzen ama nloop 3ala el  controlled army neshof army army lw hwa idle ncreate a button naming it army+index w ne7ot kol button
		//fl list bta3etnha w ncreat ma3 kol button textarea n add feh el information tba3et el unit w7na bnloop w n7ot el textarea fl list bardo
		//w ne3ml action prefeormer tany lw dosna 3aal wa7da mn el buttons dol yetla3 el textarea at the same index
		if (arg0.getSource()==idle) {
			Boolean flag=false;
			marching.setEnabled(false);
			besiege.setEnabled(false);
			type="idle";
			idleinfo.removeAll();
			buttons.removeAll(buttons);
			armyinfo.removeAll(armyinfo);
			for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {
				if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus().equals(Status.IDLE)) {
					flag=true;
					
					currentArmy.add(this.game.getPlayer().getControlledArmies().get(i));
					JButton idlearmy=new JButton();
					idlearmy.setPreferredSize(new Dimension(100,20));
					idlearmy.setText("army:"+(i+1));
					idlearmy.addActionListener(this);
					idleinfo.add(idlearmy);
					buttons.add(idlearmy);
					JTextArea idlearmyinfo=new JTextArea();
					//idlearmyinfo.setBounds(0, 100, 500, 500);
					idlearmyinfo.setVisible(false);
					//Attack.setBounds(50,50, 100, 100);
					Attack.setText("Attack!");
					armyinfo.add(idlearmyinfo);
					//backgroundmap.add(Attack);
					//backgroundmap.add(idlearmyinfo);
					Attack.setVisible(false);
					idleinfo.setVisible(true);
					Exit.setVisible(true);
					String s="army:"+(i+1)+"\n________\n";
					for(int j =0 ;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
						s=s+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel()+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount()+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getClass()+"\n--------------------\n";
						idlearmyinfo.setText(s);
					}
					
					
				}
				
			}
			if (flag==false) {
				JOptionPane.showMessageDialog(null, "No current Idle army","NOTE", JOptionPane.ERROR_MESSAGE);
				marching.setEnabled(true);
				besiege.setEnabled(true);
			}
		}
		else {
			JButton b=(JButton)arg0.getSource();
			int r=buttons.indexOf(b);
			if(r!=-1) {
				temp=r;
				
				armyinfo.get(r).setEditable(false);
				armyinfo.get(r).setVisible(true);
				idle.setEnabled(false);
				marching.setEnabled(false);
				besiege.setEnabled(false);
				Exit.setVisible(true);
				Attack.setVisible(true);
				idleinfo.setVisible(false);
				marchinginfo.setVisible(false);
				besiegeinfo.setVisible(false);
				if(type=="idle") {
				newone=new JPanel();
				newone.setLayout(new BorderLayout());
				newone.setBounds(0,100, 500, 500);
				newone.add(armyinfo.get(r),BorderLayout.CENTER);
				newone.add(Attack,BorderLayout.WEST);
				newone.setVisible(true);
				backgroundmap.add(newone);
				}
				type="";
				
				
			
			}
			else {
				if(arg0.getSource()==Exit) {
				 for(int i=0;i<armyinfo.size();i++) {
					 armyinfo.get(i).setVisible(false);
					 idleinfo.setVisible(false);
					 marchinginfo.setVisible(false);
					 besiegeinfo.setVisible(false);
						Attack.setVisible(false);
						newone.setVisible(false);



				 }
				 idle.setEnabled(true);
				 marching.setEnabled(true);
				 besiege.setEnabled(true);
				 Exit.setVisible(false);
				 
				
			}
				else {

					if (arg0.getSource()==marching) {
						Boolean flag=false;
						idle.setEnabled(false);
						besiege.setEnabled(false);
						marchinginfo.removeAll();
						buttons.removeAll(buttons);
						armyinfo.removeAll(armyinfo);
						for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {
							if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus().equals(Status.MARCHING)) {
								flag=true;
								JButton marchingarmy=new JButton();
								marchingarmy.setPreferredSize(new Dimension(100,20));
								marchingarmy.setText("army:"+(i+1));
								marchingarmy.addActionListener(this);
								marchinginfo.add(marchingarmy);
								buttons.add(marchingarmy);
								JTextArea marchingarmynifo=new JTextArea();
								marchingarmynifo.setBounds(0, 100, 600, 500);
								marchingarmynifo.setVisible(false);
								armyinfo.add(marchingarmynifo);
								backgroundmap.add(marchingarmynifo);
								marchinginfo.setVisible(true);
								Exit.setVisible(true);

								String s="army:"+(i+1)+"\n________\n";
								for(int j =0 ;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
									s=s+"Leve:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel()+" "+"Currentsoldiercount:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount()+" "+"Maxcount:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+"   "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getClass()+" "+"Target: "+" "+this.game.getPlayer().getControlledArmies().get(i).getTarget()+" "+"Distance to Target"+" "+this.game.getPlayer().getControlledArmies().get(i).getDistancetoTarget()+"\n--------------------\n";
									marchingarmynifo.setText(s);
								}
								
								
							}
						}
						if (flag==false) {
							JOptionPane.showMessageDialog(null, "No current Marching army","NOTE", JOptionPane.ERROR_MESSAGE);
							idle.setEnabled(true);
							besiege.setEnabled(true);
						}
					}
					else {
						if (arg0.getSource()==besiege) {
							Boolean flag=false;

							idle.setEnabled(false);
							marching.setEnabled(false);
							besiegeinfo.removeAll();
							buttons.removeAll(buttons);
							armyinfo.removeAll(armyinfo);
							for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {
								if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus().equals(Status.BESIEGING)) {
									flag=true;
									String name="";
									int numberunderseige=0;
									JButton besiegearmy=new JButton();
									besiegearmy.setPreferredSize(new Dimension(100,20));
									besiegearmy.setText("army:"+(i+1));
									besiegearmy.addActionListener(this);
									besiegeinfo.add(besiegearmy);
									buttons.add(besiegearmy);
									JTextArea besiegenifo=new JTextArea();
									besiegenifo.setBounds(0, 100, 550, 500);
									besiegenifo.setVisible(false);
									armyinfo.add(besiegenifo);
									backgroundmap.add(besiegenifo);
									besiegeinfo.setVisible(true);
									Exit.setVisible(true);

									String s="army:"+(i+1)+"\n________\n";
									for(int j =0 ;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
										for(int x=0;x<this.game.getAvailableCities().size();x++) {
											if(this.game.getAvailableCities().get(x).isUnderSiege()==true) {
												 name=this.game.getAvailableCities().get(x).getName();
												 numberunderseige=game.getAvailableCities().get(x).getTurnsUnderSiege();
											}
										}
										s=s+"Leve:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel()+" "+"Currentsoldiercount:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount()+" "+"Maxcount:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+"   "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getClass()+" "+"City under seige: "+" "+name+" "+"Turnsunderseige"+" "+numberunderseige+"\n--------------------\n";
										besiegenifo.setText(s);
									}
									
									
									
								}
							}
							if (flag==false) {
								JOptionPane.showMessageDialog(null, "No current besiege army","NOTE", JOptionPane.ERROR_MESSAGE);
								idle.setEnabled(true);
								marching.setEnabled(true);
							}
						}
						
						else {
							if(arg0.getSource()==Rome) {
								Boolean flag=false;
								for(int i=0;i<this.game.getPlayer().getControlledCities().size();i++) {
									if(this.game.getPlayer().getControlledCities().get(i).getName().equalsIgnoreCase("Rome")) {
										flag=true;
										this.setVisible(false);
										CityView X=new CityView(game,this.game.getPlayer().getControlledCities().get(i));
									}
									
								}
								if(flag==false) {
									JOptionPane.showMessageDialog(null, "this County  is not controlled","NOTE", JOptionPane.ERROR_MESSAGE);
								}
							}
							else {
								if(arg0.getSource()==cairo) {
									Boolean flag=false;
									for(int i=0;i<this.game.getPlayer().getControlledCities().size();i++) {
										if(this.game.getPlayer().getControlledCities().get(i).getName().equalsIgnoreCase("cairo")) {
											flag=true;
											this.setVisible(false);
											CityView X=new CityView(game,this.game.getPlayer().getControlledCities().get(i));
										}
										
									}
									if(flag==false) {
										JOptionPane.showMessageDialog(null, "this County  is not controlled","NOTE", JOptionPane.ERROR_MESSAGE);
									}
								}
								else {
									if(arg0.getSource()==sparta) {
										Boolean flag=false;
										for(int i=0;i<this.game.getPlayer().getControlledCities().size();i++) {
											if(this.game.getPlayer().getControlledCities().get(i).getName().equalsIgnoreCase("sparta")) {
												flag=true;
												this.setVisible(false);
												CityView X=new CityView(game,this.game.getPlayer().getControlledCities().get(i));
											}
											
										}
										if(flag==false) {
											JOptionPane.showMessageDialog(null, "this County  is not controlled","NOTE", JOptionPane.ERROR_MESSAGE);
										}
									}
									else if(arg0.getSource()==Attack) {
										ArrayList<String> helper=new ArrayList<>();

										for(int i=0;i<this.game.getAvailableCities().size();i++) {
											for(int j=0;j<this.game.getPlayer().getControlledCities().size();j++) {
												if(!this.game.getAvailableCities().get(i).getName().equalsIgnoreCase(this.game.getPlayer().getControlledCities().get(j).getName())){
													helper.add(this.game.getAvailableCities().get(i).getName());
												}
											}
											
										}
										String[] helper2= {helper.get(0),helper.get(1)};
										String output="";
										 output=(String)JOptionPane.showInputDialog(null,null,
										        "Choose a city to conqure", JOptionPane.QUESTION_MESSAGE, null, 
										        helper2, // Array of choices
										        null); // Initial choice
										 if(output!="") {
											// System.out.print(temp);
											JOptionPane.showMessageDialog(null, "YOUR ARMY ARE ON THE WAY!");
											 newone.setVisible(false);
											 idle.setEnabled(true);
											 marching.setEnabled(true);
											 besiege.setEnabled(true);
											 Exit.setVisible(false);
											 

											 this.game.targetCity(this.game.getPlayer().getControlledArmies().get(temp), output);
													 this.game.getPlayer().getControlledArmies().get(temp).setCurrentStatus(Status.MARCHING);

										
											 
										 }
										 
										
										
										//JOptionPane.showMessageDialog(Attack, "Your army started the Jounry to the City they will reach in"+, title, messageType);
										
										
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



















