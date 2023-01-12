import java.util.Scanner;

public class ArrayTester {
private static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    System.out.println("Introduce cuantos números quieres revisar:");
   int[] enteros = leerEnteros(sc.nextInt());
int[] transformado = transformarArray(enteros);
imprimirArray(transformado);
 //main
    }

    //Introduce los valores del teclado en el array inicial.
    public static int[] leerEnteros(int elementos) {
        System.out.println("Inserta " + elementos + " de tipo entero.");
        int[] array = new int[elementos];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    // Mira cada posición del array miras si es par y segun lo introduce en un nuevo array que es devuelto.
    public static int[] transformarArray(int[] aCambiar){
    int[] cambiado = new int[aCambiar.length];
    for (int i=0; i< aCambiar.length;i++){
        if (aCambiar[i]%2==0){
            cambiado[i]=aCambiar[i];
        }else{
            cambiado[i]=-1;        }
    }
    return cambiado;
    }

    // Imprime todas las posiciones de un Array con texto.
    .0
//class
}
