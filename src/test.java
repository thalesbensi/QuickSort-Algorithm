import java.util.Random;

public class test {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] List = new int[10];

        // Filling the array with random integers
        for (int i = 0; i < List.length; i++) {
            List[i] = rand.nextInt(100);
        }

        // Displaying the disorganized array
        System.out.println("Disorganized Array:");
        for (int i = 0; i < List.length; i++) {
            System.out.print(List[i] + " ");
        }
        System.out.println();

        // Sorting the array
        QuickSort(List, 0, List.length - 1);

        // Displaying the organized array
        System.out.println("Organized Array:");
        for (int i = 0; i < List.length; i++) {
            System.out.print(List[i] + " ");
        }
    }

    public static void QuickSort(int[] List, int low, int high) {
        int pivot = List[(low + high) / 2];
        int L = low;
        int R = high;

        while (L <= R) {
            while (List[L] < pivot) {
                L++;
            }
            while (List[R] > pivot) {
                R--;
            }
            if (L <= R) {
                // Swap elements at L and R
                int temp = List[L];
                List[L] = List[R];
                List[R] = temp;

                L++;
                R--;
            }
        }

        // Recursively sort the left and right parts
        if (low < R) {
            QuickSort(List, low, R);
        }
        if (L < high) {
            QuickSort(List, L, high);
        }
    }
}

