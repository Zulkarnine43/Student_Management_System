
package jcolorchuserl;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
public class JColorchuserL extends JFrame {
    private Container c;
    private JButton button;
    JColorchuserL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Jtabbed Pane demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        button = new JButton("choose a colour");
        button.setBounds(100,50,150,50);
        c.add(button);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            Color color = JColorChooser.showDialog(null,"select a color",Color.YELLOW);
            c.setBackground(color);
            }
            
            
            
            
        });
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JColorchuserL frame = new JColorchuserL();
        frame.setVisible(true);
    }
    
}
