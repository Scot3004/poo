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
public class Empleado extends Persona{
    private BigDecimal Salario;

    public BigDecimal getSalario() {
        return Salario;
    }

    public void setSalario(BigDecimal Salario) {
        this.Salario = Salario;
    }
    
}
