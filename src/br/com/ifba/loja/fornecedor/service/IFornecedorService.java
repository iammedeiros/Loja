/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifba.loja.fornecedor.service;

import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import java.util.List;

/**
 *
 * @author wisof
 */

public interface IFornecedorService {
    public Fornecedor getById(Long id);
    public void save(Fornecedor fornecedor);
    public void update(Fornecedor fornecedor);
    public void delete(Fornecedor fornecedor);
    public List<Fornecedor> findAll();
    public List<Fornecedor> findByRazaoSocial(String razaoSocial);
    public Fornecedor findByCnpj(String cnpj);
}
