import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertadoOrdenadoImpreso {
    //Como bien dice el nombre hay q introducir un array por teclado. ordene en ascendente eimprima en pantalla.
    //Voy a crear varios metodos y llamarlos desde main.

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Cuan largo quieres que sea el array?");
        int[] enteros = leerEnteros(sc.nextInt());
       ordenarArray(enteros);
       imprimirArray(enteros);
        //MAIN
    }

    public static int[] ordenarArray(int[] enteros){
        Arrays.sort(enteros);
        return enteros;
    }
    public static int[] leerEnteros(int elementos) {
        System.out.println("Inserta " + elementos + " números de tipo entero.");
        int[] array = new int[elementos];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void imprimirArray(int[]enteros) {
        for (int i = 0; i < enteros.length; i++) {
            System.out.print(enteros[i] + " ");

        }
    }


    //CLASS
}
