import java.util.Scanner;
public class Main
{
	   //Soma de todos os algarismos
    public static void main(String[] args) {
        System.out.println("Informe um número:");
        
        int num = new Scanner(System.in).nextInt();
        int soma = 0;

        while(num>0) {
        
            soma += (num % 10);
            
            num /= 10;
            
            System.out.println("O valor de soma é: " + soma);
        }
        System.out.println();
        System.out.println("A soma dos algarismos é: " + soma);

    }
}
