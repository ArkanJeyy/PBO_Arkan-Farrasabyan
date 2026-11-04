package Jobsheet9;

public class MainDemo {
  public static void main(String[] args) {
    Kulkas kulkas1 = new Kulkas(2);
    kulkas1.harga = 1500000;
    kulkas1.merk = "Sharp";
    kulkas1.warna = "Silver";
    kulkas1.getInfo();

    System.out.println();

    TV tv1 = new TV("Amoled", 20);
    tv1.harga = 2600000;
    tv1.merk = "Samsung";
    tv1.warna = "Hitam";    
    tv1.getInfo();

  }
}
