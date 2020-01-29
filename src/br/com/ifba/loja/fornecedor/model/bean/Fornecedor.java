/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.fornecedor.model.bean;

import br.com.ifba.loja.pessoa.model.bean.Pessoa;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Icaro
 */
@Entity
@Table(name = "fornecedores")
@PrimaryKeyJoinColumn(name="idPessoa")
public class Fornecedor extends Pessoa implements Serializable {
    @Column(nullable = false, length = 80)
    private String razaoSocial;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
