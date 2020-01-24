/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author Icaro
 */
abstract class Funcionario extends Pessoa{
    
    protected String email;
    protected int Senha;
    
    abstract void CadastroCliente();
    
    abstract void CadastroProduto();
    
    abstract void ControleEstoque();
}
