package test;

public class SortTest {

	public static void main(String[] args) {
		int [] intArray = {4, 5, 7, 1, 2, 3, 6};
		
		
		 int [] sortArray = sort(intArray);
		 for (int i = 0; i < sortArray.length; i ++ ) {
			 System.out.print(sortArray[i]);
		 }
		 System.out.println();
		 System.out.println(sortArray.length);

	}
	

	    public static int[] sort(int[] numbers) {
	        if (numbers == null || numbers.length <= 1) {
	            return numbers;
	        }

	        int mid = numbers.length / 2;
	        int[] left = new int[mid];
	        int[] right = new int[numbers.length - mid];

	        System.arraycopy(numbers, 0, left, 0, mid);
	        System.arraycopy(numbers, mid, right, 0, numbers.length - mid);

	        return merge(sort(left), sort(right));
	    }

	    private static int[] merge(int[] left, int[] right) {
	        if (left == null || right == null) {
	            throw new IllegalArgumentException("Invalid input array(s)");
	        }

	        int[] merged = new int[left.length + right.length];
	        System.out.println(merged.length);
	        int i = 0, j = 0, k = 0;

	        while (i < left.length && j < right.length) {
	            merged[k++] = left[i] <= right[j] ? left[i++] : right[j++];
	        }

	        if (i < left.length) {
	            System.arraycopy(left, i, merged, k, left.length - i);
	        } else if (j < right.length) {
	            System.arraycopy(right, j, merged, k, right.length - j);
	        }
//	        for(i = 0; i < merged.length; i++) {
	        //System.out.print(merged.length);
//	        }
	        return merged;
	    }


}
