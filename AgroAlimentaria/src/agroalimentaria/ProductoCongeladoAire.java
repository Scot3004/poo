/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agroalimentaria;

import java.util.Date;

/**
 *
 * @author bohorquezhector@coruniamericana.edu.co, orozcosergio@coruniamericana.edu.co
 */
public class ProductoCongeladoAire extends ProductoCongelado {
    protected float porcentajeNitrogeno;
    protected float porcentajeOxigeno;
    protected float porcentajeDioxidoDeCarbono;
    protected float porcentajeVaporDeAgua;

    public ProductoCongeladoAire() {
    }

  
    public ProductoCongeladoAire(float porcentajeNitrogeno, float porcentajeOxigeno, float porcentajeDioxidoDeCarbono, float porcentajeVaporDeAgua, Date fechaEnvasado, String paisOrigen, Float temperaturaRecomendada, Date fechaCaducidad, Integer numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoDeCarbono = porcentajeDioxidoDeCarbono;
        this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
    }

    public float getPorcentajeNitrogeno() {
        return porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(float porcentajeNitrogeno) {
        this.porcentajeNitrogeno = porcentajeNitrogeno;
    }

    public float getPorcentajeOxigeno() {
        return porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(float porcentajeOxigeno) {
        this.porcentajeOxigeno = porcentajeOxigeno;
    }

    public float getPorcentajeDioxidoDeCarbono() {
        return porcentajeDioxidoDeCarbono;
    }

    public void setPorcentajeDioxidoDeCarbono(float porcentajeDioxidoDeCarbono) {
        this.porcentajeDioxidoDeCarbono = porcentajeDioxidoDeCarbono;
    }

    public float getPorcentajeVaporDeAgua() {
        return porcentajeVaporDeAgua;
    }

    public void setPorcentajeVaporDeAgua(float porcentajeVaporDeAgua) {
        this.porcentajeVaporDeAgua = porcentajeVaporDeAgua;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nPorcentaje de Nitrogeno=" + porcentajeNitrogeno + "\nPorcentaje de Oxigeno=" + porcentajeOxigeno + "\nPorcentaje de Dioxido de Carbono=" + porcentajeDioxidoDeCarbono + "\nPorcentaje deVapor De Agua=" + porcentajeVaporDeAgua;
    }
    
    
    
}
