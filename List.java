import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class List extends JFrame
{
    JTextField textField = new JTextField(15);
    JButton b1 = new JButton("Add");

    JButton b2 = new JButton("Delete");
    public List() {
            setSize (400, 400);
            setBackground(Color.PINK);
            setDefaultCloseOperation (EXIT_ON_CLOSE);
            setLocationRelativeTo (null);
            setVisible (true);

        setLayout (new GridLayout(1,2));

            JList list=new JList();
            JPanel panel= new JPanel();
            add(panel);
            panel.add(new JScrollPane(list));


        DefaultListModel model = new DefaultListModel();
        model.addElement ("Mobile");
        model.addElement ("Laptop");
        model.addElement("Accessories");
        list.setModel (model);
        revalidate();

        JPanel panel2=new JPanel();
        add (panel2);
        panel2.add(textField);
        panel2.add(b1);
        panel2.add(b2);
        revalidate();

        b1.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (!textField.getText().toString().isEmpty()) {
                    String item = textField.getText().toString();
                    model.addElement(item);
                }
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                if (!textField.getText().toString().isEmpty()) {
                    String item = textField.getText().toString();
                    model.removeElement(item);
                }
            }
            });

        }
    public static void main(String[] args)
    {
        new List();
    }
}