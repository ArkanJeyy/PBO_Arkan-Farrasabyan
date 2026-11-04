package Jobsheet8.Tugas;

public class Segitiga extends BangunDatar {
  public double alas;
  public double tinggi;
  public double sisiMiring;

  public Segitiga(String warna, double alas, double tinggi, double sisiMiring) {
    super("Segitiga", warna);
    this.alas = alas;
    this.tinggi = tinggi;
    this.sisiMiring = sisiMiring;
  }

  @Override
  public double hitungLuas() {
    return 0.5 * alas * tinggi;
  }

  @Override
  public double hitungKeliling() {
    return alas + tinggi + sisiMiring;
  }

}
