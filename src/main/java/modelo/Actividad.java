/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Actividad {

    private int[] respuestasCorrectas = {1, 2, 3};
    private int[] respuestasUsuario = new int[3];
    private int[][] historial = new int[3][3];
    private int intentos = 0;

    private String[] imagenes = {
        "/resources/residuosPlasticos.png",
        "/resources/residuosOrganicos.png",
        "/resources/residuosPapel.png"
    };

    public void guardarRespuesta(int pregunta, int respuesta) {
        if (pregunta >= 0 && pregunta < 3 && respuesta >= 1 && respuesta <= 3) {
            respuestasUsuario[pregunta] = respuesta;
        }
    }

    public int puntosIntento(int numeroIntento) {

        if (numeroIntento < 0 || numeroIntento >= intentos) {
            return -1;
        }

        int puntos = 0;

        for (int i = 0; i < 3; i++) {
            if (historial[numeroIntento][i] == respuestasCorrectas[i]) {
                puntos++;
            }
        }

        return puntos;
    }

    public String obtenerResultados() {

        String resultado = "";

        for (int i = 0; i < intentos; i++) {
            resultado += "Intento " + (i + 1) + ": "
                    + puntosIntento(i) + " de 3 correctas\n";
        }

        if (intentos == 0) {
            resultado = "Todavía no has realizado intentos.";
        }

        return resultado;
    }

    public int calcularPuntos() {
        int puntos = 0;

        for (int i = 0; i < 3; i++) {
            if (respuestasUsuario[i] == respuestasCorrectas[i]) {
                puntos++;
            }
        }

        return puntos;
    }

    public boolean guardarIntento() {
        if (intentos >= 3) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            historial[intentos][i] = respuestasUsuario[i];
        }

        intentos++;
        return true;
    }

    public int getIntentos() {
        return intentos;
    }

    public int[][] getHistorial() {
        return historial;
    }

    public String mostrarHistorial() {
        String resultado = "";

        for (int i = 0; i < intentos; i++) {
            resultado += "Intento " + (i + 1) + ": ";

            for (int j = 0; j < 3; j++) {
                resultado += historial[i][j] + " ";
            }

            resultado += "\n";
        }

        return resultado;
    }

    public boolean respuestasCompletas() {

        for (int i = 0; i < 3; i++) {
            if (respuestasUsuario[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public String obtenerImagen(int posicion) {
        return imagenes[posicion];
    }

    public int cantidadPreguntas() {
        return imagenes.length;
    }

    public int obtenerRespuesta(int posicion) {
        return respuestasUsuario[posicion];
    }

    public boolean esRespuestaCorrecta(int posicion, int respuesta) {
        return respuestasCorrectas[posicion] == respuesta;
    }

    public void limpiarRespuestas() {

        for (int i = 0; i < respuestasUsuario.length; i++) {
            respuestasUsuario[i] = 0;
        }
    }

}//class
