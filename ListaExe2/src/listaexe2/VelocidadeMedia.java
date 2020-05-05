/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexe2;

import java.util.Scanner;

/**
 *
 * @author cintia
 */
public class VelocidadeMedia {

   
    public static void main(String[] args) {
       double per, hora, min,tempo, velmedia;
       
       //entrada
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite o percurso:");
        per =entrada.nextDouble();
        System.out.println("Digite a hora sem os minutos:");
        hora =entrada.nextDouble();
        System.out.println("Digite o minuto:");
        min =entrada.nextDouble();
        
        //processamnto
        tempo = (min/60)+hora;
        
        velmedia = per/tempo;
        
        
        // saida
        System.out.println(" A velocidade desse carro era de "+ velmedia+ "Km/h");
        
        
        
        
    }
    
}
