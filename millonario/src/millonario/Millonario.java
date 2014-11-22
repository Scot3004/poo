/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millonario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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
    private boolean ayuda_50=true;

    public List<Pregunta> getPreguntas() {
        if(preguntas==null){
            preguntas=new ArrayList<>();
            preguntas.add(new Pregunta("Cuanto es 1+1: ",new String[]{"3","1","2","6"},2,"4-2","10/5"));
            preguntas.add(new Pregunta("Ciudad de Colombia conocida como la Arenosa: ",new String[]{"Barranquilla","Cartagena","Medellin","Bogotá"},0,"Norte del pais","Rio Magdalena"));
            preguntas.add(new Pregunta("Lenguaje de marcas usado como base de muchas páginas web: ",new String[]{"HTML","CSS","Jquery","C"},0,"Hipertexto","Parece XML"));
            preguntas.add(new Pregunta("Nombre de biblioteca Java usada en gráficos: ",new String[]{"JPA","Swing","jdbc","jquery"},1,"remplaza AWT","No es de base de datos"));
            preguntas.add(new Pregunta("Nombre de la calle 45 en Barranquilla Colombia: ",new String[]{"Olaya Herrera","Cordialidad","Murillo Toro","Circunvalar"},2,"Pasa por soledad","Es una avenida"));
            preguntas.add(new Pregunta("Nombre del Afinaito, cantante de champeta cartagenero: ",new String[]{"Pablo Cesar","Sergio Orozco","Sergio Liñan","Alberto Lopez"},2,"No es el jhonky","Tiene un apellido raro"));
            preguntas.add(new Pregunta("Vocalista del grupo de Metal Avantasia: ",new String[]{"Tobias Sammet","Victor Garcia","Tonny Kakko","Sharon del Adel"},0, "Empieza por T", "Tiene una S"));
            preguntas.add(new Pregunta("Rio que atraviesa la ciudad de Barranquilla: ",new String[]{"Cauca","Amazonas","Bogotá","Magdalena"},3,"3 de ellos son de su vertiente","Inicia por el paramo de las papas"));
            preguntas.add(new Pregunta("Numero de notas en una octava: ",new String[]{"6","32","7","8"},2,"Eso es de musica", "Es un numero pequeño"));
            preguntas.add(new Pregunta("Numero de '0' en el juego uno de mattel: ",new String[]{"8","6","10","4"},3,"El numero es pequeño","Muchas cartas son de 8 pero no creo que esa"));
            preguntas.add(new Pregunta("Sistema operativo del celular Moto G de motorola: ",new String[]{"Windows","Android","Smartalk","Slax"},1,"Es linux","Debe ser algo movil"));
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
    
    public List<Integer> incorrectas(){
        if(ayuda_50){
            LinkedList<Integer>  lista = new LinkedList<>();
            for(int i=0;i<4;i++){
                lista.add(i);
            }
            Integer correcta=getPreguntas().get(getPreguntaActual()-1).getCorrecta();
            System.out.println(correcta);
            lista.remove(correcta);
            System.out.println(lista);
            Collections.shuffle(lista);
            System.out.println("Eliminado "+lista.pop());
            
            System.out.println(lista);
            ayuda_50=false;
            return lista;
        }else{
            return null;
        }
        
    }

    public int[] getSeguros() {
        return seguros;
    }

    public void setSeguros(int[] seguros) {
        this.seguros = seguros;
    }

    public boolean isAyuda_50() {
        return ayuda_50;
    }

    public void setAyuda_50(boolean ayuda_50) {
        this.ayuda_50 = ayuda_50;
    }

    
    
    
}
