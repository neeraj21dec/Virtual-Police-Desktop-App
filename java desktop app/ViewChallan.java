import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class ViewChallan extends JPanel implements ActionListener
{
JButton b1;
JLabel jbg,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
ImageIcon ic1,ic2,ic3,ic4,ic5;

JLabel jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8;
JLabel c1,c2,c3,c4;



Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null,st5=null,st6=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null;

String name,mobno,address,father_name,vechicle_no,city,state,area,type,amount,licno,police_name,control_room;


ViewChallan()
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


try
{
st3=con.createStatement();
rs3=st3.executeQuery("select * from challans");
rs3.last();

name=rs3.getString(1);
mobno=rs3.getString(2);
address=rs3.getString(3);
father_name=rs3.getString(4);
vechicle_no=rs3.getString(5);
city=rs3.getString(6);
state=rs3.getString(7);
area=rs3.getString(8);
type=rs3.getString(9);
amount=rs3.getString(10);
licno=rs3.getString(11);
police_name=rs3.getString(12);
control_room=rs3.getString(13);
}

catch(SQLException e3)
 {
 System.out.println(e3);
 }
catch(Exception e4)
 {
 System.out.println(e4);
 }


ic1=new ImageIcon("bgblur.jpg");
ic2=new ImageIcon("submit.jpg");



jbg=new JLabel(ic1);
add(jbg);
jbg.setLayout(null);

jl1=new JLabel("Challan:-");


jl1.setForeground(new Color(176,175,183));
jl1.setFont(new Font("Impact",Font.PLAIN,30));


jbg.add(jl1);

jl2=new JLabel("Name:");
jl3=new JLabel("Mob no:");
jl4=new JLabel("Address:");
jl5=new JLabel("Father's name:");
jl6=new JLabel("Vechicle no:");
jl7=new JLabel("City:");
jl8=new JLabel("State:");
jl9=new JLabel("Challan area:");
jl10=new JLabel("Challan type:");
jl11=new JLabel("Challan Amount:");
jl12=new JLabel("Licence no  (if have):");
jl13=new JLabel("Police name:");
jl14=new JLabel("Control room:");

jl15=new JLabel("");

jl2.setForeground(new Color(176,175,183));
jl2.setFont(new Font("Impact",Font.PLAIN,20));

jl3.setForeground(new Color(176,175,183));
jl3.setFont(new Font("Impact",Font.PLAIN,20));

jl4.setForeground(new Color(176,175,183));
jl4.setFont(new Font("Impact",Font.PLAIN,20));

jl5.setForeground(new Color(176,175,183));
jl5.setFont(new Font("Impact",Font.PLAIN,20));

jl6.setForeground(new Color(176,175,183));
jl6.setFont(new Font("Impact",Font.PLAIN,20));

jl7.setForeground(new Color(176,175,183));
jl7.setFont(new Font("Impact",Font.PLAIN,20));

jl8.setForeground(new Color(176,175,183));
jl8.setFont(new Font("Impact",Font.PLAIN,20));

jl9.setForeground(new Color(176,175,183));
jl9.setFont(new Font("Impact",Font.PLAIN,20));

jl10.setForeground(new Color(176,175,183));
jl10.setFont(new Font("Impact",Font.PLAIN,20));

jl11.setForeground(new Color(176,175,183));
jl11.setFont(new Font("Impact",Font.PLAIN,20));

jl12.setForeground(new Color(176,175,183));
jl12.setFont(new Font("Impact",Font.PLAIN,20));

jl13.setForeground(new Color(176,175,183));
jl13.setFont(new Font("Impact",Font.PLAIN,20));

jl14.setForeground(new Color(176,175,183));
jl14.setFont(new Font("Impact",Font.PLAIN,20));

jl15.setForeground(Color.white);
jl15.setFont(new Font("Impact",Font.PLAIN,20));

jt1=new JLabel(name); 
jt2=new JLabel(mobno);
jt3=new JLabel(address);
jt4=new JLabel(father_name);
jt5=new JLabel(vechicle_no);
jt6=new JLabel(area);
jt7=new JLabel(licno);
jt8=new JLabel(police_name);
jl15=new JLabel(amount);

c1=new JLabel(city);
c2=new JLabel(state);
c3=new JLabel(type);
c4=new JLabel(control_room);


jt1.setForeground(Color.white);
jt2.setForeground(Color.white);
jt3.setForeground(Color.white);
jt4.setForeground(Color.white);
jt5.setForeground(Color.white);
jt6.setForeground(Color.white);
jt7.setForeground(Color.white);
jt8.setForeground(Color.white);
jl15.setForeground(Color.white);

c1.setForeground(Color.white);
c2.setForeground(Color.white);
c3.setForeground(Color.white);
c4.setForeground(Color.white);

jl1.setBounds(490,0,300,70);
jl2.setBounds(10,50,300,70);
jl3.setBounds(10,90,300,70);
jl4.setBounds(10,130,100,70);
jl5.setBounds(10,170,150,70);
jl6.setBounds(10,210,100,70);
jl7.setBounds(10,250,100,70);
jl8.setBounds(10,290,100,70);
jl9.setBounds(10,330,130,70);
jl10.setBounds(10,370,130,70);
jl11.setBounds(10,410,130,70);
jl12.setBounds(10,450,300,70);
jl13.setBounds(10,490,150,70);
jl14.setBounds(10,530,160,70);

jl15.setBounds(230,410,300,70);

b1=new JButton("Print");

jt1.setBounds(120,70,700,25);
jt2.setBounds(120,110,700,25);
jt3.setBounds(120,150,700,25);
jt4.setBounds(180,190,700,25);
jt5.setBounds(130,230,700,25);
jt6.setBounds(150,350,700,25);
jt7.setBounds(180,470,700,25);
jt8.setBounds(130,510,700,25);

c1.setBounds(120,270,200,25);
c2.setBounds(160,310,300,25);
c3.setBounds(220,390,300,25);
c4.setBounds(220,555,300,25);

b1.setBounds(490,700,150,40);













jbg.add(jl2);
jbg.add(jl3);
jbg.add(jl4);
jbg.add(jl5);
jbg.add(jl6);
jbg.add(jl7);
jbg.add(jl8);
jbg.add(jl9);
jbg.add(jl10);
jbg.add(jl11);
jbg.add(jl12);
jbg.add(jl13);
jbg.add(jl14);
jbg.add(jt1);
jbg.add(jt2);
jbg.add(jt3);
jbg.add(jt4);
jbg.add(jt5);
jbg.add(jt6);
jbg.add(jt7);
jbg.add(jt8);
jbg.add(c1);
jbg.add(c2);
jbg.add(c3);
jbg.add(c4);
jbg.add(b1);
jbg.add(jl15);




b1.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{

}







}
