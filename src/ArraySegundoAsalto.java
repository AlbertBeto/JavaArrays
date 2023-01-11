import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySegundoAsalto {






    public static void main(String[] args) {

 // Busca el número maximo del array
    /* int[] array = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
       int max= array[0];
       for (int i=0; i<array.length;i++){
           if (array[i]>max){
               max=array[i];
           }
       }
        System.out.println(max);
        */

// Busca el numero inferior del array
        /*int[] array = {-35,-13,-77,-46,-82,-2,-26};
        int min= array[0];
        for (int i=0; i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
        */

//Los dos ejercicios anteriores pero escritos con el FOR-EACH que es un sistema para reducir errores.
        /*
        int[] array = {-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max= array[0];
        for (int i : array){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);

        int[] array2 = {-35,-13,-77,-46,-82,-2,-26};
        int min= array2[0];
        for (int i : array2){
            if (array2[i]<min){
                min=array2[i];
            }
        }
        System.out.println(min);
    */

//Saca la media de los valores contenidos en el array
    /* double[] array = {-47.39,24.96,-1.02,3.45,14.21,32.6,19.42};
       double suma=0.0;
       for(double i : array){
           suma += i;
       }
        System.out.println(suma/ array.length);
    */

// Comparamos los array sin usar Arrays.equals
        /*
        int[] array2 = {1,2,3,4};
        int[] array4 = {1,2,3,4};
        boolean compare=false;
        for (int i:array2){
            if(array2[i-1]==array4[i-1]){
                compare=true;
            }else {
                compare = false;
                break;
            }
        }
        System.out.println(compare);
        */

//ESTO ES UN EJERCICIO PARA COMPARAR DOS ARRAYS.....
               /*             int[] array2 = {1,2,3,4,5,6};
                            int[] array4 = {1,2,3,4,5,5};
                            int comparador;
                            boolean comparaFinal=true;

                            boolean[] arrayCompara = new boolean[array2.length+array4.length];

                    // Este compara el primer array con el segundo array
                            for (int i=0; i<array2.length;i++){
                                comparador=array2[i];
                                for (int j=0;j<array4.length;j++){
                                    if(comparador==array4[j]){
                                        arrayCompara[i]=true;
                                        break;
                                    }
                                }
                            }
                    //Este compara el segundo array con el primero.
                            for (int i=0; i<array4.length;i++){
                                comparador=array4[i];
                                for (int j=0;j<array2.length;j++){
                                    if(comparador==array2[j]){
                                        arrayCompara[i+array2.length]=true;
                                        break;
                                    }
                                }
                            }

                            //Esto ya es la comparativa final del arrayCompara para ver si hay algun campo falso.
                            for (boolean c : arrayCompara) {
                                if (c==false){
                                    comparaFinal=false;
                                    break;
                                }

                            }
                    if (comparaFinal==false) {
                        System.out.println("No son iguales");
                    }else {
                        System.out.println("Son iguales");
                    }
                    */

//ESTO ES PARA EL METODO DE BUSCAR UN ARRAY DENTRO DE OTRO ARRAY LLAMADO isArrayOn.
        int[] arrayBuscar = {1,2,3,5,8};
        int[] arrayDondeBuscar = {5,4,3,2,1,634,};
        //System.out.println(isArrayOn(arrayBuscar,arrayDondeBuscar));
        System.out.println(binariSearch(arrayBuscar,5));




            //main
    }

/*
    public static boolean isArrayOn(int[] src, int [] dst) {
        boolean[] arrayCompara=new boolean[src.length];
        int comparador=0;
        boolean comparaFinal=true;

        for (int i=0; i< src.length;i++){
            comparador=src[i];
            for (int j=0; j< dst.length;j++){
                if (comparador==dst[j]){
                    arrayCompara[i]=true;
                }
            }
        }
        for (boolean c : arrayCompara) {
            if (c==false){
                comparaFinal=false;
                break;
            }
        }

        return comparaFinal;
        //METODO isArrayOn
    }

*/

    public static int binariSearch(int[] array, int key){
        /*int low = array[0];
        int high = array.length-1;

        boolean salida= false;

        while(salida=false){
            int mid = (low+high)/2;
            if(array[mid]==key){
                salida=true;
            }
            if(array[mid]<key){
                high=mid;
            }
            if(array[mid]>key){
                low=mid;
            }
        }

        return mid;
    }*/

        int low=0;
        int high = array.length-1;
        int mid;

        while(low <=high){
            mid = (low + high)/2;
            if (key > array[mid]){
            low=mid+1;
            }else if(key< array[mid]){
                high = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
        }



    //class
}
