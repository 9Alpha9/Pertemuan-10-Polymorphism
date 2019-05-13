package polymorphism;
import java.io.*;
public class Polymorphism {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //contoh array 1Dimensi
        motor [] m = new motor[2];
        
        for(int i = 0; i < m.length; i++){
            System.out.println("Input 1 : Honda ");
            System.out.println("Input 2 : Yamaha ");
            System.out.print("Masukkan Pilihan  : ");
            int pilih = Integer.parseInt(br.readLine());
            
            System.out.print("Masukkan Tipe : ");
            String tipe = br.readLine();
            System.out.print("Jumlah Beli   : ");
            int jumlah = Integer.parseInt(br.readLine());
            
            if (pilih == 1){
                m[i] = new honda(jumlah, tipe);
                System.out.println("Total Beli = Rp "+m[i].TotalBeli());
            }else{
                m[i] = new yamaha(jumlah, tipe);
                System.out.println("Total Beli = Rp "+m[i].TotalBeli());
            }
        }
        
//        //contoh tanpa array
//        motor m = new motor (0."");
    }
    
}
