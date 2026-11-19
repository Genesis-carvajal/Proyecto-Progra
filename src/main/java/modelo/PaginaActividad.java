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
 //  BancoPreguntas
    //Arreglo tipo bidimensional tipo Pregunta.
    private Pagina[][] pagina = new Pagina[3][3];

    public PaginaActividad() {
        cargarPreguntas();
    }
    
    
    
    public void cargarPreguntas(){
//        //Pregunta selección multiple
//        String[] opciones1 = {"Aquí van las respuestas"};
//        pagina[0][0] = new NombreClaseHija(opciones1,"Respuesta correcta","Pregunta");
//     
//        //Pregunta verdadero falso
//        pagina[0][1] = new NombreClaseHija(true, "Pregunta");
        
        //Pregunta arrastrar.
        ///NombreClaseHija podría ser un Banco de Preguntas
//        pagina[0][2] = new NombreClaseHija("Nombre", "Nombre", "Lleve el coso hasta su casilla correcta");
//        
    }
    
    //Recibir preguntas de CLASE pREGUNTA
    public Pagina obtenerPregunta(int capitulo, int numeroPregunta){
        return pagina[capitulo][numeroPregunta];
    }
}
