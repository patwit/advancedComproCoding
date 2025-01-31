
    import java.awt.*;
    import java.awt.*;
    import javax.swing.*;

    
    public class Login1 extends JFrame {
    
        private JTextField usernameField;
        private JPasswordField passwordField;
        private JButton loginButton;
        private JButton cancelButton;
    
        public Login1() {
            // Set up the frame
            setTitle("Login Form");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 200);
            setLocationRelativeTo(null); // Center on screen
            setLayout(new BorderLayout());
    
            // =========== Top Panel =========== //
            JPanel topPanel = new JPanel();
            topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JLabel titleLabel = new JLabel("LOGIN");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
            topPanel.add(titleLabel);
            add(topPanel, BorderLayout.NORTH);
    
            // =========== Center Panel =========== //
            JPanel centerPanel = new JPanel();
            // Use a GridLayout with 2 rows, 2 columns
            centerPanel.setLayout(new GridLayout(2, 2, 10, 10));
    
            // Username row
            JLabel userLabel = new JLabel("Username: ");
            usernameField = new JTextField(15);
    
            // Password row
            JLabel passLabel = new JLabel("Password: ");
            passwordField = new JPasswordField(15);
    
            centerPanel.add(userLabel);
            centerPanel.add(usernameField);
            centerPanel.add(passLabel);
            centerPanel.add(passwordField);
    
            add(centerPanel, BorderLayout.CENTER);
    
            // =========== Bottom Panel =========== //
            JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
    
            loginButton = new JButton("Login");
            cancelButton = new JButton("Cancel");
    
            bottomPanel.add(loginButton);
            bottomPanel.add(cancelButton);
    
            add(bottomPanel, BorderLayout.SOUTH);
    
            // =========== Button Actions =========== //
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());
                    // Simple action - just show a message
                    JOptionPane.showMessageDialog(LoginForm.this,
                            "Logged in with username: " + username + "\nPassword: " + password,
                            "Login Clicked",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            });
    
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Clear the fields
                    usernameField.setText("");
                    passwordField.setText("");
                }
            });
        }
    
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new Login1().setVisible(true);
            });
        }
    }