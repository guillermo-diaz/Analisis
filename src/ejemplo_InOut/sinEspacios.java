package ejemplo_InOut;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class sinEspacios {
    //ejercicio1
    public static void main(String[] args) {
        String nombreArchivoEntrada = "src/entrada.txt";
        String nombreArchivoSalida = "src/ejemplo_InOut/out/salida.txt";
        String linea = null;

        try (FileReader lectorArchivo = new FileReader(nombreArchivoEntrada)) {
            FileWriter escritorArchivo = new FileWriter(nombreArchivoSalida);
            
            BufferedReader bufferLectura = new BufferedReader(lectorArchivo);
            BufferedWriter bufferEscritura = new BufferedWriter(escritorArchivo);

            while ((linea = bufferLectura.readLine()) != null) {
                bufferEscritura.write(linea.replaceAll(" ", "") +"\n");
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
