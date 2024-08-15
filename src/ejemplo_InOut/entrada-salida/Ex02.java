

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
    
    public static void main(String[] args) {
        String nombreArchivoEntrada = "src/entrada.txt";
        String nombreArchivoSalida = "src/ejemplo_InOut/out/salida.txt";
        String linea = null;
        int numeroLinea=1;

        try {
            FileReader lector = new FileReader(nombreArchivoEntrada);
            FileWriter escritor = new FileWriter(nombreArchivoSalida);
            
            BufferedReader bufferLectura = new BufferedReader(lector);
            BufferedWriter bufferEscritura = new BufferedWriter(escritor);

            while ((linea = bufferLectura.readLine()) != null) {
                if (numeroLinea % 2 != 0) { // Si la línea es impar
                    escritor.write(linea+"\n");
                    bufferEscritura.newLine(); // Agrega una nueva línea en el archivo de salida

                }
                numeroLinea++;
            }

            bufferLectura.close();
            bufferEscritura.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }

        
        

    }
}
