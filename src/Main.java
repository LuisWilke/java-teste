import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int senha_correta = 12345;

       System.out.print("Digite seu nome de acesso: ");

       String nome = sc.nextLine();

       System.out.print("Digite sua idade: ");

       int idade = sc.nextInt();

       System.out.print("Digite sua senha de acesso: ");
       int senha = sc.nextInt();

       if ( senha == senha_correta) {
           System.out.println("Acesso liberado");
       }
       else System.out.println("Acesso negado");


       System.out.println("Nome digitado: " + nome);
       System.out.println("Idade: " + idade);

       sc.close();
    }
}