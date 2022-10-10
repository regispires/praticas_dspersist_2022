package classes_principais;

import dao.ContatoDAO;
import dao.ContatoJPADAOSimplificado;
import entity.Contato;

import java.util.List;

public class ExemploQueryDAO {
    public static void main(String[] args) {

        //dao.ContatoDAO contatoDAO = new dao.ContatoJDBCDAO();
        //dao.ContatoDAO contatoDAO = new dao.ContatoJPADAO();
        ContatoDAO contatoDAO = new ContatoJPADAOSimplificado();

        List<Contato> contatos = contatoDAO.getLista();

        for (Contato c : contatos) {
            System.out.println(c);
        }

    }
}
