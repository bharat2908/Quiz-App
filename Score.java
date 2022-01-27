package SimpleMinds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    Score(String username, int score) {
        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("SimpleMinds/Icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);

        JLabel l2 = new JLabel("ThankYou" + "   " + username + "   "+ "For Playing ");
        l2.setBounds(300, 200, 400, 30);
        l2.setFont(new Font("Jokerman", Font.PLAIN, 26));
        add(l2);

        JLabel l3 = new JLabel("Your Score is" + " " + score);
        l3.setBounds(180, 55, 700, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);

        JButton b1 = new JButton("Play Again");
        b1.setBackground(Color.BLUE);
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        b1.setBounds(400, 270, 120, 30);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new SimpleMinds().setVisible(true);

    }

    public static void main(String[] args) {
        new Score("", 0).setVisible(true);
    }
}
