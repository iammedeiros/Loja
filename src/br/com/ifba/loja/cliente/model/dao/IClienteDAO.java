/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.model.dao;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.infraestructure.dao.IGenericDAO;
import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author wisof
 * 
 */
public interface IClienteDAO extends IGenericDAO<Cliente> {
    public List<Cliente> findByName(String name);
    public Cliente findByCpf(String cpf);
}
