package polymorphism;
public class honda extends motor {

    public honda(int jumlah, String tipe) {
        super(jumlah, tipe);
    }

    @Override
    public int TotalBeli() {
        return super.getJumlah()*21000000;
    }
    
    
}
