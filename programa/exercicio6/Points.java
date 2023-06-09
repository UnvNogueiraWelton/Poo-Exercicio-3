package programa.exercicio6;

public class Points {
  private double x1;
  private double x2;
  private double y1;
  private double y2;

  public Points(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
  }

  public double getDistance() {
    return Math.sqrt(Math.pow((this.x2 - this.x1),2) + Math.pow((this.y2 - this.y1),2));
  }
}
