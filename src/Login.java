import javafx.scene.control.ButtonType;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private static JPanel panel = new JPanel();
    private static JFrame frame = new JFrame();
    private static JTextField userText = new JTextField(20);
    private static JTextField passText = new JTextField(20);
    private static JLabel userLabel = new JLabel();
    private static JLabel passLabel = new JLabel();
    private static JButton button = new JButton("Login");

    public static void main(String[] args){


        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel.setText("User Login");
        userLabel.setBounds(10, 25, 80, 25);
        panel.add(userLabel);

        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);


        passLabel.setText("Password");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);

        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);

        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Login());
        panel.add(button);


        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userCheck = userText.getText();
        String passwordCheck = passText.getText();
        System.out.println(userCheck + " " + passwordCheck);

        if(userCheck.equals("Dynamic") && passwordCheck.equals("Douge")){
            System.out.println("Seems Good to me!");
        }
    }
}
