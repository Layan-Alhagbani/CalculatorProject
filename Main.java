import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    int x = 15;
    int y = 10;
  
    int result= ((x*y+100)/y);
    System.out.println(result);

    boolean isGreater  = result > y;
    System.out.println(isGreater);
    boolean isInRange = (result > 50) && (y > 5);
    System.out.println(isInRange);

    Scanner input  = new Scanner(System.in);
   
    System.out.println("Do you want to stsrt? yes or no");
    String letter = input.next();
   
    while( letter.equalsIgnoreCase("YES")){
       System.out.println("Welcome Calculator");
     
       System.out.println("Enter first number");
       int numberF = input.nextInt();
     
       System.out.println("Enter second number");
       int numberS = input.nextInt();
     
       System.out.println("Enter the opereter");
       char operater = input.next().charAt(0);
     
        if (operater == '+' ){
          System.out.println(numberF + numberS);
        }
        else if(operater == '-'){
          System.out.println(numberF - numberS);
        }
        else if(operater == '*'){
          System.out.println(numberF * numberS);
        }
        else if(operater == '/'){
          System.out.println(numberF / numberS);
        }
        else {
          System.out.println(numberF % numberS);
        } 
     
        System.out.println("Do you want another Calculation?");
        letter = input.next();
    }
  }
}
