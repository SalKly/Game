package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import engine.Game;
import units.Archer;
import units.Army;
import units.Cavalry;
import units.Infantry;
import units.Status;
import units.Unit;

public class WorldMapview extends JFrame implements ActionListener {
Game game;
JButton Armystats;
JButton Armystats1;
JButton Armystats2;
JButton Exit;

JPanel idle;
JPanel Marching;
JPanel besiege;
JPanel type;
JPanel Level;
JPanel Numberofsoldiers;
JPanel type1;
JPanel Level1;
JPanel Numberofsoldiers1;
JPanel type2;
JPanel Level2;
JPanel Numberofsoldiers2;
JPanel City;
JPanel temp;
JPanel temp1;
JPanel temp2;
JPanel temp3;
JPanel City1;
JPanel City2;

public WorldMapview(Game game) {
	this.game=game;
	
this.setTitle("WORLD MAP");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.setSize(1600, 900);
JLayeredPane Layers=new JLayeredPane();
Layers.setSize(1600,900);
this.getContentPane().setBackground(new Color(194,178,128));
JLabel label=new JLabel();
label.setVisible(true);
this.add(label);
label.add(Layers);
ImageIcon image=new ImageIcon("logo1.png");
ImageIcon imagecairo = new ImageIcon("Map.jpg");
this.setIconImage(image.getImage());
label.setIcon(imagecairo);
JPanel Panel1=new JPanel(); //panel1 for cairo
Panel1.setBounds(900, 150, 100, 30);
Panel1.setLayout(new BorderLayout());
Layers.add(Panel1);
JButton Cairo=new JButton();
Cairo.setText("Cairo");
Cairo.setVerticalAlignment(JButton.TOP);
Panel1.add(Cairo);
JPanel Panel2=new JPanel();//panel 2 for sparta
Panel2.setBounds(1200, 600, 100, 30);
Panel2.setLayout(new BorderLayout());
Layers.add(Panel2);
JButton Sparta=new JButton();
Sparta.setText("Sparta");
Sparta.setVerticalAlignment(JButton.TOP);
Panel2.add(Sparta);
JPanel Panel3=new JPanel(); //pannel 3 for Rome
Panel3.setBounds(600, 350, 100, 30);
Panel3.setLayout(new BorderLayout());
Layers.add(Panel3);
JButton Rome=new JButton();
Rome.setText("Rome");
Rome.setVerticalAlignment(JButton.TOP);
Panel3.add(Rome);
Armystats=new JButton();  //button for showing army status
Armystats.addActionListener(this);
Armystats.setText("CLICK TO SEE THE DEFENDING ARMY INFORMATION");
Armystats.setBounds(0,0 ,400 , 50);
Layers.add(Armystats);
Armystats1=new JButton();  //button for showing army status
Armystats1.addActionListener(this);
Armystats1.setText("CLICK TO SEE THE MARCHING ARMY INFORMATION ");
Armystats1.setBounds(500,0 ,400 , 50);
Layers.add(Armystats1);
Armystats2=new JButton();  //button for showing army status
Armystats2.addActionListener(this);
Armystats2.setText("CLICK TO SEE THE BESIEGING ARMY INFORMATION ");
Armystats2.setBounds(1000,0 ,400 , 50);
Layers.add(Armystats2);
Exit=new JButton();  //button for showing army status
Exit.addActionListener(this);
Exit.setText("Exit");
Exit.setBounds(1450,0 ,100 , 50);
Layers.add(Exit);
Exit.setVisible(false);


idle=new JPanel();
idle.setLayout(new BorderLayout(10,10)) ;
idle.setBackground(Color.gray);
idle.setBounds(50,50, 1300, 600);
idle.setBorder(BorderFactory.createTitledBorder("Idle"));
Marching=new JPanel();
Marching.setLayout(new BorderLayout(10,10));
Marching.setBorder(BorderFactory.createTitledBorder("Marching"));
Marching.setBounds(50,50, 1300, 600);
Marching.setBackground(Color.red);
besiege=new JPanel();
besiege.setLayout(new BorderLayout(10,10));
besiege.setBorder(BorderFactory.createTitledBorder("besiege"));
besiege.setBackground(Color.green);
besiege.setBounds(50,50, 1300, 600);
besiege.setName("Besiege");
type=new JPanel();
type.setLayout(new GridLayout(30,1)) ;
type.setBackground(Color.CYAN);
type.setPreferredSize(new Dimension(60,50));
type.setBorder(BorderFactory.createTitledBorder("Type"));
 Level=new JPanel();
 Level.setLayout(new GridLayout(30,1));
Level.setBorder(BorderFactory.createTitledBorder("Level"));
Level.setBackground(Color.ORANGE);
Level.setPreferredSize(new Dimension(60,50));
temp=new JPanel();
temp.setLayout(new BorderLayout());
temp.setPreferredSize(new Dimension(60,50));
 Numberofsoldiers=new JPanel();
 Numberofsoldiers.setLayout(new GridLayout(30,1));
Numberofsoldiers.setBorder(BorderFactory.createTitledBorder("CurrentNumberofSoldiers&&Maxnumberofsoldiers"));
Numberofsoldiers.setBackground(Color.LIGHT_GRAY);
Numberofsoldiers.setPreferredSize(new Dimension(400,50));
City=new JPanel();
City.setLayout(new GridLayout(30,1));
City.setPreferredSize(new Dimension(300,50));
City.setBorder(BorderFactory.createTitledBorder("City of the army"));

temp.add(City,BorderLayout.WEST);
temp.add(Numberofsoldiers,BorderLayout.EAST);

idle.add(type,BorderLayout.WEST);
idle.add(Level,BorderLayout.EAST);
idle.add(temp,BorderLayout.CENTER);
idle.setVisible(false);
//marching table
type1=new JPanel();
type1.setLayout(new GridLayout(30,1)) ;
type1.setBackground(Color.CYAN);
type1.setPreferredSize(new Dimension(500,500));
type1.setBorder(BorderFactory.createTitledBorder("Type"));
 Level1=new JPanel();
 Level1.setLayout(new GridLayout(30,1));
Level1.setBorder(BorderFactory.createTitledBorder("Level"));
Level1.setBackground(Color.DARK_GRAY);
Level1.setPreferredSize(new Dimension(60,50));
temp1=new JPanel();
temp1.setLayout(new BorderLayout());
temp1.setPreferredSize(new Dimension(60,50));
 Numberofsoldiers1=new JPanel();
 Numberofsoldiers1.setLayout(new GridLayout(30,1));
Numberofsoldiers1.setBorder(BorderFactory.createTitledBorder("CurrentNumberofSoldiers&&Maxnumberofsoldiers"));
Numberofsoldiers1.setBackground(Color.LIGHT_GRAY);
Numberofsoldiers1.setPreferredSize(new Dimension(400,50));
City1=new JPanel();
City1.setLayout(new GridLayout(30,1));
City1.setPreferredSize(new Dimension(300,50));
City1.setBorder(BorderFactory.createTitledBorder("City of the target army and number of turns left "));

temp1.add(City1,BorderLayout.WEST);
temp1.add(Numberofsoldiers1,BorderLayout.EAST);
Marching.setVisible(false);
Marching.add(type1,BorderLayout.WEST);
Marching.add(Level1,BorderLayout.EAST);
Marching.add(temp1,BorderLayout.CENTER);
type2=new JPanel();
type2.setLayout(new GridLayout(30,1)) ;
type2.setBackground(Color.CYAN);
type2.setPreferredSize(new Dimension(60,50));
type2.setBorder(BorderFactory.createTitledBorder("Type"));
 Level2=new JPanel();
 Level2.setLayout(new GridLayout(30,1));
Level2.setBorder(BorderFactory.createTitledBorder("Level"));
Level2.setBackground(Color.DARK_GRAY);
Level2.setPreferredSize(new Dimension(60,50));
temp2=new JPanel();
temp2.setLayout(new BorderLayout());
temp2.setPreferredSize(new Dimension(60,50));
 Numberofsoldiers2=new JPanel();
 Numberofsoldiers2.setLayout(new GridLayout(30,1));
Numberofsoldiers2.setBorder(BorderFactory.createTitledBorder("CurrentNumberofSoldiers&&Maxnumberofsoldiers"));
Numberofsoldiers2.setBackground(Color.LIGHT_GRAY);
Numberofsoldiers2.setPreferredSize(new Dimension(400,50));
City2=new JPanel();
City2.setLayout(new GridLayout(30,1));
City2.setPreferredSize(new Dimension(300,50));
City2.setBorder(BorderFactory.createTitledBorder("City of on Seige and number of turns it was underseige "));

temp2.add(City2,BorderLayout.WEST);
temp2.add(Numberofsoldiers2,BorderLayout.EAST);
besiege.setVisible(false);
besiege.add(type2,BorderLayout.WEST);
besiege.add(Level2,BorderLayout.EAST);
besiege.add(temp2,BorderLayout.CENTER);
Layers.add(idle,JLayeredPane.DRAG_LAYER);
Layers.add(Marching,JLayeredPane.DRAG_LAYER);
Layers.add(besiege,JLayeredPane.DRAG_LAYER);
this.setVisible(true);

}


public static void main(String[] args) throws IOException {
Game m = new Game("mazen","Cairo");
Archer A=new Archer(1,20,0,0,0);
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
army1.getUnits().add(A);
army1.getUnits().add(B);
army1.getUnits().add(C);
army1.setCurrentStatus(Status.IDLE);
army1.setCurrentLocation("Rome");
m.getPlayer().getControlledArmies().add(army1);
Army army2=new Army("cairo");
army2.getUnits().add(A);
army2.getUnits().add(B);
army2.getUnits().add(C);
army2.setCurrentStatus(Status.IDLE);
army2.setCurrentLocation("Rome");
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);
m.getPlayer().getControlledArmies().add(army2);


WorldMapview X=new WorldMapview(m);

}
@Override
public void actionPerformed(ActionEvent arg0) {
if(arg0.getSource()==Armystats) {
Exit.setVisible(true);
Armystats1.setEnabled(false);
Armystats.setEnabled(false);
Armystats2.setEnabled(false);
for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {

if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus()==Status.IDLE) {
for(int j=0;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
String Z = new String();
Z="City of the unit"+":"+"   "+this.game.getPlayer().getControlledArmies().get(i).getCurrentLocation()+Z;
JLabel temp4=new JLabel(Z);
City.add(temp4);
String X =new String();
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Archer) {
X="Archer";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Infantry) {
X="Infantry";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Cavalry) {
X="Cavalry";
}
JLabel temp1=new JLabel(X);
type.add(temp1);
X="    "+" , "+"numberofsoldiers:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount();
X="MAX:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+X;
JLabel temp2=new JLabel(X);
Numberofsoldiers.add(temp2);
X="Level:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel();
JLabel temp3=new JLabel(X);
Level.add(temp3);
idle.setVisible(true);
}
}
}
}
if(arg0.getSource()==Armystats1) {
Exit.setVisible(true);

Armystats1.setEnabled(false);
Armystats.setEnabled(false);
Armystats2.setEnabled(false);
for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {

if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus()==Status.MARCHING) {
for(int j=0;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
String Z = new String();
Z="  " + " ," +"City of the unit"+":"+"   "+this.game.getPlayer().getControlledArmies().get(i).getTarget()+Z;
Z="Turns left to reach"+this.game.getPlayer().getControlledArmies().get(i).getDistancetoTarget()+Z;
JLabel temp4=new JLabel(Z);
City1.add(temp4);
String X =new String();
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Archer) {
X="Archer";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Infantry) {
X="Infantry";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Cavalry) {
X="Cavalry";
}
JLabel temp1=new JLabel(X);
type1.add(temp1);
X="    "+" , "+"numberofsoldiers:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount();
X="MAX:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+X;
JLabel temp2=new JLabel(X);
Numberofsoldiers1.add(temp2);
X="Level:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel();
JLabel temp3=new JLabel(X);
Level1.add(temp3);
Marching.setVisible(true);
}
}
}
}
if(arg0.getSource()==Armystats2) {
Exit.setVisible(true);

Armystats1.setEnabled(false);
Armystats.setEnabled(false);
Armystats2.setEnabled(false);
for(int i=0;i<this.game.getPlayer().getControlledArmies().size();i++) {

if (this.game.getPlayer().getControlledArmies().get(i).getCurrentStatus()==Status.BESIEGING) {
for(int j=0;j<this.game.getPlayer().getControlledArmies().get(i).getUnits().size();j++) {
String Z = new String();
Z="  " + " ," +"City of the unit"+":"+"   "+this.game.getPlayer().getControlledArmies().get(i).getCurrentLocation()+Z;
for(int k=0;k<this.game.getAvailableCities().size();k++) {
if(this.game.getAvailableCities().get(k).isUnderSiege()) {
Z="Turns underSeige:"+" "+this.game.getAvailableCities().get(k).getTurnsUnderSiege()+Z;
JLabel temp4=new JLabel();
City2.add(temp4);
}
}
String X =new String();
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Archer) {
X="Archer";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Infantry) {
X="Infantry";
}
if (this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j) instanceof Cavalry) {
X="Cavalry";
}
JLabel temp1=new JLabel(X);
type1.add(temp1);

X="    "+" , "+"numberofsoldiers:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getCurrentSoldierCount();
X="MAX:"+" "+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getMaxSoldierCount()+X;
JLabel temp2=new JLabel(X);
Numberofsoldiers1.add(temp2);
X="Level:"+this.game.getPlayer().getControlledArmies().get(i).getUnits().get(j).getLevel();
JLabel temp3=new JLabel(X);
Level1.add(temp3);
Marching.setVisible(true);
}
}
}
}

if(arg0.getSource()==Exit) {
idle.setVisible(false);
Marching.setVisible(false);
besiege.setVisible(false);
Armystats1.setEnabled(true);
Armystats.setEnabled(true);
Armystats2.setEnabled(true);
Exit.setVisible(false);
System.exit(0);

}
}


	
			

}