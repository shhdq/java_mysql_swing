import com.mysql.cj.log.Log;

import javax.swing.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


        Login login = new Login();
        Calculator calc = new Calculator();


        JFrame frame = new JFrame("Login form");

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(calc.getMain_panel());

        frame.setVisible(true);


    }
}