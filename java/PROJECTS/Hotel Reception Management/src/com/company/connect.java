package com.company;

import java.sql.*;

public class  connect {
    Connection con;
    public  connect(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
            System.out.println("Success");
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("class not  found");
        }
    }
}
