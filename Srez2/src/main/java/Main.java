import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{23, 13, 32, 34, 54, 1, 3, 35};

        System.out.println(Arrays.toString(array));

        Task1 task1 = new Task1();
        task1.quickSort(array, 0, array.length - 1);
        for (int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
