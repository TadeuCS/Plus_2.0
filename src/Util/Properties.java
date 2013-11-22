/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte4
 */
public class Properties {

    static FileOutputStream fos;
    static FileInputStream fis;
    static java.util.Properties properties;

    public Properties() {
        try {
            //iniciando o diretorio
            properties = new java.util.Properties();
            //Criamos um objeto FileOutputStream  
            fos = new FileOutputStream("config.properties");
            //Setamos o arquivo que será lido
            fis = new FileInputStream("config.properties");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void altera(String campo, String valor) {
        try {
            //altera do campo
            properties.setProperty(campo, valor);
            //grava os dados no arquivo
            properties.store(fos, campo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void gravaPropriedades() {
        try {
            //fecha o arquivo
            fos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public String lerPropriedades(String campo) {
        try {
            //método load faz a leitura através do objeto fis
            properties.load(fis);
           
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Captura o valor da propriedade, através do nome da propriedade(Key)
        String p1 = properties.getProperty(campo);
        return p1;
    }
}
