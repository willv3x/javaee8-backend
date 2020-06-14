package br.dev.willvwa.repositorio;

import br.dev.willvwa.entidade.Paciente;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PacienteRepositorio extends Repositorio<Paciente> {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void salvarEntidade(Paciente paciente) {

        this.entityManager.persist(paciente);
    }

    @Override
    public Paciente obterEntidade(Long id) {

        return (Paciente) this.entityManager.createQuery("SELECT P FROM Paciente as P WHERE P.id = :id")
                .setParameter("id", id).setFirstResult(0).setMaxResults(1).getSingleResult();
    }

    @Override
    public List<Paciente> obterTodos() {

        return this.entityManager.createQuery("SELECT P from Paciente as P", Paciente.class).getResultList();
    }

    @Transactional
    @Override
    public void excluirEntidade(Paciente paciente) {

        this.entityManager.remove(entityManager.merge(paciente));
    }
}
