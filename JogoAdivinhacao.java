import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativasMaximas = 5; // Número limitado de tentativas
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        // Laço de tentativas
        while (tentativas < tentativasMaximas) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                acertou = true;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }
        }

        // Se o jogador não acertou após todas as tentativas
        if (!acertou) {
            System.out.println("Você esgotou todas as suas tentativas.");
            System.out.println("O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
