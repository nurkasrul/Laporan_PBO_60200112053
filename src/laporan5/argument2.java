/**
 * 
 */
package laporan5;

/**
 * @author asrul
 *
 */
public class argument2 {
	public static void argumenArray(int[] args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2] + ","
				+ args[3] + "," + args[4] + "," + args[5]);
	}

	public static void argumenSembarang(int... args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2] + ","
				+ args[3]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = { 1, 2, 3, 4, 5, 6 };
		argumenArray(i);
		argumenSembarang(i);
	}

}
