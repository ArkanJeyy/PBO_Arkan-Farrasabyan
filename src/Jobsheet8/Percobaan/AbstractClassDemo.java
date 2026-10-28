public package Jobsheet8.Percobaan;

class AbstractClassDemo {
  public static void main(String[] args) {
    Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
    hewan1.cetakInfo();
    hewan1.bergerak();
    hewan1.bernafas();

    Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
    lebah1.cetakInfo();
    lebah1.bergerak();
    lebah1.bernafas();
  }
  
}