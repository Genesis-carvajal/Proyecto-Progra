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
    }//Fin del constructor.
    
    public void Iniciar(){
        menu.setLocationRelativeTo(null); //Nos permite que al ejecutar el juego se centre la ventana.
        menu.setVisible(true); //Un método que hace que se vea la ventana sí es true.
    }//Fin del método Iniciar.
    
    public void Salir(){
        System.exit(0);
    }//Fin del método Salir.
    
    public void abrirJuego(){
        menu.setVisible(false);
        juego.setLocationRelativeTo(null);
        juego.setVisible(true);
    }//Fin del método abrirJuego.
    
    public void menuAnterior(){
        GUI_Juego volver = new GUI_Juego();
        
    }//Fin del método menuAnterior.
    
}//Fin de la clase ControladorSistema.
