/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listafluxogramas;

import java.util.Scanner;

/**
 *
 * @author cintia
 */
public class horaextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criando variaveis
        double minuto, hora, conversao,valor, resultado;
        
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite quantas horas extras você fez, sem os minutos: ");
        hora =entrada.nextDouble();
        
        System.out.println("Digite os minutos: ");
        minuto =entrada.nextDouble();
        
        System.out.println("Informe quanto você ganha por hora trabalhada ");
        valor =entrada.nextDouble();
        
        //processamento
        
        conversao =(minuto/60) + hora;
        resultado = (conversao*valor)*1.70;
        //System.out.println(conversao);
       //saida
       System.out.println(" Pelas suas horas trabalhadas você ira ganhar R$: "+resultado+" de hora extra");
    }
    
}
