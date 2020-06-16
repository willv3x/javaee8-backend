package br.dev.willvwa.entidade;

import br.dev.willvwa.entidade.enumeracao.GeneroEnum;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Paciente extends Entidade {

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_mae")
    private String nomeMae;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero")
    private GeneroEnum genero;

    @Temporal(TemporalType.DATE)
    @Column(name = "nascimento")
    private Date nascimento;

    @Column(name = "rg")
    private Long rg;

    @Column(name = "cpf")
    private Long cpf;

    @Column(name = "endereco")
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GeneroEnum getGenero() {
        return genero;
    }

    public void setGenero(GeneroEnum genero) {
        this.genero = genero;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
