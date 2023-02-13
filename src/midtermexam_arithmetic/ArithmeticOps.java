package midtermexam_arithmetic;
import java.util.Scanner;

/**
 *
 * @author black
 */
public class ArithmeticOps 
{

    /**
     * @return the ops
     */
    public Operations getOps() {
        return ops;
    }

    /**
     * @param ops the ops to set
     */
    public void setOps(String s) {
        this.ops = s;
        //this.ops = ops;
    }

    private Operations ops;
    public enum Operations
    {
        PLUS, MINUS, TIMES, DIVIDE
    }
    public double x,y;
    double calculate(double x, double y) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s = sc.next();
        switch (getOps()) 
        {
            case PLUS:
                return x + y;
            case MINUS:
                return y - x;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }  
}
