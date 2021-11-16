package DAO;

import br.com.academia.Aluno;

import javax.persistence.EntityManager;

public class AcademiaDao {

    private final EntityManager em;

    public AcademiaDao(EntityManager em)
    {
        this.em = em;
    }

    public void cadastrar(Aluno aluno)
    {
        this.em.persist(aluno);
    }
}
