/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.model.dao;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.infraestructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {
    
    @Override
    public List<Cliente> findByName(String name) {
        String hql = "from Pessoa p inner join Cliente c "
                + "where p.nome like %:nome%";
        
        return GenericDAO.entityManager.createQuery(hql)
                .setParameter("nome", name)
                .getResultList(); 
    }

    @Override
    public Cliente findByCpf(String cpf) {  
        return (Cliente) entityManager.find(Cliente.class, cpf);
    }
}
