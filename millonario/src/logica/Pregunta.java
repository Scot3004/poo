package logica;

/**
 *
 * @author scot3004
 */
public class Pregunta {
    String[] opciones;
    int correcta;
    String pregunta;
    String pista1;
    String pista2;

    public Pregunta() {
    }

    public Pregunta(String pregunta,String[] opciones, int correcta) {
        this.pregunta=pregunta;
        this.opciones = opciones;
        this.correcta = correcta;
    }

    public Pregunta(String pregunta, String[] opciones, int correcta, String pista1, String pista2) {
        this.opciones = opciones;
        this.correcta = correcta;
        this.pregunta = pregunta;
        this.pista1 = pista1;
        this.pista2 = pista2;
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

    public String getPista1() {
        return pista1;
    }

    public void setPista1(String pista1) {
        this.pista1 = pista1;
    }

    public String getPista2() {
        return pista2;
    }

    public void setPista2(String pista2) {
        this.pista2 = pista2;
    }
    
    
}
