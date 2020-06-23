
package condicionais;

import javax.swing.JOptionPane;


public class Triangulo {
    public static void main(String[] args) {
        
        double a,b,c;
        
        //entrada
        
a= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triangulo"));

b= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triangulo"));

c= Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triangulo"));

        
if (((a<(b+c)) && (a >(Math.abs(b-c)))) && ((b<(a+c)) && (b >(Math.abs(a-c)))) &&((c<(b+a)) && (c>(Math.abs(b-a))))){
      
    if(((a==b) && (b==c) && (a==c))){
      JOptionPane.showMessageDialog(null, "É triângulo Equilatero");
    
    }
    
     if((a!=b)&&(b!=c)&&(a!=c)){
      JOptionPane.showMessageDialog(null, "É triângulo Escaleno");
    
    }
     
     if(((a==b)&&(b!=c))||((b==c)&&(c!=a))||(a==c)&&(c!=b)){
      JOptionPane.showMessageDialog(null, "É triângulo Isóceles");
    
    } 
    
    
    
}else{
            
    JOptionPane.showMessageDialog(null, "Não é um triangulo");
            
    }

   
        
    }
    
}
