/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		  Scanner in = new Scanner (System.in);
          System.out.println("Informe o primeiro numero da contagem:");
          int n1 = in.nextInt();
          System.out.println("Informe o segundo numero: ");
          int n2 = in.nextInt();
                for(int i = n1; i<=n2; i++){
                    int soma = 0;
            soma +=  i;
            System.out.println(soma);
            }
	}
}
