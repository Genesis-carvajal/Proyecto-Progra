/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Libro;
import modelo.PaginaActividad;
import modelo.PaginaInformativa;
import vista.VistaLibro;
import vista.VistaPrincipal;


public class ControladorPrincipal {

    private VistaPrincipal vista;

    public ControladorPrincipal(VistaPrincipal vista) {
        this.vista = vista;
    }

    public void salir() {
        vista.dispose();
    }

    /*  Libro libro = new Libro(); crea nuestro libro interactivo.
        agregarPagina() agrega las tres páginas educativas y la actividad.
        VistaLibro vistaLibro = new VistaLibro(); crea la ventana de lectura.
        ControladorLibro conecta el libro con esa ventana.
        mostrarPagina() muestra la primera página.
        setVisible(true) abre la ventana del libro.
        setVisible(false) oculta el menú principal.
    */
    public void iniciarLectura() {

        Libro libro = new Libro();

        libro.agregarPagina(new PaginaInformativa(
                "¿Qué es el reciclaje?",
                1,
                "El reciclaje consiste en aprovechar materiales "
                + "que ya utilizamos para crear nuevos productos. "
                + "Así ayudamos a cuidar nuestro planeta."
        ));

        libro.agregarPagina(new PaginaInformativa(
                "Reciclemos el plástico",
                2,
                "Las botellas y algunos envases de plástico "
                + "se pueden reciclar. Debemos colocarlos "
                + "en el contenedor correspondiente."
        ));

        libro.agregarPagina(new PaginaInformativa(
                "El papel y los residuos orgánicos",
                3,
                "El papel y el cartón pueden reciclarse. "
                + "Los restos de frutas y verduras son residuos "
                + "orgánicos que pueden convertirse en abono."
        ));

        libro.agregarPagina(new PaginaActividad(
                "¡Ayudemos a LOOPI!",
                4,
                "Vamos a comprobar cuánto aprendiste "
                + "sobre el reciclaje."
        ));

        VistaLibro vistaLibro = new VistaLibro();

        ControladorLibro controladorLibro = new ControladorLibro(libro, vistaLibro);

        vistaLibro.setControlador(controladorLibro);

        controladorLibro.mostrarPagina();

        vistaLibro.setVisible(true);
        vista.setVisible(false);
    }

}//class
