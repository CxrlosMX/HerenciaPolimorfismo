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
public class AdministradorBD extends Informaticos{

    //Polimorfismo-Overload
    public void sueldo( double pagoH) {
        JOptionPane.showMessageDialog(null, "El pago es: "+ pagoH, "Pago", 1);
    }

    public void datos(String nombre) {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre , "Datos", 1);

    }

    public void labores(String lab) {
        JOptionPane.showMessageDialog(null, "Soy administrador  y me dedico a " + lab,"Laboras", 1);

    }
}
