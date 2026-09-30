public class PerkuliahanDemo {
    public static void main(String[] args) {
        // 1. Membuat objek Dosen
        Dosen dosen1 = new Dosen("198501012010121001", "Vit Zuraida,S.Kom., M.Kom.");

        // 2. Membuat objek MataKuliah dan menghubungkannya dengan Dosen
        Matakuliah mkPemrograman = new Matakuliah("VZ1234", "Pemrograman Berorientasi Objek", 2, dosen1);

        // 3. Membuat beberapa objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("254107060013", "Arkan Farrasabyan");
        Mahasiswa mhs2 = new Mahasiswa("25410706035", "Anandha Vesakha");
        Mahasiswa mhs3 = new Mahasiswa("254107060067", "Isma Anbiya");

        // 4. Menambahkan Mahasiswa ke dalam MataKuliah
        mkPemrograman.tambahMahasiswa(mhs1);
        mkPemrograman.tambahMahasiswa(mhs2);
        mkPemrograman.tambahMahasiswa(mhs3);

        // 5. Menampilkan Detail Mata Kuliah (termasuk Dosen dan Daftar Mahasiswa)
        mkPemrograman.tampilDetailMatakuliah();
    }
}