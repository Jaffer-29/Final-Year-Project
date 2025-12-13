//This GUI Interface is Make up with JTable Component. It make the Data Organize.

import javax.swing.*;
import java.awt.*;

class Department extends JFrame {
    JTable tb;
    JScrollPane sp;
    JButton back;

    Department(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,5,840,540);
        panel.setBackground(new Color(129, 133, 137	 ));
        add(panel);

        JLabel labelName= new JLabel("\"Hospital Department Directory\"");
        labelName.setForeground(Color.BLACK);
        labelName.setBounds(50, 30, 550, 50);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setFont(new Font("Roboto",Font.BOLD,20));
        panel.add(labelName);

        String[][] data = {
                {"Emergency Department", "Dr. Zohaib Ahmed", "Ground Floor", "24/7"},
                {"Radiology Department","Dr. Saira","Ground Floor", "8:00 AM – 10:00 PM"},
                {"Outpatient Department", "Dr. Ali Raza", "1st Floor", "8:00 AM – 4:00 PM"},
                {"Cardiology Department","Dr. Farhan","1st Floor","9:00 AM – 5:00 PM"},
                {"Pediatrics Department","Dr. Hira","1st Floor","9:00 AM – 5:00 PM"},
                {"Laboratory Department", "Dr. Asfand Yar", "1st Floor", "7:00 AM – 11:00 PM"},
                {"Intensive Care Unit", "Dr. Inaya", "2nd Floor", "24/7"},
                {"Surgery Department", "Dr. Babar Ali", "2nd Floor", "On-Call (Emergency 24/7)"}
        };
        String[] colData = {
                "Department","Head of Department","Location","Operating Hours"
        };

        tb = new JTable(data,colData);
        tb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tb.setForeground(Color.WHITE);
        tb.setBackground(Color.GRAY);
        tb.setSelectionBackground(new Color(200, 200, 200));
        tb.setSelectionForeground(Color.BLACK);
        sp = new JScrollPane(tb);
        sp.setBounds(20, 140, 600, 153);
        panel.add(sp);


        back= new JButton("Back");
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setBounds(260,355,120,30);
        back.setFocusPainted(false);
        back.setBorder(null);
        back.addActionListener(ae->{
            dispose();
        });
        panel.add(back);

        ImageIcon icon = new ImageIcon("E:\\2nd Semester\\src\\Icon.png");
        setIconImage(icon.getImage());

        setResizable(true);
        setLocation(300,285);
        setSize(650,450);
        setTitle("Hospital Department Directory");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
