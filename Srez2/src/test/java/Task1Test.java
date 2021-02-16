import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Task1Test {


    @Test
    public void quickSortTest() {
        int [] array = {4, 12, 23, 11, 2, 5};
        int [] actual = Task1.quickSort(array, 0, array.length - 1);
        int [] expected = {2, 4, 5, 11, 12, 23};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void quickSortTestWithMinus() {
        int [] array = {4, 12, 23, -11, 2, 5};
        int [] actual = Task1.quickSort(array, 0, array.length - 1);
        int [] expected = {-11, 2, 4, 5, 12, 23};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void quickSortTestWithNull() {
        int [] array = {4, 12, 23, 11, 0, 2, 5};
        int [] actual = Task1.quickSort(array, 0, array.length - 1);
        int [] expected = {0, 2, 4, 5, 11, 12, 23};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    public void quickSortTestAllNull() {
        int [] array = {0, 0, 0, 0, 0};
        int [] actual = Task1.quickSort(array, 0, array.length - 1);
        int [] expected = {0, 0, 0, 0, 0};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
