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
                if(verificarPrimos(i)){//si es primo aumenta el contador de numeros primos entre 1 y n
                    cant=cant+1;
                }
            }
            System.out.println("entre 1 y "+n+" hay "+cant+" numeros primos");
         }else{
            System.out.println("el numero no es mayor a 1");
         }
      }
      public static boolean verificarPrimos( int num){
          boolean val=true;
          if (num == 2){ return true;}// 2 es el único número par que es primo
          if (num % 2 == 0) {return false;} // Eliminar números pares mayores a 2
          // Verificar divisibilidad desde 3 hasta la raíz cuadrada de num
          int i=2;
          while(i < num  && val) {//mientras sea menor a num y no exista otro divisor repetir
               if(num % i ==0){//no es primo 
                  val=false;
               }
               i++;
          }
         return val; // El número es primo si no es divisible por ninguno de los anteriores
     } 
}