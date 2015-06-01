package calcula2;

/**
 *
 * @author @FranJAbrilA <ffrannabril@gmail.com>
 */
public class Calcula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo obj = new Modelo();
        Vista.ejecutar(obj);
        obj.setResultado(Calcula2.realizaOP(obj));
        Vista.imprimir(obj);
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
}
