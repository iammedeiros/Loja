/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.dao;

import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import java.util.List;

/**
 *
 * @author wisof
 * @param <T>
 */
public interface IGenericDAO<T extends AbstractEntity> {
    public T getById(Long id);
    public void save(T entity);
    public void update(T entity);
    public void delete(T entity);
    public List<T> findAll();
}
