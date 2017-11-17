package healthcaremanagement;
import java.sql.*;
public interface databseconnection {
    public Connection getconnected(String path,String username,String password);
}
