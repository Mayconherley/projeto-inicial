import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if(idade>=18){
            System.out.println("Olá "+nome+" você esta autorizado para votar");
        }else {
            System.out.println("Olá "+nome+" você não está autorizado para votar, ainda lhe falta(m) "+(18-idade)+" ano(s).");
        }
    }
}
