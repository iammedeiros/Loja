/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.pessoa.model.bean;

import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author wisof
 */
@Entity
@Table(name = "pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends AbstractEntity implements Serializable {
    //pessoa física ou jurídica
    //recebe 1 para física e 2 para jurídica
    @Column(nullable = false)
    private int tipoPessoa;
    @Column(nullable = false, length = 65)
    private String nome;
    @Column(nullable = true, length = 11)
    private String ieRg;
    @Column(nullable = true, length = 14)
    private String cpfCnpj;
    @Column(nullable = true, length = 12)
    private String telefone;
    @Column(nullable = true, length = 80)
    private String email;
    @OneToOne(mappedBy = "pessoa", cascade = CascadeType.ALL)
    private Endereco endereco;
    
    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIeRg() {
        return ieRg;
    }

    public void setIeRg(String ieRg) {
        this.ieRg = ieRg;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpf_cnpj) {
        this.cpfCnpj = cpf_cnpj;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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
