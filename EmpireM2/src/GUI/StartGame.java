package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import engine.Game;

public class StartGame extends JFrame implements ActionListener{
String City="";
Game game;
JTextField Insertname;
JButton Submit;
JComboBox Cityname;
String name;

public StartGame() {
this.setLayout(null);
this.setBounds(0, 0, 2000, 2000);
ImageIcon image=new ImageIcon("Throne1.png");
JLabel background =new JLabel();
background.setLayout(null);
background.setBounds(-200, 0, 1800, 1000);
background.setIcon(image);
Insertname=new JTextField();
Insertname.setLayout(null);
Insertname.setBounds(900, 400, 200, 40);
Submit =new JButton();
Submit.addActionListener(this);
Submit.setLayout(null);
Submit.setBounds(810, 400, 90,80 );
Submit.setText("Submit");
String[] names={"Rome","Cairo","Sparta"};
Cityname=new JComboBox(names);
Cityname.addActionListener(this);
Cityname.setLayout(null);
Cityname.setBounds(900,440, 200, 40);
JLabel Welcome =new JLabel();
Welcome.setLayout(null);
Welcome.setBounds(700, 50, 800,100 );
Welcome.setText("TYPE YOUR NAME AND CHOOSE YOUR CITY");
Welcome.setFont(new Font("Consolas",Font.PLAIN,30));
Welcome.setForeground(Color.white);
background.add(Welcome);
background.add(Submit);
background.add(Insertname);
background.add(Cityname);
this.add(background);
this.setVisible(true);
}

public static void main(String[] args) throws IOException {

StartGame C =new StartGame();
}





@Override
public void actionPerformed(ActionEvent arg0) {
if (arg0.getSource()==Cityname){
	
City=(String)Cityname.getSelectedItem();
}
if(arg0.getSource()==Submit) {
if (City.equals("")) {
	JOptionPane.showMessageDialog(null, "Choose your City","NOTE", JOptionPane.ERROR_MESSAGE);
}
else {
	if(Insertname.getText().isBlank()) {
		JOptionPane.showMessageDialog(null, "Choose your Name","NOTE", JOptionPane.ERROR_MESSAGE);
	}
	else {
		name=Insertname.getText();
		try {
		game=new Game(name,City);
		} catch (IOException e) {
		// TODO Auto-generated catch block
		
	}
		game.getPlayer().setTreasury(5000);
		this.setVisible(false);

		WorldMapview2 X= new WorldMapview2(game);

}



}
}
}

}