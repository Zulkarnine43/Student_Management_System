/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmenul;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author Shaon
 */
public class JMenuL extends JFrame implements ActionListener {
    private Container c;
    private ImageIcon icon,icon2;
    private JMenuBar menu;
    private JMenu file,edit,help;
    private JMenuItem newItem,openItem,cutItem,exitItem,copyItem,pasteItem,selectAllItem;
 JMenuL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("menu demo");
        icon = new ImageIcon("src/image/1.png");
       icon2 = new ImageIcon("src/image/1.png");
        
        menu = new JMenuBar();
        this.setJMenuBar(menu);
        
        file = new JMenu("file");
        edit = new JMenu("edit");
        help = new JMenu("help");
        menu.add(file);
         menu.add(edit);
          menu.add(help);
          
          
          
          newItem = new JMenuItem("new");
          newItem.setIcon(icon2);
          newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
          openItem = new JMenuItem("open");
          copyItem = new JMenuItem("copy");
          exitItem = new JMenuItem("exit");
          pasteItem = new JMenuItem("paste");
          cutItem = new JMenuItem("cut");
          cutItem.setIcon(icon);
          selectAllItem = new JMenuItem("selectAll");
          
          
          file.add(newItem);
          file.add(openItem);
          file.add(exitItem);
         
          edit.add(copyItem);
          edit.add(cutItem);
          edit.addSeparator();
          edit.add(pasteItem);
          
          newItem.addActionListener(this);
          exitItem.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==newItem){
            JFrame Nframe = new JFrame();
            Nframe.setVisible(true);
            Nframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           Nframe.setBounds(300,100,600,500);
           Nframe.setTitle("New frame");
        
        }
        else if(e.getSource()==exitItem){
            System.exit(0);
        }
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JMenuL frame = new JMenuL();
        frame.setVisible(true);
    }

   
    
}
