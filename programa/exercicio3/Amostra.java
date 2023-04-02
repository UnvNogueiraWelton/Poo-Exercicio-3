package programa.exercicio3;
public class Amostra {
  private int id;
  private double carbon;
  private double hardness;
  private double traction;

  public Amostra (int id, double carbon, double hardness, double traction) {
    this.id = id;
    this.carbon = carbon;
    this.hardness = hardness;
    this.traction = traction;
  }

  public boolean firstTest() {
    return this.carbon < 7;
  } 

  public boolean secondTest() {
    return this.hardness > 50;
  }

  public boolean thirdTest() {
    return this.traction > 80000;
  }

  public int getDegree() {
    boolean isFirstTestOk = this.firstTest();
    boolean isSecondTestOk = this.secondTest();
    boolean isThirdTestOk = this.thirdTest();

    if(isFirstTestOk) {
      if(isSecondTestOk) {
        if(isThirdTestOk) {
          return  10;
        }
        return 9;
      }
      return 8;
    }
      return 7;
  }
}
