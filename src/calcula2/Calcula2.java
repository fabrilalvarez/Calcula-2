package calcula2;

import javax.swing.JOptionPane;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Calcula2 {

    // static final int SUMA = 0, RESTA = 1, MULTIPLICAR = 2, DIVIDIR = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Modelo contenedor = new Modelo();
        contenedor.num1 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
        contenedor.operacion = JOptionPane.showInputDialog("Operacion \nSUMA + \nRESTA - \nMULTIPLICAR * \nDIVIDIR /");
        contenedor.num2 = Float.parseFloat(JOptionPane.showInputDialog("Primer Numero"));
        contenedor.setResultado(realizaOP(contenedor));
        Vista.imprimir(contenedor);
    }

    public static float realizaOP(Modelo cont) {
        float resultado;

        switch (cont.getOperacion()) {
            case "x":
                resultado = cont.num1 + cont.num2;
                break;
            case "-":
                resultado = cont.num1 - cont.num2;
                break;
            case "*":
                resultado = cont.num1 * cont.num2;
                break;
            case "/":
                resultado = cont.num1 / cont.num2;
                break;
            default:
                resultado = 0;
        }

        return resultado;
    }

}
