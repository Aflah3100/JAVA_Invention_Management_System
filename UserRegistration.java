package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserRegister{

    public UserRegister() {
        JFrame mainWindow = new JFrame("User Registration");
        mainWindow.setSize(600, 700);
        mainWindow.setLayout(null);
        mainWindow.getContentPane().setBackground(Color.DARK_GRAY);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title=new JLabel("User Registration Form ");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 25));
        title.setBounds(155,-30,400,100);
        mainWindow.add(title);

        JLabel UserTypeTitle=new JLabel("User Type: ");
        UserTypeTitle.setForeground(Color.WHITE);
        UserTypeTitle.setFont(new Font("Serif", Font.BOLD, 25));
        UserTypeTitle.setBounds(20,30,400,100);
        mainWindow.add(UserTypeTitle);

        JRadioButton adminBtn=new JRadioButton("Administrative",true);
        adminBtn.setBackground(Color.DARK_GRAY);
        adminBtn.setForeground(Color.WHITE);
        adminBtn.setBounds(150,68,150,30);
        adminBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mainWindow.add(adminBtn);

        JRadioButton juryBtn=new JRadioButton("Jury Member");
        juryBtn.setBackground(Color.DARK_GRAY);
        juryBtn.setForeground(Color.WHITE);
        juryBtn.setBounds(350,68,150,30);
        juryBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mainWindow.add(juryBtn);

        ButtonGroup grp1=new ButtonGroup();
        grp1.add(adminBtn);
        grp1.add(juryBtn);

        //Administrative User Page

        JPanel adminPanel =new JPanel();
        adminPanel.setBackground(new Color(47,79,79));
        adminPanel.setSize(600,550);
        adminPanel.setLocation(0,110);
        adminPanel.setLayout(null);
        mainWindow.add(adminPanel);

        JLabel memberIdLabel =new JLabel("Member ID");
        memberIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        memberIdLabel.setForeground(Color.WHITE);
        memberIdLabel.setBounds(6,30,100,50);
        adminPanel.add(memberIdLabel);


        JTextField memberId =new JTextField(20);
        memberId.setBounds(110,42,150,25);
        memberId.setFont(new Font("Arial", Font.BOLD, 18));
        memberId.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(memberId);

        JLabel userIdLabel =new JLabel("User ID");
        userIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userIdLabel.setForeground(Color.WHITE);
        userIdLabel.setBounds(300,30,100,50);
        adminPanel.add(userIdLabel);

        JTextField userId =new JTextField(20);
        userId.setBounds(406,40,150,25);
        userId.setFont(new Font("Arial", Font.BOLD, 18));
        userId.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(userId);


        JLabel userNamelabel =new JLabel("Name");
        userNamelabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userNamelabel.setForeground(Color.WHITE);
        userNamelabel.setBounds(6,100,100,50);
        adminPanel.add(userNamelabel);


        JTextField userName =new JTextField(20);
        userName.setBounds(110,112,150,25);
        userName.setFont(new Font("Arial", Font.BOLD, 18));
        userName.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(userName);

        JLabel yojlabel =new JLabel("Year Of Join");
        yojlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        yojlabel.setForeground(Color.WHITE);
        yojlabel.setBounds(300,100,100,50);
        adminPanel.add(yojlabel);

        JTextField yoj =new JTextField(20);
        yoj.setBounds(406,112,150,25);
        yoj.setFont(new Font("Arial", Font.BOLD, 18));
        yoj.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(yoj);

        JLabel userPhnoLabel =new JLabel("Phone No");
        userPhnoLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userPhnoLabel.setForeground(Color.WHITE);
        userPhnoLabel.setBounds(6,160,100,50);
        adminPanel.add(userPhnoLabel);

        JLabel userGenderLabel =new JLabel("Gender");
        userGenderLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userGenderLabel.setForeground(Color.WHITE);
        userGenderLabel.setBounds(6,220,100,50);
        adminPanel.add(userGenderLabel);

        JRadioButton userGender1 =new JRadioButton("M");
        userGender1.setBackground(new Color(47,79,79));
        userGender1.setForeground(Color.WHITE);
        userGender1.setBounds(106,220,100,50);
        userGender1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        adminPanel.add(userGender1);

        JRadioButton userGender2 =new JRadioButton("F");
        userGender2.setBackground(new Color(47,79,79));
        userGender2.setForeground(Color.WHITE);
        userGender2.setBounds(200,220,100,50);
        userGender2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        adminPanel.add(userGender2);

        ButtonGroup grp2=new ButtonGroup();
        grp2.add(userGender1);
        grp2.add(userGender2);

        JTextField userPhno =new JTextField(20);
        userPhno.setBounds(110,172,150,25);
        userPhno.setFont(new Font("Arial", Font.BOLD, 16));
        userPhno.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(userPhno);

        JLabel userPasswordLabel =new JLabel("Password");
        userPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userPasswordLabel.setForeground(Color.WHITE);
        userPasswordLabel.setBounds(6,280,100,50);
        adminPanel.add(userPasswordLabel);

        JPasswordField userPassword =new JPasswordField(20);
        userPassword.setBounds(110,292,150,25);
        userPassword.setFont(new Font("Arial", Font.BOLD, 16));
        userPassword.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(userPassword);

        JLabel userconfirmPasswordLabel =new JLabel("Confirm");
        userconfirmPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        userconfirmPasswordLabel.setForeground(Color.WHITE);
        userconfirmPasswordLabel.setBounds(306,280,100,50);
        adminPanel.add(userconfirmPasswordLabel);

        JPasswordField userconfirmPassword =new JPasswordField(20);
        userconfirmPassword.setBounds(406,292,150,25);
        userconfirmPassword.setFont(new Font("Arial", Font.BOLD, 18));
        userconfirmPassword.setBorder(new LineBorder(Color.BLACK));
        adminPanel.add(userconfirmPassword);

        JButton createBtn =new JButton("Create User");
        createBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        createBtn.setBounds(50,380,140,30);
        createBtn.setBackground(new Color(175, 225, 175));
        adminPanel.add(createBtn);

        JButton clearBtn =new JButton("Clear");
        clearBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        clearBtn.setBounds(376,380,140,30);
        clearBtn.setBackground(new Color(175, 225, 175));
        adminPanel.add(clearBtn);

        JButton backBtn =new JButton("Back");
        backBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        backBtn.setBounds(215,440,125,30);
        backBtn.setForeground(Color.WHITE);
        backBtn.setBackground(new Color(220,20,60));
        adminPanel.add(backBtn);

        adminPanel.setVisible(true);

        // *************Admin Panel***************


        //Jury Panel


        JPanel juryPanel =new JPanel();
        juryPanel.setBackground(new Color(47,79,79));
        juryPanel.setSize(600,550);
        juryPanel.setLocation(0,110);
        juryPanel.setLayout(null);
        mainWindow.add(juryPanel);

        JLabel jurymemberIdLabel =new JLabel("Member ID");
        jurymemberIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurymemberIdLabel.setForeground(Color.WHITE);
        jurymemberIdLabel.setBounds(6,30,100,50);
        juryPanel.add(jurymemberIdLabel);


        JTextField jurymemberId =new JTextField(20);
        jurymemberId.setBounds(110,42,150,25);
        jurymemberId.setFont(new Font("Arial", Font.BOLD, 18));
        jurymemberId.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(jurymemberId);

        JLabel juryGenderLabel =new JLabel("Gender ");
        juryGenderLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryGenderLabel.setForeground(Color.WHITE);
        juryGenderLabel.setBounds(305,30,100,50);
        juryPanel.add(juryGenderLabel);

        JRadioButton juryGender1 =new JRadioButton("M");
        juryGender1.setBackground(new Color(47,79,79));
        juryGender1.setForeground(Color.WHITE);
        juryGender1.setBounds(400,46,80,20);
        juryGender1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        juryPanel.add(juryGender1);

        JRadioButton juryGender2 =new JRadioButton("F");
        juryGender2.setBackground(new Color(47,79,79));
        juryGender2.setForeground(Color.WHITE);
        juryGender2.setBounds(500,46,80,20);
        juryGender2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        juryPanel.add(juryGender2);


        JLabel jurymidlabel =new JLabel("Jury ID");
        jurymidlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurymidlabel.setForeground(Color.WHITE);
        jurymidlabel.setBounds(6,100,100,50);
        juryPanel.add(jurymidlabel);


        JTextField jurymid =new JTextField(20);
        jurymid.setBounds(110,112,150,25);
        jurymid.setFont(new Font("Arial", Font.BOLD, 18));
        jurymid.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(jurymid);

        JLabel jurypanelIdLabel =new JLabel("JP ID");
        jurypanelIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurypanelIdLabel.setForeground(Color.WHITE);
        jurypanelIdLabel.setBounds(306,100,100,50);
        juryPanel.add(jurypanelIdLabel);

        JTextField jurypanelId =new JTextField(20);
        jurypanelId.setBounds(406,112,150,25);
        jurypanelId.setFont(new Font("Arial", Font.BOLD, 18));
        jurypanelId.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(jurypanelId);

        JLabel juryMNameLabel =new JLabel("Name");
        juryMNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryMNameLabel.setForeground(Color.WHITE);
        juryMNameLabel.setBounds(6,160,100,50);
        juryPanel.add(juryMNameLabel);

        JTextField juryMName =new JTextField(20);
        juryMName.setBounds(110,172,150,25);
        juryMName.setFont(new Font("Arial", Font.BOLD, 16));
        juryMName.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryMName);

        JLabel juryyojlabel =new JLabel("Year Of Join");
        juryyojlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryyojlabel.setForeground(Color.WHITE);
        juryyojlabel.setBounds(300,160,100,50);
        juryPanel.add(juryyojlabel);

        JTextField juryyoj =new JTextField(20);
        juryyoj.setBounds(406,172,150,25);
        juryyoj.setFont(new Font("Arial", Font.BOLD, 18));
        juryyoj.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryyoj);


        JLabel juryPhnoLabel=new JLabel("Ph No");
        juryPhnoLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryPhnoLabel.setForeground(Color.WHITE);
        juryPhnoLabel.setBounds(6,220,100,50);
        juryPanel.add(juryPhnoLabel);

        JTextField juryPhno =new JTextField(20);
        juryPhno.setBounds(110,232,150,25);
        juryPhno.setFont(new Font("Arial", Font.BOLD, 16));
        juryPhno.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryPhno);

        JLabel juryQlfnlabel =new JLabel("Qalif");
        juryQlfnlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryQlfnlabel.setForeground(Color.WHITE);
        juryQlfnlabel.setBounds(306,220,100,50);
        juryPanel.add(juryQlfnlabel);

        JTextField juryQlfn =new JTextField(20);
        juryQlfn.setBounds(406,232,150,25);
        juryQlfn.setFont(new Font("Arial", Font.BOLD, 18));
        juryQlfn.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryQlfn);

        JLabel jurySpelcnLabel =new JLabel("Spc");
        jurySpelcnLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurySpelcnLabel.setForeground(Color.WHITE);
        jurySpelcnLabel.setBounds(6,280,100,50);
        juryPanel.add(jurySpelcnLabel);

        JTextField jurySpelcn =new JTextField(20);
        jurySpelcn.setBounds(110,292,150,25);
        jurySpelcn.setFont(new Font("Arial", Font.BOLD, 18));
        jurySpelcn.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(jurySpelcn);

        JLabel juryPasswordLabel =new JLabel("Password");
        juryPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryPasswordLabel.setForeground(Color.WHITE);
        juryPasswordLabel.setBounds(6,340,100,50);
        juryPanel.add(juryPasswordLabel);

        JPasswordField juryPassword=new JPasswordField(20);
        juryPassword.setBounds(110,352,150,25);
        juryPassword.setFont(new Font("Arial", Font.BOLD, 16));
        juryPassword.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryPassword);

        JLabel juryConfirmPasswordLabel =new JLabel("Confirm ");
        juryConfirmPasswordLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryConfirmPasswordLabel.setForeground(Color.WHITE);
        juryConfirmPasswordLabel.setBounds(306,340,100,50);
        juryPanel.add(juryConfirmPasswordLabel);

        JPasswordField juryConfirmPassword =new JPasswordField(20);
        juryConfirmPassword.setBounds(406,352,150,25);
        juryConfirmPassword.setFont(new Font("Arial", Font.BOLD, 18));
        juryConfirmPassword.setBorder(new LineBorder(Color.BLACK));
        juryPanel.add(juryConfirmPassword);

        JButton jurycreateBtn =new JButton("Create User");
        jurycreateBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurycreateBtn.setBounds(50,400,140,30);
        jurycreateBtn.setBackground(new Color(175, 225, 175));
        juryPanel.add(jurycreateBtn);

        JButton juryclearBtn =new JButton("Clear");
        juryclearBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        juryclearBtn.setBounds(376,400,140,30);
        juryclearBtn.setBackground(new Color(175, 225, 175));
        juryPanel.add(juryclearBtn);

        JButton jurybackBtn =new JButton("Back");
        jurybackBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jurybackBtn.setBounds(215,460,125,30);
        jurybackBtn.setForeground(Color.WHITE);
        jurybackBtn.setBackground(new Color(220,20,60));
        juryPanel.add(jurybackBtn);

        juryPanel.setVisible(false);

        //  **************Jury Panel***********

        ActionListener adminController = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String src=e.getActionCommand();
                if(src.equals("Administrative")){
                    adminPanel.setVisible(true);
                    juryPanel.setVisible(false);
                }else{
                    adminPanel.setVisible(false);
                    juryPanel.setVisible(true);
                }
            }
        };
        adminBtn.addActionListener(adminController);
        juryBtn.addActionListener(adminController);

        ActionListener Control1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String src=e.getActionCommand();

                if(src.equals("Back")){
                    mainWindow.setVisible(false);
                    new AdminLoginScreen();
                }else if(src.equals("Clear")){
                    memberId.setText("");jurymemberId.setText("");
                    userId.setText("");jurymid.setText("");
                    userName.setText("");jurypanelId.setText("");
                    yoj.setText("");juryMName.setText("");
                    userPhno.setText("");juryyoj.setText("");
                    userPassword.setText("");juryPhno.setText("");
                    userconfirmPassword.setText("");juryQlfn.setText("");
                    jurySpelcn.setText("");juryPassword.setText("");
                    juryConfirmPassword.setText("");
                }

            }
        };
        backBtn.addActionListener(Control1);
        jurybackBtn.addActionListener(Control1);
        clearBtn.addActionListener(Control1);
        juryclearBtn.addActionListener(Control1);

        ActionListener createUserAction=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int member_id=Integer.parseInt(memberId.getText());
                int user_id=Integer.parseInt(userId.getText());
                String name=userName.getText();
                int year=Integer.parseInt(yoj.getText());
                int phno=Integer.parseInt(userPhno.getText());
                String gender;
                if(userGender1.isSelected()){
                    gender="M";
                }else{
                    gender="F";
                }
                String pass=String.valueOf(userPassword.getPassword());
                String confirmPass=String.valueOf(userconfirmPassword.getPassword());
                if(pass.equals(confirmPass)){
                    Database_1 obj=new Database_1();
                    try{
                        int retStatus=obj.registerAdminUser(member_id,user_id,name,year,phno,gender,pass);
                        if(retStatus==1){
                            JOptionPane.showMessageDialog(mainWindow,"User Added Successfully");
                            Control1.actionPerformed(new ActionEvent(obj,1,"Clear"));
                        }else{
                            JOptionPane.showMessageDialog(mainWindow, "Error in Adding User", "Warning",
                                    JOptionPane.WARNING_MESSAGE);


                        }
                    }
                    catch(Exception a){
                        System.out.println(a);
                    };

                }else{
                    JOptionPane.showMessageDialog(mainWindow, "Passwords are not matching", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }

            }
        };createBtn.addActionListener(createUserAction);


        ActionListener createJuryAction=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int member_id=Integer.parseInt(jurymemberId.getText());
                int jury_id=Integer.parseInt(jurymid.getText());
                int jp_id=Integer.parseInt(jurypanelId.getText());
                String name=juryMName.getText();
                int year=Integer.parseInt(juryyoj.getText());
                String qualif=juryQlfn.getText();
                String speclsn=jurySpelcn.getText();
                String pass=String.valueOf(juryPassword.getPassword());
                String confirmPass=String.valueOf(juryConfirmPassword.getPassword());
                int phno=Integer.parseInt(juryPhno.getText());
                String gender;
                if(juryGender1.isSelected()){
                    gender="M";
                }else {
                    gender="F";
                }

                if(pass.equals(confirmPass)){
                    Database_1 obj=new Database_1();
                    try {
                        int retStatus=obj.registerJuryUser(member_id,jury_id,jp_id,name,year,
                                qualif,speclsn,pass,phno,gender);

                        if(retStatus==1){
                            JOptionPane.showMessageDialog(mainWindow,"Jury Member Added Successfully");
                            Control1.actionPerformed(new ActionEvent(obj,1,"Clear"));
                        }else{
                            JOptionPane.showMessageDialog(mainWindow, "Error in Adding Jury Member", "Warning",
                                    JOptionPane.WARNING_MESSAGE);

                        }

                    }catch(Exception s){
                        System.out.println(s);
                    }
                }else{
                    JOptionPane.showMessageDialog(mainWindow, "Passwords are not matching", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }



            }
        };jurycreateBtn.addActionListener(createJuryAction);



















    }

}

public class UserRegistration {


}
