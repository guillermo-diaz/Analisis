package ejemplo_InOut;
/*Al ordenar una lista de numeros enteros aplicando el algoritmo quicksort, como pivote se
elige el primer elemento de la lista. ¿que pasarıa si se selecciona otro pivote? */
public class Ej7 {
        public static void main(String[] args) {
                int lista[]={20,12,28,24,8,4,16};
        
                System.out.println("Vector original");
                imprimirLista(lista);
                quickSort(lista, 2, lista.length-1);
                System.out.println("\nVector ordenado");
                imprimirLista(lista);
        }
        
        public static void quickSort(int lista[], int inicio, int fin){
                if(inicio>=fin) return;
                int pivote=lista[inicio];
                int elemIzq=inicio+1;
                int elemDer=fin;
                while(elemIzq<=elemDer){
                        while(elemIzq<=fin && lista[elemIzq]<pivote){
                                elemIzq++;
                        }
                        while(elemDer>inicio && lista[elemDer]>=pivote){
                                elemDer--;
                        }
                        if(elemIzq<elemDer){
                                int temp=lista[elemIzq];
                                lista[elemIzq]=lista[elemDer];
                                lista[elemDer]=temp;
                        }
                }
                
                if(elemDer>inicio){
                        int temp=lista[inicio];
                        lista[inicio]=lista[elemDer];
                        lista[elemDer]=temp;
                }
                quickSort(lista, inicio, elemDer-1);
                quickSort(lista, elemDer+1, fin);
        }
        
        public static void imprimirLista(int lista[]){
                for(int i=0;i<lista.length;i++){
                        System.out.print(lista[i]+" ");
                }
        }
        
} 

