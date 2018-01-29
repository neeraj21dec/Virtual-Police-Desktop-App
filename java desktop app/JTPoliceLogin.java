import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.Color;

class JTPoliceLogin extends JPanel implements ActionListener
{
JButton b1;
JLabel jl,jl1,jl2,jbg,jlg,jinvalid;
ImageIcon ic1,ic2,ic3;
JTextField jt1,jt2;

JPanel pl,jp,jp1;
CardLayout cl;

Connection con=null;
Statement st1=null,st2=null,st3=null,st4=null,st5=null,st6=null;
ResultSet rs1=null,rs2=null,rs3=null,rs4=null,rs5=null,rs6=null;

JTPoliceLogin()
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
ic3=new ImageIcon("login.jpg");

jbg=new JLabel(ic1);

GridBagLayout gbl=new GridBagLayout();
jbg.setLayout(gbl);

GridBagConstraints gbc = new GridBagConstraints();  

add(jbg);

gbc.fill = GridBagConstraints.HORIZONTAL;
gbc.gridx=0;
gbc.gridy=0;

jl=new JLabel("Traffic Police Login :-");
jl.setForeground(new Color(176,175,183));
jl.setFont(new Font("Impact",Font.PLAIN,30));
gbc.insets = new Insets(-450, 40, 0, 0);
jbg.add(jl,gbc);

gbc.anchor = GridBagConstraints.CENTER;
gbc.weighty=0;
gbc.gridx=0;
gbc.gridy=1;

gbc.insets = new Insets(80, 0, 0, 0);
jl1=new JLabel("Mobile");
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
jl2=new JLabel("Password");
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

gbc.gridx=1;
gbc.gridy=3; 
b1=new JButton(ic3);
b1.setPreferredSize(new Dimension(100,40));
jbg.add(b1,gbc);

gbc.gridx=1;
gbc.gridy=4; 
jinvalid=new JLabel("");
jinvalid.setForeground(Color.WHITE);
jinvalid.setPreferredSize(new Dimension(100,20));
jinvalid.setFont(new Font("Serif",Font.PLAIN,20));
jbg.add(jinvalid,gbc);


jp=new JPanel();
cl=new CardLayout();
jp.setLayout(cl);
add(jp);

jp.setVisible(false);

jp1=new JTPoliceLogin2();

jp.add(jp1,"login");


b1.addActionListener(this);


}

public void actionPerformed(ActionEvent ae)
{
String mobile=jt1.getText();
String pwd=jt2.getText();


try
{
st1=con.createStatement();
rs1=st1.executeQuery("select * from tpprofile where mobno='"+mobile+"' and pwd='"+pwd+"'");
if(rs1.next())
{
jbg.setVisible(false);
b1.setVisible(false);
jp.setVisible(true);
  
}

else
{
jinvalid.setText("invalid");
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


