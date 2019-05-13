package interfaces;
public class dosen extends pegawai implements interfacePegawai {
    private int sks;

        //Constructor
    public dosen(int sks, String nama, int tahun) {
        super(nama, tahun);
        this.sks = sks;
    }
        //Getter
    public int getSks() {
        return sks;
    }
        //IMPLEMENT METHOD
    @Override
    int getUmur() {
        return 2019-super.getTahun();
    }

    @Override
    public int HtgGaji() {
      return getSks() * 100000;
    }

    @Override
    public int UangMakan() {
      return 50000 * 20;  
    }

    @Override
    public void cetak() {
        System.out.println("Usia    = "+getUmur()+" Tahun");
        System.out.println("Gaji    = Rp "+HtgGaji());
        System.out.println("Uang Makan    = Rp "+UangMakan());
    }
    
    
}

//SETELAH DI EXTENDS Ke Subclass, lalu diberi implements dari interface yang telah dibuat, interfacePegawai.