import java.util.Scanner;

public class NumeroUmNumeroDoisDesconhecido {
    public static void main(String[] args) {
        //TODO: Crie um algoritmo que mostre no console se o numero é um, dois ou descohecido
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        numero = scanner.next();

        if (numero.equals("1")){
            System.out.println("O numero é um");
        } else if (numero.equals("2")) {
            System.out.println("O numero é dois");

        }else {
            System.out.println("Desconhecido");
        }
    }
}
