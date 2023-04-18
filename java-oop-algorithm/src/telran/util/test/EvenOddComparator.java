package telran.util.test;

import java.util.Comparator;

public class EvenOddComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer x, Integer y) {
		if (x % 2 == 0 && y % 2 == 0) {
			return x - y;
		} else if (x % 2 != 0 && y % 2 != 0) {

			return y - x;
		} else if (x % 2 == 0) {

			return -1;
		} else {

			return 1;
		}
	}
}
