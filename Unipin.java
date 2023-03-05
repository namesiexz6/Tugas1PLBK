public class Unipin implements GameOnline {
    private String idAkun;
    private int hargaPoint;
    private int jumlahPoint;
    private int hargaBiaya;

    public Unipin(String idAkun, int jumlahPoint, int hargaBiaya) {
        this.idAkun = idAkun;
        this.jumlahPoint = jumlahPoint;
        this.hargaPoint = 120 * jumlahPoint;
        this.hargaBiaya = hargaBiaya;
    }

    @Override
    public String getNamaGame() {
        return "Unipin";
    }
	
    @Override
    public String getIdAkun() {
        return idAkun;
    }
    
    @Override
    public int getJumlahPoint() {
        return jumlahPoint;
    }

    @Override
    public int getHargaPoint() {
        return hargaPoint;
    }

    @Override
    public int getHargaBiaya() {
        return hargaBiaya;
    }

    public void setHargaPoint(int i) {
    }
}