package programa.exercicio2;
public class Triangulo {
  private double x;
  private double y;
  private double z;

  public Triangulo(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public static Triangulo create(double x, double y, double z) {
    return new Triangulo(x, y ,z);
  }

  public boolean checkTriangle() {
    return Math.abs(this.y - this.z) < x && x < y + z;
  }

  public String checkTriangleType() {
    if(this.checkTriangle()) {
      if (this.x == this.y && this.y == this.z) {
        return "Equilatero";
      }
      if (this.x != this.y && this.y != this.z && this.z != this.x) {
        return "Escaleno";
      }
      return "Isosceles";
    }
    return "Nao e um triangulo";
  }
}
