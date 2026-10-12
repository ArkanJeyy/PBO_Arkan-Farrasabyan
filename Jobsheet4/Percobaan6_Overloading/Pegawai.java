public class Pegawai{
  public String nip;
  public String nama;
  public double gaji;

  public Pegawai(){
    System.out.println("Ini Constructor class Pegawai");
  }

  public String getInfo(){
    String info = "";
    info += "NIP    : " + nip  + "\n";
    info += "Nama   : " + nama + "\n";
    info += "Gaji   : " + gaji + "\n";

    return info;
  }
}