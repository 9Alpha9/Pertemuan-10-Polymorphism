package tugas;
public class China extends Currency {

    public China(int nilai) {
        super(nilai);
    }

    @Override
    public int ConvertCurrency() {
        return super.getNilai()*686;
    }
    
}
