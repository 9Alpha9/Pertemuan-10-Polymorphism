package abstrac;
public final class staff extends pegawai {
    private int hadir;

    public staff(int hadir, String nama) {
        super(nama);
        this.hadir = hadir;
    }

    public int getHadir() {
        return hadir;
    }

    @Override
    int HtgGaji() {
        return getHadir() * 100000;
    }

    @Override
    int HtgMakan() {
        return 50000 * 20;
    }
    
}
//Penjelasan
//
//FINAL DIGUNAKAN APABILA DALAM TURUNAN DARI CLASS PEGAWAI SUDAH TIDAK DAPAT DITURUNKAN LAGI, MAKA FUNGSI FINAL DISINI DIGUNAKAN. KETIKA AKAN DITURUNKAN KEMBALI MAKA HASIL YANG DI OUTPUTKAN AKAN MENGHASILKAN ERROR KAREN FUNGSI FINAL DISNI SUDAH TIDAK DAPAT DITURUNKAN KEMBALI !
