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

        int x1 = Integer.parseInt(xx1);
        int x2 = Integer.parseInt(xx2);
        int y1 = Integer.parseInt(yy1);
        int y2 = Integer.parseInt(yy2);

        System.out.println(x1 + " " + x2 + " " + y1 + " " + y2 );

        SlopeSolver wow = new SlopeSolver(x1,x2,y1,y2);

        wow.toString();

    }
}
