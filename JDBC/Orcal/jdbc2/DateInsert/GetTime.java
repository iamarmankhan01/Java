
import java.sql.*;

class GetTime {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
        Statement st = conn.createStatement();
        st.executeUpdate("drop table survey113");
        st.executeUpdate("create table survey113(id number(3),myDate TIMESTAMP )");

        String INSERT_RECORD =  " insert into survey113(id,mydate) value(?,?)";

        PreparedStatement pstm = conn.prepareStatement(INSERT_RECORD);
        pstm.setInt(1, 1);
        java.sql.Time sqlDate = new java.sql.Time(new java.util.Date().getTime());
        pstm.setTime(2, sqlDate);
        pstm.executeUpdate();

        ResultSet rs = st.executeQuery("select * from survey113");
        while(rs.next()){
            System.out.println(rs.getTime(2));
        }
        rs.close();
        st.close();
        conn.close();
        

        

    }
}
