package Jobsheet9;

public class TV extends AlatElektronik implements Audible {
  public String jenisLayar;
  public int volume;

  public TV(String jenisLayar, int volume) {
    super(0, "", "");
    this.jenisLayar = jenisLayar;
    this.volume = volume;
  }

  @Override 
  public void naikkanVolume() {
    volume += 1;
  }

  @Override 
  public void turunkanVolume(){
    volume -= 1;
  }

  @Override 
  public void getInfo() {
    System.out.println("Jenis Layar : " + this.jenisLayar);
    System.out.println("Volume : " + this.volume);
    super.getInfo();
  }

}
