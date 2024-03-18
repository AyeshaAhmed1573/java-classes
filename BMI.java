//import java.util.Scanner;
//class Main{
   // public static void main (String[]args){
     /**   Scanner h= new Scanner(System.in);
       Scanner w = new Scanner(System.in);
       double height= h.nextInt();
       double weight= w.nextInt();*/
     
       //BMI bmi=new BMI( );
       //System.out.println(bmi.getBMI( ));
//h.close();
//w.close();


 //   }
//}
public class BMI{
   protected double height;
   protected double weight;
double getBMI(){
    double bmi= 703*(weight/(Math.pow(height,2)));
    return bmi;
}
BMI(double height,double weight){
    this.height=height;
    this.weight=weight;

}

BMI() {
    this.height = 70;
    this.weight = 150;
}
public double getheight(){
    return height;
}
public double setheight(){
    return height;
}
public double getweight(){
    return height;
}
public double setweight(){
    return height;
}
}

  







