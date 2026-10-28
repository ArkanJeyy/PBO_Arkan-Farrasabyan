public class Dragon {
  int x;
  int y;
  int direction;

  public Dragon() {
    direction = 2;
  }

  public void changeDirection(int newDirection) {
    if (newDirection >= 1 && newDirection <= 4) {
      direction = newDirection;
    } else {
      System.out.println("Arah harus bernilai 1, 2, 3 atau 4.");
    }
  }

  public void move(int steps) {
    switch (direction) {
      case 1:
        y -= steps;
        break;
      case 2:
        x += steps;
        break;
      case 3:
        y += steps;
        break;
      case 4:
        x -= steps;
        break;
      default:
        System.out.println("Arah tidak dapat dipilih atau tidak valid");
        break;
    }
  }

  public void printStatus() {
    System.out.println("Arah (Direction) : " + direction);
    System.out.println("Koordinat : (" + x + ", " + y + ") ");
  }
}
