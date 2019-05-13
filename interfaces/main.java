package interfaces;
import java.io.*;
public class main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        dosen ds = new dosen(0, "", 0);
        
        System.out.println("Nama Dosen         :");
        String namadosen = br.readLine();
        System.out.println("Tahun Lahir        :");
        int tahunlahir = Integer.parseInt(br.readLine());
        System.out.println("Masukkan SKS       : ");
        int sks = Integer.parseInt(br.readLine());
        
        ds = new dosen(sks, namadosen, sks);
        ds.cetak();
    }
    
}
