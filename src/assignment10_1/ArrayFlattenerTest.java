package assignment10_1;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArrayWithValidInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] inputArray = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        int[] result = flattener.flattenArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }

    @Test
    public void testFlattenArrayWithNullInput() {
        ArrayFlattener flattener = new ArrayFlattener();
        int[][] inputArray = null;
        int[] expectedOutput = {};
        int[] result = flattener.flattenArray(inputArray);
        assertArrayEquals(expectedOutput, result);
    }
}
