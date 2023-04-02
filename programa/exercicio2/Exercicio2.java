package programa.exercicio2;
class Exercicio2 {
  public static void main(String ...args) {
    Triangulo triangulo = Triangulo.create(10, 2, 5);
    
    System.out.print(triangulo.checkTriangleType());
  }
}