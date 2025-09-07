import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
      int a, b, resultado;
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor de a: ");
      a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
      b = sc.nextInt();
      
      resultado = a*b;
      
      System.out.println("O resultado da multiplicação é: " + resultado);
  }
}