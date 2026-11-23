/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author carva
 */
public class Arreglos {
    //Arreglo unidimensional para almacenar las respuestas correctas de 3 preguntas.
    private int[] respuestasCorrectas = {2, 1, 3};
    private int[] respuestasUsuario = new int[3];
    //Arreglo tipo bidimensional para almacenar los intentos realizados.
    private int[][] historial = new int[3][3];
    private int intentosRealizados = 0;
    
        
    public void registrarRespuestas(int pregunta, int respuesta) throws RespuestaInvalidaException {
        if (pregunta < 0 || pregunta >= respuestasUsuario.length) {
            throw new RespuestaInvalidaException("Esa pregunta no existe.");
        }
        if (respuesta < 1 || respuesta > 3) {
            throw new RespuestaInvalidaException("Debe elegir una opción entre 1 y 3.");
        }
        respuestasUsuario[pregunta] = respuesta;
    }

    public int calcularCorrectas() throws RespuestaInvalidaException {
        int correctas = 0;
        for (int i = 0; i < respuestasCorrectas.length; i++) {
            if (respuestasUsuario[i] == 0) {
                throw new RespuestaInvalidaException("Falta responder la pregunta " + (i + 1) + ".");
            }
            if (respuestasUsuario[i] == respuestasCorrectas[i]) {
                correctas++;
            }
        }
        return correctas;
    }

    public void registrarIntentos() throws IntentoFueraDeRangoException {
        if (intentosRealizados >= historial.length) {
            throw new IntentoFueraDeRangoException("Ya usaste los 3 intentos permitidos.");
        }
        for (int j = 0; j < respuestasUsuario.length; j++) {
            historial[intentosRealizados][j] = respuestasUsuario[j];
        }
        intentosRealizados++;
        java.util.Arrays.fill(respuestasUsuario, 0);
    }

    public int[] consultarIntento(int numeroIntento) throws IntentoFueraDeRangoException {
        if (numeroIntento < 1 || numeroIntento > intentosRealizados) {
            throw new IntentoFueraDeRangoException("Ese intento no existe.");
        }
        return historial[numeroIntento - 1];
    }
}