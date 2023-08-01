public class Main {
   public static void main(String[] args) {

        // Membuat objek pegawai dengan nama "Luffy", jenis kelamin "Laki-laki", nomor pegawai "001", dan status menikah "true".
        Pegawai pegawai1 = new Pegawai("Luffy", "Laki-laki", "001", true);

        // Membuat objek pegawai dengan nama "Nami", jenis kelamin "Perempuan", nomor pegawai "002", dan status menikah "false".
        Pegawai pegawai2 = new Pegawai("Nami", "Perempuan", "002", false);
        
        //Menampilkan Pegawai 2
        System.out.println("Pegawai 1");
        pegawai1.toShow();
        //Menampilkan Tunjangan pegawai 1
        System.out.println("Tunjangan: " + pegawai1.getTunjangan());
        System.out.println("======================");
        
        //Menampilkan Pegawai 2
        System.out.println("Pegawai 2");
        pegawai2.toShow();
        //Menampilkan Tunjangan pegawai 2
        System.out.println("Tunjangan: " + pegawai2.getTunjangan());
        System.out.println("======================");

        // Membuat objek programmer dengan nama "Aldan", jenis kelamin "Laki-laki", nomor pegawai "003", status menikah "false", lama bekerja 5 tahun, dan gaji 5.000.000.
        Programmer programmer1 = new Programmer("Asta", "Laki-laki", "003", false, 5, 5000000);

        // Membuat objek programmer dengan nama "Siti", jenis kelamin "Perempuan", nomor pegawai "004", status menikah "true", lama bekerja 2 tahun, dan gaji 6.000.000.
        Programmer programmer2 = new Programmer("Azizah", "Perempuan", "004", true, 2, 6000000);

        // Membuat objek programmer dengan nama "Joko", jenis kelamin "Laki-laki", nomor pegawai "005", status menikah "true", lama bekerja 12 tahun, dan gaji 8.000.000.
        Programmer programmer3 = new Programmer("Aldan", "Laki-laki", "005", true, 12, 8000000);
        
        //Menampilkan Programmer 1
        System.out.println("Programmer 1");
        programmer1.toShow();
        //Menampilkan Tunjungan Programmer 1
        System.out.println("Tunjangan: " + programmer1.getTunjangan());
        //Menampilkan Bonus Programmer 1
        System.out.println("Bonus: " + programmer1.getBonus());
        System.out.println("======================");
        //Memampilkan Programmer 2
        System.out.println("Programmer 2");
        programmer2.toShow();
        //Menampilkan Tunjungan Programmer 2
        System.out.println("Tunjangan: " + programmer2.getTunjangan());
        //Menampilkan Bonus Programmer 2
        System.out.println("Bonus: " + programmer2.getBonus());
        System.out.println("======================");
        //Menampilkan Programmer 3
        System.out.println("Programmer 3");
        programmer3.toShow();
        //Menampilkan Tunjungan Programmer 3
        System.out.println("Tunjangan: " + programmer3.getTunjangan());
        //Menampilkan Bonus Programmer 3
        System.out.println("Bonus: " + programmer3.getBonus());
        System.out.println("======================");
    }
}
