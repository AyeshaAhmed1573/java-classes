//Create a method called isPrime that takes an integer as input and returns true if it's prime and false otherwise.
 import java.util.Scanner;
public class Pr{
    public static void main(String[] args) {
      
      Scanner sc= new Scanner(System.in);
      int number =sc.nextInt();
      Prime pr= new Prime(number);
      System.out.println(pr.getPrime());
      sc.close();
    }    
        
    }

class Prime{
     private int number;
     Prime(int number ){
        this.number=number;
            }
           
    boolean getPrime(){
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
      
        return true;
    
}
    }
  