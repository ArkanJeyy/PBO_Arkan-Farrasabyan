

public class PerkuliahanDemo {
    public static void main(String[] args) {
        // 1. Menginisialisasi dan membuat objek Dosen
        Dosen dosen1 = new Dosen("198501012010121001", "Vit Zuraida, S.Kom., M.Kom.");
        // 2. Menginisialisasi dan membuat objek MataKuliah, serta menghubungkannya dengan Dosen
        Matakuliah mkPemrograman1 = new Matakuliah("PM6789", "Pemrograman Berorientasi Objek", 2, dosen1);


        // 3. Menginisialisasi dan membuat beberapa objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("254107060013", "Arkan Farrasabyan");
        Mahasiswa mhs2 = new Mahasiswa("254107060035", "Anandha Vesakha");
        Mahasiswa mhs3 = new Mahasiswa("254107060067", "Isma Anbiya");
        Mahasiswa mhs4 = new Mahasiswa("254107060088", "Rafa Alrabani");

        // 4. Menambahkan Mahasiswa ke dalam MataKuliah
        mkPemrograman1.tambahMahasiswa(mhs1);
        mkPemrograman1.tambahMahasiswa(mhs2);
        mkPemrograman1.tambahMahasiswa(mhs3);
        mkPemrograman1.tambahMahasiswa(mhs4);

        // 5. Menampilkan Detail Mata Kuliah (termasuk Dosen dan Daftar Mahasiswa)
        mkPemrograman1.tampilDetailMatakuliah();
    }
}