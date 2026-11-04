package Jobsheet9;

public class AlatElektronik {
  public double harga;
  public String merk;
  public String warna;

  public AlatElektronik(double harga, String merk, String warna) {
    this.harga = 0;
    this.merk = "";
    this.warna = "";
  }

  public void getInfo() {
    System.out.println("Harga : " + this.harga);
    System.out.println("Merk : " + this.merk);
    System.out.println("Warna : " + this.warna);
  }
}
