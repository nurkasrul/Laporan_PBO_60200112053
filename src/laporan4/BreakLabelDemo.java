/**
 * 
 */
package laporan4;

/**
 * @author asrul
 *
 */
public class BreakLabelDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayCode = { { 32, 87, 3, 59 }, { 12, 1500, 3000, 8 },
				{ 622, 127, 77, 955 } };
		int cari = 32;

		int i;
		int j = 0;
		boolean ketemu = false;

		keluar: for (i = 0; i < arrayCode.length; i++) {
			for (j = 0; j < arrayCode[i].length; j++) {
				if (arrayCode[i][j] == cari) {
					ketemu = true;
					break keluar;
				}
			}
		}
		if (ketemu) {
			System.out.println("Ketemu " + cari + " pada index " + i + "," + j);
		} else {
			System.out.println(cari + " tidak terdapat dalam array");
		}
	}

}
