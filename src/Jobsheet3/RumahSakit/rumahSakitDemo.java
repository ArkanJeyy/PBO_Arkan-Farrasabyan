import java.time.LocalDate;

public class rumahSakitDemo {
  public static void main(String[] args) {
    pegawai ani = new pegawai("1234", "Dr.Ani");
    pegawai bagus = new pegawai("4567", "Dr.Bagus");

    pegawai desi = new pegawai("1234", "Ns. Desi");
    pegawai eka = new pegawai("4567", "Ns. Eka");

    pasien pasien1 = new pasien("343298", "Puspa Widya");
    pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
    pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

    System.out.println(pasien1.getInfo());

    pasien pasien2 = new pasien("997744", "Yeni Anggraeni");
    System.out.println(pasien2.getInfo());
  }
}
