public interface Pembelian {
	void connectTo(GameOnline game, DompetDigital dompet);
	boolean beli();
}