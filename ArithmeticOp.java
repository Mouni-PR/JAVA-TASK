import java.util.Scanner;
class ArithmeticOp{
 public static void main(String args[]){
  System.out.println("Enter the First Value");
  Scanner obj = new Scanner(System.in);
  int a = obj.nextInt();
  System.out.println("Enter the Second Value");
  int b = obj.nextInt();
  System.out.println(a+b);
  System.out.println(a-b);
  System.out.println(a/b);
  System.out.println(a*b);
  System.out.println(a%b);
 }
}
  