
package ClasseDAO;

import bean.AlunoBean;
import conexao.ConexaoFactory;
import java.sql.Connection;

/**
 *
 * @author Alunos
 */
    public class AlunoDAO {
        Connection conexao = ConexaoFactory.obterConexao();
        public void  inserir (AlunoBean alunos){
        if(conexao != null){
            String sql = "INSERT INTO alunos"
                    +"\nNome,codigo_matricula, nota_1, nota_2, nota_3, frequencia"
                    +"\nVALUES(?,?,?)";
        }
    }
    
}
