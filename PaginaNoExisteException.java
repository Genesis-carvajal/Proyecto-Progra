/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Monserrath
 */
public class PaginaNoExisteException extends Exception {
    public PaginaNoExisteException(String mensaje) {
        super(mensaje);
    }
}
