/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.GUI_Fin;
import vista.GUI_Juego;
import vista.VistaActividad;


    
    //LLamar a las vistas
   public class ControladorSistema {

    // Llamar a las ventanas del proyecto
    private GUI_Juego juego = new GUI_Juego();
    private VistaActividad actividad = new VistaActividad();

    // Constructor del controlador
    public ControladorSistema() {

        // Conectar la acción de jugar
        juego.setAccionJugar(() -> abrirPrimeraActividad());

    }

    // Método para iniciar el programa
    public void Iniciar() {

        juego.setLocationRelativeTo(null);
        juego.setVisible(true);

    }

    // Método para abrir la primera actividad
    public void abrirPrimeraActividad() {

        juego.setVisible(false);

        actividad.setLocationRelativeTo(null);
        actividad.setVisible(true);

    }

    // Método para salir del programa
    public void Salir() {

        System.exit(0);

    }

}