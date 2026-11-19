/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Libro {
    
    private ArrayList<Pagina>Paginas=new ArrayList<>();
    
    public void AgregarPag(Pagina pagina){
    
    Paginas.add(pagina);
    
    }
    
    public Pagina CondultarPag(int posicion) {
        if (posicion < 0 || posicion >= Paginas.size()) {

            JOptionPane.showMessageDialog(null, "la pagina no existe ");
            return null;
        }
        return Paginas.get(posicion);
    }
   
    public String MostrarPags() {
        String contenido = "";
        for (int i = 0; i < Paginas.size(); i++) {
            contenido += Paginas.get(i).MostrarContenido()+ "\n\n";
           
        }
        return contenido;

    }
    public int Disponibles() {
        return Paginas.size();
    }
    
}
