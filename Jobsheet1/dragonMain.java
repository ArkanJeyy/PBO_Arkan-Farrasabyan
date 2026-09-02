public class dragonMain {
  public static void main(String[] args) {
    Dragon dragon1 = new Dragon();
    Dragon dragon2 = new Dragon();

    System.out.println("=== STATUS AWAL LIGHT DRAGON  ===");
    dragon1.printStatus();

    System.out.println("");
    dragon1.changeDirection(4);
    dragon1.move(3);
    dragon1.changeDirection(1);
    dragon1.move(5);
    System.out.println("=== STATUS LIGHT DRAGON SUDAH BERGERAK ===");
    dragon1.printStatus();

    System.out.println("------------------------------------------");

    System.out.println("=== STATUS AWAL DARK DRAGON ===");
    dragon2.printStatus();

    System.out.println("");
    dragon2.changeDirection(4);
    dragon2.move(4);
    dragon2.changeDirection(3);
    dragon2.move(1);
    System.out.println("=== STATUS DARK DRAGON SUDAH BERGERAK ===");
    dragon2.printStatus();
  }
}
