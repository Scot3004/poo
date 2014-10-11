/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author scot3004
 */
public class Fechas {

    ArrayList<Persona> personas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fechas gestion = new Fechas();
        Scanner in = new Scanner(System.in);

        int opc = 0;
        while (opc != 9) {
            System.out.println("\n");
            System.out.println("\n	  MENU PRINCIPAL");
            System.out.println("\n1.Informacion");
            System.out.println("\n2.Modificar Informacion");
            System.out.println("\n3.Persona de Mayor Edad");
            System.out.println("\n4.Numero de Personas Mayores de Edad");
            System.out.println("\n5.Estudiantes de Menor Edad ");
            System.out.println("\n6.Programa mas Escojido");
            System.out.println("\n7.Salario mas Alto");
            System.out.println("\n8.Personas que viven en Barranquilla");
            System.out.println("\n9.Salir");
            System.out.println("\n");
            System.out.println("\ningrese su opcion\t");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    gestion.agregarPersona();
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("La persona de mayor edad es: "+gestion.elMayor());
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    int personasEnBarranquilla=gestion.personasEnBarranquilla();
                    if(personasEnBarranquilla==0){
                        System.out.println("No hay personas en Barranquilla");
                    }else{
                       System.out.println("Los residentes en Barranquilla son: "+personasEnBarranquilla);
                    }
                    break;
                case 9:

                    System.exit(0);

                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }// fin de switch
        }//fin de while
    }

    /**
     * Obtiene la persona que es mayor entre todos
     * @return 
     */
    public Persona elMayor() {
        Persona mayor = null;
        for (Persona p : personas) {
            if (mayor == null) {
                mayor = p;
            } else if (p.esMayor(mayor)) {
                mayor = p;
            }
        }
        return mayor;
    }

    public int personasEnBarranquilla() {
        int residentes=0;
        for (Persona p : personas) {
            if (p.getCiudad().equals("Barranquilla")) {
                residentes++;
            }
        }
        return residentes;
    }

    /**
     * datos de las personas
     */
    public void agregarPersona() {
        Persona p = new Persona();
        p.setNombre(obtenerCampo("Nombre:"));
        p.setCiudad(obtenerCampo("Ciduad:"));
        p.setCodigoPostal(obtenerCampo("Codigo Postal:"));
        p.setDireccion(obtenerCampo("Direccion:"));
        p.setNacimiento(obtenerFecha("nacimiento"));
        //TODO: nacimiento de persona        
        personas.add(p);
    }

    /**
     * Obtiene un dato obtenido por consola
     *
     * @param mensaje
     * @return
     */
    public String obtenerCampo(String mensaje) {
        System.out.println("\n" + mensaje);
        return sc.next();
    }
    
    public Date obtenerFecha(String nombreCampo){
        int dia, mes, anio;
        System.out.println("\nIngresando "+nombreCampo);
        System.out.println("Ingrese dia de "+nombreCampo);
        dia=sc.nextInt();
        System.out.println("Ingrese mes de " + nombreCampo
                + "\n1: Enero"
                + "\n2: Febrero"
                + "\n3: Marzo"
                + "\n4: Abril"
                + "\n5: Mayo"
                + "\n6: Junio"
                + "\n7: Julio"
                + "\n8: Agosto"
                + "\n9: Septiembre"
                + "\n10: Octubre"
                + "\n11: Noviembre"
                + "\n12: Diciembre"
        );
        mes=sc.nextInt();
        //Mes se le resta uno para nivelar mes de la clase calendar
        mes--;
        System.out.println("Ingrese año de "+nombreCampo);
        anio=sc.nextInt();
        return new GregorianCalendar(anio, mes, dia).getTime();
    }
}
