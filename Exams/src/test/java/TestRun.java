import org.junit.Assert;
import org.junit.Test;

public class TestRun {
    @Test
    public void testBubbleSorted(){

        int[] array = {1, 3, 5, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = Run.bubbleSorted(array);
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testBubbleSorted_EPTY_ARRAY(){
        int[] array = {};
        int[] expected = {};
        int[] actual = Run.bubbleSorted(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testBinarySearch(){

        int expected = 2;
        int actual = Run.binarySearch();
        Assert.assertEquals(expected, actual);
    }


}
