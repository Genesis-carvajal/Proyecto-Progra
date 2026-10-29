/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.GUI_Fin;
import vista.GUI_Juego;
import vista.GUI_Menu;

/**
 *
 * @author carva
 */
public class ControladorSistema {
    //Llamar a la clase con ArrayList
    
    //LLamar a las vistas
    private GUI_Menu menu = new GUI_Menu();
    private GUI_Juego juego = new GUI_Juego();
    private GUI_Fin fin = new GUI_Fin();

    //Conexión a las vistas del proyecto.
    public ControladorSistema() {
        menu.setControlador(this);
        juego.setControlador(this);
        fin.setControlador(this);
    }//Fin del constructor
    
}//Fin de la clase ControladorSistema.
