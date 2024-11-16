package Controlador;

import Vista.Login;
import BD.Conexion;
import Modelo.Cuenta;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;


/**
 *
 * @author carlos
 */
public class CuentaCON {

    public CuentaCON() {
    }

//  
public boolean loginCuenta(String usuario, String contrasena) {

    try {
        Conexion con = new Conexion();
        Connection cnx = null;
        try {
            cnx = con.obtenerConexionOracle();
        } catch (Exception ex) {
            Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no conectado");
            return false;
        }
   
        String query = "select * from cuenta where usuario = ? and contrasena = ?";
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Usuario autenticado");
                    int codUsuario = rs.getInt("cod_cuenta"); // Obtener el valor de cod_usuario
                    System.out.println("Usuario autenticado. Código de usuario: " + codUsuario);
                    
                    return true;
                } else {
                    System.out.println("Error usuario inexistente o error de contraseña");
                    System.out.println("Usuario: " + usuario + ", Contraseña: " + contrasena);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return false;
}

public int loginCuentax(String usuario, String contrasena) {
    try {
        Conexion con = new Conexion();
        Connection cnx = null;
        try {
            cnx = con.obtenerConexionOracle();
        } catch (Exception ex) {
            Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no conectado");
            return -1; // Devolver un valor predeterminado si no se conecta
        }

        String query = "select * from cuenta where usuario = ? and contrasena = ?";
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setString(1, usuario);
            stmt.setString(2, contrasena);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Usuario autenticado");
                    int codUsuario = rs.getInt("cod_cuenta"); // Obtener el valor de cod_usuario
                    System.out.println("Usuario autenticado. Código de usuario: " + codUsuario);
                    
                    return codUsuario; // Devolver el valor de cod_cuenta si el usuario está autenticado
                } else {
                    System.out.println("Error usuario inexistente o error de contraseña");
                    System.out.println("Usuario: " + usuario + ", Contraseña: " + contrasena);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return -1; // Si hay un error, devolver un valor predeterminado
}

public boolean agregarCuenta(Cuenta cuenta) throws Exception {
    try (Connection cnx = new Conexion().obtenerConexionOracle()) {
        String query = "INSERT INTO cuenta (cod_cuenta, nombres, apellidos, contrasena, usuario) VALUES (SEQ_CUENTA.NEXTVAL,?, ?, ?, ?)";
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setString(1, cuenta.getNombre());
            stmt.setString(2, cuenta.getApellidos());
            stmt.setString(3, cuenta.getContrasena());
            stmt.setString(4, cuenta.getCuenta());
            int filasInsertadas = stmt.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("Inserción exitosa: " + filasInsertadas + " fila(s) insertada(s).");
                return true;
            } else {
                System.out.println("No se insertaron filas.");
                return false;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error SQL al agregar cuenta: " + e.getMessage());
        return false;
    }
}



public DefaultListModel<String> obtenerAsignaturasFavoritas(int usuario) {
    DefaultListModel<String> listModel = new DefaultListModel<>();
   

    try {
        Conexion con = new Conexion();
        Connection cnx = null;
        try {
            cnx = con.obtenerConexionOracle();
        } catch (Exception ex) {
            Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo conectar carlos se la come");
            return listModel;
        }

        String query = "SELECT a.nombre_asignatura FROM cuenta c JOIN persona_asignatura pa ON pa.cod_cuenta = c.cod_cuenta JOIN asignaturas a ON pa.id_asignatura = a.id_asignatura WHERE c.cod_cuenta = ?";
        try (PreparedStatement stmt = cnx.prepareStatement(query)) {
            stmt.setInt(1, usuario);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) { // Mover el cursor al primer resultado
                    do {
                        String nombreAsignatura = rs.getString("nombre_asignatura"); //rescato todos los nombres de asignatura de la tabla favoritos de acuerdo al id usuario
                        listModel.addElement(nombreAsignatura); //lo registro en una lista 
                    } while (rs.next()); // Iterar sobre los resultados
                } else {
                    System.out.println("No se encontraron resultados");
                }
            }
            System.out.println(listModel);
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return listModel; //retorno la lista con todos las asignaturas favoritas
}

public boolean eliminarFavorito(int usuario, int idAsig) throws Exception {
try {
    Conexion con = new Conexion();
    Connection cnx = null;
    try {
        cnx = con.obtenerConexionOracle();
    } catch (Exception ex) {
        Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
        System.out.println("no conectado");
        return false;
    }
   
    String querySelect = "select id_relacion from persona_asignatura where cod_cuenta = ? and id_asignatura = ?";
    try (PreparedStatement stmtSelect = cnx.prepareStatement(querySelect)) {
        stmtSelect.setInt(1, usuario); // el codigo del usuario
        stmtSelect.setInt(2, idAsig); // el codigo de la asignatura
        try (ResultSet rs = stmtSelect.executeQuery()) {
            if (rs.next()) { //si hacen matach entonces obtenemos id_relacion y procede a eliminar el id relación correspondiente 
                int idRelacion = rs.getInt("id_relacion"); // Obtener el valor de id_relacion
                System.out.println("Id de relación a eliminar: " + idRelacion);
                
                String queryDelete = "DELETE FROM persona_asignatura WHERE id_relacion = ?";
                try (PreparedStatement stmtDelete = cnx.prepareStatement(queryDelete)) {
                    stmtDelete.setInt(1, idRelacion);
                    int filasEliminadas = stmtDelete.executeUpdate();
                    
                    if (filasEliminadas > 0) {
                        System.out.println("Se eliminó la fila correctamente");
                        return true;
                    } else {
                        System.out.println("No se pudo eliminar la fila");
                    }
                }
            } else {
                System.out.println("No se encontró la relación para eliminar");
            }
        }
    }
} catch (SQLException e) {
    System.out.println("ERROR: " + e.getMessage());
}
return false;}

public int obtenerIdAsignaturaPorNombre(String valor) {
    int idAsignatura = -1; // Valor predeterminado en caso de no encontrar la asignatura o errores

    try {
        Conexion con = new Conexion();
        Connection cnx = null;
        try {
            cnx = con.obtenerConexionOracle();
        } catch (Exception ex) {
            Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No conectado");
            return idAsignatura; // Devuelve el valor predeterminado
        }

        String querySelect = "SELECT id_asignatura FROM ASIGNATURAS WHERE nombre_asignatura = ?";
        try (PreparedStatement stmtSelect = cnx.prepareStatement(querySelect)) {
            stmtSelect.setString(1, valor);
            try (ResultSet rs = stmtSelect.executeQuery()) {
                if (rs.next()) {
                    idAsignatura = rs.getInt("id_asignatura");
                    System.out.println("El ID de la asignatura '" + valor + "' es: " + idAsignatura);
                } else {
                    System.out.println("No se encontró la asignatura con ese nombre");
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return idAsignatura;
}

public boolean agregarRelacion(int idAsig, int usuario) {
    try {
        Conexion con = new Conexion();
        Connection cnx = null;
        try {
            cnx = con.obtenerConexionOracle();
        } catch (Exception ex) {
            Logger.getLogger(CuentaCON.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No conectado");
            return false;
        }

        String queryInsert = "INSERT INTO persona_asignatura (id_relacion, id_asignatura, cod_cuenta) VALUES (SEQ_RELACION.NEXTVAL, ?, ?)";
        try (PreparedStatement stmtInsert = cnx.prepareStatement(queryInsert)) {
            stmtInsert.setInt(1, idAsig);
            stmtInsert.setInt(2, usuario);

            int filasInsertadas = stmtInsert.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Se agregó correctamente la relación");
                return true;
            } else {
                System.out.println("No se pudo agregar la relación");
            }
        }
    } catch (SQLException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return false;
}
}