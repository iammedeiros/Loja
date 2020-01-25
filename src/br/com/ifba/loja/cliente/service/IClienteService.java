/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import java.util.List;

/**
 *
 * @author wisof
 */
public interface IClienteService {
    public Cliente getById(Long id);
    public void save(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
    public List<Cliente> findAll();
    public List<Cliente> findByName(String name);
    public Cliente findByCpf(String cpf);
}
