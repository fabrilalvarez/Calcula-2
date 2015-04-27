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

    public static float realizaOP(Modelo cont) {
        float resultado;
        switch (cont.getOperacion()) {
            case "+":
                resultado = cont.getNum1() + cont.getNum2();
                break;
            case "-":
                resultado = cont.getNum1() - cont.getNum2();
                break;
            case "*":
                resultado = cont.getNum1() * cont.getNum2();
                break;
            case "/":
                resultado = cont.getNum1() / cont.getNum2();
                break;
            default:
                resultado = 0;
        }
        return resultado;
    }

    public static void ejecutar() {
        Modelo contenedor = new Modelo();
        contenedor.num1 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
        contenedor.operacion = JOptionPane.showInputDialog("Operacion \nSUMA + \nRESTA - \nMULTIPLICAR * \nDIVIDIR /");
        contenedor.num2 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
        contenedor.setResultado(realizaOP(contenedor));
        Vista.imprimir(contenedor);
    }
}
