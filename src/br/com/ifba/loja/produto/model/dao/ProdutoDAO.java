/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.produto.model.dao;

import br.com.ifba.loja.infraestructure.dao.GenericDAO;
import br.com.ifba.loja.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author wisof
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO {

    @Override
    public List<Produto> findByDescricao(String descricao) {
        String hql = "select p from produtos where descricao like %:nome%";
        
        return GenericDAO.entityManager.createQuery(hql)
                .setParameter("nome", descricao)
                .getResultList();
    }

    @Override
    public Produto findByCodigoBarras(String codigoBarras) {
        return (Produto) entityManager.find(Produto.class, codigoBarras);
    }
}
