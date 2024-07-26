import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int primeiroParam = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int segundoParam = scanner.nextInt();

        try {
            contar(primeiroParam, segundoParam);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    private static void contar(int primeiroParam, int segundoParam) throws ParametrosInvalidosException{
        if (primeiroParam >= segundoParam) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = segundoParam - primeiroParam;

        for (var i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}