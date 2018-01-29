import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class VechicleSeize extends JPanel implements ItemListener,ActionListener
{
JButton b1;
JLabel jbg,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
ImageIcon ic1,ic2,ic3,ic4,ic5;

JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
Choice c1,c2,c3,c4;

Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null,st5=null,st6=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null;

VechicleSeize()
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



jbg=new JLabel(ic1);
add(jbg);
jbg.setLayout(null);

jl1=new JLabel("Vechicle Seize:-");


jl1.setForeground(new Color(176,175,183));
jl1.setFont(new Font("Impact",Font.PLAIN,30));


jbg.add(jl1);

jl2=new JLabel("Person Name:");
jl3=new JLabel("Mob no:");
jl4=new JLabel("Address:");
jl6=new JLabel("Vechicle no:");
jl7=new JLabel("City:");
jl8=new JLabel("State:");
jl9=new JLabel("Seize area:");
jl11=new JLabel("Seize Amount:");
jl14=new JLabel("Control room:");



jl2.setForeground(new Color(176,175,183));
jl2.setFont(new Font("Impact",Font.PLAIN,20));

jl3.setForeground(new Color(176,175,183));
jl3.setFont(new Font("Impact",Font.PLAIN,20));

jl4.setForeground(new Color(176,175,183));
jl4.setFont(new Font("Impact",Font.PLAIN,20));


jl6.setForeground(new Color(176,175,183));
jl6.setFont(new Font("Impact",Font.PLAIN,20));

jl7.setForeground(new Color(176,175,183));
jl7.setFont(new Font("Impact",Font.PLAIN,20));

jl8.setForeground(new Color(176,175,183));
jl8.setFont(new Font("Impact",Font.PLAIN,20));

jl9.setForeground(new Color(176,175,183));
jl9.setFont(new Font("Impact",Font.PLAIN,20));



jl11.setForeground(new Color(176,175,183));
jl11.setFont(new Font("Impact",Font.PLAIN,20));


jl14.setForeground(new Color(176,175,183));
jl14.setFont(new Font("Impact",Font.PLAIN,20));



jt1=new JTextField(60); 
jt2=new JTextField(60);
jt3=new JTextField(60);
jt4=new JTextField(60);
jt5=new JTextField(60);
jt6=new JTextField(60);


c1=new Choice();
c2=new Choice();
c4=new Choice();



jl1.setBounds(490,0,300,70);
jl2.setBounds(10,50,300,70);
jl3.setBounds(10,90,300,70);
jl4.setBounds(10,130,100,70);
jl6.setBounds(10,210,100,70);
jl7.setBounds(10,250,100,70);
jl8.setBounds(10,290,100,70);
jl9.setBounds(10,330,130,70);
jl11.setBounds(10,410,130,70);
jl14.setBounds(10,530,160,70);



b1=new JButton(ic2);

jt1.setBounds(120,70,700,25);
jt2.setBounds(120,110,700,25);
jt3.setBounds(120,150,700,25);
jt4.setBounds(150,430,700,25);
jt5.setBounds(130,230,700,25);
jt6.setBounds(150,350,700,25);


c1.setBounds(120,270,200,25);
c2.setBounds(160,310,300,25);
c4.setBounds(220,555,300,25);

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
c4.addItemListener(this);




jbg.add(jl2);
jbg.add(jl3);
jbg.add(jl4);
jbg.add(jl6);
jbg.add(jl7);
jbg.add(jl8);
jbg.add(jl9);
jbg.add(jl11);
jbg.add(jl14);

jbg.add(jt1);
jbg.add(jt2);
jbg.add(jt3);
jbg.add(jt4);
jbg.add(jt5);
jbg.add(jt6);

jbg.add(c1);
jbg.add(c2);
jbg.add(c4);
jbg.add(b1);


b1.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{
String name=jt1.getText();
String mobno=jt2.getText();
String address=jt3.getText();
String amount=jt4.getText();
String vechicle_no=jt5.getText();
String city=c1.getSelectedItem();
String state=c2.getSelectedItem();
String area=jt6.getText();
String control_room=c4.getSelectedItem();


Date date=new Date();
String current_date=date.toString();

try
{
st6=con.createStatement();
st6.executeUpdate("insert into vechicle_seize values('"+name+"','"+mobno+"','"+address+"','"+vechicle_no+"','"+city+"','"+state+"','"+area+"','"+amount+"','"+control_room+"','"+current_date+"')");

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
if(ob2==c2 || ob2==c1)
{
c4.removeAll();

try
{
st5=con.createStatement();
rs5=st5.executeQuery("select * from controlrooms where city='"+c1.getSelectedItem()+"' and state='"+c2.getSelectedItem()+"'");
while(rs5.next())
{
 String room=rs5.getString(1);
  c4.add(room);
  
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

}

}
