/**
 * 
 */
package laporan4;

/**
 * @author asrul
 *
 */
public class ContinueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kalimat = "Nama Saya Nur Kasrul Andriawan";

		int maks = kalimat.length();
		int jumlahR = 0;

		for (int i = 0; i < maks; i++) {
			if (kalimat.charAt(i) != 'N')
				continue;

			jumlahR++;
		}
		System.out.println("Ditemukan " + jumlahR
				+ " huruf N Kapital dalam kalimat.");
	}

}
