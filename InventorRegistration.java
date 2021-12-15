package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class AddInvention{

    public AddInvention(){

        JFrame mainWindow = new JFrame("Add Invention");
        mainWindow.setSize(600,700);
        mainWindow.setLayout(null);
        mainWindow.getContentPane().setBackground(Color.DARK_GRAY);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title=new JLabel("Add Inventions ");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Serif", Font.BOLD, 25));
        title.setBounds(200,-30,400,100);
        mainWindow.add(title);

        JLabel categoryTitle=new JLabel("Select: ");
        categoryTitle.setForeground(Color.WHITE);
        categoryTitle.setFont(new Font("Serif", Font.BOLD, 25));
        categoryTitle.setBounds(20,30,400,100);
        mainWindow.add(categoryTitle);


        JRadioButton inventorBtn=new JRadioButton("Inventor",true);
        inventorBtn.setBackground(Color.DARK_GRAY);
        inventorBtn.setForeground(Color.WHITE);
        inventorBtn.setBounds(150,68,100,30);
        inventorBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mainWindow.add(inventorBtn);

        JRadioButton inventionBtn=new JRadioButton("Invention");
        inventionBtn.setBackground(Color.DARK_GRAY);
        inventionBtn.setForeground(Color.WHITE);
        inventionBtn.setBounds(350,68,120,30);
        inventionBtn.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mainWindow.add(inventionBtn);

        ButtonGroup grp1=new ButtonGroup();
        grp1.add(inventorBtn);
        grp1.add(inventionBtn);

        //Inventor Details Panel

        JPanel inventorPanel=new JPanel();
        inventorPanel.setBackground(new Color(47,79,79));
        inventorPanel.setSize(600,550);
        inventorPanel.setLocation(0,110);
        inventorPanel.setLayout(null);
        mainWindow.add(inventorPanel);


        JLabel invIdlabel=new JLabel("Inventor ID");
        invIdlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invIdlabel.setForeground(Color.WHITE);
        invIdlabel.setBounds(6,30,100,50);
        inventorPanel.add(invIdlabel);

        JTextField inventorId=new JTextField(20);
        inventorId.setBounds(110,42,150,25);
        inventorId.setFont(new Font("Arial", Font.BOLD, 18));
        inventorId.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorId);

        JLabel invFNamelabel=new JLabel("First Name");
        invFNamelabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invFNamelabel.setForeground(Color.WHITE);
        invFNamelabel.setBounds(6,100,100,50);
        inventorPanel.add(invFNamelabel);


        JTextField inventorFName=new JTextField(20);
        inventorFName.setBounds(110,112,150,25);
        inventorFName.setFont(new Font("Arial", Font.BOLD, 18));
        inventorFName.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorFName);

        JLabel invLNamelabel=new JLabel("Last Name");
        invLNamelabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invLNamelabel.setForeground(Color.WHITE);
        invLNamelabel.setBounds(306,100,100,50);
        inventorPanel.add(invLNamelabel);

        JTextField inventorLName=new JTextField(20);
        inventorLName.setBounds(406,112,150,25);
        inventorLName.setFont(new Font("Arial", Font.BOLD, 18));
        inventorLName.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorLName);

        JLabel invEmailLabel=new JLabel("Email");
        invEmailLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invEmailLabel.setForeground(Color.WHITE);
        invEmailLabel.setBounds(6,160,100,50);
        inventorPanel.add(invEmailLabel);

        JTextField inventorEmail=new JTextField(20);
        inventorEmail.setBounds(110,172,150,25);
        inventorEmail.setFont(new Font("Arial", Font.BOLD, 16));
        inventorEmail.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorEmail);

        JLabel invCountrylabel=new JLabel("Country");
        invCountrylabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invCountrylabel.setForeground(Color.WHITE);
        invCountrylabel.setBounds(306,160,100,50);
        inventorPanel.add(invCountrylabel);

        JTextField inventorCountry=new JTextField(20);
        inventorCountry.setBounds(406,172,150,25);
        inventorCountry.setFont(new Font("Arial", Font.BOLD, 18));
        inventorCountry.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorCountry);

        JLabel invJTitleLabel=new JLabel("Job");
        invJTitleLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invJTitleLabel.setForeground(Color.WHITE);
        invJTitleLabel.setBounds(6,220,100,50);
        inventorPanel.add(invJTitleLabel);

        JTextField inventorJob=new JTextField(20);
        inventorJob.setBounds(110,232,150,25);
        inventorJob.setFont(new Font("Arial", Font.BOLD, 16));
        inventorJob.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorJob);

        JLabel invReligionlabel=new JLabel("Religion");
        invReligionlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invReligionlabel.setForeground(Color.WHITE);
        invReligionlabel.setBounds(306,220,100,50);
        inventorPanel.add(invReligionlabel);

        JTextField inventorReligion=new JTextField(20);
        inventorReligion.setBounds(406,232,150,25);
        inventorReligion.setFont(new Font("Arial", Font.BOLD, 18));
        inventorReligion.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorReligion);

        JLabel invQlfcnLabel=new JLabel("Qualif");
        invQlfcnLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invQlfcnLabel.setForeground(Color.WHITE);
        invQlfcnLabel.setBounds(6,280,100,50);
        inventorPanel.add(invQlfcnLabel);

        JTextField inventorQualif=new JTextField(20);
        inventorQualif.setBounds(110,292,150,25);
        inventorQualif.setFont(new Font("Arial", Font.BOLD, 16));
        inventorQualif.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorQualif);


        JLabel invSpelcnLabel=new JLabel("Spc");
        invSpelcnLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invSpelcnLabel.setForeground(Color.WHITE);
        invSpelcnLabel.setBounds(306,280,100,50);
        inventorPanel.add(invSpelcnLabel);

        JTextField inventorSpelcn=new JTextField(20);
        inventorSpelcn.setBounds(406,292,150,25);
        inventorSpelcn.setFont(new Font("Arial", Font.BOLD, 18));
        inventorSpelcn.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorSpelcn);

        JLabel invYoeLabel=new JLabel("Exp (Year) ");
        invYoeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invYoeLabel.setForeground(Color.WHITE);
        invYoeLabel.setBounds(6,340,100,50);
        inventorPanel.add(invYoeLabel);

        JTextField inventorExp=new JTextField(20);
        inventorExp.setBounds(110,352,150,25);
        inventorExp.setFont(new Font("Arial", Font.BOLD, 16));
        inventorExp.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorExp);

        JLabel invGenderLabel=new JLabel("Gender ");
        invGenderLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invGenderLabel.setForeground(Color.WHITE);
        invGenderLabel.setBounds(305,30,100,50);
        inventorPanel.add(invGenderLabel);

        JRadioButton invGender1=new JRadioButton("M");
        invGender1.setBackground(new Color(47,79,79));
        invGender1.setForeground(Color.WHITE);
        invGender1.setBounds(400,46,80,20);
        invGender1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        inventorPanel.add(invGender1);

        JRadioButton invGender2=new JRadioButton("F");
        invGender2.setBackground(new Color(47,79,79));
        invGender2.setForeground(Color.WHITE);
        invGender2.setBounds(500,46,80,20);
        invGender2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        inventorPanel.add(invGender2);

        ButtonGroup grp2=new ButtonGroup();
        grp2.add(invGender1);
        grp2.add(invGender2);

        JLabel invPhn1Label=new JLabel("Ph. No 1");
        invPhn1Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invPhn1Label.setForeground(Color.WHITE);
        invPhn1Label.setBounds(306,340,100,50);
        inventorPanel.add(invPhn1Label);

        JTextField inventorPhn1=new JTextField(20);
        inventorPhn1.setBounds(406,352,150,25);
        inventorPhn1.setFont(new Font("Arial", Font.BOLD, 18));
        inventorPhn1.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorPhn1);


        JLabel invPhn2Label=new JLabel("Ph. No 2");
        invPhn2Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invPhn2Label.setForeground(Color.WHITE);
        invPhn2Label.setBounds(6,400,100,50);
        inventorPanel.add(invPhn2Label);

        JTextField inventorPhn2=new JTextField(20);
        inventorPhn2.setBounds(110,412,150,25);
        inventorPhn2.setFont(new Font("Arial", Font.BOLD, 16));
        inventorPhn2.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorPhn2);

        JLabel invPhn3Label=new JLabel("Ph. No 3");
        invPhn3Label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invPhn3Label.setForeground(Color.WHITE);
        invPhn3Label.setBounds(306,400,100,50);
        inventorPanel.add(invPhn3Label);

        JTextField inventorPhn3=new JTextField(20);
        inventorPhn3.setBounds(406,412,150,25);
        inventorPhn3.setFont(new Font("Arial", Font.BOLD, 18));
        inventorPhn3.setBorder(new LineBorder(Color.BLACK));
        inventorPanel.add(inventorPhn3);


        JButton pushBtn =new JButton("Add Inventor");
        pushBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        pushBtn.setBounds(30,470,150,30);
        pushBtn.setBackground(new Color(175, 225, 175));
        inventorPanel.add(pushBtn);


        JButton clearBtn =new JButton("Clear");
        clearBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        clearBtn.setBounds(400,470,140,30);
        clearBtn.setBackground(new Color(175, 225, 175));
        inventorPanel.add(clearBtn);


        JButton logOutBtn =new JButton("Exit");
        logOutBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        logOutBtn.setBounds(230,513,120,30);
        logOutBtn.setBackground(new Color(220,20,60));
        logOutBtn.setForeground(Color.WHITE);
        inventorPanel.add(logOutBtn);

        inventorPanel.setVisible(true);

        //    ***************Iventor Panel*************************

        //Invention Panel

        JPanel inventionPanel=new JPanel();
        inventionPanel.setBackground(new Color(47,79,79));
        inventionPanel.setSize(600,550);
        inventionPanel.setLocation(0,110);
        inventionPanel.setLayout(null);
        mainWindow.add(inventionPanel);

        JLabel inventionIdlabel=new JLabel("Invention ID");
        inventionIdlabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        inventionIdlabel.setForeground(Color.WHITE);
        inventionIdlabel.setBounds(6,30,100,50);
        inventionPanel.add(inventionIdlabel);

        JTextField inventionId=new JTextField(20);
        inventionId.setBounds(110,42,180,25);
        inventionId.setFont(new Font("Arial", Font.BOLD, 18));
        inventionId.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(inventionId);

        JLabel invntrIdLabel=new JLabel("Inventor ID");
        invntrIdLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        invntrIdLabel.setForeground(Color.WHITE);
        invntrIdLabel.setBounds(316,30,100,50);
        inventionPanel.add(invntrIdLabel);

        JTextField inventrId=new JTextField(20);
        inventrId.setBounds(415,42,160,25);
        inventrId.setFont(new Font("Arial", Font.BOLD, 18));
        inventrId.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(inventrId);

        JLabel iventionNameLabel=new JLabel("Invention Name");
        iventionNameLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        iventionNameLabel.setForeground(Color.WHITE);
        iventionNameLabel.setBounds(6,100,160,50);
        inventionPanel.add(iventionNameLabel);


        JTextField inventionName=new JTextField(20);
        inventionName.setBounds(159,112,180,30);
        inventionName.setFont(new Font("Arial", Font.BOLD, 18));
        inventionName.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(inventionName);

        JLabel iventionCategoryLabel=new JLabel("Invention Category");
        iventionCategoryLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        iventionCategoryLabel.setForeground(Color.WHITE);
        iventionCategoryLabel.setBounds(6,170,160,50);
        inventionPanel.add(iventionCategoryLabel);

        String[] invCatgs={"Select","Science","Medicine","Scientific/Technological","Cultural"};
        JComboBox inventionCategories =new JComboBox(invCatgs);
        inventionCategories.setBounds(159,182,200,30);
        inventionCategories.setFont(new Font("Arial", Font.BOLD, 18));
        inventionCategories.setBackground(Color.WHITE);
        inventionCategories.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(inventionCategories);

        JLabel iventionYearLabel=new JLabel("Invention Year");
        iventionYearLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        iventionYearLabel.setForeground(Color.WHITE);
        iventionYearLabel.setBounds(6,240,160,50);
        inventionPanel.add(iventionYearLabel);

        JTextField inventionYear=new JTextField(20);
        inventionYear.setBounds(159,252,200,30);
        inventionYear.setFont(new Font("Arial", Font.BOLD, 18));
        inventionYear.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(inventionYear);

        JLabel StoryBehindLabel=new JLabel("Story Behind");
        StoryBehindLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        StoryBehindLabel.setForeground(Color.WHITE);
        StoryBehindLabel.setBounds(6,310,160,50);
        inventionPanel.add(StoryBehindLabel);

        JTextArea StoryBehind=new JTextArea(20,20);
        StoryBehind.setBounds(159,322,280,120);
        StoryBehind.setFont(new Font("Arial", Font.PLAIN, 15));
        StoryBehind.setBorder(new LineBorder(Color.BLACK));
        inventionPanel.add(StoryBehind);

        JButton addInventionBtn =new JButton("Add Invention");
        addInventionBtn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        addInventionBtn.setBounds(30,470,150,30);
        addInventionBtn.setBackground(new Color(175, 225, 175));
        inventionPanel.add(addInventionBtn);

        JButton clearBtn2 =new JButton("Clear");
        clearBtn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        clearBtn2.setBounds(400,470,140,30);
        clearBtn2.setBackground(new Color(175, 225, 175));
        inventionPanel.add(clearBtn2);


        JButton logOutBtn2 =new JButton("Exit");
        logOutBtn2.setFont(new Font("Times New Roman", Font.BOLD, 18));
        logOutBtn2.setBounds(230,513,120,30);
        logOutBtn2.setBackground(new Color(220,20,60));
        logOutBtn2.setForeground(Color.WHITE);
        inventionPanel.add(logOutBtn2);

        inventionPanel.setVisible(false);


        //************************Invention Panel*********************************

        //Event Handling

        ActionListener radioBtnChange = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String radioButton=e.getActionCommand();

                if(radioButton.equals("Inventor")){
                    inventionPanel.setVisible(false);
                    inventorPanel.setVisible(true);
                }else{
                    inventionPanel.setVisible(true);
                    inventorPanel.setVisible(false);
                }
            }


        };
        inventionBtn.addActionListener(radioBtnChange);
        inventorBtn.addActionListener(radioBtnChange);

        ActionListener clearEvent = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String src=e.getActionCommand();
                if(src.equals("Clear")) {
                    inventorFName.setText("");
                    inventorLName.setText("");
                    inventorEmail.setText("");
                    inventorCountry.setText("");
                    inventorJob.setText("");
                    inventorReligion.setText("");
                    inventorQualif.setText("");
                    inventorSpelcn.setText("");
                    inventorExp.setText("");
                    inventorId.setText("");
                    inventorPhn1.setText("");
                    inventorPhn2.setText("");
                    inventorPhn3.setText("");
                    invGender1.setSelected(false);
                    invGender2.setSelected(false);
                }
            }
        };clearBtn.addActionListener(clearEvent);

        ActionListener clearInventionEvent =new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inventionId.setText("");
                inventrId.setText("");
                inventionName.setText("");
                inventionYear.setText("");
                StoryBehind.setText("");
            }
        };clearBtn2.addActionListener(clearInventionEvent);

        ActionListener addInventorControl=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inventor_id=(Integer.parseInt(inventorId.getText()));
                String fName=inventorFName.getText();
                String lname=inventorLName.getText();
                String email=inventorEmail.getText();
                String country=inventorCountry.getText();
                String Job=inventorJob.getText();
                String religion=inventorReligion.getText();
                String qualif=inventorQualif.getText();
                String spclsn=inventorSpelcn.getText();
                int eox=(Integer.parseInt(inventorExp.getText()));
                String gender;
                if(invGender1.isSelected()){
                    gender="M";
                }else{
                    gender="F";
                }
                /////Phone number data

                int phno1=(Integer.parseInt(inventorPhn1.getText()));
                int phno2=(Integer.parseInt(inventorPhn2.getText()));
                int phno3=(Integer.parseInt(inventorPhn3.getText()));

                Database_2 obj=new Database_2();
                try {
                    int retStatus = obj.addInventor(inventor_id, fName, lname, email, country, Job, religion, qualif, spclsn, eox, gender,
                            phno1, phno2, phno3);


                    if (retStatus == 1) {
                        JOptionPane.showMessageDialog(mainWindow, "Inventor Added Successfully");
                        clearEvent.actionPerformed(new ActionEvent(obj, 1, "Clear"));
                    } else {
                        JOptionPane.showMessageDialog(mainWindow, "Error in Adding Inventor Details", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }catch(Exception w){
                    System.out.println(w);
                }



            }
        };pushBtn.addActionListener(addInventorControl);

        ActionListener addInventionControl =new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int invention_id=(Integer.parseInt(inventionId.getText()));
                int inventor_id=(Integer.parseInt(inventrId.getText()));
                String invname=inventionName.getText();
                String selected_text = (String) inventionCategories.getItemAt(inventionCategories.getSelectedIndex());
                int year=(Integer.parseInt(inventionYear.getText()));
                String storybehind=StoryBehind.getText();

                Database_2 obj=new Database_2();
                try {
                    int retstatus=obj.addInvention(invention_id, inventor_id, invname, selected_text, year, storybehind);

                    if(retstatus==1){
                        JOptionPane.showMessageDialog(mainWindow, "Invention Added Successfully");
                        addInventorControl.actionPerformed(new ActionEvent(obj,1,"Clear"));
                    }else{
                        JOptionPane.showMessageDialog(mainWindow, "Error in Adding Invention ", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }catch(Exception q){
                    System.out.println(q);
                }
            }
        };addInventionBtn.addActionListener(addInventionControl);

        ActionListener logoutControl=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.dispose();
            }
        };logOutBtn.addActionListener(logoutControl);
        logOutBtn2.addActionListener(logoutControl);










    }

}

public class InventorRegistration{

}
