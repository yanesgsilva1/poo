import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        double dinheiro_gasto, num_anos, preco_carteira, dias, valor_unit;
        int num_cigarros, carteira = 20;
        Scanner input = new Scanner(System.in);   
        
        System.out.println("Informe o numero de anos que fuma: ");
        num_anos = input.nextDouble();
        System.out.println("Informe o numero de cigarros fumados por dia: ");
        num_cigarros = input.nextInt();
        System.out.println("Informe o preco da carteira de cigarros: ");
        preco_carteira = input.nextDouble();
       
        dias = num_anos * 365;
        valor_unit = preco_carteira/carteira;
        dinheiro_gasto = dias * num_cigarros * valor_unit;
        
        System.out.println("Em " + num_anos + " anos" + " o dinheiro gasto foi: " + "R$ " + dinheiro_gasto);
    
    }
}