/**
 * 
 */
package laporan3;

/**
 * @author asrul
 *
 */
public class laporan3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte angka = 10;
		byte angka2 = 6;
		int hasil = angka++ >> 3 + 10 * 4 | 10 << angka2;

		System.out.println(hasil);

	}

}
