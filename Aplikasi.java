public class Aplikasi implements Pembelian {
    private GameOnline game;
    private DompetDigital dompet;

    public Aplikasi() {
        game = null;
        dompet = null;
    }

    @Override
    public void connectTo(GameOnline game, DompetDigital dompet) {
        this.game = game;
        this.dompet = dompet;
        System.out.println("\nJumlah saldo " + dompet.getNamaDompet() + " Rp" + dompet.getSaldo());
        System.out.println("ID Akun " + game.getNamaGame() + " = " + game.getIdAkun());
        System.out.println(game.getJumlahPoint() + " " + game.getNamaGame() + " Points = Rp" + game.getHargaPoint());
        System.out.println("Biaya Top Up " + game.getNamaGame() + " = Rp" + game.getHargaBiaya());
    }
	
    @Override
    public boolean beli() {
        boolean statusBeli = false;

        if (dompet != null && game != null) {
            statusBeli = dompet.bayar(game.getHargaPoint()+game.getHargaBiaya());
        } else {
            System.out.println("Harap memilih game dan metode pembayaran terlebih dahulu");
        }
        return statusBeli;
    }
}