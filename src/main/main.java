/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.Authenticate;

/**
 *
 * @author gaalg
 */
public class main {


    public static void main(String[] args) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                Authenticate mainForm = new Authenticate();
                mainForm.setVisible(true);
            }
                }
                                    );
    }
    
}
