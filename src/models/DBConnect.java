// Nombre del paquete donde se encuentra la clase
package models;
// Importación de las librerías requeridas
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
// Clase de conexión a la base de datos
public class DBConnect {
    // Constantes para configurar la conexión a la base de datos
    public final String URLDB = "jdbc:mysql://localhost:3306/";
    public final String USERDB = "root";
    public final String PASSDB = "";
    public final String DBNAME = "tests";
    Connection dbConnection;
     // Método que se encarga de obtener la conexión a la base de datos  
    public Connection getConnection() {
        // Utilizamos un Try y Catch para atrapar el error en caso de ocurrencia
        try {
            // Utilizamos el driver requerido (mysql)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecemos la conexión
            dbConnection = (Connection) DriverManager.getConnection(URLDB + DBNAME, USERDB, PASSDB);
            // Si ocurre un error cuando se establece la conexión, esta se atrapa aquí
        } catch (ClassNotFoundException|SQLException e) {
            // Muestra un mensaje de error y termina la ejecución de la aplicación
            JOptionPane.showMessageDialog(null, "Error: No es posible conectar a la base de datos.");
            System.exit(0);
        }
        // En caso que se establezca la conexión sin problemas la retornamos
        return dbConnection;
    }
}
