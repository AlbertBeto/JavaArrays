public class ArrayBasico {


    public static void main(String[] args) {
//crear arrays
        /*
        int[] miArray = {2,31,5,7,12,89,6,11,0,4};
        int[] nuevaArray = new int[4];
        */
         /* Dar valores a los campos del array
miArray[4]++;
miArrat[2]=22;
miArray[9]=6*6;
*/


        //imprimir un campo del array
       // System.out.println(miArray[4]);
       // System.out.println(nuevaArray[1]);

        /* Imprimir todos los campos del Array
        for (int i=0; i< miArray.length; i++){
        System.out.println(miArray[i]);
        }
*/

//char[] profesora = new char[7]; Y luego dar valor a cada uno de los campos o hacer el siguiente:

  //char[] profesora = {'p','a','t','r','i','c','i','a'};

  /* Imprimir profesora seguido y al reves
  for (int i=profesora.length-1; i>0; i--){
            System.out.print(profesora[i]);}
*/


int[] array1 = {1,2,3,4,5};
int [] array2 = new int[5];

for (int i= array1.length;i>0;i--){
    array2[i-1]=array1[array1.length-i];
    System.out.print(array1[i-1]+"-");
    System.out.println(array2[i-1]);
}


//main
    }
//class
}
