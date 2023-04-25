import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
//        TODO: Criar uma calculadora utilizando o Java.
//         Pedir para o usuário dois valores e usar eles para fazer uma calculadora com 4 operadores matemáticos.
        int usu1, usu2, resul;
        String opc;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro valor:");
        usu1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        usu2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a operação matematica (+, -, * ou /)");
        opc = scanner.nextLine();


        if (opc.equals("+")) {
            resul = usu1 + usu2;
        } else if (opc.equals("-")) {
            resul = usu1 - usu2;
        } else if (opc.equals("*")) {
            resul = usu1 * usu2;
        } else if (opc.equals("/")) {
            resul = usu1 / usu2;
        } else {
            System.out.println("Operação inválida");
            return;
        }
        System.out.println(usu1 + " " + opc + " " + usu2 + " = " + resul);
    }
}
