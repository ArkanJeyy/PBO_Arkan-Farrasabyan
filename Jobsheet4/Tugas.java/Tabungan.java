public class Tabungan extends Rekening{
  public double biayaAdmin;

  public Tabungan() {
    super();
    this.biayaAdmin = 0.0;
    }

  public Tabungan(String noRekening, String namaPemilik, double saldo, double bunga, double biayaAdmin){
    super(noRekening, namaPemilik, saldo, bunga);
    this.biayaAdmin = biayaAdmin;
  }

  public void hitungBunga() {
    double nominalBunga = (saldo * bunga / 100) - biayaAdmin;
    System.out.println("Bunga setelah dipotong admin: Rp" + nominalBunga);
  }

  @Override 
  public void tampilInfo() {
    System.out.println("=== INFO REKENING TABUNGAN ===");
    super.tampilInfo();
    System.out.println("Biaya admin                 : Rp " + biayaAdmin);
  }
}
