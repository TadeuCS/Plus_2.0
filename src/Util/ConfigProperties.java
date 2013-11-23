/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class ConfigProperties {

    FileOutputStream fos;
    FileInputStream fis;
    //iniciando o diretorio
    Properties prop = new Properties();

    public void altera(String campo, String valor,String file) {
        try {
            //Criamos um objeto FileOutputStream
            fos = new FileOutputStream(file);
            //altera do campo
            prop.setProperty(campo, valor);
            //grava os dados no arquivo
            prop.store(fos, campo);
            fos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String ler(String campo,String file) {
        try {
            //Setamos o arquivo que será lido
            fis = new FileInputStream(file);
            //método load faz a leitura através do objeto fis
            prop.load(fis);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        //Captura o valor da propriedade, através do nome da propriedade(Key)
        return prop.getProperty(campo);
    }
   
}
