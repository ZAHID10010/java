import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int num1, num2, num3, sum;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter three integers: ");
    num1 = in.nextInt();
    num2 = in.nextInt();
    num3 = in.nextInt();

    sum = num1 + num2 + num3;

    System.out.println("The sum is " + sum);
    System.out.println("The sum is ");
  }
}