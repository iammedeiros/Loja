/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.funcionario.service;

import br.com.ifba.loja.funcionario.model.bean.Funcionario;
import br.com.ifba.loja.funcionario.model.dao.FuncionarioDAO;
import br.com.ifba.loja.funcionario.model.dao.IFuncionarioDAO;
import br.com.ifba.loja.infraestructure.exception.BusinessException;
import br.com.ifba.loja.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author wisof
 */
public class FuncionarioService implements IFuncionarioService {
    private final IFuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    @Override
    public Funcionario getById(Long id) {
        if (id <= 0)
            throw new BusinessException("Id inválido!");
        
        return funcionarioDAO.getById(id);
    }

    @Override
    public void save(Funcionario funcionario) {
        if (validaFuncionario(funcionario))
            funcionarioDAO.save(funcionario);
    }

    @Override
    public void update(Funcionario funcionario) {
        if (validaFuncionario(funcionario))
            funcionarioDAO.update(funcionario);
    }

    @Override
    public void delete(Funcionario funcionario) {
        if (funcionario.getId() <= 0)
            throw new BusinessException("O id do funcionário é inválido!");
        
        else if (funcionarioDAO.getById(funcionario.getId()) == null)
            throw new BusinessException("Funcionário inexistente na base de dados!");
        
        funcionarioDAO.delete(funcionario);
    }

    @Override
    public List<Funcionario> findAll() {
        return funcionarioDAO.findAll();
    }

    @Override
    public List<Funcionario> findByName(String name) {
        return funcionarioDAO.findByName(name);
    }

    @Override
    public Funcionario findByCpf(String cpf) {
        return funcionarioDAO.findByCpf(cpf);
    }
    
    private Boolean validaFuncionario(Funcionario funcionario) {
        if (StringUtil.getInstance().isEmpty(funcionario.getNome()))
            throw new BusinessException("Informe o nome do funcionário!");
        
        else if (funcionario.isUsuario()) {
            if (StringUtil.getInstance().isEmpty(funcionario.getEmail()))
                throw new BusinessException("Informe o email do funcionário "
                        + "para acesso ao sistema!");
            else if (StringUtil.getInstance().isEmpty(funcionario.getSenha()))
                throw new BusinessException("Informe a senha do funcionário "
                        + "para acesso ao sistema!");
        }
        
        else if (StringUtil.getInstance().isEmpty(funcionario.getCpfCnpj()))
            throw new BusinessException("Informe o cpf do funcionário!");
        
        else if (StringUtil.getInstance().isEmpty(funcionario.getEndereco().getCidade()))
            throw new BusinessException("Informe a cidade no endereço do funcionário!");
        
        else if (StringUtil.getInstance().isEmpty(funcionario.getEndereco().getEstado()))
            throw new BusinessException("Informe o estado no endereço do funcionário!");
        
        return true;
    }
}
