/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garits;

import javax.swing.JFrame;

/**
 *
 * @author Rahul
 */
public class GARITS {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        JFrame frame = new SignInForm();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}