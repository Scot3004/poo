/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agroalimentaria;

import java.util.Date;

/**
 *
 * @author sala101
 */
public class ProductoCongelado extends Producto {
    protected Date fechaEnvasado;
    protected String paisOrigen;
    protected Float temperaturaRecomendada;

    public ProductoCongelado() {
    }

    public ProductoCongelado(Date fechaEnvasado, String paisOrigen, Float temperaturaRecomendada, Date fechaCaducidad, Integer numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(Float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return super.toString()+",\nFecha de Envasado=" + fechaEnvasado + ",\nPais de Origen=" + paisOrigen + ",\nTemperatura Recomendada=" + temperaturaRecomendada;
    }
    
    
}
