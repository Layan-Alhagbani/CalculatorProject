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
    System.out.println("Enter the number of calculations you want to perform:");
    int times = input.nextInt();
    
    int [] array = new int[times *2];
    int index=0;
    
    System.out.println("Do you want to stsrt? yes or no");
    String letter = input.next();
    
   
    while( letter.equalsIgnoreCase("YES")){
       System.out.println("Welcome Calculator");
     
       System.out.println("Enter first number");
        int numberF = input.nextInt();
     
       System.out.println("Enter second number");
        int numberS = input.nextInt();
        
        array [index++]=numberF;
        array [index++]=numberS;
        
       System.out.println("Enter the opereter");
       char operater = input.next().charAt(0);
     
        switch (operater ){
           case'+':
            int sumation = sum(numberF,numberS);
            System.out.println(sumation);
            break;
        
          case'-' :
           int subtraction= subtract(numberF,numberS);
           System.out.println(subtraction);
           break;
        
          case'*' :
            int multiplication =multiply(numberF,numberS) ;
            System.out.println(multiplication);
            break;
        
          case'/':
           int dividetion = divide(numberF,numberS);
           System.out.println(dividetion);
           break;
          
          case'%': 
           int remainder= mod(numberF,numberS);
           System.out.println(remainder);
           break;
          
          default:
           System.out.println("Invalid operater");
           break;
        } 
     
        System.out.println("Do you want another Calculation?");
        letter = input.next();
    }
    
    System.out.println("Numbers entered");
      for (int i = 0; i < index; i++) {
         System.out.println(array[i]); 
      }
    
  }
  
  public static int sum( int num1,int num2){
      return num1+num2;
  }
  
  public static int subtract( int num1,int num2){
      return num1-num2;
  }
  
  public static int multiply( int num1,int num2){
      return num1*num2;
  }
  
  public static int divide( int num1,int num2){
      return num1/num2;
  }
  
  public static int mod( int num1,int num2){
      return num1%num2;
  }
  
}
