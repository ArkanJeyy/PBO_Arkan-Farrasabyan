package Jobsheet9;

public class Kipas extends AlatElektronik  {
  public String jenis;

  public Kipas(String jenis){
    super(0, "", "");
    this.jenis = jenis;
  }

  @Override 
  public void getInfo() {
    System.out.println("Jenis Kipas : " + this.jenis);
    super.getInfo();
  }

}
