package tugas;
public class Indonesia extends Currency {

    public Indonesia(int nilai) {
        super(nilai);
    }

    @Override
    public int ConvertCurrency() {
        return super.getNilai()*14385;
    }
    
}
