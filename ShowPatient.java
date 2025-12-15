//This Class is used to Show Patient Data from a .txt File.
//This is add on Reception PAge

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;

public class ShowPatient extends JFrame {

    DefaultTableModel model;
    JTable table;
    JScrollPane sp;

    ShowPatient() throws IOException {

        File  f = new File("ShowData.txt");
        if(!f.exists()){
            JOptionPane.showMessageDialog(null,
                    "File Not Found in System",
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        BufferedReader reader = new BufferedReader(new FileReader("ShowData.txt"));
        model = new DefaultTableModel();

        String line =  reader.readLine().trim();
        String[] colTitle =line.split(",");

        model = new DefaultTableModel();
        model.setColumnIdentifiers(colTitle);

        Object[] fileData = reader.lines().toArray();

        for(int i = 0; i<fileData.length; i++){
            String lineNew = fileData[i].toString().trim();
            String[] store =lineNew.split("\\|");

            Object[] rowData = new Object[store.length];
            for (int j = 0; j < store.length; j++) {
                rowData[j] = store[j];
            }
            model.addRow(rowData);
        }

        table = new JTable(model){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        table.setForeground(Color.BLACK);
        table.setBackground(Color.LIGHT_GRAY);
        table.setSelectionBackground(new Color(81, 152, 152));

        sp = new JScrollPane(table);
        sp.setBounds(165,145,500,150);
        add(sp);

        reader.close();
        ImageIcon icon1 = new ImageIcon("E:\\Side Code\\src\\Icon.png");
        setIconImage(icon1.getImage());

        setResizable(true);
        setLocation(300,285);
        setSize(850,350);
        setTitle("Saved Patient Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
