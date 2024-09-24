
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        printColorForPoint(-8,1);
        printColorForPoint(-3,3);
        printColorForPoint(3,2);
        printColorForPoint(6.5,1);
        printColorForPoint(9,1);
        printColorForPoint(9,-3);
        System.out.println("введите числа х1, у1");
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();

        printColorForPoint(x1,y1);
    }

    public static void printColorForPoint(double x, double y) {

        System.out.println("(" + x + "," + y + ") -> " + Program.getColor(x,y));

    }
}
