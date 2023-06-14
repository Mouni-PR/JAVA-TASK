import java.util.Scanner;
class AssignmentOP{
 public static void main(String args[]){
  System.out.println("Enter the Value");
  Scanner obj = new Scanner(System.in);
  int a = obj.nextInt();
  System.out.println(a+=1);
  System.out.println(a-=1);
  System.out.println(a/=1);
  System.out.println(a*=1);
  System.out.println(a%=1);
  
 } 
}