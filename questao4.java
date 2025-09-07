import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        float bytes, kbytes;
        Scanner input = new Scanner(System.in);   
        
        System.out.println("Informe quantos bytes deseja comprar: ");
        bytes = input.nextFloat();
        
        kbytes = bytes / 1024;
        
        System.out.println("Você comprou: " + kbytes + " quilobytes");
        
    
    }
}