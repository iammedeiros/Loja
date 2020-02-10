/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
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
    
    //--------------------- Fornecedores ----------------------------
    public Fornecedor getByIdFornecedor(Long id);
    public void saveFornecedor(Fornecedor fornecedor);
    public void updateFornecedor(Fornecedor fornecedor);
    public void deleteFornecedor(Fornecedor fornecedor);
    public List<Fornecedor> findAllFornecedores();
    public List<Fornecedor> findByRazaoSocialFornecedor(String razaoSocial);
    public Fornecedor findByCnpjFornecedor(String cnpj);
}
