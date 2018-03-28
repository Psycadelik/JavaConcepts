
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 90237
 */
public class Admin extends JFrame implements ActionListener{
    private JLabel lblMessage;
    private JTextField txtName;
    private JButton btnRegister;
    
    //jdbc user name and database url 
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/dbBooks";
    static final String USER = "root";
    static final String Password = "";
    
            
    public Admin()
    {
        super("Register user");
        setLayout(new FlowLayout());
        
        lblMessage = new JLabel("Library Management System - Admin Login");
        add(lblMessage);
        txtName = new JTextField(15);
        add(txtName);
        btnRegister = new JButton("Send");
        btnRegister.addActionListener(this);
        add(btnRegister);       
        
    }
    
    public static void main(String args[])
    {
        Admin LibAdmin = new Admin();
        LibAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LibAdmin.setSize(300,400);
        LibAdmin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hello Administrator");
    }
}
