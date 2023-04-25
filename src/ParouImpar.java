import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
//        Tarefa de final de semana:
//
//        Escreva um programa Java que solicite ao usuário que insira um número inteiro e verifique se esse número é par ou ímpar. Em seguida, imprima uma mensagem informando se o número é par ou ímpar.
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é par ou impar:");
        numero = scanner.nextInt();

        if (numero % 2== 0){
            System.out.println("O número "+numero+" é Par!");
        }else{
            System.out.println("O número "+numero+" é Ímpar!");
        }
    }
}
