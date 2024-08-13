package ejemplo_InOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class cadenasAleatorias {
    private static final String CARACTERES = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int LONGITUD_CADENA = 10;

    public static void main(String[] args) {
        String nombreArchivoSalida = "src/ejemplo_InOut/cadenasAl.txt";

        try(BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(nombreArchivoSalida))) {

            for (int i = 0; i < 100; i++) {
                String cadenaAleatoria = generarCadenaRandom();
                System.out.println(cadenaAleatoria);
                bufferEscritura.write(cadenaAleatoria +"\n");
            }

            bufferEscritura.close();
        }

        catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
    public static String generarCadenaRandom(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder(LONGITUD_CADENA);
        for (int i = 0; i < LONGITUD_CADENA; i++) {
            //obtiene un indice random sobre las posibilidades de eleccion
            int index = random.nextInt(CARACTERES.length());
            //utiliza el indice para colocar ese caracter
            sb.append(CARACTERES.charAt(index));
        }
        return sb.toString();
    }
}