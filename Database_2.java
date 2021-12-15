package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_2 {

    public int addInventor(int inventor_id,String fname,String lname,String email,String country,
                            String job,String religion,String qualif, String spclsn,
                            int eox,String gender,int ph1,int phn2,int phn3) throws Exception{
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet = null;
        int status=0;

        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");

            String sql1 = "insert into inventor values (?,?,?,?,?,?,?,?,?,?,?)";

            preparedStatement1 = connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,inventor_id);
            preparedStatement1.setString(2,fname);
            preparedStatement1.setString(3,lname);
            preparedStatement1.setString(4,gender);
            preparedStatement1.setString(5,email);
            preparedStatement1.setString(6,country);
            preparedStatement1.setString(7,job);
            preparedStatement1.setString(8,qualif);
            preparedStatement1.setString(9,spclsn);
            preparedStatement1.setString(10,religion);
            preparedStatement1.setInt(11,eox);
            int rowsAffected=preparedStatement1.executeUpdate();

            String sql2="insert into inventor_phone_number values(?,?,?,?)";
            preparedStatement2 = connect.prepareStatement(sql2);
            preparedStatement2.setInt(1,inventor_id);
            preparedStatement2.setInt(2,ph1);
            preparedStatement2.setInt(3,phn2);
            preparedStatement2.setInt(4,phn3);
            status=1;
            int rowsAffected2=preparedStatement2.executeUpdate();



        }catch(Exception e){
            System.out.println(e);
            status=-1;
        }finally{
            connect.close();
        }
        return status;
    }
    public int addInvention(int invention_id, int inventor_id, String invname,String invcat,int year,
                             String storybehind) throws Exception{

        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        ResultSet resultSet = null;
        int status=0;

        try{

            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");
            String sql1 = "insert into invention values (?,?,?,?,?)";
            preparedStatement1 = connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,invention_id);
            preparedStatement1.setString(2,invname);
            preparedStatement1.setString(3,invcat);
            preparedStatement1.setInt(4,year);
            preparedStatement1.setString(5,storybehind);
            int rowsAffected=preparedStatement1.executeUpdate();

            String sql2="insert into invents values(?,?)";
            preparedStatement2 = connect.prepareStatement(sql2);
            preparedStatement2.setInt(1,inventor_id);
            preparedStatement2.setInt(2,invention_id);
            int rowsAffected2=preparedStatement2.executeUpdate();

            status=1;


        }catch(Exception e){
            System.out.println(e);
            status=-1;
        }finally{
            connect.close();
        }
        return status;

    }


}
