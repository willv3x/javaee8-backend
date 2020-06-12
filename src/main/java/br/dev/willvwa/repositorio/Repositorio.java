package br.dev.willvwa.repositorio;

import br.dev.willvwa.entidade.Entidade;

import java.io.Serializable;

public abstract class Repositorio<T extends Entidade> implements Serializable {

    abstract boolean salvarEntidade(T t);



    abstract boolean atualizarEntidade(T t);

    abstract boolean excluirEntidade(T t);
}
