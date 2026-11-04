package Jobsheet8.Tugas;

public class Persegi extends BangunDatar {
  public double sisi;

  public Persegi( String warna, double sisi) {
    super("Persegi", warna);
    this.sisi = sisi;
  }

  @Override 
  public double hitungLuas() {
    return sisi * sisi;
  }

  @Override
  public double hitungKeliling(){
    return 4 * sisi;
  }
}
