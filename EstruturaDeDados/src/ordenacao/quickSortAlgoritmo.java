package ordenacao;

public class quickSortAlgoritmo {
    public static void main(String[] args) {
        int array [] = new int[10];

        for (int i = 0; i<array.length; i++){
            array[i] =(int) (Math.random()* array.length);
        }
        System.out.println("Desordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        quickSort(array, 0, array.length-1);

        System.out.println();
        System.out.println("Ordenado: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void quickSort(int [] array, int inicio, int  fim) {
        if (inicio <= fim){
            int pivot = particao(array, inicio, fim);
            quickSort(array, inicio, pivot-1);
            quickSort(array, pivot+1, fim);
        }
    }

    static int particao(int [] array, int inicio, int fim) {
        int pivot = inicio;
        int i = inicio+1, f = fim;
        while (i<=f){
            if(array[i]<=pivot){
                i++;
            } else if(array[f]>pivot){
                f--;
            } else {
                int k = array[i];
                array[i] = array[f];
                array[f] = k;
            }
        }
        array[inicio] = array[f];
        array[f] = pivot;
        return f;
    }
}
