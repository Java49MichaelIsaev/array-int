package telran.arrays.test;
import static org.junit.jupiter.api.Assertions.*;
import static telran.arrays.MyArraysInt.*;
import org.junit.jupiter.api.Test;

import telran.arrays.MyArraysInt;

import java.util.Arrays;

class MyArraysIntTests {

	@Test
	void testAddNumber() { 
		int[]array = {1,2};
		int[]array1 = {1,2,3,4};
		int[]expected = {1,2,3};
		int[]expected1 = {1,2,3,4,-10};
		assertArrayEquals(expected, addNumber(array, 3));
		assertArrayEquals(expected1, addNumber(array1, -10));		
	}
	
	@Test
	void testRemoveNumber() {
		int[]array = {1,2};
		int[]array1 = {1,2,3,4};
		int[]array2 = {1,2,3,4};
		int[]expected = {2};
		int[]expected1 = {1,2,3};
		int[]expected2 = {1,2,3,4};
		
		assertArrayEquals(expected, removeNumber(array, 0));
		assertArrayEquals(expected1, removeNumber(array1, 3));
		assertArrayEquals(expected2, removeNumber(array2, -2));
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
  
		assertArrayEquals(expected,  insertNumber(array, 3, 4));
		assertArrayEquals(expected1, insertNumber(array1, 1,-2));
		assertArrayEquals(expected2, insertNumber(array2, 0,3));
		assertArrayEquals(expected3, insertNumber(array3, -1,3));
		
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
	
	assertEquals(expected, binarySearch(array, 3));
	assertEquals(expected2, binarySearch(array2, 15));
	assertEquals(expected3, binarySearch(array3, -10));
	assertEquals(expected4, binarySearch(array4, 0));
	assertEquals(expected5, binarySearch(array5, 12));
	assertEquals(expected6, binarySearch(array6, 10));
	assertEquals(expected7,binarySearch(array7, 10));
}
}
