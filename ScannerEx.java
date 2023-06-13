import java.util.Scanner;
class ScannerEx{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Name");
   String name = sc.nextLine();

   System.out.println("Enter Your age");
   int age = sc.nextInt();

   System.out.println("Are you above 18, True/Flase ");
   boolean bValue = sc.nextBoolean();

   System.out.println("Enter Your Ph Number");
   long ph = sc.nextLong();

   System.out.println("Enter Your Fav Number (1-100)");
   byte favNo = sc.nextByte();

   System.out.println("Enter Some Float Value");
   float fValue = sc.nextFloat();

   System.out.println("Enter Some Double value");
   double dValue = sc.nextDouble(); 
 
   System.out.println("Enter Some Ex for character");
   char charValue = sc.next().charAt(3,4); 
   
   System.out.println("Your name is " + name);
   System.out.println("And your age is " + age);
   System.out.println("Your Above 18 " + bValue);
   System.out.println("your Ph.No " + ph);
   System.out.println("Your Fav Number " + favNo);
   System.out.println("Entered Float Value is " + fValue);
   System.out.println("Entered Double Value is " + dValue);
   System.out.println("character " + charValue);
 }
}