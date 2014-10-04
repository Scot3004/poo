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
public abstract class Producto {
    protected Integer numeroLote;
    protected Date fechaCaducidad;
    

    public Producto() {
    }
    
    public Producto(Date fechaCaducidad, Integer numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Integer getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(Integer numeroLote) {
        this.numeroLote = numeroLote;
    }

    @Override
    public String toString() {
         return "numeroLote=" + numeroLote + 
         "\nfechaCaducidad=" + fechaCaducidad ;
    }
    
    
}
