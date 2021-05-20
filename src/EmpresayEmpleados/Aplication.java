/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresayEmpleados;

import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 20/05/2021
 *
 */
public class Aplication {

    int op;
    ListaEmpleados ListaContratado = new ListaEmpleados();
    ListaEmpleados ListaDestajo = new ListaEmpleados();
    private static Scanner Lector = new Scanner(System.in);
    public static final short CONTRATADO = 1;
    public static final short DESTAJO = 2;

    private static String Leer(String msje) {
        System.out.println(msje + ": ");
        return Lector.nextLine();
    }

    private void Leer(int Type) {
        String dni = Leer("Introduce el DNI");
        String nombre = Leer("Introduce el Nombre por favor");
        String apellido = Leer("Introduce los apellidos por favor");
        System.out.println("Ingrese la fecha de ingreso");
        int anio = Integer.parseInt(Leer("Año"));
        int mes = Integer.parseInt(Leer("Mes (1-12)"));
        int dia = Integer.parseInt(Leer("Dia"));
        GregorianCalendar fechaIngreso = new GregorianCalendar(anio, mes - 1, dia);
        if (Type == CONTRATADO) {
            double sueldo = Double.parseDouble(Leer("Introduce tu sueldo base por favor"));
            ListaContratado.addEmpleado(new EmpleadoContratado(sueldo, dni, nombre, apellido, fechaIngreso));
        } else {
            int clientes = Integer.parseInt(Leer("Introduce el numero de clientes"));
            ListaDestajo.addEmpleado(new EmpleadoDestajo(clientes, dni, nombre, apellido, fechaIngreso));
        }
    }

    private void mostrarSalarios() {
        System.out.println("Empleados Contratados");
        for (int i = 0; i <=ListaContratado.getPosicion(); i++) {
            System.out.println(ListaContratado.getEmpleado(i));
        }
        System.out.println("Empleados Destajo:");
        for (int j = 0; j <=ListaDestajo.getPosicion(); j++) {
            System.out.println(ListaDestajo.getEmpleado(j));
        }

    }

    private int menu() {
        System.out.println("*-MENU-*\n"
                + "------------------\n"
                + "1.-REGISTRAR EMPLEADOS CONTRATADOS\n"
                + "2.-REGISTRAR EMPLEADOS DESTAJO\n"
                + "3.-MOSTRAR SALARIO\n"
                + "4.-SALIR\n");
        return Integer.parseInt(Leer("Selecciones una opcion"));

    }

    private void Accionar(int opt) {
        switch (opt) {
            case 1: {
                Leer(CONTRATADO);
                System.out.println("Empleado agregado");
                break;
            }
            case 2: {
                Leer(DESTAJO);
                System.out.println("Empleado agregado");
                break;
            }
            case 3: {
                mostrarSalarios();
                break;
            }
            case 4: {
                System.out.println("Cerrando programa");
                break;
            }
            default: {
                System.out.println("Introduce valores validos por favor");
                break;
            }

        }

    }
    
    public void Ejecutar(){
    do{
    op=menu();
    Accionar(op);
            
    }while(op!=4);
    
    }

}
