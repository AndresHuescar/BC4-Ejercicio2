import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CrearTablaOracle {
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "RIBERA";
        String password = "ribera";

        String sql = "CREATE TABLE EMPLEADO (" +
                "ID NUMBER PRIMARY KEY, " +
                "NOMBRE VARCHAR2(100), " +
                "SALARIO NUMBER)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement st = conn.createStatement()) {

            st.executeUpdate(sql);
            System.out.println("Tabla EMPLEADO creada correctamente");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}