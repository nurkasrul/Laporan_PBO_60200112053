/**
 * 
 */
package laporan4;

/**
 * @author asrul
 *
 */
public class Kondisional1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int harga = 50000;
		String barang;

		if (harga <= 30000) {
			barang = "jersey";
		} else if (harga <= 5000) {
			barang = "sepatu";
		} else if (harga <= 10000) {
			barang = "jaket";
		} else if (harga <= 20000) {
			barang = "topi";
		} else {
			barang = "jersey";
		}
		System.out.println("Barang = " + barang);
	}

}
