import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Rsmd2 {
    public static void main(String[] args) throws Exception {
        Connection conn = getOracleConnection();
        
        Statement st = conn.createStatement();
        
        // Drop and recreate table
        st.executeUpdate("DROP TABLE survey PURGE");
        st.executeUpdate("CREATE TABLE survey (id NUMBER(4), name VARCHAR(30))");
        
        // Insert a record
        st.executeUpdate("INSERT INTO survey (id, name) VALUES (9, 'messa')");

        // Execute query
        ResultSet rs = st.executeQuery("SELECT * FROM survey");
        ResultSetMetaData rsMetaData = rs.getMetaData();

        int numberOfColumns = rsMetaData.getColumnCount();
        System.err.println("ResultSet MetaData column count = " + numberOfColumns);

        for (int i = 1; i <= numberOfColumns; i++) {
            System.out.println("Column MetaData for column " + i);

            //indicate the designated column's normal maximum width in characters
            System.out.println(rsMetaData.getColumnDisplaySize(i));

            //gets the designated column's suggested title for use in printouts and displays.
            System.out.println(rsMetaData.getColumnLabel(i));

            //get the designated column's name.
            System.out.println(rsMetaData.getColumnClassName(i));

            //get the designated column's SQL type.
            System.out.println(rsMetaData.getColumnType(i));

           //get the designate column's SQL type name.
           System.out.println(rsMetaData.getColumnTypeName(i));

           //get the designate column class name.
           System.out.println(rsMetaData.getTableName(i));

           //get the designate column number of decimal digits.
           System.out.println(rsMetaData.getPrecision(i));

           //gets the designate column number of digits to right of the decimal point.
           System.out.println(rsMetaData.getScale(i));

           //indicates whether the designated column is automatically numbered, thus read-only.
           System.out.println(rsMetaData.isAutoIncrement(i));

           //indicates whether the designated column is a cash value.
           System.out.println(rsMetaData.isCurrency(i));

           //indicates whether a write on the designated column will succeed.
           System.out.println(rsMetaData.isWritable(i));

           //indicate the nullability of values in the designated column.
           System.out.println(rsMetaData.isNullable(i));

           //indicate whether the designated column is definitely not writable.
           System.out.println(rsMetaData.isReadOnly(i));

           //Indicate whether a colum case matters in the designated column.
           System.out.println(rsMetaData.isCaseSensitive(i));

           //Indicate whether a column case matters in the designated column.
           System.out.println(rsMetaData.isSearchable(i));

           //Indicate whether a column case matter in the designated column.

           System.out.println(rsMetaData.isSigned(i));

        // gets the designated column's table's catalog name.
        System.out.println("catalog name= "+rsMetaData.getCatalogName(i));

        //get the designated column table schema name.
        System.out.println("Schema name "+rsMetaData.getSchemaName(i));
        }

        // Close resources
        rs.close();
        st.close();
        conn.close();
    }

    public static Connection getOracleConnection() throws Exception {
        // Load Oracle JDBC Driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        // Establish connection
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "mca6");
    }
}
