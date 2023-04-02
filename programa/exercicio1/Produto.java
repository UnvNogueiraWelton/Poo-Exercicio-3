package programa.exercicio1;
import java.util.Scanner;

public class Produto {
  private int code;
  private int amount;
  private double price;
  private int payment;

  private double subtotal;

  public Produto(int code, int amount, double price, int payment) {
    this.code = code;
    this.amount = amount;
    this.price = price;
    this.payment = payment;

    this.subtotal = price * amount;
  }

  static Produto create() {
    Scanner scan = new Scanner(System.in);

    System.out.print("Insira o codigo do produto: ");
    int code = scan.nextInt();

    System.out.print("Insira a quantidade de produtos: ");
    int amount = scan.nextInt();

    System.out.print("Insira o preco dos produtos: ");
    double price = scan.nextDouble();

    System.out.print("Insira o metodo de pagamento: ");
    int payment = scan.nextInt();

    scan.close();

    return new Produto(code, amount, price, payment);
  }

  public double getDiscount() {
    switch(this.payment) {
      case 1:
        return this.subtotal * 0.1;
      case 2:
        return this.subtotal * 0.02;
      case 3:
        return this.subtotal * 0.05;
      case 4:
        return this.subtotal * 0.05;
      default:
        return this.subtotal;
    }
  }

  public double getTotal() {
    return this.subtotal - getDiscount();
  }
}
