/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspinnerl;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Shaon
 */
public class JspinnerL extends JFrame implements ChangeListener {
    private Container c;
    private JSpinner spinner;
    private JLabel label;
    JspinnerL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,350);
        this.setTitle("slider proect demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        SpinnerNumberModel value = new SpinnerNumberModel(0,0,30,1);
        
        spinner = new JSpinner(value);
        spinner.setBounds(100,100,70,50);
        c.add(spinner);
        
        label = new JLabel("Current Value : 0");
        label.setBounds(100,200,150,50);
        c.add(label);
        spinner.addChangeListener(this);
    }
 @Override
    public void stateChanged(ChangeEvent e) {
        String number=spinner.getValue().toString();
      int value = Integer.parseInt(number);
      label.setText("Current value:"+value);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JspinnerL frame = new JspinnerL();
        frame.setVisible(true);
    }

   
    
}
