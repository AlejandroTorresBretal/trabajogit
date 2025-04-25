import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentosMaximos = 10;
        int contadorIntentos = 0;

        System.out.println("🎮 Bienvenido al juego 'Adivina el Número'");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("¡Tenés 10 intentos para adivinarlo!");

        do {
            System.out.print("Intento #" + (contadorIntentos + 1) + ": ");
            intento = scanner.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número es más alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es más bajo.");
            } else {
                System.out.println("🎉 ¡Correcto! Adivinaste el número en " + contadorIntentos + " intento(s).");
                break;
            }

        } while (contadorIntentos < intentosMaximos);

        if (intento != numeroSecreto) {
            System.out.println("😢 Se te acabaron los intentos. El número era: " + numeroSecreto);
        }

        scanner.close();
    }
}
