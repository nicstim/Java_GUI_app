package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JButton b1 = new JButton("click me!");
    private JTextField txt = new JTextField(">>>>",15);
    private  JLabel label = new JLabel("Enter text:");

    public GUI(){
        super("Click me!");
        this.setBounds(100,100,640,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(txt);
        b1.addActionListener(new be());
        container.add(b1);
    }
    class be implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = txt.getText() + "\n" ;
            JOptionPane.showMessageDialog(null,message,"output",JOptionPane.PLAIN_MESSAGE);


        }
    }
}

