/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author carva
 */
public class BancoPreguntas {
     //  BancoPreguntas
    private Pagina[][] pagina = new Pagina[3][3];
    
        public BancoPreguntas() {
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

//        pagina[0][2] = new BancoPreguntas("Nombre", "Nombre", "Lleve el coso hasta su casilla correcta");
//        
    }
    
    //Recibir preguntas de CLASE pREGUNTA
    public Pagina obtenerPregunta(int capitulo, int numeroPregunta) throws PaginaNoExisteException {
    if (capitulo < 0 || capitulo >= pagina.length
            || numeroPregunta < 0 || numeroPregunta >= pagina[capitulo].length) {
        throw new PaginaNoExisteException("Esa pregunta no existe.");
    }
    if (pagina[capitulo][numeroPregunta] == null) {
        throw new PaginaNoExisteException("Esa pregunta todavía no está cargada.");
    }
    return pagina[capitulo][numeroPregunta];
}
    
    
}
