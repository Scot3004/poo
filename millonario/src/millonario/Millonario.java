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
    int preguntaActual=0;
    int[] seguros=new int[]{1,4,7};

    public List<Pregunta> getPreguntas() {
        if(preguntas==null){
            preguntas=new ArrayList<>();
            preguntas.add(new Pregunta("Cuanto es 1+1: ",new String[]{"3","1","2","6"},2));
            preguntas.add(new Pregunta("Ciudad de Colombia conocida como la Arenosa: ",new String[]{"Barranquilla","Cartagena","Medellin","Bogotá"},0));
            preguntas.add(new Pregunta("Lenguaje de marcas usado como base de muchas páginas web: ",new String[]{"HTML","CSS","Jquery","C"},0));
            preguntas.add(new Pregunta("Nombre de biblioteca Java usada en gráficos: ",new String[]{"JPA","Swing","jdbc","jquery"},1));
            preguntas.add(new Pregunta("Nombre de la calle 45 en Barranquilla Colombia: ",new String[]{"Olaya Herrera","Cordialidad","Murillo Toro","Circunvalar"},2));
            preguntas.add(new Pregunta("Nombre del Afinaito, cantante de champeta cartagenero: ",new String[]{"Pablo Cesar","Sergio Orozco","Sergio Liñan","Alberto Lopez"},2));
            preguntas.add(new Pregunta("Vocalista del grupo de Metal Avantasia: ",new String[]{"Tobias Sammet","Victor Garcia","Tonny Kakko","Sharon del Adel"},0));
            preguntas.add(new Pregunta("Rio que atraviesa la ciudad de Barranquilla: ",new String[]{"Cauca","Amazonas","Bogotá","Magdalena"},3));
            preguntas.add(new Pregunta("Numero de notas en una octava: ",new String[]{"6","32","7","8"},2));
            preguntas.add(new Pregunta("Numero de '0' en el juego uno de mattel: ",new String[]{"8","6","10","4"},3));
            preguntas.add(new Pregunta("Sistema operativo del celular Moto G de motorola: ",new String[]{"Windows","Android","Smartalk","Slax"},1));
        }
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    public Pregunta getPregunta(){
        if(preguntaActual<getPreguntas().size())
            return getPreguntas().get(preguntaActual++);
        else return null;
       
    }

    public void resetCounter() {
        preguntaActual=0;
    }

    public int getPreguntaActual() {
        return preguntaActual;
    }

    public void setPreguntaActual(int preguntaActual) {
        this.preguntaActual = preguntaActual;
    }
    
    public int getAsegurado(){
        int preguntaAsegurada=0;
        for(int i: seguros){
            if(i<=preguntaActual){
                preguntaAsegurada=i;
            }
        }
        return preguntaAsegurada;
    }
    
}
