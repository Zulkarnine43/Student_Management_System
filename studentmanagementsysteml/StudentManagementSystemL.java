/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsysteml;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shaon
 */
public class StudentManagementSystemL extends JFrame implements ActionListener {
private Container c;
private JTable table;
private DefaultTableModel model;
private JScrollPane scroll;
private Font f;
private JLabel titleLabel,fnLabel,lnLabel,phoneLabel,gpaLabel;
   private JTextField fntf,lntf,phonetf,gpatf;
   private JButton addButton,updateButton,deleteButton,clearButton;
private String[] cols ={"First Name","Last name","Phone number","GPA"};
   private String[] rows =new String[4];

   
   
   StudentManagementSystemL(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(780,690);
        this.setLocationRelativeTo(null);
        this.setTitle("Student Table");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        f= new Font("Arial",Font.BOLD,16);
        
   titleLabel = new JLabel("Student registration");
   titleLabel.setFont(f);
   titleLabel.setBounds(140, 10, 250, 50);
   c.add(titleLabel);
   
   fnLabel = new JLabel("First Name");
   fnLabel.setFont(f);
   fnLabel.setBounds(10, 80, 140, 30);
   c.add(fnLabel);
   
   fntf= new JTextField();
   fntf.setBounds(110, 80, 200, 30);
   fntf.setFont(f);
   c.add(fntf);
   
   addButton= new JButton("Add");
   addButton.setBounds(400, 80, 100, 30);
   addButton.setFont(f);
   c.add(addButton);
   
   
   
   
   lnLabel = new JLabel("last Name");
   lnLabel.setFont(f);
   lnLabel.setBounds(10, 130, 140, 30);
   c.add(lnLabel);
   
   lntf= new JTextField();
   lntf.setBounds(110, 130, 200, 30);
   lntf.setFont(f);
   c.add(lntf);
   
   updateButton= new JButton("Update");
   updateButton.setBounds(400, 130, 100, 30);
   updateButton.setFont(f);
   c.add(updateButton);
   
   
   
    phoneLabel = new JLabel("Phone");
   phoneLabel.setFont(f);
   phoneLabel.setBounds(10, 180, 140, 30);
   c.add(phoneLabel);
   
   phonetf= new JTextField();
   phonetf.setBounds(110, 180, 200, 30);
   phonetf.setFont(f);
   c.add(phonetf);
   
   deleteButton= new JButton("Delete");
   deleteButton.setBounds(400, 180, 100, 30);
   deleteButton.setFont(f);
   c.add(deleteButton);
   
   
   
   
    gpaLabel = new JLabel("GPA");
   gpaLabel.setFont(f);
   gpaLabel.setBounds(10, 230, 140, 30);
   c.add(gpaLabel);
   
   gpatf= new JTextField();
   gpatf.setBounds(110, 230, 200, 30);
   gpatf.setFont(f);
   c.add(gpatf);
   
   clearButton= new JButton("Clear");
   clearButton.setBounds(400, 230, 100, 30);
   clearButton.setFont(f);
   c.add(clearButton);
   
   table = new JTable();
   model=new DefaultTableModel();
   model.setColumnIdentifiers(cols);
   table.setModel(model);
   table.setFont(f);
   table.setSelectionBackground(Color.green);
   table.setBackground(Color.white);
   table.setRowHeight(30);
   scroll= new JScrollPane(table);
   scroll.setBounds(10, 360, 740, 265);
   c.add(scroll);
   
   addButton.addActionListener(this);
    clearButton.addActionListener(this);
    deleteButton.addActionListener(this);
    updateButton.addActionListener(this);
    
    table.addMouseListener(new MouseAdapter(){
    public void mouseClicked(MouseEvent e){
        int numberOfRow = table.getSelectedRow();
        
    String f_name = model.getValueAt(numberOfRow, 0).toString();
    String l_name = model.getValueAt(numberOfRow, 1).toString();
    String phone = model.getValueAt(numberOfRow, 2).toString();
    String gpa = model.getValueAt(numberOfRow, 3).toString();
    
    fntf.setText(f_name);
    lntf.setText(l_name);
    phonetf.setText(phone);
    gpatf.setText(gpa);
    }
    
    
    });
   
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton){
            rows[0]=fntf.getText();
            rows[1]=lntf.getText();
            rows[2]=phonetf.getText();
            rows[3]=gpatf.getText();
            
            model.addRow(rows);
        }else if(e.getSource()==clearButton){
             fntf.setText("");
             lntf.setText("");
             phonetf.setText("");
             gpatf.setText("");
        }
        else if(e.getSource()==deleteButton){
            int numberOfRow=table.getSelectedRow();
            if(numberOfRow>=0){
                model.removeRow(numberOfRow);
            }
            else{
                JOptionPane.showMessageDialog(null,"no row has been selected or no row exist");
            }
        }
        else if(e.getSource()==updateButton){
            int numberOfRow =table.getSelectedRow();
      String f_name=  fntf.getText();
   String l_name= lntf.getText();
   String phone= phonetf.getText();
   String gpa=gpatf.getText();
   
   model.setValueAt(f_name, numberOfRow, 0);
    model.setValueAt(l_name, numberOfRow, 1);
     model.setValueAt(phone, numberOfRow, 2);
      model.setValueAt(gpa, numberOfRow, 3);
   
   
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         StudentManagementSystemL frame = new StudentManagementSystemL();
        frame.setVisible(true);
    }

  
}
