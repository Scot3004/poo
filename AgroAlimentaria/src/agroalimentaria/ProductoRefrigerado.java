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
public class ProductoRefrigerado extends Producto{
    protected String codigoOrganismoSupervision;
    protected Date fechaEnvasado;
    protected String paisOrigen;
    protected Float temperaturaRecomendada;

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(Date fechaCaducidad, Integer numeroLote) {
        super(fechaCaducidad, numeroLote);
    }
    
    public ProductoRefrigerado(String codigoOrganismoSupervision, Date fechaEnvasado, String paisOrigen, Float temperaturaRecomendada, Date fechaCaducidad, Integer numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
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
        return super.toString()+",\nCódigo de Organismo Supervision=" + codigoOrganismoSupervision + ",\nFecha de Envasado=" + fechaEnvasado + ",\nPais de Origen=" + paisOrigen + ",\nTemperatura Recomendada=" + temperaturaRecomendada;
    }
    
    
}
