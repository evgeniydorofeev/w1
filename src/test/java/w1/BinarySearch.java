package w1;

public class BinarySearch {

	private static int search(int[] a, int v) {
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int i = (h + l) >>> 1;
			int m = a[i];
			if (v > m) {
				l = i + 1;
			} else if (v < m) {
				h = i - 1;
			} else {
				return i;
			}
		}
		return -(l + 1);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = search(a, 11);
		System.out.println(i);
	}
}
