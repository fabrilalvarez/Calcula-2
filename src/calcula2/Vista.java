package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Vista {

    public Vista() {
    }

    public static void imprimir(Modelo dato) {
        JOptionPane.showMessageDialog(null, dato.getResultado());
    }

    public static void ejecutar(Modelo dato) {
        dato.num1 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
        dato.operacion = JOptionPane.showInputDialog("Operacion \nSUMA + \nRESTA - \nMULTIPLICAR * \nDIVIDIR /");
        dato.num2 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
    }
}
