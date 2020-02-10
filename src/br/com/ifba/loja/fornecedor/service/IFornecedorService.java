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
    public Fornecedor getByIdFornecedor(Long id);
    public void saveFornecedor(Fornecedor fornecedor);
    public void updateFornecedor(Fornecedor fornecedor);
    public void deleteFornecedor(Fornecedor fornecedor);
    public List<Fornecedor> findAllFornecedores();
    public List<Fornecedor> findByRazaoSocialFornecedor(String razaoSocial);
}
