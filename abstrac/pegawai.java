package abstrac;
abstract class pegawai {
    private String nama;

   //Memanggil Constructor
    public pegawai(String nama) {
        this.nama = nama;
    }
    
   //Memanggil Getter
    public String getNama() {
        return nama;
    }
   //Memanggil abstract class
    abstract int HtgGaji();
    abstract int HtgMakan();
}

//info PUBLIC DI GANTI MENGGUNAKAN abstract 
//Contoh public class pegawai {} dirubah menjadi abstract class pegawai{}
//ABSTRACT BISA DITAMBAHKAN GETTER, SETTER, CONSTRUCTOR
