/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

import br.com.ifba.loja.cliente.model.bean.Cliente;
import br.com.ifba.loja.fornecedor.model.bean.Fornecedor;
import br.com.ifba.loja.funcionario.model.bean.Funcionario;
import br.com.ifba.loja.produto.model.bean.Produto;
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
    
    //--------------------- Funcionários -------------------------------
    public Funcionario getByIdFuncionario(Long id);
    public void saveFuncionario(Funcionario funcionario);
    public void updateFuncionario(Funcionario funcionario);
    public void deleteFuncionario(Funcionario funcionario);
    public List<Funcionario> findAllFuncionarios();
    public List<Funcionario> findByNameFuncionario(String name);
    public Funcionario findByCpfFuncionario(String cpf);
    
    //--------------------- Produtos ----------------------------------
    public Produto getByIdProduto(Long id);
    public void saveProduto(Produto produto);
    public void updateProduto(Produto produto);
    public void deleteProduto(Produto produto);
    public List<Produto> findAllProdutos();
    public List<Produto> findByDescricaoProduto(String descricao);
    public Produto findByCodigoBarrasProduto(String codigoBarras);
}
