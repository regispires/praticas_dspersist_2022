package classes_principais;

import dao.ContatoDAO;
import dao.ContatoJPADAOSimplificado;
import entity.Contato;

public class ExemploInsertDAO {
    public static void main(String[] args) {
        //dao.ContatoDAO contatoDAO = new dao.ContatoJDBCDAO();
        //dao.ContatoDAO contatoDAO = new dao.ContatoJPADAO();
        ContatoDAO contatoDAO = new ContatoJPADAOSimplificado();

        Contato c = new Contato("João Pedro IV", "joaopedro4@gmail.com", "R. João 1234");
        contatoDAO.adiciona(c);
    }
}
