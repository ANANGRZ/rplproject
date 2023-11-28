package datapegawai;

public class datapegawaibaru {
    private String nama;
    private String alamat;
    public int umur;
    
    public datapegawaibaru(String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }
    
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getUmur() {
        return umur;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Nama: "+ nama + ", \nAlamat: " + alamat + ", \nUmur: " + umur;
    }
}