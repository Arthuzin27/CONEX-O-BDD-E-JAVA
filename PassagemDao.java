package br.com.unisales.dao;

import br.com.unisales.table.Passagem;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PassagemDao {
    private EntityManagerFactory emf;

    public PassagemDao() {
        this.emf = Persistence.createEntityManagerFactory("onibusPUSQLite");
    }

    public String salvar(Passagem passagem) {
        try {
            // Criando o objeto para realizar as operações de CRUD no banco de dados
            EntityManager em = this.emf.createEntityManager();
            // Inicializando uma trasação com o banco de dados
            em.getTransaction().begin();
            // Preparando e validando os dados do novo ônibus para serem salvos no banco de
            // dados
            em.persist(passagem);
            // Salvando os dados do novo ônibus no bando de dados
            em.getTransaction().commit();
            // Fechando a transação de inserção do novo ônibus no banco de dados
            em.close();
            return "sucesso";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            return "erro";
        }
    }
}
