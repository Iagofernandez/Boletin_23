/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_23;

/**
 *
 * @author ifernandezblanco
 */
public class ForaDeRangoExcepcion extends Exception {
    private int errorRango;
    
    public ForaDeRangoExcepcion(int errorRango){
        super();
        this.errorRango=errorRango;
    }

    @Override
    public String getMessage() {
       String mensaxe="";
       
       switch(errorRango){
           case 1: mensaxe="erro, número inferior a 0";
           break;
           case 2: mensaxe="erro, numero de afora maximo sobrepasado";
       }
       return mensaxe;
    }
    
}
