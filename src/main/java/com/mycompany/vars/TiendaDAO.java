
package com.mycompany.vars;
import java.awt.BorderLayout;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    em.setId_personal(rs.getInt(1));
    em.setNombre(rs.getString(2));
    em.setPermisos(rs.getString(3));
    em.setUsuario(rs.getString(4));
    em.setContrasena(rs.getString(5));
    datos.add(em);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
    
    public ArrayList<Venta> listar_ventas() {
    String sql = "SELECT * FROM ventas;";
    ArrayList<Venta> datos_v = new ArrayList<>();

    try {
        con = acceso.Conectar();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Venta vn = new Venta();
            vn.setId_venta(rs.getInt(1));
            vn.setFecha(rs.getString(2));
            vn.setTotal(rs.getFloat(3));
            vn.setCliente(rs.getString(4));
            vn.setRecivo(rs.getString(5));
            vn.setVendedor(rs.getInt(6));
            datos_v.add(vn);
        }

        return datos_v;

    } catch (Exception e) {
        e.printStackTrace(); // para ver errores si ocurren
    }

    return null;
}

    
    
    public void crear(String Codigo , String Nombre,String Descripcion,float Precio) {
    String sql = "insert into productos (codigo,nombre,descripcion,precio) values (?,?,?,?);";
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Codigo);
    ps.setString(2,Nombre);
     ps.setString(3,Descripcion);
     ps.setFloat(4,Precio);
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
  
  public int crear_venta(float total, String cliente, String recibo) {
    String sql = "INSERT INTO ventas (fecha, total, cliente, recibo, vendedor) VALUES (?, ?, ?, ?, ?)";
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int idVenta = -1;
    
    try {
        con = acceso.Conectar();
        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
        ps.setDate(1, fechaActual);
        ps.setFloat(2, total);
        ps.setString(3, cliente);
        ps.setString(4, recibo);
        ps.setInt(5, 5); // Asumiendo que 5 es el ID del vendedor
        
        int affectedRows = ps.executeUpdate();
        
        if (affectedRows > 0) {
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                idVenta = rs.getInt(1);
            }
        }
        
        return idVenta;
        
    } catch (SQLException e) {
        System.err.println("Error al crear venta: " + e.getMessage());
        e.printStackTrace();
        return -1; 
    } finally {

        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.err.println("Error al cerrar recursos: " + e.getMessage());
        }
    }
}


  public void crear_detalle_venta_simple(int idVenta, String codigoProducto, int cantidad, double precioUnitario) {
    String sql = "INSERT INTO detalle_venta (id_venta, codigo_producto, cantidad, precio_unitario) VALUES (?, ?, ?, ?)";
    
    try (Connection con = acceso.Conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, idVenta);
        ps.setString(2, codigoProducto);
        ps.setInt(3, cantidad);
        ps.setDouble(4, precioUnitario);
        
        ps.executeUpdate();
        
    } catch (SQLException e) {
        System.err.println("Error al crear detalle venta: " + e.getMessage());
        e.printStackTrace();
    }
}
  
  public void modificar (String Codigo , String Nombre,String Descripcion,float Precio) {
    String sql = "update productos set nombre=?,descripcion=?,precio=?"
            + " where codigo=?;";
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
     ps.setString(2,Descripcion);
     ps.setFloat(3,Precio);
     ps.setString(4,Codigo);
     ps.executeUpdate();
    }catch (Exception e) {
}
  }
  
  public void modificar_resta (String Codigo , String Nombre,String Descripcion,float Precio,int Cantidad) {
    String sql = "update productos set nombre=?,descripcion=?,precio=?,"
            + " cantidad=? where codigo=?;";
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
     ps.setString(2,Descripcion);
     ps.setFloat(3,Precio);
     ps.setInt(4,Cantidad);
     ps.setString(5,Codigo);
     ps.executeUpdate();
    }catch (Exception e) {
}
  }
  
  public void modificar_empleado (String Nombre,String Permisos,String Usuario,String Contrasena) {
    String sql = "UPDATE personal SET nombre=?, permisos=?, contrasena=? WHERE usuario = ?";
      System.out.println(Usuario);
      String hashedContra = encoder.encode(Contrasena);
    try {
    con = acceso.Conectar();
    ps = con.prepareStatement(sql); 
    ps.setString(1,Nombre);
     ps.setString(2,Permisos);
     ps.setString(3,hashedContra);
     ps.setString(4, Usuario);
     ps.executeUpdate();
    }catch (Exception e) {
}
  }
  
  public boolean eliminar(String codigo) {
    try (Connection con = acceso.Conectar()) {
        con.setAutoCommit(false); 
        
        String sqlLotes = "DELETE FROM lotes WHERE producto = ?";
        try (PreparedStatement ps = con.prepareStatement(sqlLotes)) {
            ps.setString(1, codigo);
            ps.executeUpdate();
        }
        
        String sqlProducto = "DELETE FROM productos WHERE codigo = ?";
        try (PreparedStatement ps = con.prepareStatement(sqlProducto)) {
            ps.setString(1, codigo);
            int result = ps.executeUpdate();
            con.commit(); // Confirmar transacción
            return result > 0;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
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
       md.mostrar(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4));
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
  
  public void buscar2 (String codigo, JPanel panel_general){
             String sql = "SELECT * FROM `productos` WHERE `codigo` = '"+codigo+"';";
             System.out.println(sql);
              try {
           con = acceso.Conectar();
     ps= con.prepareStatement(sql);
     rs = ps.executeQuery();
     if (rs.next()) {
        Crear_lote md = new Crear_lote (panel_general);
       md.mostrar(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4));
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
    em.setId_personal(rs.getInt(1));
    em.setNombre(rs.getString(2));
    em.setPermisos(rs.getString(3));
    em.setUsuario(rs.getString(4));
    em.setContrasena(rs.getString(5));
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
    vn.setId_venta(rs.getInt(1));
    vn.setFecha(rs.getString(2));
    vn.setTotal(rs.getFloat(3));
    vn.setCliente(rs.getString(4));
    vn.setRecivo(rs.getString(5));
    vn.setVendedor(rs.getInt(6));
    datos.add(vn);
}
 return datos ;
    }catch (Exception e) {
}
    return null;
    }
  
  public void reducir_stock(String codigo, int cantidad) {
    Connection con = null;
    try {
        con = acceso.Conectar();
        con.setAutoCommit(false); // Iniciar transacción
        
        // 1. Verificar que existe el producto y tiene stock suficiente
        if (!verificarStockDisponible(con, codigo, cantidad)) {
            System.out.println("Stock insuficiente para el producto: " + codigo);
            return;
        }
        
        // 2. Reducir de lotes (empezando por los más próximos a caducar)
        int cantidadRestante = reducirDeLotes(con, codigo, cantidad);
        
        // 3. Actualizar stock en tabla productos
        actualizarStockProducto(con, codigo, cantidad);
        
        con.commit(); // Confirmar transacción
        System.out.println("Stock actualizado correctamente");
        
    } catch (SQLException e) {
        if (con != null) {
            try {
                con.rollback(); // Revertir en caso de error
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback: " + ex.getMessage());
            }
        }
        System.err.println("Error al reducir stock: " + e.getMessage());
        e.printStackTrace();
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
}
  
  private boolean verificarStockDisponible(Connection con, String codigo, int cantidad) throws SQLException {
    String sql = "SELECT cantidad FROM productos WHERE codigo = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, codigo);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("cantidad") >= cantidad;
            }
            return false;
        }
    }
}

private int reducirDeLotes(Connection con, String codigo, int cantidad) throws SQLException {
    int cantidadRestante = cantidad;
    
    // Obtener lotes ordenados por fecha de caducidad (más próximos primero)
    String sql = "SELECT id_lote, cantidad FROM lotes " +
                 "WHERE producto = ? AND cantidad > 0 " +
                 "ORDER BY fecha_caducidad ASC";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, codigo);
        try (ResultSet rs = ps.executeQuery()) {
            
            while (rs.next() && cantidadRestante > 0) {
                int idLote = rs.getInt("id_lote");
                int cantidadLote = rs.getInt("cantidad");
                int cantidadAReducir = Math.min(cantidadRestante, cantidadLote);
                
                // Actualizar lote
                actualizarLote(con, idLote, cantidadLote - cantidadAReducir);
                cantidadRestante -= cantidadAReducir;
            }
        }
    }
    
    return cantidadRestante;
}

private void actualizarLote(Connection con, int idLote, int nuevaCantidad) throws SQLException {
    if (nuevaCantidad <= 0) {
        // Eliminar lote si cantidad llega a 0 o menos
        String deleteSql = "DELETE FROM lotes WHERE id_lote = ?";
        try (PreparedStatement ps = con.prepareStatement(deleteSql)) {
            ps.setInt(1, idLote);
            ps.executeUpdate();
            System.out.println("Lote " + idLote + " eliminado por agotamiento");
        }
    } else {
        // Actualizar cantidad en lote
        String updateSql = "UPDATE lotes SET cantidad = ? WHERE id_lote = ?";
        try (PreparedStatement ps = con.prepareStatement(updateSql)) {
            ps.setInt(1, nuevaCantidad);
            ps.setInt(2, idLote);
            ps.executeUpdate();
        }
    }
}

private void actualizarStockProducto(Connection con, String codigo, int cantidadReducida) throws SQLException {
    String sql = "UPDATE productos SET cantidad = cantidad - ? WHERE codigo = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, cantidadReducida);
        ps.setString(2, codigo);
        ps.executeUpdate();
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
         System.out.println(rs.getString(5));
       if (encoder.matches(Contrasena,rs.getString(5))){
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
  
  public void crear_lote(String producto, String numeroLote, java.util.Date fechaCaducidad, int cantidad) {
    String sql = "{call gestionar_lote(?, ?, ?, ?, ?)}";
    
    try (Connection con = acceso.Conectar();
         CallableStatement cs = con.prepareCall(sql)) {
        
        java.sql.Date fechaActual = new java.sql.Date(System.currentTimeMillis());
        java.sql.Date fechaCaducidadSQL = new java.sql.Date(fechaCaducidad.getTime());

        cs.setString(1, producto);
        cs.setString(2, numeroLote);
        cs.setDate(3, fechaActual);
        cs.setDate(4, fechaCaducidadSQL);
        cs.setInt(5, cantidad);
        
        boolean hasResults = cs.execute();
        if (hasResults) {
            try (ResultSet rs = cs.getResultSet()) {
                if (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            }
        }
        
    } catch (SQLException e) {
        if ("45000".equals(e.getSQLState())) {
            System.out.println("Aviso: " + e.getMessage());
        } else {
            e.printStackTrace();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
  
}