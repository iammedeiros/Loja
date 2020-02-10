/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.cliente.service.ClienteService;
import br.com.ifba.loja.cliente.service.IClienteService;
import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import br.com.ifba.loja.fornecedor.service.FornecedorService;
import br.com.ifba.loja.fornecedor.service.IFornecedorService;
import java.util.List;

/**
 *
 * @author wisof
 */

public class Facede implements IFacede {
    private static Facede instance;
    
    private Facede() {
    }
    
    /**
     *
     * @return
     */
    
    public static synchronized Facede getInstance() {
        if (instance == null)
            instance = new Facede();
        
        return instance;
    }
    
    //--------------------- Clientes --------------------------
    private final IClienteService clienteService = new ClienteService();
    
    @Override
    public Cliente getByIdCliente(Long id) {
        return clienteService.getByIdCliente(id);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteService.saveCliente(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteService.updateCliente(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteService.deleteCliente(cliente);
    }

    @Override
    public List<Cliente> findAllClientes() {
        return clienteService.findAllClientes();
    }

    @Override
    public List<Cliente> findByNameCliente(String name) {
        return clienteService.findByNameCliente(name);
    }

    @Override
    public Cliente findByCpfCliente(String cpf) {
        return clienteService.findByCpfCliente(cpf);
    }

    //-------------------------- Fornecedores -------------------------------
    private final IFornecedorService fornecedorService = new FornecedorService();
    
    @Override
    public Fornecedor getByIdFornecedor(Long id) {
        return fornecedorService.getByIdFornecedor(id);
    }

    @Override
    public void saveFornecedor(Fornecedor fornecedor) {
        fornecedorService.saveFornecedor(fornecedor);
    }

    @Override
    public void updateFornecedor(Fornecedor fornecedor) {
        fornecedorService.updateFornecedor(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        fornecedorService.deleteFornecedor(fornecedor);
    }

    @Override
    public List<Fornecedor> findAllFornecedores() {
        return fornecedorService.findAllFornecedores();
    }

    @Override
    public List<Fornecedor> findByRazaoSocialFornecedor(String razaoSocial) {
        return fornecedorService.findByRazaoSocialFornecedor(razaoSocial);
    }

    @Override
    public Fornecedor findByCnpjFornecedor(String cnpj) {
        return fornecedorService.findByCnpjFornecedor(cnpj);
    }
}
