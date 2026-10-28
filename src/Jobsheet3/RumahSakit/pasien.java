import java.time.LocalDate;
import java.util.ArrayList;

public class pasien {
  private String noRekamMedis;
  private String nama;
  private ArrayList<konsultasi>riwayatKonsultasi;

  public void tambahKonsultasi(LocalDate tanggal, pegawai dokter, pegawai perawat) {
    konsultasi konsul = new konsultasi();
    konsul.setTanggal(tanggal);
    konsul.setDokter(dokter);
    konsul.setPerawat(perawat);
    riwayatKonsultasi.add(konsul);
  }

  public String getNoRekamMedis() {
    return noRekamMedis;
  }

  public void setNoRekamMedis(String noRekamMedis) {
    this.noRekamMedis = noRekamMedis;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public pasien(String noRekamMedis, String nama) {
    this.noRekamMedis = noRekamMedis;
    this.nama = nama;
    this.riwayatKonsultasi = new ArrayList<konsultasi>();
  }

  public String getInfo() {
    String info = "";
    info += "No Rekam Medis        : " + this.noRekamMedis + "\n";
    info += "Nama                  : " + this.nama + "\n";

    if (!riwayatKonsultasi.isEmpty()) {
      info += "Riwayat Konstultasi :\n";

      for (konsultasi konsul : riwayatKonsultasi) {
        info += konsul.getInfo();
      }
    } else {
      info += "Belum ada  riwayat konsultasi";
    }

    info += "\n";

    return info;
  }
}
