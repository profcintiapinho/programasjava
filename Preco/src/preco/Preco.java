package preco;
import java.util.Scanner;
public class Preco {
    public static void main(String[] args) {
         //definição de variaveis
        double preco, resul;
        String nome;
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        nome =entrada.next();
        
        System.out.println("Digite o preço do Produto:");
        preco = entrada.nextDouble();
        //pocessamento
        resul= (preco*1.65);   
        //saída
        System.out.println("Você vai vender o produto: "+nome+" por R$"+resul);
    }    
}
