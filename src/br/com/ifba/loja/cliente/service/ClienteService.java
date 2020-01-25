/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.cliente.model.dao.ClienteDAO;
import br.com.ifba.loja.cliente.model.dao.IClienteDAO;
import br.com.ifba.loja.infraestructure.exception.BusinessException;
import br.com.ifba.loja.infraestructure.support.StringUtil;
import java.util.List;

/**
 *
 * @author wisof
 */
public class ClienteService implements IClienteService {
    private final IClienteDAO clienteDAO = new ClienteDAO();

    @Override
    public Cliente getById(Long id) {
        if (id <= 0)
            throw new BusinessException("Id inválido!");
        
        return clienteDAO.getById(id);
    }

    @Override
    public void save(Cliente cliente) {
        if (validaCliente(cliente))
            clienteDAO.save(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        if (validaCliente(cliente))
            clienteDAO.update(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        if (cliente.getId() <= 0)
            throw new BusinessException("Id do cliente inválido!");
        else if (clienteDAO.getById(cliente.getId()) == null)
            throw new BusinessException("Cliente inexistente na base de dados!");
        
        clienteDAO.delete(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public List<Cliente> findByName(String name) {
        if (StringUtil.getInstance().isEmpty(name))
            throw new BusinessException("Argumento inválido!");
        
        return clienteDAO.findByName(name);
    }

    @Override
    public Cliente findByCpf(String cpf) {
        if (StringUtil.getInstance().isEmpty(cpf))
            throw new BusinessException("Argumento inválido!");
        
        return clienteDAO.findByCpf(cpf);
    }
    
    private boolean validaCliente(Cliente cliente) {
        if (StringUtil.getInstance().isEmpty(cliente.getNome()))
            throw new BusinessException("Informe o nome do cliente!");
        else if (StringUtil.getInstance().isEmpty(cliente.getEndereco().getCidade()))
            throw new BusinessException("Informe a cidade no endereço do cliente!");
        else if (StringUtil.getInstance().isEmpty(cliente.getEndereco().getBairro()))
            throw new BusinessException("Informe o estado no endereço do cliente!");
        
        return true;
    }
}
