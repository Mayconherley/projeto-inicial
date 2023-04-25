import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int tabuada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a tabuada que vc quer ver:");
        tabuada = scanner.nextInt();

        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador+ " X " + tabuada + " = " +(contador*tabuada));
        }
    }
}
