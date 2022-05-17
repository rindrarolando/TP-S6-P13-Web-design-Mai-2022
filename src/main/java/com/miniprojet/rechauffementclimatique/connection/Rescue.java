package com.miniprojet.rechauffementclimatique.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Rescue {

    static String url="jdbc:postgresql://ec2-34-192-210-139.compute-1.amazonaws.com:5432/d7krh8g4d7dug";
    static String user="cbyldiwekhqeot";
    static String password="a897b6bb4fa42dfd4a3cd57e8fc8b55503f8e80a781eb0ce59b6ce8dd62fdac5";
    
    public static Connection connectToDatabase(){
        try{
            Connection c = null;
            Statement stmt ;
            c = DriverManager.getConnection(url,user,password);
            return c;
        }catch(Exception e){
            return null;
        }
    }
}
