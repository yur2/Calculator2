
import java.util.Scanner;


public class CalMain extends Calculator{
  
 public static void main(String[] args) {
  
  while(true) {

  Scanner scan = new Scanner(System.in);
  
  System.out.println("���ڸ� �Է��ϼ���");
  int a = scan.nextInt();
  System.out.println("���ڸ� �Է��ϼ���");
  int b = scan.nextInt();
  
  

  add(a, b);
  minus(a, b);
  multiple(a, b);
  devide(a, b);
  }
 }
}
