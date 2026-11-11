import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double mediaFinal = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Media final = %.2f\n", mediaFinal);

        scanner.close();
    }
}