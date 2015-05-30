/**
 * 
 */
package laporan4;

/**
 * @author asrul
 *
 */
public class BreakDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nilai = { 50, 87, 9, 589, 22, 1076, 2000, 8, 453, 10000 };
		int cari = 10000;

		int i;
		boolean ketemu = false;

		for (i = 0; i < nilai.length; i++) {
			if (nilai[i] == cari) {
				ketemu = true;
				break;
			}
		}
		if (ketemu) {
			System.out.println("Ditemukan " + cari + " pada index " + i);
		} else {
			System.out.println(cari + " tidak terdapat dalam array");
		}
	}

}
