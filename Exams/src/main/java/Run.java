public class Run {
    public static int[] bubbleSorted(int[] array) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(array));
        return array;
    }
    public static int binarySearch() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int key = 3;
        int low = 0;
        int high = a.length - 1;

        int middle = 0;
        while (low <= high) {
            middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                System.out.println(middle);
                return middle;
            }
        }
        System.out.println("Елемент не найден попробуйте ввести другое значение");
        return -1;
    }


}
