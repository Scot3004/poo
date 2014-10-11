/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;

/**
 *
 * @author scot3004
 */
public class Fechas {
    ArrayList<Persona> personas=new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public Persona elMayor(){
        Persona mayor=null;
        for(Persona p:personas){
            if(mayor==null)
                mayor=p;
            else if(p.esMayor(mayor))
                mayor=p;
        }
        return mayor;
    }
    
    public boolean algunoEnBarranquilla(){
        for(Persona p:personas){
            if(p.getCiudad().equals("Barranquilla"))
                return true;
        }
        return false;
    }
}
