package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMinds extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField t1;

    SimpleMinds() {
        setBounds(200, 200, 1200, 500);
        //To design A BACKGROUND
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //To get Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("SimpleMinds/Icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 500);
        add(l1);

        //ADD J2 label TO WRITE QUIZ MINDS
        JLabel l2 = new JLabel("Simple Minds");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 40));
        //set a font color we have to use foregrounfd color
        //another method to print the color l2.setForeground(new Color(30,144,254));
        l2.setForeground(Color.BLUE);
        l2.setBounds(750, 60, 300, 45);
        add(l2);

        //ADD J3 label TO Enter A NAME
        JLabel l3 = new JLabel("Enter Your Name Here");
        l3.setFont(new Font("ROBOTO", Font.BOLD, 18));
        //set a font color we have to use foregrounfd color
        //another method to print the color l2.setForeground(new Color(30,144,254));
        l3.setForeground(Color.BLUE);
        l3.setBounds(780, 150, 300, 20);
        add(l3);

        t1 = new JTextField();
        t1.setBounds(735, 200, 300, 25);
        //t1.setForeground(Color.BLUE);
        t1.setFont(new Font("ROBOTO", Font.BOLD, 20));
        add(t1);

        //TO ADD A BUTTON FOR RULES
        b1 = new JButton("RULES");
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("ROBOTO", Font.BOLD, 18));
        b1.setBounds(735, 270, 120, 25);
        b1.addActionListener(this);
        add(b1);

        //TO ADD A  BUTTON FOR EXIT
        b2 = new JButton("EXIT");
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("ROBOTO", Font.BOLD, 18));
        b2.setBounds(915, 270, 120, 25);
        b2.addActionListener(this);
        add(b2);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //To know which button is clicked
        if (ae.getSource() == b1) {
            this.setVisible(false);
            String name = t1.getText();
            new Rules(name);
        } else {
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        new SimpleMinds();

    }
}
