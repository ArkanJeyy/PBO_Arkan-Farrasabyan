package Tugas;

public class mainDemo {
  public static void main(String[] args) {
    Katak katak1 = new Katak("Goliat", 24);
    katak1.getInfo();
    katak1.lompat();

    System.out.println();

    KarakterMario mario1 = new KarakterMario(3, "Fire Mushroom");
    mario1.getInfo();
    mario1.lompat();
  }
}
