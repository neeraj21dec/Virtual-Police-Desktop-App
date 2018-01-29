import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

class JTPoliceRegister extends JPanel implements ItemListener,ActionListener
{
JButton b1,b2;
JLabel jl,jl1,jl2,jl3,jl4,jl5,jl8,jl6,jl7,jbg,jlg,jreg;
ImageIcon ic1,ic2,ic3,ic4;
JTextField jt1,jt2,jt3,jt4,jt8,jt6,jt7;
JPanel pl,jp,jp1;
Choice c1,c2,c3;
CardLayout cl;

Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null;


JTPoliceRegister()
{


try
 {
 Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost/policeapp","root","12345");
 }

catch(ClassNotFoundException e1)
 {
 System.out.println(e1);
 }

catch(SQLException e2)
 {
System.out.println(e2);
 }


ic1=new ImageIcon("bg.jpg");
ic2=new ImageIcon("logo.jpg");
ic3=new ImageIcon("reg.jpg");
ic4=new ImageIcon("login.jpg");

jbg=new JLabel(ic1);

GridBagLayout gbl=new GridBagLayout();
jbg.setLayout(gbl);

GridBagConstraints gbc = new GridBagConstraints();  

add(jbg);

gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;

jl=new JLabel("Traffic Police Registration :-");
jl.setForeground(new Color(176,175,183));
jl.setFont(new Font("Impact",Font.PLAIN,30));
gbc.insets = new Insets(-100, 40, 0, 0);
jbg.add(jl,gbc);

gbc.anchor = GridBagConstraints.CENTER;
gbc.weighty=0;
gbc.gridx=0;
gbc.gridy=1;

gbc.insets = new Insets(80, 0, 0, 0);
jl1=new JLabel("Name");
jl1.setForeground(Color.WHITE);
jl1.setPreferredSize(new Dimension(30,50));
jl1.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl1,gbc);


gbc.gridx=1;
gbc.gridy=1;
jt1=new JTextField();

jt1.setPreferredSize(new Dimension(100,30));
jbg.add(jt1,gbc);


gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=2;
jl2=new JLabel("Mobile no");
jl2.setForeground(Color.WHITE);
jl2.setPreferredSize(new Dimension(200,50));
jl2.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl2,gbc);
  
gbc.gridx=1;
gbc.gridy=2;
jt2=new JTextField(30);
jt2.setPreferredSize(new Dimension(50,30));
jbg.add(jt2,gbc);

gbc.fill = GridBagConstraints.NONE;
gbc.ipady = 0;  

gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=3;
jl3=new JLabel("Password");
jl3.setForeground(Color.WHITE);
jl3.setPreferredSize(new Dimension(200,50));
jl3.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl3,gbc);
  

gbc.gridx=1;
gbc.gridy=3;
jt3=new JTextField(30);
jt3.setPreferredSize(new Dimension(50,30));
jbg.add(jt3,gbc);



gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=4;
jl4=new JLabel("Post");
jl4.setForeground(Color.WHITE);
jl4.setPreferredSize(new Dimension(200,50));
jl4.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl4,gbc);
  

gbc.gridx=1;
gbc.gridy=4;
jt4=new JTextField(30);
jt4.setPreferredSize(new Dimension(50,30));
jbg.add(jt4,gbc);


gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=5;
jl5=new JLabel("City");
jl5.setForeground(Color.WHITE);
jl5.setPreferredSize(new Dimension(200,50));
jl5.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl5,gbc);
  

gbc.gridx=1;
gbc.gridy=5;
c1=new Choice();
c1.setPreferredSize(new Dimension(280,20));
jbg.add(c1,gbc);

try
{
st1=con.createStatement();
rs1=st1.executeQuery("select * from cities");
while(rs1.next())
{
 String city=rs1.getString(1);
  c1.add(city);
}

}

catch(SQLException e3)
 {
 System.out.println(e3);
 }
catch(Exception e4)
 {
 System.out.println(e4);
 }







gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=6;
jl6=new JLabel("State");
jl6.setForeground(Color.WHITE);
jl6.setPreferredSize(new Dimension(200,50));
jl6.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl6,gbc);
  

gbc.gridx=1;
gbc.gridy=6;
c2=new Choice();
c2.setPreferredSize(new Dimension(280,20));
jbg.add(c2,gbc);
  
try
{
st2=con.createStatement();
rs2=st2.executeQuery("select * from states");
while(rs2.next())
{
 String state=rs2.getString(1);
  c2.add(state);
}

}

catch(SQLException e3)
 {
 System.out.println(e3);
 }
catch(Exception e4)
 {
 System.out.println(e4);
 }  


c2.addItemListener(this);

gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=7;
jl7=new JLabel("Control room");
jl7.setForeground(Color.WHITE);
jl7.setPreferredSize(new Dimension(200,50));
jl7.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl7,gbc);
  

gbc.gridx=1;
gbc.gridy=7;
c3=new Choice();
c3.setPreferredSize(new Dimension(280,20));
jbg.add(c3,gbc);
   

gbc.insets = new Insets(0, 0, 0, 0);
gbc.ipady = 0;  
gbc.gridx=0;
gbc.gridy=8;
jl8=new JLabel("Home Address");
jl8.setForeground(Color.WHITE);
jl8.setPreferredSize(new Dimension(200,50));
jl8.setFont(new Font("Serif",Font.PLAIN,30));
jbg.add(jl8,gbc);
  

gbc.gridx=1;
gbc.gridy=8;
jt8=new JTextField(30);
jt8.setPreferredSize(new Dimension(50,30));
jbg.add(jt8,gbc);


gbc.gridx=1;
gbc.gridy=9; 
b1=new JButton(ic3);
b1.setPreferredSize(new Dimension(100,40));
jbg.add(b1,gbc);

b1.addActionListener(this);

gbc.gridx=0;
gbc.gridy=10;
jreg=new JLabel(""); 
jreg.setForeground(new Color(176,175,183));
jreg.setFont(new Font("Impact",Font.PLAIN,30));
jbg.add(jreg,gbc);

gbc.gridx=0;
gbc.gridy=11; 
b2=new JButton(ic4);
b2.setPreferredSize(new Dimension(100,40));
jbg.add(b2,gbc);
b2.setVisible(false);

b2.addActionListener(this);

jp=new JPanel();
cl=new CardLayout();
jp.setLayout(cl);
add(jp);
jp1=new JPoliceLogin();
jp.add(jp1,"login");
jp.setVisible(false);


}

public void itemStateChanged(ItemEvent ie)
{ 
c3.removeAll();

String city=c1.getSelectedItem();
String state=c2.getSelectedItem();

try
{
st3=con.createStatement();
rs3=st3.executeQuery("select control_room from controlrooms where city='"+city+"' and state='"+state+"'");
while(rs3.next())
{
 String station=rs3.getString(1);
  c3.add(station);
}

}

catch(SQLException e3)
 {
 System.out.println(e3);
 }
catch(Exception e4)
 {
 System.out.println(e4);
 }  

}


public void actionPerformed(ActionEvent ae)
{
b2.setVisible(false);
JButton ob=(JButton)ae.getSource();
if(ob==b1)
{
String name=jt1.getText();
String mobno=jt2.getText();
String pwd=jt3.getText();
String post=jt4.getText();
String city=c1.getSelectedItem();
String state=c2.getSelectedItem();
String control_room=c3.getSelectedItem();
String home=jt8.getText();


try
{
st4=con.createStatement();
rs4=st4.executeQuery("select * from tpprofile where mobno='"+mobno+"'");

if(rs4.next())
{
jreg.setText("Already Registered!");
b2.setVisible(true);
}

else if(mobno.equals(""))
{
jreg.setText("Please Fill Entries!");
}

else
{
st4.executeUpdate("insert into tpprofile values('"+name+"','"+mobno+"','"+pwd+"','"+post+"','"+city+"','"+state+"','"+control_room+"','"+home+"')");

jreg.setText("Registered Successfully");
b2.setVisible(true);
}

}
catch(SQLException e3)
 {
 System.out.println(e3);
 }
catch(Exception e4)
 {
 System.out.println(e4);
 }  


}

if (ob==b2)
{
jbg.setVisible(false);
b1.setVisible(false);
b2.setVisible(false);
jp.setVisible(true);
cl.show(jp,"login");

}

}

}