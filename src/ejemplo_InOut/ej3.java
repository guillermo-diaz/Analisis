package ejemplo_InOut;
import java.util.Scanner;
public class ej3{
      public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n,cant,i;
         cant=0;// no tomo encuenta a 1 y n
         System.out.println("ingrese un numero n(entero):");
         n=sc.nextInt();
         if(n>=2){

            for(i=2; i < n ; i++){//recorre el rango
                //a cada numero del rango verifico si es primo
                if(virificarPrimos(i)){//si es primo aumenta el contador de numeros primos entre 1 y n
                    System.out.println(i);
                    cant=cant+1;
                }
            }
            System.out.println("entre 1 y "+n+" hay "+cant+" numeros primos");
         }else{
            System.out.println("el numero no es mayor a 1");
         }
      }
      public static Boolean virificarPrimos( int num){
          if (num <= 1){ return false;} // Números menores o iguales a 1 no son primos
          if (num == 2){ return true;}// 2 es el único número par que es primo
          if (num % 2 == 0) {return false;} // Eliminar números pares mayores a 2
    
          // Verificar divisibilidad desde 3 hasta la raíz cuadrada de num
          for (int i = 3; i * i <= num; i += 2) {
             if (num % i == 0) {
                 return false; // No es primo si es divisible por i
             }
          }
         return true; // El número es primo si no es divisible por ninguno de los anteriores
     }     
}