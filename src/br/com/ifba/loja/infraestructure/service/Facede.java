/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.service;

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
}
