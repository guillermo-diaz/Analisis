package ejemplo_InOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class numerosAleatorios {
    private static final int MIN = 1;
    private static final int MAX = 1000;

    public static void main(String[] args) {
        String archivoSalida = "src/ejemplo_InOut/out/numerosAl.txt";
        List<Integer> numerosUnicos = generarNumerosRandom();  //generamos los números aleatorios

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoSalida))) {
            //escribimos cada numero en el archivo, uno por linea
            for (int nro : numerosUnicos) {
                //se castea el numero a string
                String numero = Integer.toString(nro);
                System.out.println(numero);
                bufferedWriter.write(numero + "\n");
            }
            System.out.println("Archivo generado exitosamente: " + archivoSalida);

        } catch (IOException e) {
            System.err.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        }
    }

    //generar numeros aleatorios únicos
    private static List<Integer> generarNumerosRandom() {
        Random random = new Random(); 
        List<Integer> numerosUnicos = new LinkedList<>();  // se utiliza una LinkedList para almacenar los numeros
        int rango = MAX - MIN + 1;  //calculamos el rango total de números

        //generamos numeros aleatorios hasta llenar la lista
        while (numerosUnicos.size() < rango) {
            int nroUnico = random.nextInt(rango) + MIN;  //generamos un número aleatorio dentro del rango
            if (!numerosUnicos.contains(nroUnico)) {
                numerosUnicos.add(nroUnico);  //agregamos el número a la lista (si ya existe NO lo agrega)
            }
        }

        return numerosUnicos;
    }
    
}
