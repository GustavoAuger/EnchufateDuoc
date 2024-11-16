/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author administrador
 */
public class Conexion {
    
    
    // DE ACA COMIENZA LA CONEXION A ORACLE
    private static final String WALLET_PATH = "src/wallet";
    private static final String WALLET_PASSWORD = "asddsa123DDD$";
    private static final String JDBC_URL = "jdbc:oracle:thin:@SEGUNDO_SEMESTRE"; // - REEMPLAZA 'testdb_high' EN EL ARCHIVO TNSNAMES.ORA APARECE AL INICIO [NOMBRE DE LA DB]_HIGH";

    public Connection obtenerConexionOracle() throws Exception {
        // Configuración del wallet
        String trustStorePath = Paths.get(WALLET_PATH, "truststore.jks").toString();
        String keyStorePath = Paths.get(WALLET_PATH, "keystore.jks").toString();

        System.setProperty("oracle.net.tns_admin", WALLET_PATH);
        System.setProperty("javax.net.ssl.trustStore", trustStorePath);
        System.setProperty("javax.net.ssl.trustStorePassword", WALLET_PASSWORD);
        System.setProperty("javax.net.ssl.keyStore", keyStorePath);
        System.setProperty("javax.net.ssl.keyStorePassword", WALLET_PASSWORD);

        Properties properties = new Properties();
        properties.put("user", "admin");
        properties.put("password", WALLET_PASSWORD);
        System.out.println("conectadox");
        return DriverManager.getConnection(JDBC_URL, properties);
        
    }
    // ------- * --------
    
}
