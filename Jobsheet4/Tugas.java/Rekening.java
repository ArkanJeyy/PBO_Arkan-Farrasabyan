public class Rekening {
  public String noRekening;
  public String namaPemilik;
  protected double saldo;
  public double bunga;

  public Rekening() {
    this.noRekening = "";
    this.namaPemilik = "";
    this.saldo = 0.0;
    this.bunga = 0.0;
  }

  public Rekening(String noRekening, String namaPemilik, double saldo, double bunga) {
    this.noRekening = noRekening;
    this.namaPemilik = namaPemilik;
    this.saldo = saldo;
    this.bunga = bunga;
  }

  public void tarikSaldo(double jumlah) {
    if (jumlah <= saldo) {
      saldo -= jumlah;
      System.out.println("-----------------------------------------------------");
      System.out.println("Tarik saldo berhasil. Saldo anda tersisa: " + saldo);
      System.out.println("-----------------------------------------------------");
      System.out.println();
    } else {
      System.out.println("-------------------------");
      System.out.println("Saldo tidak mencukupi.");
      System.out.println("-------------------------");
    }
  }

  public void setorSaldo(double jumlah) {
    saldo += jumlah;
    System.out.println("-----------------------------------------------");
    System.out.println("Setor saldo berhasil. Total saldo : " + saldo);
    System.out.println("-----------------------------------------------");
    System.out.println();
  }

  public void tampilInfo() {
    System.out.println("No. Rekening                : " + noRekening);
    System.out.println("Nama Pemilik                : " + namaPemilik);
    System.out.println("Saldo                       : Rp " + saldo);
    System.out.println("bunga                       : " + bunga);
  }

}
