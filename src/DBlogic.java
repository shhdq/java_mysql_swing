import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/java_sql";
    String USER = "root";
    String PASS = "biskviits";

    // method - insert, connection, insert
    public void insert(String email) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String sql = "INSERT INTO users (email) VALUES ('"+ email +"')";

        stmt.executeUpdate(sql);

        System.out.println("Dati tika ierakstīti");

    }

    // method - delete, connection, delete
    public void delete(int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String sql = "DELETE FROM users WHERE id = '"+ id +"'";

        stmt.executeUpdate(sql);

        System.out.println("Dati tika dzēsti");
    }

    // method - select, connection, select
    public void select() throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet resultset = stmt.executeQuery("SELECT id, email FROM users");

        while(resultset.next()) {
            System.out.println("id: " + resultset.getInt("id"));
            System.out.println("E-mail: " + resultset.getString("email"));
            System.out.println(" ");
        }
    }

    // method - update, connection, update
    public void update(String email, int id) throws SQLException {
        Connection conn = DriverManager.getConnection(DB, USER, PASS);
        Statement stmt = conn.createStatement();

        String sql = "UPDATE users SET email = ? WHERE id = '"+ id +"'";

        stmt.executeUpdate(sql);

        System.out.println("Dati tika atjaunoti uz: " + email);
    }



}
