import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        // criar objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);


        // solicitar primeira nota
        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        // solicitar segunda nota
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        // solicitar terceira nota
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        // calcular a média aritmética
        media = (nota1 + nota2 + nota3) / 3;

        // imprimir a média
        System.out.println("A média é " + media);

        // verificar se o aluno foi aprovado ou reprovado
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // fechar o objeto Scanner
        scanner.close();
    }
}

