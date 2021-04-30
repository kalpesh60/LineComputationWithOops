import java.util.Scanner;

class LineComputation
{
    public void LengthOfLine()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 co-ordinate");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 co-ordinate");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 co-ordinate");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 co-ordinate");
        int y2 = sc.nextInt();
        double LengthOfLine = Math.sqrt((x2-x1)*( x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of line=" +LengthOfLine);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to the Comparison Computation Program");
        LineComputation line = new LineComputation();
        line.LengthOfLine();
    }
}
