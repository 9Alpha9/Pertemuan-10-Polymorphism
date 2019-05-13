//Ini adalah class keturunan dari pegawai
package abstrac;
public class dosen extends pegawai {
    //Deklarasi
    private int sks;
    
    //Constructor

    public dosen(int sks, String nama) {
        super(nama);
        this.sks = sks;
    }

    //Getter
    public int getSks() {
        return sks;
    }
    //Memanggil Implement Method ALT + INSERT > Implement Method jika pada Abstract

    @Override
    int HtgGaji() {
        return getSks() *180000;
    }

    @Override
    int HtgMakan() { 
        return 5000 * 20;
    }
    
}
