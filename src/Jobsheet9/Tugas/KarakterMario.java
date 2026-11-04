package Tugas;

public class KarakterMario implements BisaLompat {
  public int jumlahNyawa;
  public String powerUp;

  public KarakterMario(int jumlahNyawa, String powerUp) {
    this.jumlahNyawa = jumlahNyawa;
    this.powerUp = powerUp;
  }

  @Override
  public void lompat() {
    System.out.println("Lompatan Mario");
  }

  @Override
  public double dapatkanTinggiLompatan() {
    return 1.0;
  }

  public void getInfo() {
    System.out.println("Jumlah Nyawa : " + this.jumlahNyawa);
    System.out.println("Power Up : " + this.powerUp);
    System.out.println("Tinggi Lompatan : " + this.dapatkanTinggiLompatan() + " Meter");
  }
}
