
import java.util.Random;

public class QuicksortAlgorithm {
    public static void main(String[] args){

        //Random rand = new Random();
        //int[] List = new int[10];
        int[] List = {2, 5, 8, 1, 3, 7, 10, 6, 9, 4};

        /*for(int i = 0; i < List.length; i++){
            List[i] = rand.nextInt(100);
        }*/
        System.out.println(" ");
        System.out.println("Disorganized Array" );
        for (int i : List) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        System.out.println(" ");


        QuickSort(List,0, List.length - 1 );

        System.out.println("Organized Array" );
        for (int i : List) {
            System.out.print(i + " ");
        }
    }

    public static void QuickSort(int [] List, int low, int high ){
        int pivot = List[(low + high) / 2];
        int LP = low;
        int RP = high;

        while (LP <= RP) {
            while (List[LP] < pivot) {
                LP++;
            }
            while (List[RP] > pivot) {
                RP--;
            }
            if (LP <= RP) {
                int temp = List[LP];
                List[LP] = List[RP];
                List[RP] = temp;

                LP++;
                RP--;
            }
        }

        if (low < RP) {
            QuickSort(List, low, RP);
        }
        if (LP < high) {
            QuickSort(List, LP, high);
        }

    }
}

