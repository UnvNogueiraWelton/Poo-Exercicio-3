package programa.exercicio4;
public class Paralelepipedo {
  private double a;
  private double b;
  private double c;
  
  public Paralelepipedo(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getSide() {
    return Math.sqrt((this.a * this.a) + (this.b * this.b));
  }

  public double getDiagonal() {
    double side = this.getSide();
    return Math.sqrt((side * side) + (this.c * this.c));
  }
}
