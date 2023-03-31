/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduar
 */
public class Validaciones {
    public String ValidarEnteros (String numero){
        int c = 0;
        String a="";
        for(int x=0;x<numero.length();x++){
            //JOptionPane.showMessageDialog(null, numero.charAt(x));
            if (numero.charAt(x) == '.'){
                c++;
            }
        }
        if (c==1){
            a = "decimal";
        }else if (c==0){
             a = "entero";
        }
       return a;
    }
}
