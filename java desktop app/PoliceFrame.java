import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Police extends JFrame implements WindowListener,ActionListener
{
JButton b1,b2,b3,b4;
JLabel jl,jl2,jl3,jl4;
CardLayout cl;
ImageIcon ic,ic2,ic3,ic4,ic5,ic6;
JPanel jp,jp1,jp2,jp3;
JPoliceLogin jpl;
JTextField tj;

Police()
{

super("Police App");

ic=new ImageIcon("bg.jpg");
ic2=new ImageIcon("logo.jpg");
ic3=new ImageIcon("buttonbg.jpg");
ic4=new ImageIcon("tp.jpg");
ic5=new ImageIcon("ad.jpg");
ic6=new ImageIcon("signup.jpg");

GridBagLayout gbl=new GridBagLayout();
setLayout(gbl);
GridBagConstraints gbc = new GridBagConstraints();  



gbc.fill = GridBagConstraints.HORIZONTAL;


jl=new JLabel(ic);
gbl.setConstraints(jl,gbc);
GridBagLayout gbl1=new GridBagLayout();
jl.setLayout(gbl1); 
GridBagConstraints gbc1=new GridBagConstraints();
add(jl);


gbc1.gridx=0;
gbc1.gridy=0;
gbc1.gridwidth=GridBagConstraints.REMAINDER;
jl2=new JLabel(ic2);  
gbl1.setConstraints(jl,gbc1);
jl.add(jl2);



gbc1.gridx=0;
gbc1.gridy=3;
b1=new JButton(ic3);
gbl1.setConstraints(b1,gbc1);
jl.add(b1);
b1.setPreferredSize(new Dimension(150,40));

gbc1.gridx=0;
gbc1.gridy=4;
b2=new JButton(ic4);
gbl.setConstraints(b2,gbc1);
jl.add(b2);
b2.setPreferredSize(new Dimension(150,40));

gbc1.gridx=0;
gbc1.gridy=5;
b3=new JButton(ic5);
gbl1.setConstraints(b3,gbc1);
jl.add(b3);
b3.setPreferredSize(new Dimension(150,40));

gbc1.gridx=0;
gbc1.gridy=6;
b4=new JButton(ic6);
gbl1.setConstraints(b4,gbc1);
jl.add(b4);
b4.setPreferredSize(new Dimension(130,40));

jp=new JPanel();
cl=new CardLayout();
jp.setLayout(cl);
gbl.setConstraints(jp,gbc);
add(jp);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

tj=new JTextField();

jp1=new JPoliceLogin();

jp2=new JPoliceSignup();

jp3=new JTPoliceLogin();


jp.add(jp1,"login");
jp.add(jp2,"signup");
jp.add(jp3,"tlogin");



jp.setSize(500,500);

jp.setVisible(false);

setSize(1052,824);
setVisible(true);


addWindowListener(this);

setLocation(300,100);



}

public void windowClosing(WindowEvent we)
{
setVisible(false);
System.exit(0);

}

public void windowDeactivated(WindowEvent we)
{

}

public void windowActivated(WindowEvent we)
{

}



public void windowDeiconified	(WindowEvent we)
{

}

public void windowIconified(WindowEvent we)
{

}

public void windowClosed(WindowEvent we)
{

}

public void windowOpened(WindowEvent we)
{

}

public void actionPerformed(ActionEvent ae)
{
JButton ob=(JButton)ae.getSource();
jl.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);
b3.setVisible(false);
b4.setVisible(false);
jp.setVisible(true);

if(ob==b1)
{
cl.show(jp,"login");
}

if(ob==b4)
{
cl.show(jp,"signup");
}

if(ob==b2)
{
cl.show(jp,"tlogin");
}

if(ob==b3)
{

}

}




}





class PoliceFrame
{

public static void main(String args[])
{
Police po=new Police();




}




}