
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class RecordScroll extends JFrame implements AdjustmentListener {

    Connection cn;
    Statement st;
    Scrollbar bar;
    JLabel[] labels = new JLabel[4];
    JTextField[] fields = new JTextField[4];
    ResultSet rst;
    JLabel recordView;
    int totalRecords = 0;

    public RecordScroll() {
        setTitle("Record Scroll");
        setSize(400, 400);
        setResizable(false);
        setLayout(null);

        String[] columnNames = {"Sid", "Name", "City", "Age"};
        int y = 50;
        for (int i = 0; i < labels.length; i++) {
            labels[i] = new JLabel(columnNames[i]);
            labels[i].setBounds(100, y, 90, 27);
            add(labels[i]);

            fields[i] = new JTextField();
            fields[i].setBounds(200, y, 150, 27);
            add(fields[i]);

            y += 60;
        }

        recordView = new JLabel();
        recordView.setBounds(100, 270, 200, 30);
        add(recordView);

        bar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 1, 1); // Placeholder
        bar.setBounds(100, 300, 200, 30);
        add(bar);
        bar.addAdjustmentListener(this);

        connectDatabase();
        if (totalRecords > 0) {
            bar.setMaximum(totalRecords + 1);
            showRecord(1);
        } else {
            JOptionPane.showMessageDialog(this, "No records found.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void connectDatabase() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
            System.out.println("Connection____-");
            st = cn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rst = st.executeQuery("SELECT * FROM Student");

            while (rst.next()) {
                totalRecords++;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    void showRecord(int recordNumber) {
        try {
            if (rst.absolute(recordNumber)) {
                for (int i = 0; i < fields.length; i++) {
                    fields[i].setText(rst.getString(i + 1));
                }
                recordView.setText(recordNumber + " / " + totalRecords);
            }
        } catch (Exception ex) {
            System.out.println("Error showing record: " + ex.getMessage());
        }
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        showRecord(e.getValue() + 1);
    }

    public static void main(String[] args) {
        new RecordScroll();
    }
}

