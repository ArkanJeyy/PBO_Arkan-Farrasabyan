public class Deposito extends Rekening {
  public double tenor;

  public Deposito() {
    super();
    this.tenor = 0.0;
  }

  public Deposito(String noRekening, String namaPemilik, double saldo, double bunga, double tenor) {
    super(noRekening, namaPemilik, saldo, bunga);
    this.tenor = tenor;
  }

  public void durasiTenor() {
    System.out.println("Jangka waktu tenor          : " + tenor + " Bulan.");
  }

  @Override 
  public void tampilInfo(){
    System.out.println("=== INFO REKENING DEPOSITO ===");
    super.tampilInfo();
  }


}
