import javax.swing.*;   //external package
import java.awt.*;
import java.awt.event.*;
public class Slide1 extends JFrame implements ActionListener {
    Slide1(){
        setLayout(null);    //to make our own layout not default layot
        JLabel heading = new JLabel("INVENTORY MANAGEMENT SYSTEM"); //creating object for heading
        heading.setBounds(55,30,1200,60);   //where heading is visible on screen
        heading.setFont(new Font("sarif",Font.PLAIN,60));   //setting font
        heading.setForeground(Color.BLUE);  //setting font color
        add(heading);   //to make heading visible
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Image1.jpg"));    //to add image from path
        Image i2 = i1.getImage().getScaledInstance(1100, 550, Image.SCALE_DEFAULT);     //to scale image using function of ImageIcon
        ImageIcon i3 = new ImageIcon(i2);   //again changing the image to image icon
        JLabel image = new JLabel(i3);      //we cannot add image so we use JLabel
        image.setBounds(50,100,1050,500);   //where to add image in frame
        add(image);
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLUE);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);  //to go login page
        image.add(clickhere);
        setSize(1170,650);  //create frame
        setLocation(200,50);  //where frame opens in screen
        setVisible(true);   //to make frame visible
        // while(true){    //for setting blink button
        //     heading.setVisible(false);
        //     try{
        //         Thread.sleep(500);
        //     } catch (Exception e){
        // }
    
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            } catch (Exception e){
            }
            }
    
    public void actionPerformed(ActionEvent ae) //we override action listner outside constructor
    {
        setVisible(false);  //to stop first page
        new Login();
    }
    public static void main(String args[])
    {
        new Slide1();   //object without variable to call default constructor
    }
}