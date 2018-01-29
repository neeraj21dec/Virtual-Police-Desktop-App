import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;

class JPoliceSignup extends JPanel implements ActionListener
{
JButton b1,b2;
JLabel jl,jlg,jbg;
ImageIcon ic1,ic2,ic3;
JPanel jp,jp1,jp2;
CardLayout cl;

JPoliceSignup()
{

ic1=new ImageIcon("policesignup.jpg");
ic2=new ImageIcon("trapolicesignup.jpg");
ic3=new ImageIcon("bg.jpg");


jbg=new JLabel(ic3);

GridBagLayout gbl=new GridBagLayout();
jbg.setLayout(gbl);

GridBagConstraints gbc = new GridBagConstraints();  

add(jbg);

gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;



gbc.insets = new Insets(-600, 0, 0, 0);
gbc.weighty=0;
jl=new JLabel("Signup by :-");
jl.setForeground(new Color(176,175,183));
jl.setFont(new Font("Impact",Font.PLAIN,30));
jbg.add(jl,gbc);

gbc.insets = new Insets(30,0,0,0);

gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=1;

b1=new JButton(ic1);
b1.setPreferredSize(new Dimension(100,40));
jbg.add(b1,gbc);



gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=2;
b2=new JButton(ic2);
b2.setPreferredSize(new Dimension(100,40));
jbg.add(b2,gbc);

//gbc.gridx=0;
//gbc.gridy=0;
jp=new JPanel();
cl=new CardLayout();
jp.setLayout(cl);

add(jp);

jp.setVisible(false);

jp1=new JPoliceRegister();
jp2=new JTPoliceRegister();

jp.add(jp1,"polreg");
jp.add(jp2,"tpolreg");

b1.addActionListener(this);
b2.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)

{
JButton ob=(JButton)ae.getSource();
jl.setVisible(false);
jbg.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);

if(ob==b1)
{jp.setVisible(true);
cl.show(jp,"polreg");}

else if(ob==b2)
{jp.setVisible(true);
cl.show(jp,"tpolreg");}

}


}