package programa.exercicio1;
class Exercicio1 {
  public static void main(String ...args) {
    Produto produto = Produto.create();
    
    System.out.println(produto.getDiscount());
    System.out.println(produto.getTotal());
  }
}