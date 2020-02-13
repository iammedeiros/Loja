/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.fornecedor.model.dao;

import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import br.com.ifba.loja.infraestructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */
public class FornecedorDAO extends GenericDAO<Fornecedor> implements IFornecedorDAO {

    @Override
    public List<Fornecedor> findByRazaoSocial(String razaoSocial) {
       String hql = "from Pessoa p inner join Fornecedor f "
                + "where f.razaoSocial like %:razaoSocial%";
        
        return GenericDAO.entityManager.createQuery(hql)
                .setParameter("razaoSocial", razaoSocial)
                .getResultList(); 
    } 

    @Override
    public Fornecedor findByCnpj(String cnpj) {
        return (Fornecedor) entityManager.find(Fornecedor.class, cnpj);
    }
}
