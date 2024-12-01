package empmanagementsystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Splash extends JFrame implements ActionListener{
     
    Splash(){
        
        getContentPane().setBackground(Color.WHITE);
		setLayout(null);
                
         JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
		heading.setBounds(240, 10, 1200, 60);
		heading.setFont(new Font("serif", Font.PLAIN, 40));
		heading.setForeground(Color.red);
		add(heading);
    
                ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/office1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(20, 90, 1130, 500);
		add(image);
                
                JButton clickhere = new JButton("Click here to continue");
		clickhere.setBounds(500, 200, 100, 60);
		clickhere.setBackground(Color.black);
		clickhere.setForeground(Color.white);
                clickhere.addActionListener(this);
		image.add(clickhere);
                
                setSize(1170,650);
                setLocation(200,50);
                setVisible(true);
         
                while(true){
                     
                    heading.setVisible(false);
                    
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){
                        
                    }
                    
                    heading.setVisible(true);
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){
                        
                    }
                }
        

	}
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
        
    }
    
    
    public static void main(String[] args){
          new Splash(); 
    }
    
}
