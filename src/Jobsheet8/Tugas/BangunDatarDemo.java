package Jobsheet8.Tugas;

public class BangunDatarDemo {
  public static void main(String[] args) {
    Persegi persegi1 = new Persegi("Merah", 5.0);
    Segitiga segitiga1 = new Segitiga("Biru", 2.0, 5.0, 6.0);

    persegi1.cetakInfo();
    System.out.println();

    segitiga1.cetakInfo();
    System.out.println();
  }
}
