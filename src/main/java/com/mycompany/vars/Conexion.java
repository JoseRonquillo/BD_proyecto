
package com.mycompany.vars;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //el static connecction no es necesario para la conexion basica
    static Connection contacto=null;
    Connection con;
    String url="jdbc:mysql://localhost:3306/vars2";
    String user="root";
    String pass="";
    
   
    public Connection Conectar(){
     try {
     Class.forName("com.mysql.cj.jdbc.Driver");
     con=DriverManager.getConnection(url,user,pass);
     
     }catch (Exception e) {
         System.out.println("e");}
     return con;
      //este public connection no es necesario para la conexion basica
    }
    public static Connection getConexion(){
    String url="jdbc:mysql://localhost:3306/vars";
    
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
    }catch (Exception e) {
        
}
    
    try{  
    contacto = DriverManager.getConnection(url,"root","");
    }catch (Exception e) {
        
}
    return contacto;
    }
    

    public static void main(String[] args) {
        Conexion sp= new Conexion();
        System.out.println(sp.Conectar());
    }
}