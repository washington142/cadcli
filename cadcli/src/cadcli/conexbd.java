
package cadcli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexbd {
   private static Connection mysqlcon;
   public static Connection conexaoDB() throws SQLException{
       if (mysqlcon == null){
           try{
               //configura conforme o seu banco de dados, este está usando o banco minicurso;
String DB = "jdbc:mysql://localhost:3306/cadastro";
               String usuario = "root";
               String senha = "";
               
               DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               //Connection Connection = null;
               mysqlcon = (Connection) DriverManager.getConnection(DB, usuario, senha);
           }catch (SQLException e){
               JOptionPane.showMessageDialog(null, "Falha na Conexão");
           }
       }
       return mysqlcon;
   }
 
}
