package TP0.ejemplo_InOut;

public class Alumno  {
    
    private String nombre;
    private int[] notas;
    private float promedio;

    private float calcularMedia(){   
        float media = 0;
        for(int i=0; i < notas.length; i++){
            media += notas[i];
        }
        return media/notas.length;
    }

    public Alumno(String nombre, int[] notas)
    {
        this.nombre = nombre;
        this.notas = notas;
        this.promedio = calcularMedia();
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int[] getNotas()
    {
        return this.notas;
    }

    public float getMedia()
    {
        return this.promedio;
    }

    public float getNotaAsignatura(int numeroAsignatura)
    {
        return notas[numeroAsignatura];
    }

    @Override
    public String toString() {
        String string = nombre + ": [";

        for (int i=0; i < notas.length; i++) {
            string = string+(String.valueOf(notas[i]) + ", ");
        }
        string = string + "]";
        string = string +" Promedio: " + promedio;
        return string;
    }

    
}
