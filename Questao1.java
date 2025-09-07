import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
      int a, b, troca;
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o valor de a: ");
      a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
      b = sc.nextInt();
      
      troca = a;
      a = b;
      b = troca;
      
      System.out.println("O valor de a agora é: " + a);
      System.out.println("O valor de b agora é: " + b);
      
  }
}
