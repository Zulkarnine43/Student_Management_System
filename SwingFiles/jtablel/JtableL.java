/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtablel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Shaon
 */
public class JtableL extends JFrame {
    private Container c;
    private JLabel label;
    private Font f;
    private JTable table;
    private JScrollPane scroll;
    
    private String[] cols ={"Id","Name","gpa"};
    private String[][] rows = {
        {"101","zulkar","3.90"},
        {"102","faruqe","3.50"},
        {"103","sajedul","3.94"},
        {"104","abul","3.95"},
         {"101","zulkar","3.90"},
        {"102","faruqe","3.50"},
        {"103","sajedul","3.94"},
        {"104","abul","3.95"},
         {"101","zulkar","3.90"},
        {"102","faruqe","3.50"},
        {"103","sajedul","3.94"},
        {"104","abul","3.95"},
    };
     JtableL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,800,500);
        this.setTitle("JTabble  demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        f=new Font("Arial",Font.ITALIC,18);
        
        label = new JLabel("Student Details");
        label.setFont(f);
          label.setBounds(250,20,200,50);
          c.add(label);
          
          table = new JTable(rows,cols);
          table.setSelectionBackground(Color.pink);
          //table.setEnabled(false);
          scroll = new JScrollPane(table);
            scroll.setBounds(50,80,600,150);
            c.add(scroll);
          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JtableL frame = new JtableL();
        frame.setVisible(true);
    }
    
}
