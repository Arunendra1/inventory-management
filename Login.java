import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login extends JFrame implements ActionListener   {
    Login()
    {
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("Image2.jpg"));    //to add image from path
        Image i5 = i4.getImage().getScaledInstance(1100, 550, Image.SCALE_DEFAULT);     //to scale image using function of ImageIcon
        ImageIcon i6 = new ImageIcon(i5);   //again changing the image to image icon
        JLabel image = new JLabel(i6);      //we cannot add image so we use JLabel
        image.setBounds(0,0,800,450);   //where to add image in frame
        add(image);
        JLabel lusername = new JLabel("Username");
        lusername.setBounds(40,20,100,30);
        image.add(lusername);
        JTextField tusername = new JTextField();
        tusername.setBounds(150,20,150,30);
        image.add(tusername);
        JLabel lpassword = new JLabel("Password");
        lpassword.setBounds(40,70,100,30);
        image.add(lpassword);
        JTextField tpassword = new JTextField();
        tpassword.setBounds(150,70,150,30);
        image.add(tpassword);
        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.PINK);
        login.setForeground(Color.WHITE);
        login.addActionListener((ActionListener) this);  //to go login page
        image.add(login);
        setSize(600,400);
        setLocation(450,200);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) //we override action listner outside constructor
    {
        setVisible(false);  //to stop first page
        new Home();
    }
    public static void main(String[] args)

    {
     new Login();
    }
}