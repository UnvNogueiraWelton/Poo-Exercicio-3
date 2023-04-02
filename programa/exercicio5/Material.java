package programa.exercicio5;
public class Material {
  private int finalTime;
  private double bulk;
  private double finalBulk;

  public Material(double bulk) {
    this.bulk = bulk;

   this.getLoss();
  }

  private void getLoss() {
    int time = 0;
    double currentBulk = this.bulk;

    while(currentBulk >= 0.5) {
      currentBulk /= 2;
      time += 50;
    }

    this.finalTime = time;
    this.finalBulk = currentBulk;
  }

  public void getData() {
    System.out.printf("Massa inicial: %.2f\nMassa final: %.2f\nTempo: %d", this.bulk, this.finalBulk, this.finalTime);
  }
}
