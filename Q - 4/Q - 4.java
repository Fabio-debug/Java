//4) Desenvolva um sistema que realize o somatório dos números de 1 até 100. (2 pontos) 

public class Main
{ public static void main(String[] args) {
int soma = 0;

        System.out.print("A soma de 1 ate 100 é: ");
        for(int i = 1; i<=100; i++)
            soma += i;
        System.out.println(soma);
}
}