import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Login {
    private JTextField email;

    DBlogic dblogic = new DBlogic();

    public JPanel getMain_panel() {
        return main_panel;
    }

    private JPanel main_panel;
    private JPasswordField password;
    private JButton submit;
    private JLabel login_title;
public Login() {
    submit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                dblogic.insert(email.getText());
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    });
}
}
