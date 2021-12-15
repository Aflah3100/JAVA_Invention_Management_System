package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class JuryMemberLogin{
    public JuryMemberLogin(){

        JFrame loginWindow = new JFrame("Jury Member Login");
        loginWindow.setSize(400,500);
        loginWindow.getContentPane().setBackground(Color.DARK_GRAY);
        loginWindow.setVisible(true);
        loginWindow.setLayout(null);
        loginWindow.setResizable(false);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel heading1=new JLabel("INVENTION MANAGEMENT SYSTEM");
        heading1.setForeground(Color.WHITE);
        heading1.setFont(new Font("Serif", Font.BOLD, 19));
        heading1.setBounds(20,-30,400,100);
        loginWindow.add(heading1);

        JLabel heading2=new JLabel("Jury Member Login ");
        heading2.setForeground(new Color(32,178,170));
        heading2.setFont(new Font("Serif", Font.BOLD, 17));
        heading2.setBounds(110,6,400,100);
        loginWindow.add(heading2);

        JLabel jmidHeading=new JLabel("JM - ID");
        jmidHeading.setForeground(Color.WHITE);
        jmidHeading.setFont(new Font("Times New Roman", Font.BOLD, 16));
        jmidHeading.setBounds(80,93,100,100);
        loginWindow.add(jmidHeading);

        JTextField jmid=new JTextField(15);
        jmid.setBorder(new LineBorder(Color.BLACK));
        jmid.setFont(new Font("Times New Roman", Font.BOLD,18));
        jmid.setBounds(150,130,132,27);
        loginWindow.add(jmid);

        JLabel passHeading=new JLabel("Password");
        passHeading.setForeground(Color.WHITE);
        passHeading.setFont(new Font("Times New Roman", Font.BOLD, 16));
        passHeading.setBounds(80,180,100,100);
        loginWindow.add(passHeading);

        JPasswordField password=new JPasswordField(10);
        password.setBounds(150,215,132,27);
        password.setFont(new Font("Times New Roman", Font.BOLD,18));
        password.setBorder(new LineBorder(Color.BLACK));
        loginWindow.add(password);

        JButton submitButton=new JButton("Login");
        submitButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        submitButton.setBounds(30,310,100,30);
        submitButton.setBackground(new Color(193, 225, 193));
        loginWindow.add(submitButton);

        JButton clearButton=new JButton("Clear");
        clearButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        clearButton.setBounds(230,310,100,30);
        clearButton.setBackground(new Color(193, 225, 193));
        loginWindow.add(clearButton);

        JButton backButton = new JButton("Back <--");
        backButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        backButton.setBackground(new Color(220,20,60));
        backButton.setForeground(Color.WHITE);
        backButton.setBounds(130,390,100,30);
        loginWindow.add(backButton);

        JButton logoutButton = new JButton("Log Out");
        logoutButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        logoutButton.setBackground(new Color(220,20,60));
        logoutButton.setForeground(Color.WHITE);
        logoutButton.setBounds(130,390,100,30);
        loginWindow.add(logoutButton);
        logoutButton.setVisible(false);


        ActionListener clearEventListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jmid.setText("");
                password.setText("");
            }
        };
        clearButton.addActionListener(clearEventListener);

        ActionListener backButtonEvent =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginWindow.setVisible(false);
                new AdminLoginScreen();
            }
        };
        backButton.addActionListener(backButtonEvent);

        ActionListener logOutController = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jmid.setEditable(true);
                password.setEditable(true);
                backButton.setVisible(true);
                logoutButton.setVisible(false);
                jmid.setText("");
                password.setText("");
                JOptionPane.showMessageDialog(loginWindow,"Logged Out Succesfully");
            }
        };logoutButton.addActionListener(logOutController);

        ActionListener juryLoginControl=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jm_id=(Integer.parseInt(jmid.getText()));
                String pass=String.valueOf(password.getPassword());

                Database_1 obj=new Database_1();
                try {
                    String retName = obj.authenticateJuryLogin(jm_id, pass);

                    if (retName.equals("null")) {
                        JOptionPane.showMessageDialog(loginWindow, "Invalid jm_ID or Password", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(loginWindow, "Welcome " + retName);
                        jmid.setEditable(false);
                        password.setEditable(false);
                        backButton.setVisible(false);
                        logoutButton.setVisible(true);
                    }
                }catch(Exception r){
                    System.out.println(r);
                }

            }
        };submitButton.addActionListener(juryLoginControl);


    }

}


class AdminLoginScreen {

    public AdminLoginScreen(){

        //Hading & Title
        JFrame loginWindow=new JFrame("User-Login");
        loginWindow.setSize(600,600);
        loginWindow.setVisible(true);
        loginWindow.getContentPane().setBackground(Color.DARK_GRAY);
        loginWindow.setLayout(null);
        loginWindow.setResizable(false);
        loginWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel heading1=new JLabel("INVENTION MANAGEMENT SYSTEM");
        heading1.setForeground(Color.WHITE);
        heading1.setFont(new Font("Serif", Font.BOLD, 25));
        heading1.setBounds(65,-35,600,100);
        loginWindow.add(heading1);

        JLabel heading2=new JLabel("Administrative User Login ");
        heading2.setForeground(new Color(32,178,170));
        heading2.setFont(new Font("Serif", Font.BOLD, 25));
        heading2.setBounds(140,10,600,100);
        loginWindow.add(heading2);



        //Left Side of User Login.

        JLabel uidHeading=new JLabel("User-ID");
        uidHeading.setForeground(Color.WHITE);
        uidHeading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        uidHeading.setBounds(10,150,100,100);
        loginWindow.add(uidHeading);

        JTextField uid=new JTextField(10);
        uid.setBorder(new LineBorder(Color.BLACK));
        uid.setFont(new Font("Times New Roman", Font.BOLD,18));
        uid.setBounds(100,185,150,25);
        loginWindow.add(uid);

        JLabel pasHeading=new JLabel("Password");
        pasHeading.setForeground(Color.WHITE);
        pasHeading.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pasHeading.setBounds(10,250,100,100);
        loginWindow.add(pasHeading);

        JPasswordField password=new JPasswordField(10);
        password.setBounds(100,285,150,25);
        password.setFont(new Font("Times New Roman", Font.BOLD,18));
        password.setBorder(new LineBorder(Color.BLACK));
        loginWindow.add(password);

        JButton submitButton=new JButton("Login");
        submitButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        submitButton.setBounds(20,385,100,30);
        submitButton.setBackground(new Color(193, 225, 193));
        loginWindow.add(submitButton);

        JButton clearButton=new JButton("Clear");
        clearButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        clearButton.setBounds(140,385,100,30);
        clearButton.setBackground(new Color(193, 225, 193));
        loginWindow.add(clearButton);

        JButton juryButton=new JButton("Jury Member Login");
        juryButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        juryButton.setBounds(30,485,200,30);
        juryButton.setBackground(new Color(175, 225, 175));
        loginWindow.add(juryButton);


        JLabel errorLabel=new JLabel("Invalid User-ID or Password");
        errorLabel.setBounds(160,70,600,100);
        errorLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        errorLabel.setForeground(new Color(220,20,60));
        errorLabel.setVisible(false);
        loginWindow.add(errorLabel);

        JLabel userName=new JLabel("Welcome In!");
        userName.setBounds(230,70,600,100);
        userName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        userName.setForeground(new Color(152,251,152));
        userName.setVisible(false);
        loginWindow.add(userName);

        JButton userRegisterButton=new JButton("New User?");
        userRegisterButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
        userRegisterButton.setBounds(390,245,130,30);
        userRegisterButton.setBackground(new Color(175, 225, 175));
        loginWindow.add(userRegisterButton);

        JButton exitButton=new JButton("Exit");
        exitButton.setFont(new Font("Algerian", Font.BOLD, 16));
        exitButton.setBounds(405,345,100,30);
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(220,20,60));
        loginWindow.add(exitButton);





        //Right Side of Login Page

        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.DARK_GRAY);
        rightPanel.setSize(330,550);
        rightPanel.setLayout(null);
        rightPanel.setLocation(260,100);
        rightPanel.setVisible(false);
        loginWindow.add(rightPanel);

        JButton viewInvention =new JButton("View Inventions");
        viewInvention.setBounds(110,82,140,35);
        viewInvention.setFont(new Font("Times New Roman", Font.BOLD, 15));
        viewInvention.setBackground(new Color(175,238,238));
        rightPanel.add(viewInvention);

        JButton addInvention =new JButton("Add Inventions");
        addInvention.setBounds(110,135,140,35);
        addInvention.setFont(new Font("Times New Roman", Font.BOLD, 15));
        addInvention.setBackground(new Color(175,238,238));
        rightPanel.add(addInvention);

        JButton deleteInvention =new JButton("Del Invention");
        deleteInvention.setBounds(110,220,140,35);
        deleteInvention.setFont(new Font("Times New Roman", Font.BOLD, 15));
        deleteInvention.setBackground(new Color(175,238,238));
        rightPanel.add(deleteInvention);

        JButton deleteInventor =new JButton("Del Inventor");
        deleteInventor.setBounds(110,283,140,35);
        deleteInventor.setFont(new Font("Times New Roman", Font.BOLD, 15));
        deleteInventor.setBackground(new Color(175,238,238));
        rightPanel.add(deleteInventor);


        JButton logoutBtn =new JButton("Log Out");
        logoutBtn.setBounds(125,385,110,30);
        logoutBtn.setFont(new Font("Times New Roman", Font.BOLD, 14));
        logoutBtn.setBackground(new Color(220,20,60));
        logoutBtn.setForeground(Color.WHITE);
        rightPanel.add(logoutBtn);


        ActionListener clearEventListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                uid.setText("");
                password.setText("");
            }
        };
        clearButton.addActionListener(clearEventListener);

        ActionListener juryLoginScreen =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginWindow.setVisible(false);
                new JuryMemberLogin();
            }
        };
        juryButton.addActionListener(juryLoginScreen);

        ActionListener newUserController =new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String src=e.getActionCommand();
                if(src.equals("New User?")) {
                    loginWindow.setVisible(false);
                    new UserRegister();
                    JOptionPane.showMessageDialog(loginWindow, "Please fill all the Fields to Register");
                }else if(src.equals("Exit")){
                    loginWindow.setVisible(false);
                    JOptionPane.showMessageDialog(loginWindow, "System Closed Successfully");
                    System.exit(0);
                }
            }
        };
        userRegisterButton.addActionListener(newUserController);
        exitButton.addActionListener(newUserController);

        ActionListener AdUseroginButtonEvent =new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                Database_1 obj=new Database_1();

                String user_id=uid.getText();
                String pass=String.valueOf(password.getPassword());


                System.out.println("Uid: "+user_id +"Password: "+pass);
                try{
                    String name=obj.authenticateLogin(Integer.parseInt(user_id),pass);

                    if(name.equals("null")){
                        JOptionPane.showMessageDialog(loginWindow, "Invalid User Id or Password", "Warning",
                                JOptionPane.WARNING_MESSAGE);

                    }else{
                        JOptionPane.showMessageDialog(loginWindow,"Welcome "+name);
                        userRegisterButton.setVisible(false);
                        exitButton.setVisible(false);
                        juryButton.setVisible(false);
                        uid.setEditable(false);
                        password.setEditable(false);
                        userName.setVisible(true);
                        rightPanel.setVisible(true);
                    }


                } catch(Exception a){};



            }
        };
        submitButton.addActionListener(AdUseroginButtonEvent);

        ActionListener logoutbtnevent=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userRegisterButton.setVisible(true);
                exitButton.setVisible(true);
                juryButton.setVisible(true);
                uid.setEditable(true);
                password.setEditable(true);
                uid.setText("");
                password.setText("");
                userName.setVisible(false);
                rightPanel.setVisible(false);

                JOptionPane.showMessageDialog(loginWindow,"User Logged Out Succesfully");
            }
        };logoutBtn.addActionListener(logoutbtnevent);

        ActionListener rightPanelController = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String src=e.getActionCommand();

                if(src.equals("View Inventions")){
                    //loginWindow.setVisible(false);
                    new Swing_2();
                }else if(src.equals("Add Inventions")){
                    new AddInvention();
                }else if(src.equals("Del Invention")){
                    String inv_id=JOptionPane.showInputDialog(loginWindow,"Enter Invention ID");
                    if(inv_id!=null){
                        int invId=(Integer.parseInt(inv_id));
                        Database_1 obj= new Database_1();
                        try {
                            int retstatus = obj.deleteInvention(invId);
                            if (retstatus == 1) {
                                JOptionPane.showMessageDialog(loginWindow, "Invention Deleted Successfully");
                            } else {
                                JOptionPane.showMessageDialog(loginWindow, "Error in Deleting Invention ", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(Exception u){
                            System.out.println(u);
                        }
                    }
                }else if(src.equals("Del Inventor")){
                    String inv_id=JOptionPane.showInputDialog(loginWindow,"Enter Inventor ID");
                    if(inv_id!=null){
                        int invId=(Integer.parseInt(inv_id));
                        Database_1 obj=new Database_1();
                        try {
                            int retstatus = obj.deleteInventor(invId);
                            if (retstatus == 1) {
                                JOptionPane.showMessageDialog(loginWindow, "Inventor Deleted Successfully");
                            } else {
                                JOptionPane.showMessageDialog(loginWindow, "Error in Deleting Inventor ", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                            }
                        }catch(Exception u){
                            System.out.println(u);
                        }
                    }
                }

            }
        };viewInvention.addActionListener(rightPanelController);
        addInvention.addActionListener(rightPanelController);
        deleteInvention.addActionListener(rightPanelController);
        deleteInventor.addActionListener(rightPanelController);


    }









}


public class LoginScreen {
    public static void main(String[] args) {
        new AdminLoginScreen();

    }

}
