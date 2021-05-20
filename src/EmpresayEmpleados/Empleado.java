/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresayEmpleados;

import java.util.GregorianCalendar;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 19/05/2021
 *
 */
public class Empleado {

    private String numeroDNI;
    private String nombre, apellido;
    protected GregorianCalendar fechaIngreso;

    public Empleado() {
        numeroDNI = "00000000";
        nombre = "S/N";
        apellido = "S/P";
        fechaIngreso = new GregorianCalendar(1800, 0, 1); //En gregiran calendar los meses se cuentan desde 0
    }

    public Empleado(String numeroDNI, String nombre, String apellido, GregorianCalendar fechaIngreso) {
        this.numeroDNI = numeroDNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(String numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(GregorianCalendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        int dia, mes, ano;
        dia = getFechaIngreso().get(GregorianCalendar.DAY_OF_MONTH);
        mes = getFechaIngreso().get(GregorianCalendar.MONTH) + 1; //Le sumamos uno por que recordemos que el mes empieza el contedo desde 0
        ano = getFechaIngreso().get(GregorianCalendar.YEAR);
        return "DNI: " + this.getNumeroDNI() + "\nNombre y Apellido: " + this.getNombre() 
                + " " + this.getApellido() 
                + "\nFecha de ingreso: "
                + (dia <= 9 ? "0" + dia : dia) 
                + "/" + (mes <= 9 ? "0" + mes : mes) + "/" + ano; //Utilizamos nuestro operador ternario para darle un buen formato a la hora de imprimir nuestra fecha
    }

}
