package assignment10_1;

public class ArrayFlattener {
    public int[] flattenArray(int[][] inputArray) {
        if (inputArray == null) {
            return new int[0]; 
        }

        int totalElements = 0;
        for (int[] subArray : inputArray) {
            totalElements += subArray.length;
        }

        int[] flattenedArray = new int[totalElements];
        int currentIndex = 0;

        for (int[] subArray : inputArray) {
            for (int element : subArray) {
                flattenedArray[currentIndex++] = element;
            }
        }

        return flattenedArray;
    }

	
}

