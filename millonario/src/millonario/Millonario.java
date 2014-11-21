/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millonario;

import java.util.ArrayList;
import java.util.List;
import logica.Pregunta;

/**
 *
 * @author scot3004
 */
public class Millonario {

    public List<Pregunta> preguntas;

    public List<Pregunta> getPreguntas() {
        if(preguntas==null){
            preguntas=new ArrayList<>();
            preguntas.add(new Pregunta("Pregunta: ",new String[]{"A","B","C","D"},1));
        }
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    public Pregunta getPregunta(){
        return getPreguntas().get(0);
    }
    
}
