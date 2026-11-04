package Jobsheet9;

public class SmartFridge extends AlatElektronik implements Audible{
  public int volume;
  public String ukuranLayar;

  public SmartFridge(int volume, String ukuranLayar){
    super(0, "", "");
    this.volume = volume;
    this.ukuranLayar = ukuranLayar;
  }

  @Override
  public void naikkanVolume() {
    volume += 1;

  }

  @Override
  public void turunkanVolume() {
    volume -= 1;
  }

  @Override 
  public void getInfo() {
    System.out.println("Ukuran Layar : " + this.ukuranLayar);
    System.out.println("Volume : " + this.volume);
    super.getInfo();
  }
}
