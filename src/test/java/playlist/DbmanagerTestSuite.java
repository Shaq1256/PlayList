package playlist;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbmanagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given

        // When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectMusic() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT * FROM playlist";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " + rs.getString("TITLE") + ", " + rs.getString("ARTIST") +
                    ", " + rs.getString("ALBUM") + ", " + rs.getDouble("DURATION"));
            rs.close();
            statement.close();
            Assert.assertEquals(1, counter);
        }
    }
}
