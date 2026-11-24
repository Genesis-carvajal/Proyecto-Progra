/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carva
 */
public class PaginaInformativa extends Pagina{
    
    //Constructor.
    public PaginaInformativa(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }
 
    @Override
    public String mostrarContenido() {
        //Información dada al usuario.
            return "Pagina" + getNumeroPagina() + ":" + getTitulo()
            + "\n\n" + getContenido();
    }
}

