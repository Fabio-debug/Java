/******************************************************************************

5) Faça um sistema que realize o somatório dos números no intervalo determinado pelo usuário.
Peça para o usuário definir o início e o final da contagem. (2 pontos

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		  Scanner in = new Scanner (System.in);
		//recolhendo informaçoes para contagem
          System.out.println("Informe o primeiro numero da contagem:");
          int n1 = in.nextInt();
		//recolhendo informaçoes para contagem
          System.out.println("Informe o segundo numero: ");
          int n2 = in.nextInt();
                for(int i = n1; i<=n2; i++){
                    int soma = 0;
            soma +=  i;
            System.out.println(soma);
            }
	}
}
