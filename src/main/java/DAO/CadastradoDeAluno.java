package DAO;

import br.com.academia.Aluno;
import br.com.academia.Sexo;
import util.JPAUtil;


import javax.persistence.EntityManager;


public class CadastradoDeAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.setNome("Carlos");
        aluno.setCPF("08669758962");
        aluno.setIdade(25);
        aluno.setEndereco("Teste");
        aluno.setNumero(222);
        aluno.setCompleto("ap:306 bloc:10");
        aluno.setSexo(Sexo.MASCULINO);

        aluno2.setNome("Sarah");
        aluno2.setCPF("08648758962");
        aluno2.setIdade(4);
        aluno2.setEndereco("teste");
        aluno2.setNumero(270);
        aluno2.setCompleto("casa 3");
        aluno2.setSexo(Sexo.FEMININO);

        EntityManager em = JPAUtil.getEntityManager();
        AcademiaDao dao = new AcademiaDao(em);

        em.getTransaction().begin();
        dao.cadastrar(aluno);
        dao.cadastrar(aluno2);
        em.getTransaction().commit();
        em.close();
    }
}

