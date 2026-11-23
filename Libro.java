/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Pagina;
/**
 *
 * @author Monserrath
 */
import java.util.ArrayList;

public class Libro {
    private ArrayList<Pagina> paginas = new ArrayList<>();

    public void agregarPagina(Pagina pagina) {
        paginas.add(pagina);
    }

    public int cantidadPaginas() {
        return paginas.size();
    }

    public Pagina obtenerPagina(int posicion) throws PaginaNoExisteException {
        if (posicion < 0 || posicion >= paginas.size()) {
            throw new PaginaNoExisteException("Esa página no existe.");
        }
        return paginas.get(posicion);
    }
}
