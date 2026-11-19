/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carva
 */
public abstract class PaginaInformativa extends Pagina{
    
    private String contenido;
    
    //Constructor.
    public PaginaInformativa(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }
    
    //SETS y GETS.
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
 
    @Override
    public void mostrarContenido() {

    }
}
