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
import javax.persistence.Table;

/**
 *
 * @author Icaro
 */
@Entity
@Table(name = "fornecedores")
public class Fornecedor extends Pessoa implements Serializable {
    @Column(nullable = false, length = 80)
    private String razaoSocial;
    @Column(nullable = false, length = 11)
    private int inscricaoEstadual;
    @Column(nullable = false, length = 14)
    private long cnpj;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
