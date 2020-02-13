/*2) Desenvolva um sistema que peça a idade do seu primo e a idade da sua tia.
Em seguida, imprima as informações a seguir: (2 pontos) */

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //solicitando idade do primo
    System.out.println("Digite a idade do primo: ");
    int idadepri = in.nextInt();
    // solicitando idade da tia
     System.out.println("Digite a tia : ");
    int idadetia = in.nextInt();
    int a = idadetia-idadepri;
    //Printando Todas as informações obtida pelo sistemas
    System.out.println("A idade do seu primo: "+idadepri);
    System.out.println("A idade da sua tia: "+idadetia);
    System.out.println("A Sua tia tem "+a+" de diferenca do seu primo.");
  }
}
