/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.cliente.model.dao;

import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author wisof
 * @param <T>
 * 
 */
public interface IClienteDAO<T extends AbstractEntity> {
    public List<T> findByName(String name);
    public T findByCpf(String cpf);
}
