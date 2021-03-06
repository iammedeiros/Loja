/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.dao;

import br.com.ifba.loja.infraestructure.model.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author wisof
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class GenericDAO<T extends AbstractEntity> implements IGenericDAO<T>{
    protected static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        return entityManager;
    }
    
    static {
        EntityManagerFactory fac = Persistence
                .createEntityManagerFactory("LojaPU");
        entityManager = fac.createEntityManager();
    }
    
    @Override
    public T getById(Long id) {
        return (T) entityManager.find(getTypeClass(), id);
    }
    
    @Override
    public void save(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    @Override
    public void update(T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    @Override
    public void delete(T entity) {
        try {
            entity = getById(entity.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(entity);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    @Override
    public List<T> findAll() {
        return entityManager.createQuery(("From " + getTypeClass().getName()))
                .getResultList();
    }
    
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
        .getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}
