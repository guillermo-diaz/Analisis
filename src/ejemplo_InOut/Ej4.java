package ejemplo_InOut;
import java.util.Random;
import java.util.Scanner;

public class Ej4 {
    
    static int inicio = 0;
    static int fin = 100;
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int r = random.nextInt(fin-inicio)+inicio; //nro ranodm entre [inicio, fin]
        int n = -1;
        
        while(n != r) {
            System.out.printf("Adivine el numero entre %d y %d: \n",inicio, fin);
            n = scanner.nextInt();
            if(n < r){
                System.out.printf("El numero es mayor que %d.\n", n);
                // inicio = n;    si quiere ir cambiando el rango
            } else if (n > r){ 
                System.out.printf("El numero es menor que %d.\n", n);
                // fin = n;         
            }
        }
        
        System.out.printf("¡Acertaste! El nro es %d! \n", n);
        scanner.close();
    }
}
