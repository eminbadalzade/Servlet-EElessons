package az.eminbadalzade.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

public class DbHelper {
    public static Connection getConnection() throws Exception{
        Context context = new InitialContext();
        DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/eminbadalzade");
        return null;
    }
}
