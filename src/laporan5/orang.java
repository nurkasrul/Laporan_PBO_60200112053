/**
 * 
 */
package laporan5;

/**
 * @author asrul
 *
 */
public class orang {

	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float beratBadan;

	public void cetakOrang() {
		System.out
				.println("Nama :" + nama + " Alamat :" + alamat
						+ " TinggiBadan :" + tinggiBadan + " BeratBadan :"
						+ beratBadan);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orang objekOrang = new orang();
		objekOrang.nama = "nur kasrul";
		objekOrang.alamat = "gowa";
		objekOrang.tinggiBadan = 160;
		objekOrang.beratBadan = 60.4f;
		objekOrang.cetakOrang();

		orang objekOrangDua = new orang();
		objekOrangDua.nama = "baso";
		objekOrangDua.alamat = "takalae";
		objekOrangDua.tinggiBadan = 185;
		objekOrangDua.beratBadan = 70.4f;
		objekOrangDua.cetakOrang();

		orang objekOrangTiga = new orang();
		objekOrangTiga.nama = "besse";
		objekOrangTiga.alamat = "bali";
		objekOrangTiga.tinggiBadan = 190;
		objekOrangTiga.beratBadan = 75.4f;
		objekOrangTiga.cetakOrang();
	}

}