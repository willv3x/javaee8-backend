package br.dev.willvwa.negocio;

import br.dev.willvwa.entidade.Paciente;
import br.dev.willvwa.repositorio.PacienteRepositorio;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class PacienteNegocio extends Negocio<Paciente> {

    @Inject
    private PacienteRepositorio pacienteRepositorio;

    public Paciente obter(Long id) {

        return this.pacienteRepositorio.obterEntidade(id);
    }

    public List<Paciente> obterTodos() {

        return this.pacienteRepositorio.obterTodos();
    }

    public void excluir(Paciente paciente) {

        this.pacienteRepositorio.excluirEntidade(paciente);
    }

    public void salvar(Paciente paciente) {

        this.pacienteRepositorio.salvarEntidade(paciente);
    }
}
