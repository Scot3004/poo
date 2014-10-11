/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.math.BigDecimal;

/**
 *
 * @author bohorquezhector@coruniamericana.edu.co
 */
public class Empleado extends Persona {

    private BigDecimal salario;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal Salario) {
        this.salario = Salario;
    }

    @Override
    public String toString() {
        return super.toString()+"\nsalario=" + salario;
    }    
}
