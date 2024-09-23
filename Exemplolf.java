import java.util.Scanner;

public class Exemplolf {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        System.out.println("Digite a nota G1: ");
        double notaG1 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); 
        System.out.println("Digite a nota G2: ");
        double notaG2 = lerTeclado.nextDouble();
        lerTeclado.nextLine(); 
        double media = (notaG1 + notaG2) / 2;
        System.out.printf("Sua média final é: %.2f  \n", media);
        if (media >= 7 ) 
            System.out.println("PARABENS!!! Voce esta aprovado!");
        else if (media >= 3)
                System.out.println("Voce esta em exame");
            else
            System.out.println("Infelizmente não foi dessa vez!");
        }
        
    }

