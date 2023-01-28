package com.company;
import java.sql.*;
public class creator {
    PreparedStatement stmt ;

    public creator(int er){
        connect s =  new connect();
        Connection conn = s.con;
        String sql ="insert  into customer_service values("+er+",'','','',0)";
        try {
            stmt = conn.prepareStatement(sql);
            int rs = stmt.executeUpdate();
            if(rs!=0)
            {
                System.out.println(er);
            }
            else
            {
                System.out.println("unable  to  login");
            }

        }
        catch (SQLException ep){
            ep.printStackTrace();
        }
    }



    public static void main(String args[]) {
        int er =49;
        for(;er<=49;er++)
        {
            new  creator(er);
        }

    }
}