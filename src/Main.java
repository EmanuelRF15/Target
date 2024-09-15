
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Verificar se um número pertence à sequência de Fibonacci");
            System.out.println("2 - Verificar a ocorrência da letra 'a' em uma string");
            System.out.println("0 - Sair");
            System.out.print("Sua escolha: ");
            op = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (op) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.print("Digite um número: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    if (Fibonacci.isFibonacci(n)) {
                        System.out.println("O número " + n + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
                    }
                    break;
                case 2:
                    System.out.print("Digite uma string: ");
                    String s = scanner.nextLine();
                    if (StringUtils.containsA(s) > 0) {
                        System.out.println("A string contém a letra 'a' " + StringUtils.containsA(s) + " vez(es).");
                    } else {
                        System.out.println("A string não contém a letra 'a'.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 0);

    }
}
