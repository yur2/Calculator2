
import java.util.Scanner;


public class CalMain extends Calculator{
  
 public static void main(String[] args) {
  
  while(true) {

  Scanner scan = new Scanner(System.in);
  
  System.out.println("숫자를 입력하세요");
  int a = scan.nextInt();
  System.out.println("숫자를 입력하세요");
  int b = scan.nextInt();
  
  

  add(a, b);
  minus(a, b);
  multiple(a, b);
  devide(a, b);
  }
 }
}
