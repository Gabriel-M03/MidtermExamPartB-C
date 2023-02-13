package midtermexam_arithmetic;
import java.util.Scanner;
import static java.time.Clock.system;
/**
 * This class +++ Insert class description here +++
 * @author Gabriel Montemayor
 */
public class Arithmetic 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArithmeticOps r= new ArithmeticOps();
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int n= in.nextInt();
        System.out.println("\nPlease enter your second number");
        int m= in.nextInt();
        double result = r.calculate(m,n);
        System.out.println("\nResult :" +result);  
    }

}
