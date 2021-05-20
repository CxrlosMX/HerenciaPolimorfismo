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
public class EmpleadoDestajo extends Empleado {

    //Los empleados a destajo tienen un número de clientes captados y un monto por cliente captado.
    private int nCliente;
    private final double MONTO = 130;

    public EmpleadoDestajo() {
        super();
        nCliente = 5;
    }

    public EmpleadoDestajo(int nCliente, String numeroDNI, String nombre, String apellido, GregorianCalendar fechaIngreso) {
        super(numeroDNI, nombre, apellido, fechaIngreso);
        this.nCliente = nCliente;
    }

    public int getnCliente() {
        return nCliente;
    }

    public double getSueldo() {
        
        return this.nCliente*this.MONTO;
    }

    public void setnCliente(int nCliente) {
        this.nCliente = nCliente;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de clientes: " + nCliente +", Sueldo: "+getSueldo();
    }
    

}
