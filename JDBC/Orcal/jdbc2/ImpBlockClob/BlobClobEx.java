import java.io.*;
import java.sql.*;
class BlobClobEx{
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");

        Statement stmt = conn.createStatement();

        createBlobClobTables(stmt);

        PreparedStatement pstm=conn.prepareStatement("insert into BlobClob values (40,?,?)");

        File file =new File("Blob.txt");
        FileInputStream fis = new FileInputStream(file);
        pstm.setBinaryStream(1, fis,(int) file.length());

        file = new File("clob.txt");
        fis = new FileInputStream(file);
        pstm.setAsciiStream(2, fis,(int) file.length());
        fis.close();

        pstm.execute();
        
        ResultSet rs = stmt.executeQuery("select * from BlobClob where id =40 ");
        rs.next();

        java.sql.Blob blob =rs.getBlob(2);
        java.sql.Clob clob =rs.getClob(3);

        byte blobVal[] = new byte[(int) blob.length()];
        InputStream blobIs = blob.getBinaryStream();
        blobIs.read(blobVal);
        String s = new String(blobVal);
        System.out.println(s);
        blobIs.close();

        char clobVal[] = new char[(int) clob.length()];
        Reader r = clob.getCharacterStream();
        r.read(clobVal);
        String sw = new String(clobVal);
        System.out.println(sw);

        r.close();
        conn.close();  
        
    }
    public static void createBlobClobTables (Statement stmt) throws Exception{
        String sql = "CREATE TABLE BlobClob (Id NUMBER(3), b BLOB , c CLOB)";

        try {
            stmt.executeUpdate("Drop table BlobClob");
        } catch (SQLException e) {
            if(e.getErrorCode()== 942)
            System.out.println("Error dropping BlobClob table: " +e.getMessage());
        }
        if(stmt.executeUpdate(sql)==0)
        System.out.println("BlobClob table created .....");
    }
}
