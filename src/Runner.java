import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Welcome to Slope calculator!\nPlease input the first point: ");
        String first = s.nextLine();
        System.out.print("Please input the second point: ");
        String second = s.nextLine();

        String xx1 = first.substring(1,2);
        String xx2 = second.substring(1,2);
        String yy1 = first.substring(3,4);
        String yy2 = second.substring(3,4);

        double x1 = Double.parseDouble(xx1);
        double x2 = Double.parseDouble(xx2);
        double y1 = Double.parseDouble(yy1);
        double y2 = Double.parseDouble(yy2);

        System.out.println(x1 + " " + x2 + " " + y1 + " " + y2 );

        SlopeSolver wow = new SlopeSolver(x1,x2,y1,y2);

        wow.toString();

        System.out.print("Input a 3rd X coordinate: ");
        String xx3 = s.nextLine();
        double x3 = Double.parseDouble(xx3);

    }
}
