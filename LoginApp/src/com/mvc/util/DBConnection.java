package com.mvc.util;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBConnection {
 public static Connection createConnection()
 {
 Connection con = null;
 String url = "jdbc:oracle:thin:@localhost:1521:XE"; //MySQL URL and followed by the database name
 String username = "system"; //MySQL username
 String password = "root"; //MySQL password
 
 try 
 {
 try 
 {
 Class.forName("oracle.jdbc.driver.OracleDriver"); //loading mysql driver 
 } 
 catch (ClassNotFoundException e)
 {
 e.printStackTrace();
 } 
 con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 System.out.println("Printing connection object "+con);
 } 
 catch (Exception e) 
 {
 e.printStackTrace();
 }
 return con; 
 }
}