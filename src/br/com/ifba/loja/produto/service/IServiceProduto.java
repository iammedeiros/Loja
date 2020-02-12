/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.produto.service;

import br.com.ifba.loja.produto.model.bean.Produto;
import java.util.List;

/**
 *
 * @author wisof
 */
public interface IServiceProduto {
    public Produto getById(Long id);
    public void save(Produto produto);
    public void update(Produto produto);
    public void delete(Produto produto);
    public List<Produto> findAll();
    public List<Produto> findByDescricao(String descricao);
    public Produto findByCodigoBarras(String codigoBarras);
}
