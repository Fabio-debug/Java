/*

3) Desenvolva um sistema de login e senha.
Solicitando ao usuário o seu login e armazene a informação em uma variável.
Posteriormente a sua senha e coloque-a em outra variável.
Por fim, verifique se o login e a senha são iguais àquele definido por você. (2 pontos) 


*/


import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    //Reconhendo informação do usuario sobre seu login para amazerna no sistema
    System.out.println("Informe um Login: ");
    String login1 = in.nextLine();
    //Reconhendo informação do usuario sobre sua senha  para amazerna no sistema
    System.out.println("Informe uma senha: ");
    String senha1 = in.nextLine();

    System.out.println("___________________________________");
    System.out.println("__________Area de Acesso__________");
    //Verificação para logar
    System.out.println("Informe o seu login: ");
    String conlogin = in.nextLine();
    System.out.println("Informe a sua senha: ");
    String consenha = in.nextLine();
    //função nativa do java para verifica ser tem os mesmos valores amazernado
    if(login1.equals (conlogin) && senha1.equals(consenha)){
            System.out.printf("Login %s logado com sucesso.", login1);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
  }