/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.funcionario.model.bean;

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
 * @author wisof
 */
@Entity
@Table(name = "funcionarios")
public class Funcionario extends Pessoa implements Serializable {
    //atributo que defini se o funcionário é ou não é usuário do sistema
    @Column(nullable = false)
    private Boolean usuario;
    @Column(nullable = true, length = 50)
    private String login;
    @Column(nullable = true, length = 38)
    private String senha;
    @Column(nullable = true, length = 9)
    private String sexo;
    @Column(nullable = true, length = 11)
    private String rg;
    @Column(nullable = true, length = 10)
    private String cpf;
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    @Column(nullable = false, length = 50)
    private String gargo;
    @Temporal(TemporalType.DATE)
    private Calendar dataAdmissao;

    public Boolean getUsuario() {
        return usuario;
    }

    public void setUsuario(Boolean usuario) {
        this.usuario = usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGargo() {
        return gargo;
    }

    public void setGargo(String gargo) {
        this.gargo = gargo;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
