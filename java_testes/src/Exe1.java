import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);

        System.out.println("Informe a temperatura ªc:");
        Double Celsius = temp.nextDouble();

        double Kelvin = Celsius + 273.15;
        double Fahrenheit = Celsius * 1.8 + 32;

        System.out.printf("Temperatura Informada Celsius: %.2f %n", Celsius);
        System.out.printf("Temperatura Convertida para Kelvin: %.2f %n", Kelvin);
        System.out.printf("Temperatura Convertida para Fahrenheit: %.2f %n", Fahrenheit);

    }
}
