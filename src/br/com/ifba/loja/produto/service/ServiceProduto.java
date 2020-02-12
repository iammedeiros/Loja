/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.produto.service;

import br.com.ifba.loja.infraestructure.exception.BusinessException;
import br.com.ifba.loja.infraestructure.support.StringUtil;
import br.com.ifba.loja.produto.model.bean.Produto;
import br.com.ifba.loja.produto.model.dao.IProdutoDAO;
import br.com.ifba.loja.produto.model.dao.ProdutoDAO;
import java.util.List;

/**
 *
 * @author wisof
 */
public class ServiceProduto implements IServiceProduto {
    private final IProdutoDAO produtoDAO = new ProdutoDAO();
    
    @Override
    public Produto getById(Long id) {
        if (id <= 0)
            throw new BusinessException("Id inválido!");
        
        return produtoDAO.getById(id);
    }

    @Override
    public void save(Produto produto) {
        if (validaProduto(produto))
            produtoDAO.save(produto);
    }

    @Override
    public void update(Produto produto) {
        if (validaProduto(produto))
            produtoDAO.update(produto);
    }

    @Override
    public void delete(Produto produto) {
       if (produto.getId() <= 0)
           throw new BusinessException("O id do produto é inválido!");
       else if (produtoDAO.getById(produto.getId()) == null)
           throw new BusinessException("Produto inexistente na base de dados!");
       
       produtoDAO.delete(produto);
    }

    @Override
    public List<Produto> findAll() {
        return produtoDAO.findAll();
    }

    @Override
    public List<Produto> findByDescricao(String descricao) {
        return produtoDAO.findByDescricao(descricao);
    }

    @Override
    public Produto findByCodigoBarras(String codigoBarras) {
        return produtoDAO.findByCodigoBarras(codigoBarras);
    }
    
    private Boolean validaProduto(Produto produto) {
        if (StringUtil.getInstance().isEmpty(produto.getDescricao()))
            throw new BusinessException("Informe a descrição do produto!");
        else if (produto.getPrecoCusto() == null)
            throw new BusinessException("Informe o preço de custo do produto!");
        else if (produto.getPrecoVenda() == null)
            throw new BusinessException("Informe o preço de venda do produto!");
        
        return true;
    }
}
