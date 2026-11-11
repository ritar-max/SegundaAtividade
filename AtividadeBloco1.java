import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a capacidade do tanque em litros: ");
        double capacidadeTanque = scanner.nextDouble();

        double tempoHorasDecimal = capacidadeTanque / 1000.0;

        int horas = (int) tempoHorasDecimal;
        int minutos = (int) Math.round((tempoHorasDecimal - horas) * 60);

        System.out.printf("Serao necessarias %d:%02d horas.\n", horas, minutos);

        scanner.close();
    }
}