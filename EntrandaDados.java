import java.util.Scanner;

public class EntrandaDados {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = lerTeclado.nextLine();
        System.out.println("Digite sua Idade:");
        int idade = lerTeclado.nextInt();
        System.out.println("Nome:" + nome + " - Idade:" + idade);
    }
}
