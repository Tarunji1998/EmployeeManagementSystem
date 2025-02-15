package empmanagementsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
 
    JTextField tfusername, tfpassword;
    
    
    Login(){ 
        
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
        
               JLabel lbusername = new JLabel("username");
		lbusername.setBounds(40, 20, 100, 30);
		add(lbusername);
                
                tfusername = new JTextField();
		tfusername.setBounds(150, 20, 150, 30);
		add(tfusername);
                
                JLabel lbpassword = new JLabel("password");
                lbpassword.setBounds(40,70,100,30);
                add(lbpassword);
                
                tfpassword = new JTextField();
		tfpassword.setBounds(150, 70, 150, 30);
		add(tfpassword);
               
                
                JButton login = new JButton("Login");
		login.setBounds(150, 140, 150, 30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
                login.addActionListener(this);
		add(login); 
                
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/vector.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350, 0, 200, 200);
		add(image);
                 
                            
               setSize(600, 300);
		setLocation(450, 200);
		setVisible(true);
    }
            
    @Override
    public void actionPerformed(ActionEvent ae){
         try{
             String username = tfusername.getText();
             String password = tfpassword.getText();
             
             Conn c = new Conn();
             
             String query = "select * from login where username = '"+username+"' and password ='"+password+"' ";
             
             ResultSet rs = c.s.executeQuery(query);

			if (rs.next()) {
				setVisible(false);
                                new Home();
                                
			} else {
				JOptionPane.showMessageDialog(null, "Invalid!! username or password");
				setVisible(false);
			}
             
         }catch(Exception e){
             e.printStackTrace();
         }
    }
    
            
    public static void main (String[] args){
        new Login();
        
    }
    
}
