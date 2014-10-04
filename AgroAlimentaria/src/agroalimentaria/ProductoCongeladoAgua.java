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
public class ProductoCongeladoAgua extends ProductoCongelado{
    protected float gramosDeSal;
    protected float litrosDeAgua;

    public ProductoCongeladoAgua() {
    }
    
    public ProductoCongeladoAgua(float gramosDeSal, float litrosDeAgua, Date fechaEnvasado, String paisOrigen, Float temperaturaRecomendada, Date fechaCaducidad, Integer numeroLote) {
        super(fechaEnvasado, paisOrigen, temperaturaRecomendada, fechaCaducidad, numeroLote);
        this.gramosDeSal = gramosDeSal;
        this.litrosDeAgua = litrosDeAgua;
    }

    public float getGramosDeSal() {
        return gramosDeSal;
    }

    public void setGramosDeSal(float gramosDeSal) {
        this.gramosDeSal = gramosDeSal;
    }

    public float getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(float litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    @Override
    public String toString() {
        return super.toString()+",\nGramos de Sal=" + gramosDeSal + ",\nLitros de Agua=" + litrosDeAgua;
    }
    
    
    
}
