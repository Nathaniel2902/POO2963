

import java.util.Scanner;

public class FactorialNumber {
    private int factorial=1;
    private int num;
    
    public static void main(String [] args){
        
        FactorialNumber read = new FactorialNumber();
        
        read.readNumber();
        
       
        
    }
    
    public void readNumber(){
        Scanner Enter = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = Enter.nextInt();
        FactorialOFnumber(num);
    }
    
    public void FactorialOFnumber(int num){
        
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }
        System.out.println("el factorial es: "+factorial);
    }
    
}
