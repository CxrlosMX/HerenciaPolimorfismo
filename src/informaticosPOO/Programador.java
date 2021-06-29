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
public class Programador extends Informaticos {

    //Polimorfismo-Overload
    public void sueldo(int horas, double pagoH) {
        JOptionPane.showMessageDialog(null, "El pago es: " + (horas * pagoH), "Pago", 1);
    }

    public void datos(String nombre, String ape) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + ", Apellidos: " + ape, "Datos", 1);

    }

    public void labores(String lab) {
        JOptionPane.showMessageDialog(null, "Soy programador y me dedico a " + lab,"", 1);

    }
}
