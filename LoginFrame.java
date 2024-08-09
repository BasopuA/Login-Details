/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Alex
 */
public class LoginFrame extends JFrame
{
    private JPanel usernamePnel;
    private JPanel paswordPnel;
    private JPanel buttonPnel;
    private JPanel mainPanel;
    
    private JLabel loginLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    
    private JPasswordField passwordField;
    private JTextField usernameField;
    
    private JButton submit;
    private JButton clear;
    private JButton exit;
   
    public LoginFrame()
    {
        setSize(300, 300);
        setTitle("Login page");
        setLayout(new FlowLayout());
        
        usernamePnel = new JPanel();
        paswordPnel = new JPanel();
        buttonPnel = new JPanel(new FlowLayout());
        mainPanel = new JPanel(new BorderLayout());
        loginLabel = new JLabel("Login");
        loginLabel.setFont(new Font(Font.SANS_SERIF,Font.BOLD+Font.ITALIC,20));
        loginLabel.setForeground(Color.red);
        loginLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        usernameLabel = new JLabel("Username: ");
        passwordLabel = new JLabel("Password: ");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        submit = new JButton("Submit");
        clear  = new JButton("Clear");
        exit = new JButton("Exit");
        
        submit.addActionListener(new MyButtonActions());
        clear.addActionListener(new MyButtonActions());
        exit.addActionListener(new MyButtonActions());
        
        usernamePnel.add(usernameLabel);
        usernamePnel.add(usernameField);
        paswordPnel.add(passwordLabel);
        paswordPnel.add(passwordField);
        buttonPnel.add(submit);
        buttonPnel.add(clear);
        buttonPnel.add(exit);
        
        
        
        mainPanel.add(usernamePnel, BorderLayout.NORTH);
        mainPanel.add(paswordPnel,BorderLayout.SOUTH);
        mainPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Login details"));
        
        
        add(loginLabel);
        add(mainPanel);
        add(buttonPnel);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private class MyButtonActions implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == submit)
            {
                String username = usernameField.getText();
                String passwo  = passwordField.toString();
                
                JOptionPane.showMessageDialog(LoginFrame.this, "Username: "+username+"\n Password: "+ passwo);
            }
            else if(e.getSource() == clear)
            {
                usernameField.setText("");
                passwordField.setText("");
            }
            else if(e.getSource() == exit)
            {
                System.exit(0);
            }
            
        }
        
    }
    
    
}
