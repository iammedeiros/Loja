/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.cliente.service.ClienteService;
import br.com.ifba.loja.cliente.service.IClienteService;
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
}
