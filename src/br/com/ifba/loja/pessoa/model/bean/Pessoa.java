/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.pessoa.model.bean;

import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author Icaro
 */
@MappedSuperclass
public abstract class Pessoa extends AbstractEntity {
    //pessoa física ou jurídica
    @Column(nullable = false)
    private char tipoPessoa;
    @Column(nullable = false, length = 65)
    private String nome;
    @Column(nullable = true, length = 12)
    private long telefone;
    @Column(nullable = true, length = 80)
    private String email;
    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Endereco endereco;

    public char getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(char tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
