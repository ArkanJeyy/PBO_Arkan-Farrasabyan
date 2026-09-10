package MotorFolder;

public class Motor {
  private String platNomor;
  private boolean statMesin;
  private int kecepatan;

  public String getPlatNomor() {
    return platNomor;
  }

  public void setPlatNomor(String platNomor) {
    this.platNomor = platNomor;
  }

  public boolean getStatMesin() {
    return statMesin;
  }

  public void setStatMesin(boolean statMesin) {
    this.statMesin = statMesin;
  }

  public int getKecepatan() {
    return kecepatan;
  }

  public void setKecepatan(int kecepatan) {
    if (!this.statMesin && kecepatan > 0) {
      System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
    } else if (kecepatan > 100) {
      System.out.println("Kecepatan tidak boleh lebih besar dari 100 Km/h");
    } else if (kecepatan < 0) {
      System.out.println("kecepatan tidak boleh lebih kecil dari 0 (negatif)");
    } else {
      this.kecepatan = kecepatan;
    }
  }

  public void displayInfo() {
    System.out.println("Plat Nomor : " + this.platNomor);
    System.out.println("Status Mesin : " + (this.statMesin ? "On" : "Off"));
    System.out.println("Kecepatan : " + this.kecepatan);
    System.out.println("=================================");
  }

}
