package tugas;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        Currency [] c = new Currency [2];
        
        for(int i=0; i < c.length; i++){
            System.out.println("1. Indonesia (IDR)");
            System.out.println("2. China (YEN)");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("=============================================");
            System.out.print("Currency Mata Uang    : ");
            int currency = Integer.parseInt(br.readLine());
        
        if (pilih ==1){
            c[i] = new Indonesia (currency);
            System.out.println("Rupiah  = Rp "+c[i].ConvertCurrency());
        }else{
            c[i] = new China (currency);
            System.out.println("Yen     = ¥ "+c[i].ConvertCurrency());
        }
        }
            }
    
}
