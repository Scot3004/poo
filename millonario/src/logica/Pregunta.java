package logica;

/**
 *
 * @author scot3004
 */
public class Pregunta {
    String[] opciones;
    int correcta;
    String pregunta;

    public Pregunta() {
    }

    public Pregunta(String pregunta,String[] opciones, int correcta) {
        this.pregunta=pregunta;
        this.opciones = opciones;
        this.correcta = correcta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    
    
    public String[] getOpciones() {
        return opciones;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }
    
    
}
