/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carva
 */
public abstract class PaginaActividad extends Pagina{

    private String contenido;
    
    public PaginaActividad(String titulo, int numeroPagina, String contenido) {
        super(titulo, numeroPagina, contenido);
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public void mostrarContenido(){
        
    }
}
