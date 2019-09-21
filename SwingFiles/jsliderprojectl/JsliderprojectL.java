/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsliderprojectl;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Shaon
 */
public class JsliderprojectL extends JFrame implements ChangeListener{
 private Container c;
    private JSlider slider1,slider2,slider3;
    private JLabel red,green,blue,preview;
    private JTextField redtf,greentf,bluetf;
    private JPanel panel;
     JsliderprojectL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,350);
        this.setTitle("slider proect demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        red = new JLabel("Red");
        red.setBounds(50,50,80,50);
        c.add(red);
        
        slider1 = new JSlider(0,255,0);
        slider1.setBounds(90,50,300,50);
        c.add(slider1);
        
        redtf= new JTextField();
        redtf.setBounds(400, 50, 80, 40);
        c.add(redtf);
        
        
         green = new JLabel("green");
        green.setBounds(50,110,80,50);
        c.add(green);
        
        slider2 = new JSlider(0,255,0);
        slider2.setBounds(90,110,300,50);
        c.add(slider2);
        
        greentf= new JTextField();
        greentf.setBounds(400, 110, 80, 40);
        c.add(greentf);
        
        
         blue = new JLabel("blue");
        blue.setBounds(50,170,80,50);
        c.add(blue);
        
        slider3 = new JSlider(0,255,0);
        slider3.setBounds(90,170,300,50);
        c.add(slider3);
        
        bluetf= new JTextField();
        bluetf.setBounds(400, 170, 80, 40);
        c.add(bluetf);
        
        
        panel = new JPanel();
        panel.setBackground(Color.white);
        panel.setBounds(550,50,200,160);
        c.add(panel);
        
        preview = new JLabel("preview");
        preview.setBounds(630,200,100,50);
        c.add(preview);
        slider1.addChangeListener(this);
        slider2.addChangeListener(this);
        slider3.addChangeListener(this);
    
    }
      @Override
    public void stateChanged(ChangeEvent e) {
        int redValue =slider1.getValue();
         int greenValue =slider2.getValue();
          int blueValue =slider3.getValue();
          
          redtf.setText(" "+redValue);
          greentf.setText(" "+greenValue);
          bluetf.setText(" "+blueValue);
          
          
          Color color = new Color(redValue,greenValue,blueValue);
        panel.setBackground(color);
    }

    public static void main(String[] args) {
        // TODO code application logic here
         JsliderprojectL frame = new JsliderprojectL();
        frame.setVisible(true);
    }

  
}
