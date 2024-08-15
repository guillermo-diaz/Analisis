package ejemplo_InOut;
public class Ej2 {
    public static void main (String [] args){
         char [] matriz={'e','u','o','i','a'};
         metodo(matriz);
         for (int i=0; i<matriz.length; i++){
              System.out.print(matriz[i]);//muestra el nuevo array 
         }
    }
    public static void metodo (char [] vocales){
        char aux;
        for (int i=1;i<vocales.length;i++){//recorrer todo el array
            //si el valor del caracter anterior es mayor que el siguiente LOS INTERCAMBIA
            if (vocales[i-1]>vocales[i]){
                  aux=vocales[i-1];
                  vocales[i-1]=vocales[i];
                  vocales[i]=aux;
            }
        }
    }
    

}


