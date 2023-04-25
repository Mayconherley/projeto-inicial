import java.util.Scanner;

public class Festa {
    public static void main(String[] args) {
//Elabore um algoritmo que leia o nome
//e a idade de uma pessoa, caso ela tiver
//18 anos, o algoritmo libera a entrada dela para uma festa, se ela nao tiver 18 anos, ela não é liberada para a festa
        String nome;
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = scanner.next();
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade >=18){
            System.out.println(nome+" você está liberado pra entrar na festa");
        }else {
            System.out.println(nome+" você não está liberado");
        }
    }
}