package polymorphism;
public class motor {
    
    private int jumlah;
    private String tipe;

    public motor(int jumlah, String tipe) {
        this.jumlah = jumlah;
        this.tipe = tipe;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getTipe() {
        return tipe;
    }
    
    public int TotalBeli(){
        return 0;
    }
}
