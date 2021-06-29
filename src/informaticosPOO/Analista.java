/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package informaticosPOO;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 29/06/2021
 * 
 */
public class Analista extends Informaticos{

    //Polimorfismo-Overload
    public void sueldo(int horas, double pagoH,double incen) {
        JOptionPane.showMessageDialog(null, "El pago es: " + ((horas * pagoH)+incen), "Pago", 1);
    }

    public void datos(String nombre, String ape,String direccion) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + ", Apellidos: " + ape+", Direccion: "+direccion, "Datos", 1);

    }

    public void labores(String lab,int horas) {
        JOptionPane.showMessageDialog(null, "Soy analista y me dedico a " + lab+" "+horas +"h  al dia","Labor", 1);

    }
}
