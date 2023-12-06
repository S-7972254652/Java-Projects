package helper;

import java.util.*;
import java.sql.*;


public class SqliteHelper {
public static Connection c = null;
public static Connection getConnection() throws Exception {
    
    if(c == null){
        Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("jdbc:sqlite:/E:/workspace/shopping_cart.db");
    }
        return c;
    }

public static void closeConnection(Connection con){
    try{
        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }

}}

