/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import java.util.List;

/**
 *
 * @author wisof
 */
public interface IFacede {
    //------------------------ Clientes ----------------------------
    public Cliente getByIdCliente(Long id);
    public void saveCliente(Cliente cliente);
    public void updateCliente(Cliente cliente);
    public void deleteCliente(Cliente cliente);
    public List<Cliente> findAllClientes();
    public List<Cliente> findByNameCliente(String name);
    public Cliente findByCpfCliente(String cpf);
    
    
}
