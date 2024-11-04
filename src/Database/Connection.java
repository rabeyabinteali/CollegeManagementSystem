package Database;

/**
 *
 * @author Rabeya
 */
import java.sql.*;
public class AdminConnect {
    
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/collegemanagesystem","root","rabeya");
}
