/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtabbedpanel;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Shaon
 */
public class JTabbedPaneL extends JFrame {
    private Container c;
    private JTabbedPane jpane;
    private JPanel panel1,panel2,panel3;
    private JLabel label1,label2,label3;
    private ImageIcon icon1,icon2;
JTabbedPaneL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Jtabbed Pane demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        jpane = new JTabbedPane();
       // jpane = new JTabbedPane(JTabbedPane.BOTTOM);
        //jpane.setTabPlacement(JTabbedPane.BOTTOM);
        jpane.setBounds(50,50,300,300);
        c.add(jpane);
     
        label1=new JLabel("This is label 1");
         label2=new JLabel("This is label 2");
          label3=new JLabel("This is label 3");
        
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.red);
        panel2 = new JPanel();
         panel2.add(label2);
        panel2.setBackground(Color.green);
        panel3 = new JPanel();
         panel3.add(label3);
        panel3.setBackground(Color.blue);
        
        
        
        
         icon1=new ImageIcon("src/icon/1.png");
         icon2=new ImageIcon("src/icon/2.png");
         
         jpane.addTab("Home",icon1,panel1,"hello i am panel tab");
       // jpane.addTab("Home",icon1,panel1);
        jpane.addTab("help",icon2,panel2);
        jpane.addTab("edit", panel3);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JTabbedPaneL frame = new JTabbedPaneL();
        frame.setVisible(true);
    }
    
}
