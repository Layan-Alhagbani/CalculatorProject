 impourt java.util.Scanner;
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
    
    int NumberOne = input.nextInt();
    int NumberTwo = input.nextInt();
    char operater = input.next().charAt(0);

    if (operater == '+' ){
      System.out.println(NumberOne + NumberTwo);
    }
    else if(operater == '-'){
      System.out.println(NumberOne - NumberTwo);
    }
    else if(operater == '*'){
      System.out.println(NumberOne * NumberTwo);
    }
    else if(operater == '/'){
      System.out.println(NumberOne / NumberTwo);
    }
    else {
      System.out.println(NumberOne % NumberTwo);
    }
    for(){
       NumberTwo * NumberOne;
       NumberOne --;
      
    }
    
    
  }
}
