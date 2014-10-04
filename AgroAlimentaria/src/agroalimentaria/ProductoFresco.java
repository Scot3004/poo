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
public class ProductoFresco extends Producto {
    protected Date fechaEnvasado;
    protected String paisOrigen;

    public ProductoFresco() {
    }

    public ProductoFresco(Date fechaCaducidad, Integer numeroLote) {
        super(fechaCaducidad, numeroLote);
    }

    public ProductoFresco(Date fechaEnvasado, String paisOrigen) {
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
}
