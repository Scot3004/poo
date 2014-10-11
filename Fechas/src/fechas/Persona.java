/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author scot3004
 */
public class Persona {

    protected String nombre;
    protected Date nacimiento;
    protected String direccion;
    protected String codigoPostal;
    protected String ciudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Conpara con otra persona y dice si es mayor o no
     *
     * @param otro
     * @return
     */
    public boolean esMayor(Persona otro) {
        return this.getNacimiento().before(otro.getNacimiento());
    }

    public boolean isAdulto() {
        GregorianCalendar ahora = new GregorianCalendar();
        GregorianCalendar gc = new GregorianCalendar(
                ahora.get(GregorianCalendar.YEAR) - 18,
                ahora.get(GregorianCalendar.MONTH),
                ahora.get(GregorianCalendar.DAY_OF_MONTH));
        return this.getNacimiento().before(gc.getTime());
    }
}
