package assignment10_2;

public class MockArrayFlattenerService implements ArrayFlattenerService {
    @Override
    public int[] flattenArray(int[][] inputArray) {
        // For testing purposes, return a hardcoded flattened array
        return new int[]{9, 5, 4, 0, 3, 1};
    }
}
