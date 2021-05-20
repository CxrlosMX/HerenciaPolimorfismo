/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresayEmpleados;

import java.util.ArrayList;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 19/05/2021
 *
 */
public class ListaEmpleados {

    private ArrayList<Empleado> listaE; //Creamos un array de tipo empleado
    private int posicion; //Ultima pocision

    public ListaEmpleados() {
        listaE = new ArrayList<Empleado>();
        posicion = -1;
    }

    public void addEmpleado(Empleado e) {
        listaE.add(e);
        posicion++;

    }

    public Empleado getEmpleado(int p) {
        if (p >= 0 && p <= posicion) {
            return listaE.get(p);
        }
        return null;
    }

    public Empleado deleteEmpleado(int p) {
        if (p >= 0 && p <= posicion) {
            return listaE.remove(p);
        }
        return null;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i <= this.posicion; i++) {
            cadena += "\n\tEmpleado " + (i + 1) + ":\n" + listaE.get(i);
        }
        return cadena;
    }

}
