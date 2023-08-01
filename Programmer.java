public class Programmer extends Pegawai {
    
    // variabel private untuk menyimpan informasi khusus Programmer.
    private int lamaBekerja; 
    private double gaji; 

    // Konstruktor kelas `Programmer`.
    // Konstruktor ini akan memanggil konstruktor superclass (`Pegawai`) menggunakan `super()`
    // untuk menginisialisasi data pegawai yang sama.
    public Programmer(String nama, String jenisKelamin, String noPegawai, boolean menikah, int lamaBekerja, double gaji) {
        super(nama, jenisKelamin, noPegawai, menikah); // Memanggil konstruktor `Pegawai` dengan parameter yang sesuai.
        this.lamaBekerja = lamaBekerja; // Menginisialisasi lama bekerja Programmer.
        this.gaji = gaji; // Menginisialisasi gaji Programmer.
    }

    // Metode untuk menghitung bonus Programmer berdasarkan lama bekerja.
    public double getBonus() {
        if (lamaBekerja < 5) {
            return 0.05 * gaji; // Jika lama bekerja kurang dari 5 tahun, bonus adalah 5% dari gaji.
        } else {
            return 0.1 * gaji; // Jika lama bekerja 5 tahun atau lebih, bonus adalah 10% dari gaji.
        }
    }

    // Override metode `toShow()` dari superclass (`Pegawai`).
    // Metode ini akan menampilkan informasi pegawai menggunakan metode `toShow()` dari superclass.
    @Override
    public void toShow() {
        super.toShow(); // Memanggil metode `toShow()` dari superclass (`Pegawai`).
    }
}
