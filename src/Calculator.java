import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator {

    ArrayList<String> res = new ArrayList<>();

    int x;
    private JButton one;
    private JButton four;
    private JButton seven;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton zero;
    private JButton button1;
    private JButton nine;
    private JButton six;
    private JButton three;
    private JButton button12;
    private JButton xButton;
    private JButton minus;
    private JButton pluss;
    private JButton equals;
    private JButton cButton;
    private JButton button7;
    private JButton button8;
    private JButton divide;

    public Calculator() {
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(result.getText() == "0") {
                    result.setText("");
                }
                res.add("1");
                result.setText(result.getText() + 1);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res.add("2");
                result.setText(result.getText() + 2);
            }
        });
        pluss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                res.add("+");
                result.setText(result.getText() + "+");
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(res.contains("+")) {

                    int x = Integer.parseInt(res.get(0));
                    int y = Integer.parseInt(res.get(2));

                    int math_res = x + y;
                    result.setText(String.valueOf(math_res));

                    System.out.println(res);
                }
            }
        });
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result.setText("0");
            }
        });
    }

    public JPanel getMain_panel() {
        return main_panel;
    }

    private JPanel main_panel;
    private JLabel result;




 }
