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
        Calendar cumpleSergio=new GregorianCalendar(1991, GregorianCalendar.APRIL, 30);
        Calendar cumpleHector=new GregorianCalendar(1992, GregorianCalendar.JULY, 28);
        Calendar finAno=new GregorianCalendar(2014, GregorianCalendar.DECEMBER, 31);
        
        productos.add(new ProductoFresco(cumpleSergio.getTime(), "Colombia", new Date(), 1));
        productos.add(new ProductoCongeladoAgua(5,4,cumpleHector.getTime(), "Colombia", 35.5f, finAno.getTime(), 2));
        
        ProductoFresco pf=new ProductoFresco();
        pf.setNumeroLote(3);
        pf.setFechaCaducidad(finAno.getTime());
        pf.setFechaEnvasado(cumpleSergio.getTime());
        pf.setPaisOrigen("Colombia");
        productos.add(pf);
        
        ProductoCongeladoAgua pa1=new ProductoCongeladoAgua();
        pa1.setFechaCaducidad(finAno.getTime());
        pa1.setFechaEnvasado(cumpleSergio.getTime());
        pa1.setGramosDeSal(5);
        pa1.setLitrosDeAgua(4);
        pa1.setNumeroLote(4);
        pa1.setPaisOrigen("Argentina");
        pa1.setTemperaturaRecomendada(27.3f);
        productos.add(pa1);
        
        ProductoCongeladoAgua pa2=new ProductoCongeladoAgua();
        pa2.setFechaCaducidad(finAno.getTime());
        pa2.setFechaEnvasado(cumpleSergio.getTime());
        pa2.setGramosDeSal(3);
        pa2.setLitrosDeAgua(8);
        pa2.setNumeroLote(5);
        pa2.setPaisOrigen("Brasil");
        pa2.setTemperaturaRecomendada(10.5f);
        productos.add(pa2);
        
        ProductoCongeladoAire pi1=new ProductoCongeladoAire();
        pi1.setFechaCaducidad(finAno.getTime());
        pi1.setFechaEnvasado(cumpleSergio.getTime());
        pi1.setPorcentajeDioxidoDeCarbono(3.5f);
        pi1.setPorcentajeNitrogeno(2.5f);
        pi1.setPorcentajeOxigeno(1.2f);
        pi1.setPorcentajeVaporDeAgua(5.3f);
        pi1.setNumeroLote(6);
        pi1.setPaisOrigen("Holanda");
        pi1.setTemperaturaRecomendada(15.3f);
        productos.add(pi1);
        
        ProductoCongeladoAire pi2=new ProductoCongeladoAire();
        pi2.setFechaCaducidad(finAno.getTime());
        pi2.setFechaEnvasado(cumpleSergio.getTime());
        pi2.setPorcentajeDioxidoDeCarbono(4.5f);
        pi2.setPorcentajeNitrogeno(3.5f);
        pi2.setPorcentajeOxigeno(2.2f);
        pi2.setPorcentajeVaporDeAgua(1.3f);
        pi2.setNumeroLote(7);
        pi2.setPaisOrigen("Alemania");
        pi2.setTemperaturaRecomendada(18.8f);
        productos.add(pi2);
        
        ProductoCongeladoNitrogeno pn=new ProductoCongeladoNitrogeno();
        pn.setCongelacionEmpleado("7");
        pn.setFechaCaducidad(finAno.getTime());
        pn.setFechaEnvasado(cumpleSergio.getTime());
        pn.setNumeroLote(8);
        pn.setPaisOrigen("Bolivia");
        pn.setTemperaturaRecomendada(7.5f);
        pn.setTiempoDeExposicion(3);
        productos.add(pa2);
        
        ProductoRefrigerado pr1=new ProductoRefrigerado();
        pr1.setCodigoOrganismoSupervision("1");
        pr1.setFechaCaducidad(finAno.getTime());
        pr1.setFechaEnvasado(cumpleSergio.getTime());
        pr1.setNumeroLote(9);
        pr1.setPaisOrigen("Peru");
        pr1.setTemperaturaRecomendada(9.8f);
        productos.add(pr1);
        
        ProductoRefrigerado pr2=new ProductoRefrigerado();
        pr2.setCodigoOrganismoSupervision("2");
        pr2.setFechaCaducidad(finAno.getTime());
        pr2.setFechaEnvasado(cumpleSergio.getTime());
        pr2.setNumeroLote(10);
        pr2.setPaisOrigen("Estados Unidos");
        pr2.setTemperaturaRecomendada(13.7f);
        productos.add(pr2);
        
        ProductoRefrigerado pr3=new ProductoRefrigerado();
        pr3.setCodigoOrganismoSupervision("3");
        pr3.setFechaCaducidad(finAno.getTime());
        pr3.setFechaEnvasado(cumpleSergio.getTime());
        pr3.setNumeroLote(11);
        pr3.setPaisOrigen("Ecuador");
        pr3.setTemperaturaRecomendada(3.2f);
        productos.add(pr3);
        
        for (Producto producto : productos) {
            System.out.println("Producto:\n"+producto);
        }
    }
    
}
