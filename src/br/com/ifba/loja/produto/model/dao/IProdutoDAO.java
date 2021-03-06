/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.produto.model.dao;

import br.com.ifba.loja.produto.model.bean.Produto;
import br.com.ifba.loja.infraestructure.dao.IGenericDAO;
import java.util.List;

/**
 *
 * @author wisof
 */

public interface IProdutoDAO extends IGenericDAO<Produto> {
    public List<Produto> findByDescricao(String descricao);
    public Produto findByCodigoBarras(String codigoBarras);
}
