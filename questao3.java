import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    
    int velocidade_media;
    float distancia, tempo_gasto, qtde_litros;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Informe o tempo gasto da viagem: ");
    tempo_gasto = input.nextFloat();
    System.out.println("Informe a velocidade media: ");
    velocidade_media = input.nextInt();  
    
    distancia = tempo_gasto * velocidade_media;
    qtde_litros = distancia / 12;
    
    System.out.println("A velocidade media da viagem foi de: " + velocidade_media);
    System.out.println("O tempo gasto da viagem foi de: " + tempo_gasto);
    System.out.println("A distancia percorrida na viagem foi de: " + distancia);
    System.out.println("A quantidade de litros gasta na viagem foi de: " + qtde_litros);
    
    }
}