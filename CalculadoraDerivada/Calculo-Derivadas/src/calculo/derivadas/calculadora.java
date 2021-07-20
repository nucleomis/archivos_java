/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.derivadas;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class calculadora {
    
    private String funcion = "";
    
    DJep djep;
    Node nodofuncion;
    Node nodoDerivada;
    
    
    
    public calculadora(){
        //...
    }
    
    public void setFuncionADerivar(String funcion){
        this.funcion = funcion;
        
    }
    
    public String getFuncionDerivada(){
        
        return this.funcion;
    }
    public void derivar(){
        
        try {
            
            this.djep = new DJep();
            
            this.djep.addStandardFunctions();
            
            this.djep.addStandardConstants();
            
            this.djep.addComplex();
            
            this.djep.setAllowUndeclared(true);
            
            this.djep.setAllowAssignment(true);
            
            this.djep.setImplicitMul(true);
            
            this.djep.addStandardDiffRules();
            
            this.nodofuncion = this.djep.parse(this.funcion);
            
            Node diff = this.djep.differentiate(nodofuncion,"x");
            
            this.nodoDerivada = this.djep.simplify(diff);
            
            this.funcion = this.djep.toString(this.nodoDerivada);
            
            
        } catch (ParseException e) {
            
            System.out.println("Error" + e.getErrorInfo());
        }
        
    }
}
