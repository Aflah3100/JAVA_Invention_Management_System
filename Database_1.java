package com.company;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_1 {



    public String authenticateLogin(int userid, String password) throws Exception{
         Connection connect = null;
         Statement statement = null;
         PreparedStatement preparedStatement1 = null;
         ResultSet resultSet = null;
         String name="null";



        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");

            statement = connect.createStatement();

            String sql1="Select password,name from Administrative_User where user_id=? ";

            preparedStatement1 =connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,userid);

            ResultSet result=preparedStatement1.executeQuery();

            while(result.next()) {

                if (result.getString(1).equals(password)) {
                    name=result.getString(2);
                    break;
                } else {
                    continue;
                }

            }




        }catch(Exception e){
            System.out.println(e);
        }finally {
            connect.close();
        }

        return name;
    }

    //Register method

    public int registerAdminUser(int member_id,int user_id,String name,int year,int phno,String gender,String password) throws Exception {
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultSet = null;
        int status = 0;


        try {
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");

            statement = connect.createStatement();

            String sql1 = "insert into administrative_user values (?,?,?,?,?,?,?)";
            preparedStatement1 = connect.prepareStatement(sql1);
            preparedStatement1.setInt(1, member_id);
            preparedStatement1.setInt(2, user_id);
            preparedStatement1.setString(3, name);
            preparedStatement1.setInt(4, year);
            preparedStatement1.setInt(5, phno);
            preparedStatement1.setString(6, gender);
            preparedStatement1.setString(7, password);
            int rowsAffected=preparedStatement1.executeUpdate();
            status = 1;

        } catch (Exception e) {
            status=-1;
            System.out.println(e);
        } finally {
            connect.close();

        }

       return status;
    }

    public int registerJuryUser(int member_id, int jury_id, int jp_id,String name,int year,String qualif,String speclsn, String pass, int phno, String gender) throws Exception{

        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultSet = null;
        int status = 0;

        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");

            String sql1 = "insert into jury_member values (?,?,?,?,?,?,?,?,?,?)";

            preparedStatement1 = connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,member_id);
            preparedStatement1.setInt(2,jury_id);
            preparedStatement1.setInt(3,jp_id);
            preparedStatement1.setString(4,name);
            preparedStatement1.setInt(5,year);
            preparedStatement1.setInt(6,phno);
            preparedStatement1.setString(7,gender);
            preparedStatement1.setString(8,pass);
            preparedStatement1.setString(9,qualif);
            preparedStatement1.setString(10,speclsn);
            int rowsAffected=preparedStatement1.executeUpdate();
            status = 1;

        }catch(Exception e){
            status=-1;
            System.out.println(e);
        }finally{
            connect.close();
        }


        return status;
    }
    public String authenticateJuryLogin(int jm_id,String password) throws Exception{
        Connection connect = null;
        Statement statement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultSet = null;
        String name="null";
        try{
            Class.forName("org.postgresql.Driver");
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Invms",
                    "postgres", "Aflah@@2002");

            statement = connect.createStatement();

            String sql1="Select password,name from jury_member where jm_id=? ";
            preparedStatement1 =connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,jm_id);

            ResultSet result=preparedStatement1.executeQuery();

            while(result.next()) {

                if (result.getString(1).equals(password)) {
                    name=result.getString(2);
                    break;
                } else {
                    continue;
                }

            }

        }catch(Exception e){
            System.out.println(e);
        }finally{
            connect.close();
        }

        return name;

    }

    public int deleteInvention(int invention_id) throws Exception{
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
            String sql1="delete from invents where invention_id=? ";
            preparedStatement1 =connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,invention_id);
            int rowsAffected=preparedStatement1.executeUpdate();

            String sql2="delete from invention where invention_id=?";
            preparedStatement2 =connect.prepareStatement(sql2);
            preparedStatement2.setInt(1,invention_id);
            int rowsAffected2=preparedStatement2.executeUpdate();

             status=1;

        }catch(Exception e){
            status=-1;
            System.out.println(e);
        }finally{
            connect.close();
        }
        return status;
    }

    public int deleteInventor(int inventor_id) throws Exception{

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

            String sql="delete from inventor_phone_number where invention_id=?";
            preparedStatement2 =connect.prepareStatement(sql);
            preparedStatement2.setInt(1,inventor_id);
            int rowsAffected0=preparedStatement2.executeUpdate();


            String sql1="delete from inventor where inventor_id=? ";
            preparedStatement1 =connect.prepareStatement(sql1);
            preparedStatement1.setInt(1,inventor_id);
            int rowsAffected=preparedStatement1.executeUpdate();
            status=1;


        }catch(Exception e){
            status=-1;
            System.out.println(e);
        }finally{
            connect.close();
        }

        return status;
    }




}


// Class For Inventor and Invention


