
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
    //ejercicio1
    public static void main(String[] args) {
        String nombreArchivoEntrada = "src/entrada.txt";
        String nombreArchivoSalida = "src/ejemplo_InOut/out/salida.txt";
        String linea = null;

        try {
            FileReader fileReader = new FileReader(nombreArchivoEntrada);
            FileWriter fileWriter = new FileWriter(nombreArchivoSalida);

            BufferedReader bufferReader = new BufferedReader(fileReader);
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

            while ((linea = bufferReader.readLine()) != null) {
                bufferWriter.write(linea.replaceAll(" ", "") +"\n");
            }

            bufferReader.close();
            bufferWriter.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nSignifica que el archivo del "
                    + "que queriamos leer no existe.");
        }
        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }

        
        

    }
}

