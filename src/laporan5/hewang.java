/**
 * 
 */
package laporan5;

/**
 * @author asrul
 *
 */
public class hewang {
	public void spesies() {
		System.out.println("Spesies 1");
	}

	public void spesies(String nama) {
		System.out.println("ayam");
	}

	public void spesies(int jumlah) {
		System.out.println("kerbau");
	}

	public void spesies(long jumlah) {
		System.out.println("sapi");
	}

	public String spesies(String nama, int jumlah) {
		return "burung";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hewang hew = new hewang();
		hew.spesies();
		hew.spesies("burung");
		hew.spesies(4);
		hew.spesies(51);
		System.out.println(hew.spesies("burung", 5));
	}

}
