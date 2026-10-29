package Jobsheet8.Percobaan;

public class Ular extends Hewan {
  public boolean isberbisa;

  public Ular(boolean isberbisa, double berat, String makanan, String habitat) {
    super(berat, makanan, habitat);
    this.isberbisa = isberbisa;
  }

  @Override 
  public void bergerak() {
    System.out.println("Mengerutkan otot dari segala sisi hingga membentuk lengkungan");
    System.out.println("Menemukan titik penahan seperti batu dan pohon");
    System.out.println("Menggunakan sisik untuk mendorong tubuhnya kedepan");
  }

  @Override
  public void bernafas() {
    System.out.println("Otot tulang rusuk kontraksi, udara masuk lewat hidung");
    System.out.println("Traakea mengirimkan udara ke paru-paru");
    System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
  }

  @Override
  public void cetakInfo(){
    super.cetakInfo();
    System.out.println("Berbisa : " + (this.isberbisa ? "Ya" : "Tidak"));
  }

}