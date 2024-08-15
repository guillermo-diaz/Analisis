package ejemplo_InOut;
//TRAZA DEL ALGORITMO AÑADIR AL INFORME

public class Ej1{
    public static void main(String []args){
        int suma,i,j;
        for(i=1; i<= 4; i++){
             for(j=3; j>=0 ;j--){
                 suma=i*10+j;
                 System.out.println(suma);
             }
        }
    }
}