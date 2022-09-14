/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornoPruebas;

import clases.Clientes;

/**
 *
 * @author chema
 */
public class LeerYmeterEnArraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        clases.Clientes.leerMeter_array_clientes();
        printListaCliente();
        
        
    }
    
    public static void printListaCliente(){
        
        for(Clientes c:Clientes.listaCliente){
            
            System.out.println(c.toString());
        }
        
    }
    
    
    
}
