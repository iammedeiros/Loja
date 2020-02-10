/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.loja.infraestructure.support;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author wisof
 */
public class Support {
    private static Support instance;
    
    private Support(){}
    
    public static synchronized Support getInstance() {
        if (instance == null)
            instance = new Support();
        
        return instance;
    }
    
    //método que serve para limpar o text dos campos de texto
    public void limpaCampos(JPanel container) {
        //varre todos os componentes dentro de um JPanel
        for (int i=0; i < container.getComponentCount(); i++) {
            Component c = container.getComponent(i);
            
            //se o componente atual for um JTextField
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setText("");
            }
        }
    }
}
