import javax.swing.*;
import java.awt.*;

public class Home extends JFrame {
    Home() {
        setLayout(null);    //to make our own layout not default layout


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Image5.jpg"));    //to add image from path
        Image i2 = i1.getImage().getScaledInstance(1100, 550, Image.SCALE_DEFAULT);     //to scale image using function of ImageIcon
        ImageIcon i3 = new ImageIcon(i2);   //again changing the image to image icon
        JLabel image = new JLabel(i3);      //we cannot add image so we use JLabel
        image.setBounds(0,0,1150,600);   //where to add image in frame
        add(image);

        JLabel heading = new JLabel("Home"); //creating object for heading
        heading.setBounds(55,30,1200,60);   //where heading is visible on screen
        heading.setFont(new Font("serif",Font.PLAIN,60));   //setting font
        heading.setForeground(Color.RED);  //setting font color
        image.add(heading);   //to make heading visible

        JButton Home1 = new JButton("Goods Arriving");
        Home1.setBounds(60,140,150,30);
        Home1.setBackground(Color.YELLOW);
        Home1.setForeground(Color.BLUE);
        image.add(Home1);

        JButton Home2 = new JButton("Goods distributing");
        Home2.setBounds(60,180,150,30);
        Home2.setBackground(Color.YELLOW);
        Home2.setForeground(Color.BLUE);
        image.add(Home2);

        JButton Home3 = new JButton("Goods in Stock");
        Home3.setBounds(60,220,150,30);
        Home3.setBackground(Color.YELLOW);
        Home3.setForeground(Color.BLUE);
        image.add(Home3);

        setSize(1150,620);  //create frame
        setLocation(200,50);  //where frame opens in screen
        setVisible(true);   //to make frame visible
}
    public static void main(String[] args)

    {
        new Home();
    }
}