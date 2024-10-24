package TP0.ejemplo_InOut;

public class Ej9 {
    public static void main(String[] args) {
        int[] A = new int[100];
        int[] B = new int[60];
        
        // Llenar las listas A y B con valores aleatorios
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
        
        // Ordenar las listas A y B
        selectionSort(B);
        quickSort(A, 0, A.length-1);
        
        // Mezclar las listas ordenadas A y B en C
        int[] C = mergeArrays(A, B);
        
        // Mostrar la lista C
        System.out.println("Lista C (mezcla de A y B ordenadas): "+mostrarArray(C));
    }

    // Método de ordenación por selección (Selection Sort)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Intercambiar el elemento mínimo con el primer elemento
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; //el ultimo
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { //mueve los mayores al lado izq del pivote
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        //deja el pivote en su lugar
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    // Método para mezclar dos arreglos ordenados en uno solo
    public static int[] mergeArrays(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        
        // Recorrer ambas listas y copiar el elemento más pequeño
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        // Copiar los elementos restantes de A si hay alguno
        while (i < A.length) {
            C[k++] = A[i++];
        }
        
        // Copiar los elementos restantes de B si hay alguno
        while (j < B.length) {
            C[k++] = B[j++];
        }
        
        return C;
    }

    public static String mostrarArray(int[] a){
        String r = "[";
        for (int i = 0; i < a.length; i++) {
            r = r + a[i] +",";
        }
        return r + "]";
    }
}
