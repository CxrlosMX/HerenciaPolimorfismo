/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresayEmpleados;

import java.util.Calendar;
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
public class EmpleadoContratado extends Empleado {

    // Los empleados contratados tienen un sueldo básico y un porcentaje adicional en función de los años trabajando durante la empresa
    private double sueldoBase;

    public EmpleadoContratado() {
        super(); //Super nos permite llamar a nuestro constructor de la clase padre
        sueldoBase = 0;
    }

    public EmpleadoContratado(double sueldoBase, String numeroDNI, String nombre, String apellido, GregorianCalendar fechaIngreso) {
        super(numeroDNI, nombre, apellido, fechaIngreso);
        this.sueldoBase = sueldoBase;

    }

    public double getSueldoBase() {
        GregorianCalendar actual = new GregorianCalendar();
        int year = actual.get(Calendar.YEAR) - super.getFechaIngreso().get(Calendar.YEAR);
        if (fechaIngreso.get(Calendar.MONTH) > actual.get(Calendar.MONTH)
                || fechaIngreso.get(Calendar.MONTH) == actual.get(Calendar.MONTH)
                && fechaIngreso.get(Calendar.DAY_OF_MONTH) > actual.get(Calendar.DAY_OF_MONTH)) {
            year--;
        }
        switch (year) {
            case 0: //No utilizamos nuestro break por que no queremos interrumpir nuestra accion
            case 1:
            case 2:
            case 3:
                return (1.05 * this.sueldoBase);
            case 4:
            case 5:
            case 6:
            case 7:
                return (1.10 * this.sueldoBase);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return (1.15 * this.sueldoBase);
            default:
                return (1.20 * this.sueldoBase);
        }

    }

    public void setSueldoBase(double sueldoBase) {

        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldoBase;
    }

}
