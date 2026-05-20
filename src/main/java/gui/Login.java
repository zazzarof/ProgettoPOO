package gui;

import javax.swing.*;

public class Login {
    private JTextField utenteTextField;
    private JTextField passwordTextField;
    private JButton loginButton;
    private JButton creaAccountButton;
    private JPanel loginForm;
    private JLabel titolo;
    private JPanel loginPanel;
    private JLabel loginLabel;
    private JLabel utenteLabel;
    private JLabel passwordLabel;
    private JLabel creaAccountLabel;

    public static void main(String[] args) {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setContentPane(new Login().loginForm);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.pack();
        loginFrame.setSize(450, 350); //grandezza della finestra
        loginFrame.setLocationRelativeTo(null); //finestra si apre al centro
        loginFrame.setResizable(false); //non cambia dimensione
        loginFrame.setVisible(true);
    }
}
