import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        //TODO:Elabore um algoritmo que leia de um usuario o nome, idade, cpf e mostre os dados na tela
        String nome, cpf;
        int idade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        System.out.println("Digite seu cpf");
        cpf = scanner.next();
        System.out.println("seu nome é "+nome+", Sua idade é "+idade+", e seu cpf é "+cpf);
    }
}
