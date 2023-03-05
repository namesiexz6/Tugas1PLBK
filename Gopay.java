public class Gopay implements DompetDigital {
    private int saldo;

    public Gopay(int saldo){
        this.saldo = saldo;
    }

    @Override
    public String getNamaDompet() {
        return "Gopay";
    }
	
    @Override
    public int getSaldo() {
        return saldo;
    }

    @Override
	public boolean bayar(int tagihan) {
        boolean statusBayar = false;
		System.out.println("\nJumlah Tagihan = Rp" + tagihan);

		if (getSaldo() >= tagihan) {
			saldo = saldo - tagihan;
			statusBayar = true;
		} else {
            System.out.println("Saldo tidak cukup");
        }

		return statusBayar;
    }
}