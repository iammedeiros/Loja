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
    
    //construtor privado por que essa classe não pode ser instanciada fora dela
    private Facede() {
    }
    
    /**
     *
     * @return
     */
    
    //metodo que serve para retornar a instancia da classe
    public static synchronized Facede getInstance() {
        if (instance == null)
            instance = new Facede();
        
        return instance;
    }
    
    //--------------------- Clientes --------------------------
    private final IClienteService clienteService = new ClienteService();
    
    @Override
    public Cliente getByIdCliente(Long id) {
        return clienteService.getById(id);
    }

    @Override
    public void saveCliente(Cliente cliente) {
        clienteService.save(cliente);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteService.update(cliente);
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        clienteService.delete(cliente);
    }

    @Override
    public List<Cliente> findAllClientes() {
        return clienteService.findAll();
    }

    @Override
    public List<Cliente> findByNameCliente(String name) {
        return clienteService.findByName(name);
    }

    @Override
    public Cliente findByCpfCliente(String cpf) {
        return clienteService.findByCpf(cpf);
    }

    //-------------------------- Fornecedores -------------------------------
    private final IFornecedorService fornecedorService = new FornecedorService();
    
    @Override
    public Fornecedor getByIdFornecedor(Long id) {
        return fornecedorService.getById(id);
    }

    @Override
    public void saveFornecedor(Fornecedor fornecedor) {
        fornecedorService.save(fornecedor);
    }

    @Override
    public void updateFornecedor(Fornecedor fornecedor) {
        fornecedorService.update(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        fornecedorService.delete(fornecedor);
    }

    @Override
    public List<Fornecedor> findAllFornecedores() {
        return fornecedorService.findAll();
    }

    @Override
    public List<Fornecedor> findByRazaoSocialFornecedor(String razaoSocial) {
        return fornecedorService.findByRazaoSocial(razaoSocial);
    }

    @Override
    public Fornecedor findByCnpjFornecedor(String cnpj) {
        return fornecedorService.findByCnpj(cnpj);
    }
}
