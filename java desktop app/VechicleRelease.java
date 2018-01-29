import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class VechicleRelease extends JPanel implements ItemListener,ActionListener
{
JButton b1;
JLabel jbg,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
ImageIcon ic1,ic2,ic3,ic4,ic5;
JPanel jp,jp1,jp2,jp3;
JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
Choice c1,c2,c3,c4;
CardLayout cl;
Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null,st5=null,st6=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null;

VechicleRelease()
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


ic1=new ImageIcon("bgblur.jpg");
ic2=new ImageIcon("submit.jpg");

jp=new JPanel();
add(jp);


jbg=new JLabel(ic1);
add(jbg);
jbg.setLayout(null);

jl1=new JLabel("Vechicle Release:-");


jl1.setForeground(new Color(176,175,183));
jl1.setFont(new Font("Impact",Font.PLAIN,30));


jbg.add(jl1);


jl6=new JLabel("Vechicle no:");
jl7=new JLabel("City:");
jl8=new JLabel("State:");




jl6.setForeground(new Color(176,175,183));
jl6.setFont(new Font("Impact",Font.PLAIN,20));

jl7.setForeground(new Color(176,175,183));
jl7.setFont(new Font("Impact",Font.PLAIN,20));

jl8.setForeground(new Color(176,175,183));
jl8.setFont(new Font("Impact",Font.PLAIN,20));





jt5=new JTextField(60);



c1=new Choice();
c2=new Choice();




jl1.setBounds(490,0,300,70);

jl6.setBounds(10,210,100,70);
jl7.setBounds(10,250,100,70);
jl8.setBounds(10,290,100,70);




b1=new JButton(ic2);


jt5.setBounds(130,230,700,25);



c1.setBounds(120,270,200,25);
c2.setBounds(160,310,300,25);


b1.setBounds(490,700,150,40);



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




c1.addItemListener(this);
c2.addItemListener(this);




jbg.add(jl6);
jbg.add(jl7);
jbg.add(jl8);


jbg.add(jt5);

jbg.add(c1);
jbg.add(c2);

jbg.add(b1);


b1.addActionListener(this);

jp1=new ViewVechicle();
jp2=new InvalidEntry();


cl=new CardLayout();
jp.setLayout(cl);

jp.add(jp1,"viewvechicle");
jp.add(jp2,"invalid");


jp.setVisible(false);


}

public void actionPerformed(ActionEvent ae)
{

String vechicle_no=jt5.getText();
String city=c1.getSelectedItem();
String state=c2.getSelectedItem();



try
{
st6=con.createStatement();
rs6=st6.executeQuery("select * from vechicle_seize where vechicle_no='"+vechicle_no+"'");

jbg.setVisible(false); 
b1.setVisible(false);
jp.setVisible(true);

if(rs6.next())
 { 
  cl.show(jp,"viewvechicle");
 }
else
  cl.show(jp,"invalid");
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




public void itemStateChanged(ItemEvent ie)
{
Choice ob2=(Choice)ie.getSource();


}

}
