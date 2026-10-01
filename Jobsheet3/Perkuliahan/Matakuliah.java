import java.util.ArrayList;

public class Matakuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;
    private Dosen dosenPengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public Matakuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public Matakuliah(String kodeMK, String namaMK, int sks, Dosen dosenPengampu) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
        this.daftarMahasiswa = new ArrayList<>();
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public void setDosenPengampu(Dosen dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        this.daftarMahasiswa.add(mhs);
    }

    public void tampilDetailMatakuliah() {
        System.out.println("==========================================");
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMK);
        System.out.println("SKS              : " + sks);
        System.out.println("------------------------------------------");
        System.out.println("Dosen Pengampu:");
        if (dosenPengampu != null) {
            dosenPengampu.infoDosen();
        } else {
            System.out.println("Belum ada dosen pengampu.");
        }

        System.out.println("------------------------------------------");
        System.out.println("Daftar Mahasiswa yang Mengikuti:");
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang terdaftar.");
        } else {
            for (int i = 0; i < daftarMahasiswa.size(); i++) {
                System.out.println((i + 1) + ".");
                daftarMahasiswa.get(i).tampilInfoMahasiswa();
            }
        }
        System.out.println("==========================================");
    }
}