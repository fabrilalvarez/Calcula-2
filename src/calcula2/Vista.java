/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
