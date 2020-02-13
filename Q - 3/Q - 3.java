//_______________ questão login ______________

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Informe um Login: ");
    String login1 = in.nextLine();
    System.out.println("Informe uma senha: ");
    String senha1 = in.nextLine();
    System.out.println("___________________________________");
    System.out.println("__________Area de Acesso__________");
    System.out.println("Informe o seu login: ");
    String conlogin = in.nextLine();
    System.out.println("Informe a sua senha: ");
    String consenha = in.nextLine();
    if(login1.equals (conlogin) && senha1.equals(consenha)){
            System.out.printf("Login %s logado com sucesso.", login1);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
  }
}//_______________ questão login ______________

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Informe um Login: ");
    String login1 = in.nextLine();
    System.out.println("Informe uma senha: ");
    String senha1 = in.nextLine();
    System.out.println("___________________________________");
    System.out.println("__________Area de Acesso__________");
    System.out.println("Informe o seu login: ");
    String conlogin = in.nextLine();
    System.out.println("Informe a sua senha: ");
    String consenha = in.nextLine();
    if(login1.equals (conlogin) && senha1.equals(consenha)){
            System.out.printf("Login %s logado com sucesso.", login1);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
  }
}