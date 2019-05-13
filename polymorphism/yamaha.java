package polymorphism;
public class yamaha extends motor{

    public yamaha(int jumlah, String tipe) {
        super(jumlah, tipe);
    }

    @Override
    public int TotalBeli() {
        return super.getJumlah()*18000000;
    }
    
}
