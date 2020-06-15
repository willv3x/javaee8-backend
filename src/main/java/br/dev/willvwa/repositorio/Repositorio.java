package br.dev.willvwa.repositorio;

import br.dev.willvwa.entidade.Entidade;

import java.io.Serializable;
import java.util.List;

public abstract class Repositorio<T extends Entidade> implements Serializable {

    abstract void salvarEntidade(T t);

    abstract T obterEntidade(Long id);

    abstract List<T> obterTodos();

    abstract void excluirEntidade(Long id);
}
