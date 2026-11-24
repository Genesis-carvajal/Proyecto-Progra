/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Libro {

    private ArrayList<Pagina> arrayPaginas;

    public Libro() {
        arrayPaginas = new ArrayList<>();
    }

    public void agregarPagina(Pagina nuevaPagina) {
        arrayPaginas.add(nuevaPagina);
    }

    public Pagina obtenerPagina(int posicion) {

        if (posicion < 0 || posicion >= arrayPaginas.size()) {
            JOptionPane.showMessageDialog(null, "La página no existe");
            return null;
        }

        return arrayPaginas.get(posicion);
    }

    public int cantidadPaginas() {
        return arrayPaginas.size();
    }

    public String mostrarTodasLasPaginas() {
        String contenido = "";

        for (int i = 0; i < arrayPaginas.size(); i++) {
            contenido += arrayPaginas.get(i).mostrarContenido() + "\n\n";
        }

        return contenido;
    }
    
    
}//class
