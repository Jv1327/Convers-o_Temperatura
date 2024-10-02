import java.util.Scanner;

public class ConverseTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura em Kelvin: " + kelvin);
        System.out.println("Temperatura em Réaumur: " + reaumur);
        System.out.println("Temperatura em Rankine: " + rankine);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}