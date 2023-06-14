import java.util.Scanner;
class TernaryEx{
 public static void main(String args[]){
  System.out.println("Enter the First Value");
  Scanner obj = new Scanner(System.in);
  int a = obj.nextInt();
  System.out.println("Enter the Second Value");
  int b = obj.nextInt();
  String OutPut = (a>b)? "A Greater than B" : "A Lesser than B";
  System.out.println(OutPut);
 }
}