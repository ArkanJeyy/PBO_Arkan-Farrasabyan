package Jobsheet9;

public class Kulkas extends AlatElektronik {
  public int jumlahPintu;

  public Kulkas(int jumlahPintu){
    super(0, "", "");
    this.jumlahPintu = jumlahPintu;
  }

  @Override 
  public void getInfo() {
    System.out.println("Jumlah Pintu : " + this.jumlahPintu);
    super.getInfo();
  }
}
