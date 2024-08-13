package ejemplo_InOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class randomsDeMenos100a100 {
    public static void main(String[] args) {
        String nombreArchivoSalida = "src/ejemplo_InOut/out/numeroRandomsMenos100a100.txt";

        try (FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida)) {

            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            for (int i = 0; i < 100; i++) { // Generar 100 números aleatorios
                double numeroAleatorio = -100 + (200 * Math.random()); // Genera un número entre -100 y 100
                bufferEscritura.write(String.valueOf(numeroAleatorio)); // Convierte el double a String
                bufferEscritura.newLine();
            }

            bufferEscritura.close();
            System.out.println("Archivo generado con éxito.");

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queríamos leer no existe.");
        } catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algún archivo.");
        }
    }
}