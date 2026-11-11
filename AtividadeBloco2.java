import java.util.Scanner;

public class BombaCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor total do abastecimento em reais: ");
        double valorTotal = scanner.nextDouble();

        double precoPorLitro = 6.69;

        double litrosAbastecidos = valorTotal / precoPorLitro;

        System.out.printf("Serao abastecidos %.4f litros.\n", litrosAbastecidos);

        scanner.close();
    }
}