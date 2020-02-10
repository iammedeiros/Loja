/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.fornecedor.model.dao;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import br.com.ifba.loja.infraestructure.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */

public interface IFornecedorDAO extends IGenericDAO<Fornecedor> {
    public List<Fornecedor> findByRazaoSocial(String razaoSocial);
}
