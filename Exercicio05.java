/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author esdras
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double altura;
        Double peso;
        Double alturametro;
        Double imc;
        String scan;
        String resp;
        
        scan = JOptionPane.showInputDialog("Digite o seu peso: ");
        peso = Double.parseDouble(scan);
        
        scan = JOptionPane.showInputDialog("Digite a sua altura em cm: ");
        altura = Double.parseDouble(scan);
        
        
       alturametro = altura/100;
       
       imc = peso /(alturametro*alturametro);
         DecimalFormat df = new DecimalFormat("0.00");
         resp = df.format(imc);
     
       
       
       
         if(imc < 16){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Magreza grave");
        }else if((imc >= 16) && (imc < 17)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Magreza moderada");
        }else if((imc >= 17) && (imc < 18.5)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Magreza leve ");
        }else if((imc >= 18.5) && (imc < 25)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Saudável");
        }else if((imc >= 25) && (imc < 30)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Sobrepeso");
        }else if((imc >= 30) && (imc < 35)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Obesidade Grau I ");
        }else if((imc >= 35) && (imc < 40)){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Obesidade Grau II (severa) ");
        }else if(imc > 40){
            JOptionPane.showMessageDialog(null, "Seu IMC é: " + resp + ". Sua classificação: Obesidade Grau III (mórbida)");
        }
        
    }
    
}
