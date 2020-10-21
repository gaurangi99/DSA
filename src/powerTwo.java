public class powerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(16));
		System.out.println(isPowerOfTwo(24));
	}

	static boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		}
		while (n != 0) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n /= 2;
				if (n == 0) {
					return true;
				} else {
					break;
				}
			}
		}
		return false;
	}
}
