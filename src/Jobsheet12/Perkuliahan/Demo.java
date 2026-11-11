package Perkuliahan;

public class Demo {
  public static void main(String[] args) {
    Pegawai pegawai1 = new Pegawai("19876734", "Ahmad Khairudin");
    Dosen dosen1 = new Dosen("19940201", "Widya, S.Kom. M.Kom", "199402");
    TenagaPendidikan tendik1 = new TenagaPendidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");

    ujiDownCastBerhasil(dosen1);
    ujiDownCastGagal(pegawai1);
  }
  public static void ujiDownCastBerhasil(Pegawai pegawai){
    Dosen dosenRill = (Dosen) pegawai;
    System.out.println("Nama Dosen : " + dosenRill.nama);
    System.out.println("NIP Dosen  : " + dosenRill.nip);
  }

  public static void ujiDownCastGagal(Pegawai pegawai) {
    Dosen dosenSUS = (Dosen) pegawai;
    System.out.println("NIDN : " + dosenSUS.nidn);
  }

}