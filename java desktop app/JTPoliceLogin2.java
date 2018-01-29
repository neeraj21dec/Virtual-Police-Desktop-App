import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;

public class JTPoliceLogin2 extends JPanel implements ItemListener,ActionListener
{
JButton b1,b2,b3,b4;
JLabel jl1,jl2,jl3,jbg;
ImageIcon ic1,ic2,ic3,ic4,ic5;
JPanel jp,jp1,jp2,jp3;
JMenuBar mbar;
JMenu challans,vechicles,settings;
JMenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
CardLayout cl;

Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null;

JTPoliceLogin2()
{

ic1=new ImageIcon("bgblur.jpg");
ic2=new ImageIcon("challan.jpg");
ic3=new ImageIcon("vechicles.jpg");
ic4=new ImageIcon("vechicler.jpg");
ic5=new ImageIcon("pay.jpg");

jp=new JPanel();
add(jp);

jbg=new JLabel(ic1);
add(jbg);
jbg.setLayout(null);

jl1=new JLabel("Traffic Police:-");
jl2=new JLabel("Neeraj");

jl1.setForeground(new Color(176,175,183));
jl1.setFont(new Font("Impact",Font.PLAIN,30));

jl2.setForeground(new Color(176,175,183));
jl2.setFont(new Font("Impact",Font.PLAIN,30));

jbg.add(jl1);
jbg.add(jl2);

mbar=new JMenuBar();
mbar.setLayout(null);
jbg.add(mbar);


challans=new JMenu("Challans");
mbar.add(challans);

vechicles=new JMenu("Vechicles");
mbar.add(vechicles);

settings=new JMenu("Settings");
mbar.add(settings);

b1=new JButton(ic2);
b2=new JButton(ic3);
b3=new JButton(ic4);
b4=new JButton(ic5);

jbg.add(b1);
jbg.add(b2);
jbg.add(b3);
jbg.add(b4);


jl1.setBounds(10,0,300,70);
jl2.setBounds(920,0,300,70);
mbar.setBounds(20,100,950,50);
b1.setBounds(100,300,150,50);
b2.setBounds(100,400,200,50);
b3.setBounds(100,500,200,50);
b4.setBounds(100,600,200,50);

settings.setBounds(850,17,63,20);
challans.setBounds(10,17,63,20);
vechicles.setBounds(70,17,63,20);




m1=new JMenuItem("seized");
m2=new JMenuItem("released");

vechicles.add(m1);
vechicles.add(m2);

m3=new JMenuItem("view previous");
challans.add(m3);

m4=new JMenuItem("profile");
m5=new JMenuItem("logout");

settings.add(m4);
settings.add(m5);


jl3=new JLabel("Control room:-Contact:-");
jbg.add(jl3);


jl3.setForeground(new Color(176,175,183));
jl3.setFont(new Font("MS Serif",Font.PLAIN,20));

jl3.setBounds(100,700,200,50);


b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);


m1.addItemListener(this);
m2.addItemListener(this);
m3.addItemListener(this);
m4.addItemListener(this);
m5.addItemListener(this);


jp1=new Challan();
jp2=new VechicleSeize();
jp3=new VechicleRelease();

cl=new CardLayout();
jp.setLayout(cl);
jp.add(jp1,"Challan");
jp.add(jp2,"sieze");
jp.add(jp3,"release");

jp.setVisible(false);


}

public void actionPerformed(ActionEvent ae)
{
JButton ob=(JButton)ae.getSource();
jbg.setVisible(false); 
b1.setVisible(false);
b2.setVisible(false);
b3.setVisible(false);
b4.setVisible(false);
jp.setVisible(true);
if(ob==b1)
  {
     cl.show(jp,"Challan");
  }
if(ob==b2)
 {
   cl.show(jp,"sieze"); 
 }
if(ob==b3)
 {
   cl.show(jp,"release"); 
 }



}

public void itemStateChanged(ItemEvent ie)
{
JMenuItem ob2=(JMenuItem)ie.getSource();


}


}


