package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener {
    JButton b1, b2;
    String username;

    Rules(String username) {
        this.username = username;
        setBounds(500, 150, 600, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //welcome speech layout
        JLabel l1 = new JLabel("Welcome" + " " + username + " " + "to simple minds");
        l1.setBounds(90, 30, 700, 30);
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Viner Hand ITC", Font.BOLD, 29));
        add(l1);

//FOR THE RULES WE HAVE TO CREATE A NEW LAYOUAT
        JLabel l2 = new JLabel("Rules");
        l2.setBounds(60, 50, 300, 350);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setText(
                "<html>" +
                        "1.You have to attend all the questions" + "<br></br>" +
                        "2.Negative Marking is Allowable" + "<br></br>" +
                        "3.You have to attend all the questions" + "<br></br>" +
                        "4.Negative Marking is Allowable" + "<br></br>" +
                        "5.You have to attend all the questions" + "<br></br>" +
                        "6.Negative Marking is Allowable" + "<br></br>" +
                        "7.You have to attend all the questions" + "<br></br>" +
                        "8.Negative Marking is Allowable" + "<br></br>" +
                        "9.You have to attend all the questions" + "<br></br>" +
                        "10.Negative Marking is Allowable" + "<br></br>" +
                        "11.You have to attend all the questions" + "<br></br>" +
                        "12.Negative Marking is Allowable" + "<br></br>" +
                        "</html>"

        );
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(160, 370, 100, 30);
        b1.setForeground(Color.WHITE);
        //int Timer = 1000;
        b1.setBackground(new Color(30, 144, 255));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(310, 370, 100, 30);
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(30, 144, 255));
        b2.addActionListener(this);
        add(b2);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        } else if (ae.getSource() == b2) {
            new Quiz(username).setVisible(true);
        }
//        {
//            System.exit(0);
//        }
    }


    public static void main(String[] args) {
        new Rules("");

    }
}
