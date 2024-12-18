
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

class RecordFilter extends JFrame implements KeyListener {

    JLabel lid;
    JTextField tb;
    JTable ta;
    Connection cn;
    Statement st;
    int columns;
    JScrollPane sp;
    DefaultTableModel model;

    public RecordFilter() {
        setSize(500, 400);
        setResizable(true);
        setLayout(null);

        lid = new JLabel("Enter ID/Phone: ");
        lid.setBounds(100, 50, 100, 27);
        add(lid);

        tb = new JTextField();
        tb.setBounds(210, 50, 150, 27);
        add(tb);
        tb.addKeyListener(this);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
            Statement ps = cn.createStatement();
            ResultSet rst = ps.executeQuery("select * from Employee1");
            ResultSetMetaData metaData = rst.getMetaData();
            columns = metaData.getColumnCount();

            model = new DefaultTableModel();
            ta = new JTable(model);

            for (int i = 1; i <= columns; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            sp = new JScrollPane(ta);
            sp.setBounds(50, 100, 400, 150);
            add(sp);
            setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void keyPressed(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyReleased(KeyEvent ke) {
        String str = tb.getText();
        if (str.equals(" ")) {
            clearTable();
            return;
        }
        try {
            clearTable();
            PreparedStatement ps = cn.prepareStatement("select * from Employee1 where eid like ? or phone like ?");
            ps.setString(1, str + "%");
            ps.setString(2, str + "%");
            ResultSet rst = ps.executeQuery();

            while (rst.next()) {
                Vector<String> row = new Vector<>();
                for (int i = 1; i <= columns; i++) {
                    row.add(rst.getString(i));
                }
                model.addRow(row);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    void clearTable() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    public static void main(String[] args) {
        new RecordFilter();
    }
}







