/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifba.loja.fornecedor.service;

import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import br.com.ifba.loja.fornecedor.model.dao.FornecedorDAO;
import br.com.ifba.loja.fornecedor.model.dao.IFornecedorDAO;
import br.com.ifba.loja.infraestructure.exception.BusinessException;
import br.com.ifba.loja.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author wisof
 */
public class FornecedorService implements IFornecedorService {
    private final IFornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    @Override
    public Fornecedor getById(Long id) {
        if (id <= 0)
            throw new BusinessException("Id inválido!");
        
        return fornecedorDAO.getById(id);
    }

    @Override
    public void save(Fornecedor fornecedor) {
        if (validaFornecedor(fornecedor))
            fornecedorDAO.save(fornecedor);
    }

    @Override
    public void update(Fornecedor fornecedor) {
        if (validaFornecedor(fornecedor))
            fornecedorDAO.update(fornecedor);
    }

    @Override
    public void delete(Fornecedor fornecedor) {
        if (fornecedor.getId() <= 0)
            throw new BusinessException("O id do fornecedor é inválido!");
        else if (fornecedorDAO.getById(fornecedor.getId()) == null)
            throw new BusinessException("Fornecedor inexistente na base de dados!");
        
        fornecedorDAO.delete(fornecedor);
    }

    @Override
    public List<Fornecedor> findAll() {
        return fornecedorDAO.findAll();
    }

    @Override
    public List<Fornecedor> findByRazaoSocial(String razaoSocial) {
        if (StringUtil.getInstance().isEmpty(razaoSocial))
            throw new BusinessException("Parâmetro inválido!");
        
        return fornecedorDAO.findByRazaoSocial(razaoSocial);
    }
    
    @Override
    public Fornecedor findByCnpj(String cnpj) {
        if (StringUtil.getInstance().isEmpty(cnpj))
            throw new BusinessException("Parâmetro inválido!");
        
        return fornecedorDAO.findByCnpj(cnpj);
    }
    
    private boolean validaFornecedor(Fornecedor fornecedor) {
        if (StringUtil.getInstance().isEmpty(fornecedor.getNome()))
            throw new BusinessException("Informe o nome fantasia do fornecedor!");
        else if (StringUtil.getInstance().isEmpty(fornecedor.getCpfCnpj()))
            throw new BusinessException("Informe o CNPJ do fornecedor!");
        else if (StringUtil.getInstance().isEmpty(fornecedor.getEndereco().getCidade()))
            throw new BusinessException("Informe a cidade no endereço do fornecedor!");
        else if (StringUtil.getInstance().isEmpty(fornecedor.getEndereco().getEstado()))
            throw new BusinessException("Informe o estado no endereço do fornecedor!");
        
        return true;
    }
}
