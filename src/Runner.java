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
        first = first.replace(",", "").trim();
        second = second.replace(",", "").trim();

        //Removes every '(' ')' and ',' from the input string.

        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;

        // Initializes the variables

        if (first.length() == 4)
        {
            String xx1 = first.substring(1,2);
            String yy1 = first.substring(3,4);
            x1 = Double.parseDouble(xx1);
            y1 = Double.parseDouble(yy1);
            x1 = x1 * -1;
            y1 = y1 * -1;
        }

        if (second.length() == 4)
        {
            String xx2 = second.substring(1,2);
            String yy2 = second.substring(3,4);
            x2 = Double.parseDouble(xx2);
            y2 = Double.parseDouble(yy2);
            x2 = x2 * -1;
            y2 = y2 * -1;
        }

        //takes out the numbers from the input in case both of the inputs are negative

        if(first.length() == 3)
        {
            if(first.indexOf("-") == 0)
            {
                String xx1 = first.substring(1,2);
                String yy1 = first.substring(2,3);
                x1 = Double.parseDouble(xx1);
                y1 = Double.parseDouble(yy1);
                x1 = x1 * - 1;
            }

            if(first.indexOf("-") == 1)
            {
                String xx1 = first.substring(0,1);
                String yy1 = first.substring(2,3);
                x1 = Double.parseDouble(xx1);
                y1 = Double.parseDouble(yy1);
                y1 = y1 * - 1;
            }
        }

        if(second.length() == 3)
        {
            if(second.indexOf("-") == 0)
            {
                String xx2 = second.substring(1,2);
                String yy2 = second.substring(2,3);
                x2 = Double.parseDouble(xx2);
                y2 = Double.parseDouble(yy2);
                x2 = x2 * - 1;
            }

            if(second.indexOf("-") == 1)
            {
                String xx2 = second.substring(0,1);
                String yy2 = second.substring(2,3);
                x2 = Double.parseDouble(xx2);
                y2 = Double.parseDouble(yy2);
                y2 = y2 * - 1;
            }
        }

        //takes out the numbers from the input in case only 1 is negative. Uses indexOf() to figure out if the x or the y is negative to later multiply it by -1.

        if(first.length() == 2)
        {
            String xx1 = first.substring(0,1);
            String yy1 = first.substring(1,2);
            x1 = Double.parseDouble(xx1);
            y1 = Double.parseDouble(yy1);
        }

        if (second.length() == 2)
        {
            String xx2 = second.substring(0,1);
            String yy2 = second.substring(1,2);
            x2 = Double.parseDouble(xx2);
            y2 = Double.parseDouble(yy2);
        }

        //returns the values if both of the values are positive

        SlopeSolver wow = new SlopeSolver(x1,x2,y1,y2);  //creates the object via the gathered values
        System.out.println(wow.toString());


        System.out.print("Input a 3rd X coordinate: ");  //third x point
        String xx3 = s.nextLine();
        double x3 = Double.parseDouble(xx3);
        System.out.println(wow.pointFinder(x3));


    }
}
