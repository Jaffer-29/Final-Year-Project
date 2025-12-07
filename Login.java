import javax.swing.*;
import java.awt.*;

public class FirstcGUI {
    public static void main(String[] arg){
        Login l =  new Login();
    }
}


class Login extends JFrame{
    JLabel username, password;
    JTextField text;
    JPasswordField passwordField;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JButton login,cancel;
    Login()
    {
        username = new JLabel();
        username.setText("Username  :");
        username.setBounds(20,100,200,100);
        username.setFont(new Font("Arial",Font.BOLD,20));
        add(username);

        password = new JLabel();
        password.setText("Password  :");
        password.setBackground(new Color(0, 0, 0));
        password.setBounds(20,140,200,100);
        password.setFont(new Font("Arial",Font.BOLD,20));
        add(password);


        text = new JTextField();
        text.setBounds(150,135,160,30);
        text.setFont(new Font("Arial",Font.BOLD,15));
        text.setBorder(null);
        add(text);


        passwordField = new JPasswordField();
        passwordField.setBounds(150,175,160,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,15));
        passwordField.setBorder(null);
        add(passwordField);


        JButton eyeBtn = new JButton("👁");
        eyeBtn.setBorder(null);
        eyeBtn.setContentAreaFilled(false);
        eyeBtn.setFocusPainted(false);
        eyeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        eyeBtn.setBounds(250,175,160,30);
        char defaultEcho = passwordField.getEchoChar();
        eyeBtn.addActionListener(e -> {
            if (passwordField.getEchoChar() == 0) {
                passwordField.setEchoChar(defaultEcho);
                eyeBtn.setText("👁");
            } else {
                passwordField.setEchoChar((char) 0);
                eyeBtn.setText("Hide");
            }
        });
        add(eyeBtn);

        r1 = new JRadioButton("Admin");
        r1.setBorder(null);
        r1.setBackground(null);
        r1.setBounds(150,220,75,30);
        add(r1);

        r2 = new JRadioButton("Receptionist");
        r2.setBorder(null);
        r2.setBackground(null);
        r2.setBounds(225,220,160,30);
        add(r2);

        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        login = new JButton("Login");
        login.setBounds(185,270,80,30);
        login.setBorder(null);
        login.addActionListener(ae->{
            if (r1.isSelected()) {
                String user = text.getText();
                String pass = new String(passwordField.getPassword());
                if (user.equalsIgnoreCase("admin@gmail.com") && pass.equals("admin123")) {
                    System.out.println("Login Successfully");
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password",
                            "Login Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Incorrect username or password");
                    System.out.println("Incorrect username or password");
                }
            }else if(r2.isSelected())
            {
                    String user = text.getText();
                    String pass = new String(passwordField.getPassword());
                    if (user.equalsIgnoreCase("receptionist@gmail.com") && pass.equals("recep123")) {
                        System.out.println("Login Successfully");
                    } else {
                        JOptionPane.showMessageDialog(null,"Incorrect username or password",
                                "Login Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Incorrect username or password");
                    }
                }
            else{
                JOptionPane.showMessageDialog(null,"Select Your Status",
                        "Login Error", JOptionPane.ERROR_MESSAGE);
                System.out.println("Incorrect username or password");
            }

        });
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(185,305,80,30);
        cancel.setBorder(null);
        cancel.addActionListener(ae->{
            dispose();
        });
        add(cancel);




        setLayout(null);
        setLocation(150,300);
        getContentPane().setBackground(new Color(186, 138, 138));
        ImageIcon i = new ImageIcon("C:\\Users\\Pc\\IdeaProjects\\JavaLearn\\src\\GUILearning\\image.png");
        setIconImage(i.getImage());
        setTitle("New GUI Code Learning");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);
        setVisible(true);
    }
}