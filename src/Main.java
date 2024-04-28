
import java.util.Scanner;

public class Main { ;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        double amount;

        String menu = """
                ***************************************************
                        1) Dólar =>> Peso argentino
                        2) Peso argentino =>> Dólar
                        3) Dólar =>> Real brasileño
                        4) Real brasileño =>> Dólar
                        5) Dólar =>> Peso colombiano
                        6) Peso colombiano =>> Dólar
                        7) Salir
                        Elija una opción válida
                ***************************************************
                """;

        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            if (opcion < 1 || opcion > 7) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                continue;
            }

            if (opcion <= 6) {
                System.out.println("Ingrese la cantidad que desea convertir:");
                amount = teclado.nextDouble();

                try {
                    double rate;
                    switch (opcion) {
                        case 1:
                            rate = APIExchangeRate.convertCurrency("USD", "ARS");
                            System.out.println(amount + " USD equivale a " + (rate * amount) + " ARS");
                            break;
                        case 2:
                            rate = APIExchangeRate.convertCurrency("ARS", "USD");
                            System.out.println(amount + " ARS equivale a " + (rate * amount) + " USD");
                            break;
                        case 3:
                            rate = APIExchangeRate.convertCurrency("USD", "BRL");
                            System.out.println(amount + " USD equivale a " + (rate * amount) + " BRL");
                            break;
                        case 4:
                            rate = APIExchangeRate.convertCurrency("BRL", "USD");
                            System.out.println(amount + " BRL equivale a " + (rate * amount) + " USD");
                            break;
                        case 5:
                            rate = APIExchangeRate.convertCurrency("USD", "COP");
                            System.out.println(amount + " USD equivale a " + (rate * amount) + " COP");
                            break;
                        case 6:
                            rate = APIExchangeRate.convertCurrency("COP", "USD");
                            System.out.println(amount + " COP equivale a " + (rate * amount) + " USD");
                            break;
                    }
                } catch (Exception e) {
                    System.err.println("Error en la conversión: " + e.getMessage());
                }
            }
        }
        System.out.println("Saliendo del programa...");
        teclado.close();
    }
}







