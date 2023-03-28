package telran.arrays.test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import telran.arrays.MyArraysInt;

class MyArraysIntTests {

	@Test
	void testAddNumber() { 
		int[]array = {1,2};
		int[]array1 = {1,2,3,4};
		int[]expected = {1,2,3};
		int[]expected1 = {1,2,3,4,-10};
		assertArrayEquals(expected, MyArraysInt.addNumber(array, 3));
		assertArrayEquals(expected1, MyArraysInt.addNumber(array1, -10));		
	}
	
	@Test
	void testRemoveNumber() {
		int[]array = {1,2};
		int[]array1 = {1,2,3,4};
		int[]array2 = {1,2,3,4};
		int[]expected = {2};
		int[]expected1 = {1,2,3};
		int[]expected2 = {1,2,3,4};
		
		assertArrayEquals(expected, MyArraysInt.removeNumber(array, 0));
		assertArrayEquals(expected1, MyArraysInt.removeNumber(array1, 3));
		assertArrayEquals(expected2, MyArraysInt.removeNumber(array2, -2));
	}

	@Test
	void testInsertNumber() {
		
		int[]array = {1,2,3};
		int[]array1 = {-1};
		int[]array2 = {1,2};
		int[]array3 = {1,2,3};
		int[]expected = {1,2,3,4};
		int[]expected1 = {-1,-2};
		int[]expected2 = {3,1,2};
		int[]expected3 = {1,2,3};
  
		assertArrayEquals(expected,  MyArraysInt.insertNumber(array, 3, 4));
		assertArrayEquals(expected1, MyArraysInt.insertNumber(array1, 1,-2));
		assertArrayEquals(expected2, MyArraysInt.insertNumber(array2, 0,3));
		assertArrayEquals(expected3, MyArraysInt.insertNumber(array3, -1,3));
		
	}
	
	@Test
	void testBinarySearchInt() {
	
	int array[] = {1,2,3,4,5,6,7,8};
	int array2[] = {0,4,8,12,14,15};
	int array3[] = {-10,-12,3,4,5,6};
	int array4[] = {1,2,3};
	int array5[] = {2,3,3,3,3,6,8,8};
	int array6[] = {10,10,10,10};
	int array7[] = {1,2,10,-10,10,10,2,3};
	int expected = 2;
	int expected2 = 5;
	int expected3 = 0;
	int expected4 = -1;
	int expected5 = -9;
	int expected6 = 1;
	int expected7 = 5;
	
	assertEquals(expected, Arrays.binarySearch(array, 3));
	assertEquals(expected2, Arrays.binarySearch(array2, 15));
	assertEquals(expected3, Arrays.binarySearch(array3, -10));
	assertEquals(expected4, Arrays.binarySearch(array4, 0));
	assertEquals(expected5, Arrays.binarySearch(array5, 12));
	assertEquals(expected6, Arrays.binarySearch(array6, 10));
	assertEquals(expected7, Arrays.binarySearch(array7, 10));
}
}
