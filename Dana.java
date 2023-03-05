public class Dana implements DompetDigital {
    private int saldo;

    public Dana(int saldo){
         this.saldo = saldo;
    }

    @Override
    public String getNamaDompet() {
        return "Dana";
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
            System.out.println("\nSaldo tidak cukup");
        }

		return statusBayar;
    }
}