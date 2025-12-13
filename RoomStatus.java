//This Class has the info for the Rooms in the Hospital.
//Use JTable for the data display

import javax.swing.*;
import java.awt.*;

class RoomStatus extends JFrame {
    JTable tb;
    JScrollPane sp;
    JButton back;

    RoomStatus(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,5,840,540);
        panel.setBackground(new Color(129, 133, 137	 ));
        add(panel);

        JLabel labelName= new JLabel("\"Hospital Room Details\"");
        labelName.setForeground(Color.BLACK);
        labelName.setBounds(50, 20, 650, 50);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setFont(new Font("Roboto",Font.BOLD,20));
        panel.add(labelName);

        String[][] data = {
                {"Room # 001", "Emergency Room", "Ground Floor", "Dr. Zohaib Ahmed, Atif Ahmed"},
                {"Room # 003", "Dressing Room", "Ground Floor", "Shah Jahan - Nurse"},
                {"Room # 002", "Medical Imaging Room", "Ground Floor", "Hamza Nasir- Assistant Staff"},

                {"Room # 101", "Laboratory", "First Floor", "Dr. Asfand Yar - Lab In-Charge"},
                {"Room # 102", "Outpatient Department", "First Floor", "Dr. Ali Raza - Consultant"},
                {"Room # 103", "Cardiology Department", "First Floor", "Dr. Farhan - Cardiologist"},
                {"Room # 104", "Pediatrics Room", "First Floor", "Dr. Hira - Pediatrician"},

                {"Room # 201", "ICU", "Second Floor", "Dr. Inaya - Senior Consultant"},
                {"Room # 202", "Surgery Department", "Second Floor", "Dr. Babar Ali - Senior Consultant"},

                {"OT-205", "Operation Theater", "Second Floor", "Dr. Farhan, Nadeem"},
                {"OT-206", "Operation Theater", "Second Floor", "Dr. Babar Ali, Hamza Nasir"},
                {"OT-207", "Operation Theater", "Second Floor", "Dr. Ali Raza, Nadeem"},

                {"G-301", "General Ward", "Third Floor", "Shah Jahan - Nurse"},
                {"G-302", "Private Room", "Third Floor", "Atif Ahmed - Nurse"},
                {"G-303", "Private Room", "Third Floor", "Shah Jahan - Nurse"}
        };
        String[] colData = {
                "Room Number","Room Type","Floor","Assigned Staff"
        };
        tb = new JTable(data,colData);

        tb.getColumnModel().getColumn(0).setPreferredWidth(120);
        tb.getColumnModel().getColumn(1).setPreferredWidth(160);
        tb.getColumnModel().getColumn(2).setPreferredWidth(120);
        tb.getColumnModel().getColumn(3).setPreferredWidth(250);
        tb.getRowHeight(60);

        tb.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        tb.setForeground(Color.WHITE);
        tb.setBackground(Color.GRAY);
        tb.setSelectionBackground(new Color(200, 200, 200));
        tb.setSelectionForeground(Color.BLACK);
        sp = new JScrollPane(tb);
        sp.setBounds(30, 110, 680, 266);
        panel.add(sp);


        back= new JButton("Back");
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.setBounds(305,430,120,30);
        back.setFocusPainted(false);
        back.setBorder(null);
        back.addActionListener(ae->{
            dispose();
        });
        panel.add(back);

        ImageIcon icon = new ImageIcon("E:\\2nd Semester\\src\\Icon.png");
        setIconImage(icon.getImage());
        
        setLayout(null);
        setResizable(false);
        setLocation(300,285);
        setSize(750,550);
        setTitle("Room Directory");
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
