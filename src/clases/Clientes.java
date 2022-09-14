
package clases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Clientes {
    
    public static String rutaCliente = "\\\\192.168.120.253\\dpto cargas\\CHEMA\\expecificaciones\\clientes.txt";
    
    public static ArrayList<Clientes> listaCliente = new ArrayList<Clientes>();
    
    private String idCliente;
    private String nombre1;
    private String nombre2;
    private boolean estado;
    private String nombreCliente;
    
    

    public Clientes(String idCliente, String nombre1, String nombre2, boolean estado, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.estado = estado;
        this.nombreCliente = nombreCliente;
    }//fin constructor

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nombre1=" + nombre1 + ", nombre2=" + 
                nombre2 + ", estado=" + estado + ", nombreCliente=" + nombreCliente + '}';
    }
    
    
    public static void leerMeter_array_clientes(){
        
        try{
            File file = new File(rutaCliente);

            Scanner sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                
                String linea = sc.nextLine();
                
                String[] partes = linea.split(";");
                
                String idCliente = partes[0];
                String nombre1 = partes[1];
                String nombre2 = partes[2];
                boolean estado = Boolean.parseBoolean(partes[3]);
                String nombreCliente = partes[4];
                
                listaCliente.add(new Clientes(idCliente, nombre1, nombre2, estado, nombreCliente));
                
                
            }//fin while
            
            
        }catch(IOException e){
            
             e.printStackTrace();
            
        }//fin catch
        
    }//fin método leerMeter_array_clientes
    
    
    
}//fin clase Clientes
