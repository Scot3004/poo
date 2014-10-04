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
public class ProductoFresco extends Producto {
    protected Date fechaEnvasado;
    protected String paisOrigen;

    public ProductoFresco() {
    }

    public ProductoFresco(Date fechaEnvasado, String paisOrigen, Date fechaCaducidad, Integer numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
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

    @Override
    public String toString() {
        return super.toString()+"\nFecha de Envasado=" + fechaEnvasado + ", Pais de Origen=" + paisOrigen ;
    }
    
    
}
