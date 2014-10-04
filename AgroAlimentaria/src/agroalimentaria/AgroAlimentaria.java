/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agroalimentaria;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author scot3004
 */
public class AgroAlimentaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Producto> productos=new ArrayList<>();
        Calendar c=new GregorianCalendar(1991, GregorianCalendar.APRIL, 30);
        productos.add(new ProductoFresco(c.getTime(), "Colombia", new Date(), 1));
        
        for (Producto producto : productos) {
            System.out.println("Producto:\n"+producto);
        }
    }
    
}
