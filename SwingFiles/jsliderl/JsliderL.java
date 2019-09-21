/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsliderl;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

/**
 *
 * @author Shaon
 */
public class JsliderL extends JFrame {
    private Container c;
    private JSlider js;
     JsliderL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Toggle Button demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        
        js = new JSlider(0,20,0);
        js.setBounds(100,50,300,50);
        js.setMinorTickSpacing(1);
        js.setMajorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        c.add(js);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JsliderL frame = new JsliderL();
        frame.setVisible(true);
    }
    
}
