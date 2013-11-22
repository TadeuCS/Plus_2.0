/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte4
 */
public class Properties {
    
    public void gravaPropriedades(String campo, String valor) {
        java.util.Properties properties = new java.util.Properties();
        properties.setProperty(campo, valor);
        try {
            //Criamos um objeto FileOutputStream            
            FileOutputStream fos = new FileOutputStream("config.properties");
            //grava os dados no arquivo
            properties.store(fos, "ip");
            //fecha o arquivo
            fos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void lerPropriedades(String campo) {
        java.util.Properties properties = new java.util.Properties();

        try {
            //Setamos o arquivo que será lido
            FileInputStream fis = new FileInputStream("config.properties");
            //método load faz a leitura através do objeto fis
            properties.load(fis);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Captura o valor da propriedade, através do nome da propriedade(Key)
        String p1 = properties.getProperty(campo);
        System.out.println(p1);
    }
}
