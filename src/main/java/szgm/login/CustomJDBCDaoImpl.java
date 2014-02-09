package szgm.login;

import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

public class CustomJDBCDaoImpl extends JdbcDaoImpl {
   public CustomJDBCDaoImpl(){
       super();
   }
}
