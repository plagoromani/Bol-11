/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol11;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Bol11 {
  
    
    public static void main(String[] args) {
        long ts, te;
        JOptionPane.showMessageDialog(null, "Siguiente frase :");
        ts = System.currentTimeMillis();
        JOptionPane.showInputDialog("\nA documentación conjunto de manuales que explican la aplicación ");
        te = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "pulsa enter para fin");
        JOptionPane.showMessageDialog(null, "tiempo de espera " + (te - ts) / 1000 + " segundos en escribir la frase");
    }
}
