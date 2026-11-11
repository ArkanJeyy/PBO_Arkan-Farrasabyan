package Perkuliahan;

public class TenagaPendidikan extends Pegawai{
  public String kategori;

  public TenagaPendidikan() {
  }

  public TenagaPendidikan(String nip, String nama, String kategori) {
    super(nip, nama);
    this.kategori = kategori;
  }

  public void displayInfo() {
    super.displayInfo();
    System.out.println("Kategori : " + kategori);
  }

}
