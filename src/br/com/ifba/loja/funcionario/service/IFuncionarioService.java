/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.funcionario.service;

import br.com.ifba.loja.funcionario.model.bean.Funcionario;
import java.util.List;

/**
 *
 * @author wisof
 */
public interface IFuncionarioService {
    public Funcionario getById(Long id);
    public void save(Funcionario funcionario);
    public void update(Funcionario funcionario);
    public void delete(Funcionario funcionario);
    public List<Funcionario> findAll();
    public List<Funcionario> findByName(String name);
    public Funcionario findByCpf(String cpf);
}
