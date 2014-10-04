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
public class ProductoCongeladoNitrogeno extends ProductoCongelado{
    protected String CongelacionEmpleado;
    /**
     * tiempo de exposición al nitrógeno expresada en segundos.
     */
    protected float TiempoDeExposicion;

    public ProductoCongeladoNitrogeno() {
    }

    public ProductoCongeladoNitrogeno(String CongelacionEmpleado, float TiempoDeExposicion, Date fechaEnvasado, String paisOrigen, Float temperaturaRecomendada, Date fechaCaducidad, Integer numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.CongelacionEmpleado = CongelacionEmpleado;
        this.TiempoDeExposicion = TiempoDeExposicion;
    }    

    public String getCongelacionEmpleado() {
        return CongelacionEmpleado;
    }

    public void setCongelacionEmpleado(String CongelacionEmpleado) {
        this.CongelacionEmpleado = CongelacionEmpleado;
    }

    public float getTiempoDeExposicion() {
        return TiempoDeExposicion;
    }

    public void setTiempoDeExposicion(float TiempoDeExposicion) {
        this.TiempoDeExposicion = TiempoDeExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nMetodo de Congelacion Empleado=" + CongelacionEmpleado + ",\nTiempo De Exposicion=" + TiempoDeExposicion;
    }
    
    
    
}
