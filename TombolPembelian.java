public class TombolPembelian implements UserInterface {
    private Pembelian aplikasi;

	public TombolPembelian() {
		aplikasi = null;
	}

	@Override
	public void tekan() {
		if (aplikasi != null) {
			boolean statusBeli = aplikasi.beli();

			if ( statusBeli )
				System.out.println("\nPembelian Berhasil!");
			else
				System.out.println("\nPembelian Gagal!");
		}
		else {
			System.out.println("Aplikasi tidak terhubung!");
		}
	}

    public void connectTo(Pembelian aplikasi) {
        System.out.println("\nMenghubungkan ke aplikasi...");
		this.aplikasi = aplikasi;
		System.out.println("Aplikasi terhubung ");
    }
}