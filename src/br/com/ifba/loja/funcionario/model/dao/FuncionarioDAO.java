/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.funcionario.model.dao;

import br.com.ifba.loja.funcionario.model.bean.Funcionario;
import br.com.ifba.loja.infraestructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */
public class FuncionarioDAO extends GenericDAO<Funcionario> implements IFuncionarioDAO {
    
    @Override
    public List<Funcionario> findByName(String name) {
        String hql = "select p from pessoas p inner join funcionarios f on "
                + "f.idPessoa = p.id where f.nome like %:nome%";
        
        return GenericDAO.entityManager.createQuery(hql)
                .setParameter("nome", name)
                .getResultList(); 
    }

    @Override
    public Funcionario findByCpf(String cpf) {  
        return (Funcionario) entityManager.find(Funcionario.class, cpf);
    }
}
