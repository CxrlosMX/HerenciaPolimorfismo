/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informaticosPOO;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 29/06/2021
 *
 */
public class Main {
    
    public static void main(String[] args) {
        Programador p1 = new Programador();
        Analista a1 = new Analista();
        AdministradorBD bd1 = new AdministradorBD();
        
        p1.datos("Luis", "Aparicio");
        p1.sueldo(24, 100);
        p1.labores("Gestionar datos");
        
        a1.datos("Sayuri","Rendon","Tlaxiaco");
        a1.labores("Decodifico",8);
        a1.sueldo(24, 100,600);
        
        bd1.sueldo(4500);
        bd1.datos("Antonio");
        bd1.labores("Gestionar BD");
    }
    
}
