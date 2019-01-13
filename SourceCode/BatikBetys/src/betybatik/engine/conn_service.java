
package betybatik.engine;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ANDITO
 */
public class conn_service {
  private static Connection koneksi;
    public static Connection configDB()throws SQLException{
        try {
            String url= "jdbc:mysql://localhost:3306/BetyBatikDb";
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return koneksi;
    }
}
