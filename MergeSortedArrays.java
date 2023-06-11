public class MergeSortedArrays {
    
    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param arr1 The first sorted array (largest to smallest).
     * @param arr2 The second sorted array (largest to smallest).
     * @return The merged sorted array.
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];
        
        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for mergedArray
        
        // Merge elements from arr1 and arr2 into mergedArray until one of the arrays is fully processed
        while (i < len1 && j < len2) {
            if (arr1[i] >= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        // Copy remaining elements from arr1, if any
        while (i < len1) {
            mergedArray[k++] = arr1[i++];
        }
        
        // Copy remaining elements from arr2, if any
        while (j < len2) {
            mergedArray[k++] = arr2[j++];
        }
        
        return mergedArray;
    }
    
    public static void main(String[] args) {
        // Example usage
        int[] arr1 = {10, 8, 6, 4, 2};
        int[] arr2 = {9, 7, 5, 3, 1};
        
        int[] merged = mergeArrays(arr1, arr2);
        
        // Print the merged sorted array
        System.out.println("Merged Sorted Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
