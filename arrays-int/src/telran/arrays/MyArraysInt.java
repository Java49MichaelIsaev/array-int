package telran.arrays;
import java.util.Arrays;

public class MyArraysInt {
	public static int [] addNumber(int[] array, int num) {
		
		int array1[] = Arrays.copyOf(array, array.length + 1);
		array1[array1.length-1] = num;
		
		return array1;
	}
	
	public static int[] removeNumber(int[] array, int index) {
		
		if(index<0 || index>array.length -1) {
			return array;
		} else {
		int arrayDest[] = new int[array.length - 1];
		System.arraycopy(array, 0, arrayDest, 0, index);
		System.arraycopy(array, index + 1, arrayDest, index, array.length - index - 1);
		
		return arrayDest;
		}
	}
	
	public static int[] insertNumber(int [] array, int index, int num) {

		if(index<0 || index>array.length) {
			return array;
		} else {
		int[] arrayDest = new int[array.length + 1];
		System.arraycopy(array, 0, arrayDest, 0, index);
		arrayDest[index] = num;
		System.arraycopy(array, index, arrayDest, index + 1, array.length - index);
		
		return arrayDest;
		}
	}
	public static int binarySearch(int [] a, int key) {
		
		//Arrays.sort(a);
		int result = Arrays.binarySearch(a,key);
		return result;
	}

}

