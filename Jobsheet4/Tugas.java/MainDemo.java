public class MainDemo {
  public static void main(String[] args) {
    Tabungan tabungan1 = new Tabungan("101002345", "Arkan", 5000000, 1.5, 2000);
    Deposito deposito2 = new Deposito("101002345","Byan", 2000000, 5.0, 12);

    tabungan1.setorSaldo(1000000);
    System.out.println("=============================================");
    tabungan1.tampilInfo();
    System.out.println("=============================================");
    tabungan1.hitungBunga();
    System.out.println("=============================================");
    System.out.println("");

    
    deposito2.tarikSaldo(200000);
    System.out.println("=============================================");
    deposito2.tampilInfo();
    deposito2.durasiTenor();
    System.out.println("=============================================");
  }  
}
