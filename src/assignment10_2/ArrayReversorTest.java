package assignment10_2;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
public class ArrayReversorTest {

    @Test
    public void testReverseArrayWithValidInput() {
        ArrayFlattenerService mockArrayFlattenerService = new MockArrayFlattenerService();
        ArrayReversor reversor = new ArrayReversor(mockArrayFlattenerService);
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        int[] result = reversor.reverseArray(inputArray);
        assertArrayEquals(expectedOutput, result);
        verify(mockArrayFlattenerService, times(1)).flattenArray(inputArray);
    }

    @Test
    public void testReverseArrayWithNullInput() {
        ArrayFlattenerService mockArrayFlattenerService = new MockArrayFlattenerService();
        ArrayReversor reversor = new ArrayReversor(mockArrayFlattenerService);
        int[][] inputArray = null;
        int[] expectedOutput = {};
        int[] result = reversor.reverseArray(inputArray);
        assertArrayEquals(expectedOutput, result);
        verify(mockArrayFlattenerService, never()).flattenArray(inputArray);
    }
}
