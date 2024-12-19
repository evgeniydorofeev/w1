package w1;

public class Recursion {
	
	static void f1(int i) {
		if (i == 0) {
			return;
		}
  		f1(i - 1);
		System.out.println(i);
	}

	public static void main(String[] args) {
//		f1(3);
	}

}
