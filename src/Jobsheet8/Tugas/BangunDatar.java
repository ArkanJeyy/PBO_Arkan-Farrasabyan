package Jobsheet8.Tugas;

public abstract class BangunDatar {
  public String namaBentuk;
  public String warna;

  public BangunDatar(String namaBentuk, String warna){
    this.namaBentuk = namaBentuk;
    this.warna = warna;
  }

  public String getNamaBentuk(){
    return namaBentuk;
  }

  public String getWarna(){
    return warna;
  }

  public abstract double hitungLuas();
  public abstract double hitungKeliling();

  public void cetakInfo(){
    System.out.println("Warna    : " + warna);
    System.out.println("Luas     : " + hitungLuas());
    System.out.println("Keliling : " + hitungKeliling());

  }
  
}