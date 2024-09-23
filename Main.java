import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = lerTeclado.nextLine();

        System.out.println("Digite o seu gênero (M para Masculino, F para Feminino, N para Não informar):");
        char genero = lerTeclado.next().charAt(0);

        System.out.println("Digite a sua altura (em metros, ex: 1.75):");
        double altura = lerTeclado.nextDouble();

        System.out.println("Digite o seu peso (em kg):");
        double peso = lerTeclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Nome: %s\nGênero: %c\nAltura: %.2f\nPeso: %.2f\n", nome, genero, altura, peso);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (genero == 'M') {
            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso.");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("Classificação: Peso normal.");
            } else if (imc >= 25 && imc < 29.9) {
                System.out.println("Classificação: Sobrepeso.");
            } else {
                System.out.println("Classificação: Obesidade.");
            }
        }

        lerTeclado.close();
    }
}
