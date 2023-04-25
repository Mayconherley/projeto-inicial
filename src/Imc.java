import java.util.Scanner;

public class Imc {
//    IMC abaixo de 18,5: abaixo do peso
//    IMC entre 18,5 e 24,9: peso normal
//    IMC entre 25,0 e 29,9: sobrepeso
//    IMC entre 30,0 e 34,9: obesidade grau 1
//    IMC entre 35,0 e 39,9: obesidade grau 2 (severa)
//    IMC acima de 40: obesidade grau 3 (mórbida)

    public static void main(String[] args) {

        // criar objeto Scanner para ler entrada do usuário
        Scanner input = new Scanner(System.in);

        // solicitar peso em kg
        System.out.print("Digite seu peso em kg: ");
        double peso = input.nextDouble();

        // solicitar altura em metros
        System.out.print("Digite sua altura em metros: ");
        double altura = input.nextDouble();

        // calcular o índice de massa corporal (IMC)
        double imc = peso / (altura * altura);

        // imprimir o valor do IMC
        System.out.printf("Seu IMC é %.2f%n", imc);

        // verificar a categoria do IMC e imprimir mensagem correspondente
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25.0) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 30.0) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 35.0) {
            System.out.println("Você está com obesidade grau 1.");
        } else if (imc < 40.0) {
            System.out.println("Você está com obesidade grau 2 (severa).");
        } else {
            System.out.println("Você está com obesidade grau 3 (mórbida).");
        }

        // fechar o objeto Scanner
        input.close();
    }
}
