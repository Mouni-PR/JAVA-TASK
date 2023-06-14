import java.util.Scanner;
class LogicalOP{
 public static void main(String args[]){
  System.out.println("Enter the Value");
  Scanner obj = new Scanner(System.in);
  int a = obj.nextInt();
  System.out.println("Enter the Value");
  int b = obj.nextInt();
  System.out.println((a>b)&&(a>5));
  System.out.println((a>b)||(a>5));
}
 } 
