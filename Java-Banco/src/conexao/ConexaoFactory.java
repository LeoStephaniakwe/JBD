package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Leonardo
 */
public class ConexaoFactory {
    private static String CLASS_NAME = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost:3306/curso";
    private static String LOGIN = "root";
    private static String SENHA = "";
    static Connection conexao;
    
    static void main (String[] args){
        ConexaoFactory.obterConexao();
   
}

    public static Connection obterConexao() {
        try{
            conexao = DriverManager.getConnection(HOST,LOGIN,SENHA);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conexao;
        }
     public static void fecharConexao(){
        try{
            if(conexao != null){
                conexao.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
            
    
    
}

    
    
    
    
