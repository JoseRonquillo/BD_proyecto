
package com.mycompany.vars;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TiendaDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public ArrayList<producto> listar (){
        String sql = "select * from productos;";
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<producto>datos = new ArrayList<producto>();
 while (rs.next()){
    //System.out.println("==============================");
    //System.out.println("Codigo: "+rs.getString(1));
    //System.out.println("Nombre: "+rs.getString(2));
    //System.out.println("Cantidad: "+rs.getInt(5));
    //System.out.println("Precio: "+rs.getFloat(4));
    //System.out.println("Descripcion: "+rs.getString(3));
    producto pr = new producto();
    pr.setCodigo(rs.getString(1));
    pr.setNombre(rs.getString(2));
    pr.setDescripcion(rs.getString(3));
    pr.setPrecio(rs.getFloat(4));
    pr.setCantidad(rs.getInt(5));
    pr.setLote(rs.getInt(6));
    datos.add(pr);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
    public ArrayList<empleado> listar_empleados (){
        String sql = "select * from personal;";
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<empleado>datos = new ArrayList<empleado>();
 while (rs.next()){
    empleado em = new empleado();
    em.setNombre(rs.getString(1));
    em.setPermisos(rs.getString(2));
    em.setUsuario(rs.getString(3));
    em.setContrasena(rs.getString(4));
    datos.add(em);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
    public ArrayList<Venta> listar_ventas (){
        String sql = "select * from ventas;";
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<Venta>datos_v = new ArrayList<Venta>();
 while (rs.next()){
    Venta vn = new Venta();
    vn.setFecha(rs.getString(1));
    vn.setProductos(rs.getString(2));
    vn.setTotal(rs.getFloat(3));
    vn.setCliente(rs.getString(4));
    vn.setRecivo(rs.getString(5));
    datos_v.add(vn);
}
 return datos_v ;
    }catch (Exception e) {
}
    return null;
    }
    
    
    public void crear(String Codigo , String Nombre,String Descripcion,float Precio,int Cantidad,int Lote) {
    String sql = "insert into productos (codigo,nombre,descripcion,precio,cantidad,lote) values (?,?,?,?,?,?);";
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Codigo);
    ps.setString(2,Nombre);
     ps.setString(3,Descripcion);
     ps.setFloat(4,Precio);
     ps.setInt(5, Cantidad);
     ps.setInt(6, Lote);
     ps.executeUpdate();
    }catch (Exception e) {
}
 }   
    
  public void crear_empleado(String Nombre,String Permisos,String Usuario,String Contrasena) {
    String sql = "insert into personal (nombre,permisos,usuario,contrasena) values (?,?,?,?);";
    String hashedContra = encoder.encode(Contrasena);
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
    ps.setString(2,Permisos);
     ps.setString(3,Usuario);
     ps.setString(4,hashedContra);
     ps.executeUpdate();
    }catch (Exception e) {
}
 }
  
  public void crear_venta(String producto,float total,String cliente,String recibo) {
    String sql = "insert into ventas (fecha,productos,total,cliente,recibo) values (?,?,?,?,?);";
    Date fechaActual = new Date(System.currentTimeMillis());
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql);
    ps.setDate(1, fechaActual);
    ps.setString(2,producto);
    ps.setFloat(3,total);
    ps.setString(4,cliente);
    ps.setString(5,recibo);
    ps.executeUpdate();
    }catch (Exception e) {
}
    
 }
  
  public void modificar (String Codigo , String Nombre,String Descripcion,float Precio,int Cantidad) {
    String sql = "update productos set nombre=?,descripcion=?,precio=?,"
            + "cantidad=? where codigo=?;";
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
     ps.setString(2,Descripcion);
     ps.setFloat(3,Precio);
     ps.setInt(4, Cantidad);
     ps.setString(5,Codigo);
     ps.executeUpdate();
    }catch (Exception e) {
}
  }
  
  public void modificar_empleado (String Nombre,String Permisos,String Usuario,String Contrasena) {
    String sql = "UPDATE personal SET nombre=?, permisos=?, contrasena=? WHERE usuario = ?";
      System.out.println(Usuario);
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
     ps.setString(2,Permisos);
     ps.setString(3,Contrasena);
     ps.setString(4, Usuario);
     ps.executeUpdate();
    }catch (Exception e) {
}
  }
  
  public void eliminar (String Codigo){
      String sql = "delete from productos where codigo=?;";
      try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
      ps.setString(1, Codigo);
      ps.executeUpdate();
          
           }catch (Exception e) {
}
      }
  
  public void eliminar_empleado (String Usuario){
      String sql = "delete from personal where usuario=?;";
      try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
      ps.setString(1, Usuario);
      ps.executeUpdate();
          
           }catch (Exception e) {
}
      }
  
  public void buscar (String codigo, JPanel panel_general){
             String sql = "SELECT * FROM `productos` WHERE `codigo` = '"+codigo+"';";
             System.out.println(sql);
              try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
        Modificar md = new Modificar (panel_general);
       md.mostrar(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
        md.setSize(807,511);
        md.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(md,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
}
  
  public void buscar_empleado (String usuario, JPanel panel_general){
             String sql = "SELECT * FROM `personal` WHERE `usuario` = '"+usuario+"'";

              try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
        Modificar_empleado md = new Modificar_empleado (panel_general);
       md.mostrar(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
        md.setSize(807,511);
        md.setLocation(0,0);
        panel_general.removeAll();
        panel_general.add(md,BorderLayout.CENTER);
        panel_general.revalidate();
        panel_general.repaint();
} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
}
  
  public ArrayList<producto> listar_busqueda (String sql){
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<producto>datos = new ArrayList<producto>();
 while (rs.next()){
    producto pr = new producto();
    pr.setCodigo(rs.getString(1));
    pr.setNombre(rs.getString(2));
    pr.setDescripcion(rs.getString(3));
    pr.setPrecio(rs.getFloat(4));
    pr.setCantidad(rs.getInt(5));
    pr.setLote(rs.getInt(6));
    datos.add(pr);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
  
  public ArrayList<empleado> listar_empleados_busqueda (String sql){
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<empleado>datos = new ArrayList<empleado>();
 while (rs.next()){
    empleado em = new empleado();
    em.setNombre(rs.getString(1));
    em.setPermisos(rs.getString(2));
    em.setUsuario(rs.getString(3));
    em.setContrasena(rs.getString(4));
    datos.add(em);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
  
  public ArrayList<Venta> listar_busqueda_venta (String sql){
    try {
 con = acceso.Conectar ();
 ps= con.prepareStatement(sql);
 rs = ps.executeQuery();
 ArrayList<Venta>datos = new ArrayList<Venta>();
 while (rs.next()){
    Venta vn = new Venta();
    vn.setFecha(rs.getString(1));
    vn.setProductos(rs.getString(2));
    vn.setTotal(rs.getFloat(3));
    vn.setCliente(rs.getString(4));
    vn.setRecivo(rs.getString(5));
    datos.add(vn);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
  
  public void reducir_stock(String Codigo,int Cantidad){
      String sql = "SELECT * FROM `productos` WHERE `codigo` = '"+Codigo+"';";
              try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
       modificar(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5)-Cantidad);

} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
  }
  
  public Boolean verificar_login(String Usuario, String Contrasena){
      Boolean comprobado = false;
      String sql = "SELECT * FROM `personal` WHERE `usuario` = '"+Usuario+"'";
      try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
       if (encoder.matches(Contrasena,rs.getString(4))){
           comprobado = true;
       }
} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
      return comprobado;
  }
  
  public String obtener_permisos(String Usuario, String Contrasena){
      String permisos = "";
      String sql = "SELECT * FROM `personal` WHERE `usuario` = '"+Usuario+"'";
      try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
         permisos = rs.getString(2);
} else {
        System.out.println("Caracter invalido");
} 
          
           }catch (Exception e) {
}
      return permisos;
  }
  
  public void crear_lote(String producto, String numeroLote, java.util.Date fechaCaducidad, int Cantidad) {
    String sql = "INSERT INTO lotes (producto, numero_lote, fecha_ingreso, fecha_caducidad, cantidad) VALUES (?, ?, ?, ?, ?);";
    
    try (Connection con = acceso.Conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        // Fecha actual generada en Java (tipo java.sql.Date)
        java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
        
        // Convertir fechaCaducidad (java.util.Date) a java.sql.Date
        java.sql.Date fechaCaducidadSQL = new java.sql.Date(fechaCaducidad.getTime());
        
        // Parámetros del INSERT
        ps.setString(1, producto);
        ps.setString(2, numeroLote);
        ps.setDate(3, fechaActual);
        ps.setDate(4, fechaCaducidadSQL); 
        ps.setInt(5, Cantidad);
        
        ps.executeUpdate();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
  
}