package ejemplo_InOut;

import java.util.Random;

public class Ej8 {

    private static float promedioAsignatura(int numeroAsignatura, Alumno[] alumnos){
        float promedio = 0;
        for(int i=0; i<alumnos.length; i++){
            promedio += alumnos[i].getNotaAsignatura(numeroAsignatura);
        }
        return promedio/alumnos.length;
    }


    private static float promedioDeCurso(Alumno[] alumnos){
        float media = 0;
        for(int i=0; i<alumnos.length; i++){
            media += alumnos[i].getMedia();
        }
        return media/alumnos.length;
    }

    private static int[] obtenerNotas(int size){
       
        int[] array = new int[size];
        Random random = new Random();
        for(int i=0; i < size; i++)
            array[i] = random.nextInt(11); // [0, 10]
        return array;
    
    }

    //metodos de ordenamiento
    public static void selectionSort(Alumno[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].getMedia() > arr[minIndex].getMedia()) {
                    minIndex = j;
                }
            }
            Alumno temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void main(String[] args){
        final int CANTIDAD_ALUMNOS = 15;
        final int CANTIDAD_NOTAS = 5;
        Alumno[] alumnos = new Alumno[CANTIDAD_ALUMNOS];

        for(int i=0; i<CANTIDAD_ALUMNOS; i++){
            alumnos[i] = new Alumno("#Alumno"+i, obtenerNotas(CANTIDAD_NOTAS));
        }

        for(int i=0; i<CANTIDAD_ALUMNOS; i++) {
            System.out.println(alumnos[i]);

        }
        selectionSort(alumnos);


        for(int i=0; i<CANTIDAD_NOTAS; i++){
            System.out.printf("Notas promedio de la asignatura %d: %f\n", i, promedioAsignatura(i, alumnos));
        }
        
        
        System.out.println("El promedio del curso es: " + promedioDeCurso(alumnos));
        System.out.println();

        System.out.println("Arreglo Ordenado: ");
        for(int i=0; i<CANTIDAD_ALUMNOS; i++) {
            System.out.println(alumnos[i]);

        }

    }
}
