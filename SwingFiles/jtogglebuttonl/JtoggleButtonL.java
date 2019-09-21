/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtogglebuttonl;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author Shaon
 */
public class JtoggleButtonL extends JFrame implements ActionListener {
    private Container c;
    private JToggleButton tb;
    private JLabel label;
    private ImageIcon onImage,offImage;
    JtoggleButtonL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Toggle Button demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        onImage = new ImageIcon("src/images/1.png");
                offImage = new ImageIcon("src/images/2.png");

        tb = new JToggleButton(offImage);
       // tb = new JToggleButton("off");
        tb.setBounds(50, 50, 90, 90);
        c.add(tb);
        label = new JLabel("Hi there");
        label.setVisible(false);
        label.setBounds(50,150,150,50);
        c.add(label);
        
        tb.addActionListener(this);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JtoggleButtonL frame = new JtoggleButtonL();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(tb.isSelected()){
            tb.setIcon(onImage);
           // tb.setText("ON");
            label.setVisible(true);
        }
            else{
            tb.setIcon(offImage);
          //  tb.setText("off");
            label.setVisible(false);
        }
    }
    
}
