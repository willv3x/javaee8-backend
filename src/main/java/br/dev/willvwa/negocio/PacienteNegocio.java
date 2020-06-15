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

    public List<Paciente> obterTodos() {

        return this.pacienteRepositorio.obterTodos();
    }

    public void excluir(Long pacienteId) {

        this.pacienteRepositorio.excluirEntidade(pacienteId);
    }

    public void salvar(Paciente paciente) {

        this.pacienteRepositorio.salvarEntidade(paciente);
    }
}
