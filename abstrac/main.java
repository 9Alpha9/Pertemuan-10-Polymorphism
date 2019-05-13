package abstrac;
import java.io.*;
public class main {

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        //Yang Dipanggil adalah Subclassnya
        dosen ds = new dosen(0, "");
        staff st = new staff(0, "");
        
        System.out.print("1.Dosen / 2.Staff : ");
        int pilih = Integer.parseInt(br.readLine());
        
        //Pemanggilan Input
        if (pilih==1){
            System.out.print("Masukkan Nama : ");
            String namadosen = br.readLine();
            System.out.print("Masukkan SKS  : ");
            int sks = Integer.parseInt(br.readLine());
            
            ds = new dosen(sks, namadosen);
            System.out.println("Gaji          = Rp "+ds.HtgGaji());
            System.out.println("Uang Makan    = Rp "+ds.HtgMakan());
        }else{
            System.out.print("Masukkan Nama         : ");
            String namastaff = br.readLine();
            System.out.print("Masukkan Jumlah Hadir : ");
            int hadir = Integer.parseInt(br.readLine());
            
            st = new staff(hadir, namastaff);
            System.out.println("Gaji          = Rp "+st.HtgGaji());
            System.out.println("Uang Makan  = Rp "+st.HtgMakan());
        }
    }
   
}

//ABSTRACT YANG DIPANGGIL 2-2nya yaitu DOSEN & STAFF
