import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        //Elabore um algoritmo que mostre na tela a soma de dois valores
        int v1, v2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        v1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        v2 = scanner.nextInt();
        System.out.println(v1 + v2);
    }
}