import java.util.Scanner;

public class SistemaValidacaoProcessoSeletivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Validação de Processo Seletivo");
        System.out.println("Por favor, insira suas informações pessoais:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        // Validando a idade
        if (idade >= 18) {
            System.out.println("Parabéns, " + nome + "! Você atende aos critérios de seleção.");
        } else {
            System.out.println("Desculpe, " + nome + ". Você não atende aos critérios de seleção.");
        }

        // Fechando o scanner
        scanner.close();
    }
}