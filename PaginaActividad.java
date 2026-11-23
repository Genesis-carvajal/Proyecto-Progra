/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author carva
 */
public abstract class PaginaActividad extends Pagina{
    
    public PaginaActividad(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }
    
    @Override
    public String mostrarContenido(){
        //Orden dada al usuario.
        return  "Pagina " + getNumeroPagina() + ": " + getTitulo()
                + "\n\n" + getContenido()
                + "\n\nPresione RESPONDER para contestar tres preguntas.";
    }
}
