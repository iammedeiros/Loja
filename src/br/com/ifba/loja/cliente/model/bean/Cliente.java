/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.model.bean;

import br.com.ifba.loja.pessoa.model.bean.Endereco;
import br.com.ifba.loja.pessoa.model.bean.Pessoa;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Icaro
 */
@Entity
@Table(name = "clientes")
@PrimaryKeyJoinColumn(name="idPessoa")
public class Cliente extends Pessoa implements Serializable {
    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Calendar dataNascimento;
    @Column(nullable = true, length = 9)
    private String sexo;

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
