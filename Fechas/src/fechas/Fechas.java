/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import static java.lang.System.out;
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

        int opc;
        do {
            System.out.println();
            System.out.println("	  MENU PRINCIPAL");
            System.out.println("1.Agregar Persona");
            System.out.println("2.Modificar Informacion");
            System.out.println("3.Persona de Mayor Edad");
            System.out.println("4.Consultar Informacion");
            System.out.println("5.Estudiantes de Menor Edad ");
            System.out.println("6.Programa mas Escojido");
            System.out.println("7.Salario mas Alto");
            System.out.println("8.Personas que viven en Barranquilla");
            System.out.println("0.Salir");
            System.out.println("ingrese su opcion\t");
            opc = in.nextInt();
            System.out.println();
            switch (opc) {
                case 1:
                    gestion.agregarPersona();
                    break;
                case 2:
                    gestion.editarInformacion();
                    break;
                case 3:
                    System.out.println("La persona de mayor edad es: "+gestion.elMayor());
                    break;
                case 4:
                    int menores=gestion.menoresDeEdad();
                    if(menores==0){
                        System.out.println("No hay personas menores de edad");
                    }else{
                       System.out.println("Los menores de edad son: "+menores);
                    }
                    
                    break;
                case 5:
                    int mayores=gestion.mayoresDeEdad();
                    if(mayores==0){
                        System.out.println("No hay personas menores de edad");
                    }else{
                       System.out.println("Los menores de edad son: "+mayores);
                    }
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
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }// fin de switch
        }while (opc != 0); //fin de while
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
    
    public int menoresDeEdad() {
        int menores=0;
        for (Persona p : personas) {
            if (!p.isAdulto()) {
                menores++;
            }
        }
        return menores;
    }
    
    public int mayoresDeEdad() {
        int mayores=0;
        for (Persona p : personas) {
            if (p.isAdulto()) {
                mayores++;
            }
        }
        return mayores;
    }

    /**
     * datos de las personas
     */
    public void agregarPersona() {
        Persona p;// = new Persona();
        //Condicion crear persona o enoleado
        System.out.println("Digite una Opcion");
        int opcion =  sc.nextInt();
        if(opcion==1)
            p=new Empleado();
        else
            p=new Estudiante();
        p.setNombre(obtenerCampo("Nombre:"));
        p.setCiudad(obtenerCampo("Ciduad:"));
        p.setCodigoPostal(obtenerCampo("Codigo Postal:"));
        p.setDireccion(obtenerCampo("Direccion:"));
        p.setNacimiento(obtenerFecha("nacimiento"));
        //TODO: nacimiento de persona        
        personas.add(p);
        System.out.println("La persona tiene id: "+(personas.size()-1));
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
  
    public void editarInformacion(){
        //TODO; Pedir que persona modificara
        //TODO; Pedir que campo Se editara
        //TODO: Editar el campo
        //TODO: Ciclo para saber si va a cambiar mas campos
        
        System.out.println("Que persona modificara  (id)");
        int index=sc.nextInt();
        Persona p=personas.get(index);
        //TODO: agregar condicional
        int opc;
        do {
            System.out.println();
            System.out.println("EDICION DE PERSONA");
            System.out.println("1.Editar Nombre");
            System.out.println("2.Editar Ciudad");
            System.out.println("3.Editar Codigo Postal");
            System.out.println("4.Editar Direccion");
            System.out.println("0.Salir");
            System.out.println("ingrese su opcion\t");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    p.setNombre(obtenerCampo("Nombre: "));
                    break;
                case 2:
                    p.setCiudad(obtenerCampo("Ciudad: "));
                    break;
                case 3:
                    p.setCodigoPostal(obtenerCampo("Codigo Postal: "));
                    break;
                case 4:
                    p.setDireccion(obtenerCampo("Direccion: "));
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }// fin de switch
        }while (opc != 0); //fin de while
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
    public void consultarInformacion(){
                //TODO: Editar el campo
        //TODO: Ciclo para saber si va a cambiar mas campos
        
        System.out.println("mostrar informacion");
        int index=sc.nextInt();
        Persona p=personas.get(index);
        System.out.println("Eligio: "+p);
        //TODO: agregar condicional
    }
}
