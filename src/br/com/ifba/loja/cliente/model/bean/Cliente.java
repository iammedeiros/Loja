/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.model.bean;

import br.com.ifba.loja.pessoa.model.bean.Pessoa;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Icaro
 */
@Entity
@Table(name = "clientes")
public class Cliente extends Pessoa implements Serializable {
    @Column(nullable = true, length = 11)
    private String ie_rg;
    @Column(nullable = true, length = 14)
    private String cpf_cnpj;
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    @Column(nullable = false, length = 9)
    private String sexo;

    public String getRg() {
        return ie_rg;
    }

    public void setRg(String ie_rg) {
        this.ie_rg = ie_rg;
    }

    public String getCpf() {
        return cpf_cnpj;
    }

    public void setCpf(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 
}
