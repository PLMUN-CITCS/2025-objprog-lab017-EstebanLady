
import java.util.Scanner;
public class GradeCalculator {
  public static void main(String[] args) {
     int n = getStudentScore();
     calculateGrade( n);
  }
  public static int getStudentScore() {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your Score: ");
    int n = input.nextInt();
    
    if (n >= 0){
        
    }else {
        System.out.print("ERROR! Please Enter an integer");
    }
    return n;
  }
  
  public static int calculateGrade(int n) {
      
    
    if (n >= 90){
        System.out.print("Your grade is: A" );
    } else if (n >= 80) {
        System.out.print("Your grade is: B");
    } else if (n>= 70) {
        System.out.print("Your grade is: c" );
    } else if (n>= 60) {
        System.out.print("Your grade is: D" );
    } else if (n<=60) {
        System.out.print("Your grade is: F" );
    }
       return n;
  }
}
    
    
    
    
  
  
