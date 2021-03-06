/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.funcionario.model.dao;

import br.com.ifba.loja.funcionario.model.bean.Funcionario;
import br.com.ifba.loja.infraestructure.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */
public interface IFuncionarioDAO extends IGenericDAO<Funcionario> {
    public List<Funcionario> findByName(String name);
    public Funcionario findByCpf(String cpf);
}
