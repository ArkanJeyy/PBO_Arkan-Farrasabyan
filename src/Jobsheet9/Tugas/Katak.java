package Tugas;

public class Katak implements BisaLompat {
  public String spesies;
  public int usia;

  public Katak(String spesies, int usia) {
    this.spesies = spesies;
    this.usia = usia;
  }

  @Override
  public void lompat() {
    System.out.println("Lompatan Katak");
  }

  @Override 
  public double dapatkanTinggiLompatan() {
    return 0.2;
  }

  public void getInfo() {
    System.out.println("Spesies : " + this.spesies);
    System.out.println("Usia : " + this.usia + " Bulan");
    System.out.println("Tinggi Lompatan : " + this.dapatkanTinggiLompatan() + " Meter");
  }
}
