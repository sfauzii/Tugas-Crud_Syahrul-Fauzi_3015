/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.crudmahasiswasederhana;

import com.sfauzi.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author S FAUZI
 * SYAHRUL FAUZI - 21103015
 */
public class CRUDMahasiswaSederhana {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}
