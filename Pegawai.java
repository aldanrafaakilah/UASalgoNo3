public class Pegawai {
    
    // variabel private untuk menyimpan informasi pegawai.
    private String nama; 
    private String jenisKelamin; 
    private String noPegawai; 
    private boolean menikah; 

    // Konstruktor kelas `Pegawai`.
    // Konstruktor digunakan untuk membuat objek `Pegawai` baru dan mengisi data awal.
    public Pegawai(String nama, String jenisKelamin, String noPegawai, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.noPegawai = noPegawai;
        this.menikah = menikah;
    }

    // Metod untuk mendapatkan nilai tunjangan pegawai.
    // Jika pegawai menikah, tunjangan akan diberikan berdasarkan jenis kelamin.
    // Jika pegawai belum menikah, tunjangan tetap.
    public int getTunjangan() {
        if (menikah) {
            return (jenisKelamin.equalsIgnoreCase("Laki-laki")) ? 200000 : 150000;
        } else {
            return 100000;
        }
    }

    // untuk menampilkan informasi pegawai ke layar.
    public void toShow() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("No Pegawai: " + noPegawai);
        System.out.println("Status Menikah: " + (menikah ? "Sudah Menikah" : "Belum Menikah"));
    }
}
