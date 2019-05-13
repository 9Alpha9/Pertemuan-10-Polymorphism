package interfaces;
abstract class pegawai {
    //Deklarasi
    private String nama;
    private int tahun;
    
    //Memanggil Constructor
    public pegawai(String nama, int tahun) {
        this.nama = nama;
        this.tahun = tahun;
    }
    
   //Memanggil Getter
    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }
    abstract int getUmur();
    
}

