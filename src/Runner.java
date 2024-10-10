import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Welcome to Slope calculator!\nPlease input the first point: ");
        String first = s.nextLine();
        System.out.print("Please input the second point: ");
        String second = s.nextLine();

        //Welcomes the user and collects two coordinate points

        first = first.replace("(", "").replace(")", "").trim();
        second = second.replace("(", "").replace(")", "").trim();

        int x = first.indexOf(",");
        int y = second.indexOf(",");
        //gets the index of the ","
        int z = first.length();
        int w = second.length();
        //gets the length of the coordinate points
        String xx1 = first.substring(0,x-1);
        String yy1 = first.substring(x+1,z-1);
        String xx2 = second.substring(0,y-1);
        String yy2 = second.substring(y+1, w-1);
        //uses the length and the index of the "," in order to seperate the coordinate points into x and y
        double x1 = Double.parseDouble(xx1);
        double y1 = Double.parseDouble(yy1);
        double x2 = Double.parseDouble(xx2);
        double y2 = Double.parseDouble(yy2);
        //makes x and y a double

        SlopeSolver wow = new SlopeSolver(x1,x2,y1,y2);  //creates the object via the gathered values
        System.out.println(wow.toString());


        System.out.print("Input a 3rd X coordinate: ");  //third x point
        String xx3 = s.nextLine();
        double x3 = Double.parseDouble(xx3);
        System.out.println(wow.pointFinder(x3));


    }
}
