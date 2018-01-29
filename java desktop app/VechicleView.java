import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class VechicleView extends JPanel implements ActionListener
{


JButton b1;
JLabel jbg,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,jl15;
ImageIcon ic1,ic2,ic3,ic4,ic5;

JLabel jl11,jl22,jl33,jl44,jl55,jl66,jl77,jl88,jl99;


Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null,st5=null,st6=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null;

VechicleView()
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

jl1=new JLabel("Vechicle:-");


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

jl11.setForeground(new Color(176,175,183));
jl11.setFont(new Font("Impact",Font.PLAIN,20));

jl22.setForeground(new Color(176,175,183));
jl22.setFont(new Font("Impact",Font.PLAIN,20));

jl33.setForeground(new Color(176,175,183));
jl33.setFont(new Font("Impact",Font.PLAIN,20));

jl44.setForeground(new Color(176,175,183));
jl44.setFont(new Font("Impact",Font.PLAIN,20));

jl55.setForeground(new Color(176,175,183));
jl55.setFont(new Font("Impact",Font.PLAIN,20));

jl66.setForeground(new Color(176,175,183));
jl66.setFont(new Font("Impact",Font.PLAIN,20));

jl77.setForeground(new Color(176,175,183));
jl77.setFont(new Font("Impact",Font.PLAIN,20));

jl88.setForeground(new Color(176,175,183));
jl88.setFont(new Font("Impact",Font.PLAIN,20));

jl99.setForeground(new Color(176,175,183));
jl99.setFont(new Font("Impact",Font.PLAIN,20));

jl11=new JLabel("");



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

jl11.setBounds(120,70,700,25);
jl22.setBounds(120,110,700,25);
jl33.setBounds(120,150,700,25);
jl44.setBounds(150,430,700,25);
jl55.setBounds(130,230,700,25);
jl66.setBounds(150,350,700,25);



b1.setBounds(490,700,150,40);



try
{
st1=con.createStatement();
rs1=st1.executeQuery("select * from cities");
while(rs1.next())
{
   
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






jbg.add(jl2);
jbg.add(jl3);
jbg.add(jl4);
jbg.add(jl6);
jbg.add(jl7);
jbg.add(jl8);
jbg.add(jl9);
jbg.add(jl11);
jbg.add(jl14);

jbg.add(jl11);
jbg.add(jl22);
jbg.add(jl33);
jbg.add(jl44);
jbg.add(jl55);
jbg.add(jl66);



b1.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{



}



}
